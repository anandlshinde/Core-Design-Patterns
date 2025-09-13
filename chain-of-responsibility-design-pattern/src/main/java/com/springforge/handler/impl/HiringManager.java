package com.springforge.handler.impl;

import com.springforge.domain.Candidate;
import com.springforge.handler.Approver;

import java.util.List;

// Hiring Manager
public class HiringManager extends Approver {
    private List<String> requiredSkills = List.of("Java", "Spring Boot", "Microservices");
    private double teamBudget = 2000000; // 20 LPA
    private int maxNoticePeriod = 60; // in days

    @Override
    public void approveRequest(Candidate candidate) {
        System.out.println("Hiring Manager reviewing candidate: " + candidate.getName());

        // Validate skills
        if (!candidate.getSkills().containsAll(requiredSkills)) {
            System.out.println("❌ Rejected by Hiring Manager: Missing required skills.");
            return;
        }

        // Validate team budget
        if (candidate.getExpectedSalary() > teamBudget) {
            System.out.println("❌ Rejected by Hiring Manager: Salary exceeds team budget.");
            return;
        }

        // Validate notice period
        if (candidate.getNoticePeriod() > maxNoticePeriod) {
            System.out.println("❌ Rejected by Hiring Manager: Notice period too long.");
            return;
        }

        System.out.println("✅ Hiring Manager approved candidate: " + candidate.getName());

        if (nextApprover != null) {
            nextApprover.approveRequest(candidate);
        }
    }
}