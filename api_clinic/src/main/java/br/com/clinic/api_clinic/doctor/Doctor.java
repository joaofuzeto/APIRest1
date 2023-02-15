package br.com.clinic.api_clinic.doctor;

import br.com.clinic.api_clinic.address.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="doctors")
@Entity(name="Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String phoneNumber;
	private String credential;
	
	@Enumerated(EnumType.STRING)
	private Speciality speciality;
	
	@Embedded
	private Address address;
	
	private boolean active;

	public Doctor(DoctorRegisterData data) {
		this.active = true;
		this.name = data.name();
		this.email = data.email();
		this.phoneNumber = data.phoneNumber();
		this.credential = data.credential();
		this.speciality = data.speciality();
		this.address = data.address();
	}
	
	
	
}
