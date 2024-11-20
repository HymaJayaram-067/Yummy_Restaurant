package com.prashantjain.yummyrest.mapper;

import org.springframework.stereotype.Service;

import com.prashantjain.yummyrest.dto.ProductRequest;
import com.prashantjain.yummyrest.entity.Product;

@Service
public class ProductMapper {
    public Product getProductEntity(ProductRequest productRequest) {
    	return new Product(productRequest.getName(),
    			productRequest.getPrice()
    			);
    	 
    }
}
