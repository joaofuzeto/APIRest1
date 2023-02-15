package br.com.clinic.api_clinic.doctor;

import br.com.clinic.api_clinic.address.Address;

public record DoctorDetailData(Long id, String name, String email, String phoneNumber, String credential, Speciality speciality, Address address) {

	public DoctorDetailData(Doctor doctor) {
		this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getPhoneNumber(), doctor.getCredential(), doctor.getSpeciality(), doctor.getAddress());
	}
	
}
