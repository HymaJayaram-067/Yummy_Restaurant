package com.prashantjain.yummyrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ProductRequest{
        @NotNull(message = "Product should be present")
        @NotEmpty(message = "Product should be present")
        @NotBlank(message = "Product should be present")
        @JsonProperty("name")
        private String name;


        @NotNull(message="Product price is required")
        @JsonProperty("price")
       private float price;

		public ProductRequest() {
			super();
		}

		public ProductRequest(
				@NotNull(message = "Product should be present") @NotEmpty(message = "Product should be present") @NotBlank(message = "Product should be present") String name,
				@NotNull(message = "Product price is required") float price) {
			super();
			this.name = name;
			this.price = price;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public float getPrice() {
			return price;
		}


		public void setPrice(float price) {
			this.price = price;
		}

}