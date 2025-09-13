package com.springforge.handler.impl;

import com.springforge.domain.Candidate;
import com.springforge.handler.Approver;

// Finance
public class Finance extends Approver {
    private double maxCompanyBudget = 2500000; // 25 LPA

    @Override
    public void approveRequest(Candidate candidate) {
        System.out.println("Finance reviewing candidate: " + candidate.getName());

        if (candidate.getExpectedSalary() <= maxCompanyBudget) {
            System.out.println("✅ Finance approved candidate salary: " + candidate.getName());
            System.out.println("🎉 Candidate selected successfully: " + candidate.getName());
        } else {
            System.out.println("❌ Finance rejected candidate due to high salary.");
        }
    }
}