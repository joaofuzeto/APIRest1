package br.com.clinic.api_clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.clinic.api_clinic.doctor.Doctor;
import br.com.clinic.api_clinic.doctor.DoctorDetailData;
import br.com.clinic.api_clinic.doctor.DoctorRegisterData;
import br.com.clinic.api_clinic.doctor.DoctorRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorRepository repository;
	
	@PostMapping
	public ResponseEntity registerDoctor(@RequestBody @Valid DoctorRegisterData data, UriComponentsBuilder UriBuilder) {
		var doctor = new Doctor(data);
		repository.save(doctor);
		
		var uri = UriBuilder.path("/doctors/{id}").buildAndExpand(doctor.getId()).toUri();
		return ResponseEntity.created(uri).body(new DoctorDetailData(doctor));
	}

}
