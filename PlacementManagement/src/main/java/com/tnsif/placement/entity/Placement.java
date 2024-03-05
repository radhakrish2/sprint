package com.tnsif.placement.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String companyName;
	private String jobTitle;
	private LocalDate placementDate;
	private Long studentId;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public LocalDate getPlacementDate() {
		return placementDate;
	}
	public void setPlacementDate(LocalDate placementDate) {
		this.placementDate = placementDate;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Placement() {
		super();
	}
	public Placement(String companyName, String jobTitle, LocalDate placementDate, Long studentId) {
		super();
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.placementDate = placementDate;
		this.studentId = studentId;
	}
	
	
	
	

}
