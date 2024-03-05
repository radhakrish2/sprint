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

import com.tnsif.placement.entity.Placement;
import com.tnsif.placement.repository.PlacementRepository;



@RestController
@RequestMapping("/placement")
@CrossOrigin(origins = "http://localhost:4200")
public class PlacementController {

	@Autowired
	private PlacementRepository placementRepo;

	@GetMapping("/{id}")
	public Placement getCollegeById(@PathVariable Long id) {
		return placementRepo.findById(id).get();
	}

	@GetMapping
	public List<Placement> getAllColleges() {
		return placementRepo.findAll();
	}

	@PostMapping
	public Placement createCollege(@RequestBody Placement placement) {
		return placementRepo.save(placement);
	}

	@PutMapping("/{id}")
	public Placement updateCollege(@PathVariable Long id, @RequestBody Placement placement) {

		placement.setId(id);
		return placementRepo.save(placement);
	}

	@DeleteMapping("/{id}")
	public void deleteCollegeById(@PathVariable Long id) {
		placementRepo.deleteById(id);
	}
}
