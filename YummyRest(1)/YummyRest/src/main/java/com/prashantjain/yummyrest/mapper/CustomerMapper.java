package com.prashantjain.yummyrest.mapper;

import org.springframework.stereotype.Service;

import com.prashantjain.yummyrest.dto.CustomerRequest;
import com.prashantjain.yummyrest.entity.Customer;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
    	return new Customer(request.getFirstName(),
    			request.getLastName(),
    			request.getEmail(),
    			request.getPassword());
    	 
    }
}
