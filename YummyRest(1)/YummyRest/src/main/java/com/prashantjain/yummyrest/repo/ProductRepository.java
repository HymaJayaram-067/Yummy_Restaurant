package com.prashantjain.yummyrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prashantjain.yummyrest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.price >=15 and p.price<=30 order by p.price desc limit 2")
    List<Product> top2Products();
}