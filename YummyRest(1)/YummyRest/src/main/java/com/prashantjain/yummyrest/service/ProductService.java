package com.prashantjain.yummyrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashantjain.yummyrest.dto.ProductRequest;
import com.prashantjain.yummyrest.entity.Product;
import com.prashantjain.yummyrest.mapper.ProductMapper;
import com.prashantjain.yummyrest.repo.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	@Autowired
    private ProductRepository productRepository;
	
	@Autowired
    private ProductMapper productMapper;
	
    public String createProduct(ProductRequest request) {
        Product product = productMapper.getProductEntity(request);
        productRepository.save(product);
        return "Created";
    }


    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getByIDProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Transactional
    public String updateByIDProduct(Long id, ProductRequest request) {
        Product productReqObject = productMapper.getProductEntity(request);
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
        	product.setProductName(productReqObject.getProductName());
        	product.setProductPrice(productReqObject.getProductPrice());
            productRepository.save(product);
            return "updated";

        }
        else {
            return "Product not found";
        }


    }

    @Transactional
    public String deleteByIDProduct(Long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Deleted";
        }
        else {
            return "Product not found";
        }
    }

    public List<Product> top2Products() {
        return productRepository.top2Products();
    }
}