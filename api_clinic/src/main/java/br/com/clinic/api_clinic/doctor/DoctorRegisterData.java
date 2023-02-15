package br.com.clinic.api_clinic.doctor;

import br.com.clinic.api_clinic.address.Address;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorRegisterData(
		@NotBlank
		String name,
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		String phoneNumber,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String credential,
		
		@NotNull
		Speciality speciality,
		
		@NotNull @Valid
		Address address		
		) {

}
