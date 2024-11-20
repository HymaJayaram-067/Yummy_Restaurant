package com.prashantjain.yummyrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginRequest {
	@NotNull(message = "Customer email is required")
	@Email(message = "Email must be in correct format")
	@JsonProperty("email")
	private String email;

	@NotNull(message = "Password should be present")
	@NotEmpty(message = "Password should be present")
	@NotBlank(message = "Password should be present")
	@Size(min = 6, max = 12)
	@JsonProperty("password")
	private String password;

	public LoginRequest() {
		super();
	}

	public LoginRequest(
			@NotNull(message = "Customer email is required") @Email(message = "Email must be in correct format") String email,
			@NotNull(message = "Password should be present") @NotEmpty(message = "Password should be present") @NotBlank(message = "Password should be present") @Size(min = 6, max = 12) String password) {

		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
