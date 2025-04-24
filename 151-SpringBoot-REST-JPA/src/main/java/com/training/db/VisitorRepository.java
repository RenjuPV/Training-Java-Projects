package com.training.db;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer>{

}
