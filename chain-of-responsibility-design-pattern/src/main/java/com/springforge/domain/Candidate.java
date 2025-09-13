package com.springforge.domain;

import lombok.Data;

import java.util.List;

@Data
public class Candidate {
	private String name;
	private double expectedSalary;
	private List<String> skills;
	private String roleLevel; // e.g., "Senior Developer"
	private int noticePeriod; // in days

	public Candidate(String name, double expectedSalary, List<String> skills, String roleLevel, int noticePeriod) {
		this.name = name;
		this.expectedSalary = expectedSalary;
		this.skills = skills;
		this.roleLevel = roleLevel;
		this.noticePeriod = noticePeriod;
	}

}
