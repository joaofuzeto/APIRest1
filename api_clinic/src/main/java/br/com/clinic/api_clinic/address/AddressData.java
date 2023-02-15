package br.com.clinic.api_clinic.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressData(
		@NotBlank
		String street,
		
		@NotBlank
		String number,
		
		String complement,
		
		@NotBlank
		String city,
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String zipCode,
		
		@NotBlank
		String state,
		
		@NotBlank
		String country
		
		) {

}
