package com.tnsif.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placement.entity.Certificate;
import com.tnsif.placement.repository.CertificateRepository;



@RestController
@RequestMapping("/certificate")
@CrossOrigin(origins = "http://localhost:4200")
public class CertificateController {

	@Autowired
	private CertificateRepository certificateRepo;

	@GetMapping("/{id}")
	public Certificate getCertificateById(@PathVariable Long id) {
		return certificateRepo.findById(id).get();
	}

	@GetMapping
	public List<Certificate> getAllCertificates() {
		return certificateRepo.findAll();
	}

	@PostMapping
	public Certificate createCertificate(@RequestBody Certificate certificate) {
		return certificateRepo.save(certificate);
	}

	@PutMapping("/{id}")
	public void updateCertificate(@PathVariable Long id, @RequestBody Certificate Certificate) {

		Certificate.setId(id);
		certificateRepo.save(Certificate);
	}

	@DeleteMapping("/{id}")
	public void deleteCertificateById(@PathVariable Long id) {
		certificateRepo.deleteById(id);
	}
}
