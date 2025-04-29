package com.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CityRepository;
import com.training.db.ItemRepository;
import com.training.db.LocationRepository;
import com.training.db.StockRepository;
import com.training.model.City;
import com.training.model.Item;
import com.training.model.Location;
import com.training.model.Stock;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private ItemRepository itemRepository;

	public Stock addOrUpdateStock(Stock stock) {
		// Validate and fetch existing Item, Location and City entities
		Item item = itemRepository.findById(stock.getItem().getId())
				.orElseThrow(() -> new RuntimeException("Item not found"));

		Location location = locationRepository.findById(stock.getLocation().getId())
				.orElseThrow(() -> new RuntimeException("Location not found"));

		City city = cityRepository.findById(stock.getCity().getId())
				.orElseThrow(() -> new RuntimeException("City not found"));

		// Check for existing stock entry
		Optional<Stock> existingStock = stockRepository.findByItemAndLocationAndCity(item, location, city);

		if (existingStock.isPresent()) {
			Stock existing = existingStock.get();
			existing.setAvailableQuantity(existing.getAvailableQuantity() + stock.getAvailableQuantity());
			return stockRepository.save(existing);
		}

		// Set validated entity references
		stock.setItem(item);
		stock.setLocation(location);
		stock.setCity(city);

		return stockRepository.save(stock);
	}

	public Stock getStock(Long itemId, Long locationId, Long cityId) {
		Item item = itemRepository.findById(itemId)
				.orElseThrow(() -> new RuntimeException("Item not found"));

		Location location = locationRepository.findById(locationId)
				.orElseThrow(() -> new RuntimeException("Location not found"));

		City city = cityRepository.findById(cityId).orElseThrow(() -> new RuntimeException("City not found"));

		return stockRepository.findByItemAndLocationAndCity(item, location, city)
				.orElseThrow(() -> new RuntimeException("Stock not found"));
	}

	public void reduceStock(Long itemId, Long locationId, Long cityId, int quantity) {
		Stock stock = getStock(itemId, locationId, cityId);
		if (stock.getAvailableQuantity() < quantity) {
			throw new RuntimeException("Insufficient stock");
		}
		stock.setAvailableQuantity(stock.getAvailableQuantity() - quantity);
		stockRepository.save(stock);
	}
}
