package com.training.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.City;
import com.training.model.Location;
import com.training.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
	 Optional<Stock> findByItemIdAndLocationAndCity(Long itemId, Location location, City city);

}
