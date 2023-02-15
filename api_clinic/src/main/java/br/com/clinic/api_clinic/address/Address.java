package br.com.clinic.api_clinic.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String street;
	private String number;
	private String complement;
	private String city;
	private String zipCode;
	private String state;
	private String country;
	
	
	public Address(AddressData data) {
		this.street = data.street();
		this.number = data.number();
		this.complement = data.complement();
		this.city = data.city();
		this.zipCode = data.zipCode();
		this.state = data.state();
		this.country = data.country();
	}
	
	
	
}
