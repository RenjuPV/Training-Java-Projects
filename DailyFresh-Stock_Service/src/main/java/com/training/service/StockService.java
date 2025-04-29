package com.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CityRepository;
import com.training.db.LocationRepository;
import com.training.db.StockRepository;
import com.training.model.City;
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

    public Stock addOrUpdateStock(Stock stock) {
        // Validate and fetch existing location and city entities
        Location location = locationRepository.findById(stock.getLocation().getId())
                .orElseThrow(() -> new RuntimeException("Location not found"));

        City city = cityRepository.findById(stock.getCity().getId())
                .orElseThrow(() -> new RuntimeException("City not found"));

        Optional<Stock> existingStock = stockRepository
                .findByItemIdAndLocationAndCity(stock.getItemId(), location, city);

        if (existingStock.isPresent()) {
            Stock existing = existingStock.get();
            existing.setAvailableQuantity(existing.getAvailableQuantity() + stock.getAvailableQuantity());
            return stockRepository.save(existing);
        }

        // Set fully loaded location and city before saving
        stock.setLocation(location);
        stock.setCity(city);
        return stockRepository.save(stock);
    }

    public Stock getStock(Long itemId, Long locationId, Long cityId) {
        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new RuntimeException("Location not found"));

        City city = cityRepository.findById(cityId)
                .orElseThrow(() -> new RuntimeException("City not found"));

        return stockRepository.findByItemIdAndLocationAndCity(itemId, location, city)
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

