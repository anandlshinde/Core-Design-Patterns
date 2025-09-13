package com.springforge;

import com.springforge.domain.Candidate;
import com.springforge.handler.*;
import com.springforge.handler.impl.Finance;
import com.springforge.handler.impl.HR;
import com.springforge.handler.impl.HiringManager;
import com.springforge.handler.impl.Recruiter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ChainOfResponsibilityDesignPatternApplication {

	public static void main(String[] args) {
		Approver recruiter = new Recruiter();
		Approver manager = new HiringManager();
		Approver hr = new HR();
		Approver finance = new Finance();

		// Build chain
		recruiter.setNextApprover(manager);
		manager.setNextApprover(hr);
		hr.setNextApprover(finance);

		// Candidate 1 - Valid
		Candidate candidate1 = new Candidate(
				"John Doe",
				1800000,
				List.of("Java", "Spring Boot", "Microservices"),
				"Senior Developer",
				30
		);

		// Candidate 2 - Invalid (salary too high)
		Candidate candidate2 = new Candidate(
				"Jane Smith",
				2600000,
				List.of("Java", "Spring Boot", "Microservices"),
				"Senior Developer",
				30
		);

		// Candidate 3 - Invalid (skills missing)
		Candidate candidate3 = new Candidate(
				"Mark Lee",
				1700000,
				List.of("Java", "Spring Boot"), // Missing Microservices
				"Senior Developer",
				30
		);

		System.out.println("=== Candidate 1 ===");
		recruiter.approveRequest(candidate1);

		System.out.println("\n=== Candidate 2 ===");
		recruiter.approveRequest(candidate2);

		System.out.println("\n=== Candidate 3 ===");
		recruiter.approveRequest(candidate3);
	}





}
