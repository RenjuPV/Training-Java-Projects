package com.training.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}