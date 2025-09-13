package com.springforge.handler.impl;

import com.springforge.domain.Candidate;
import com.springforge.handler.Approver;

// HR
public class HR extends Approver {
    private double minBand = 1500000; // 15 LPA
    private double maxBand = 2200000; // 22 LPA

    @Override
    public void approveRequest(Candidate candidate) {
        System.out.println("HR reviewing candidate: " + candidate.getName());

        // Validate salary band
        if (candidate.getExpectedSalary() < minBand || candidate.getExpectedSalary() > maxBand) {
            System.out.println("❌ Rejected by HR: Salary not in allowed band.");
            return;
        }

        // Compliance check
        System.out.println("✅ HR approved candidate for compliance: " + candidate.getName());

        if (nextApprover != null) {
            nextApprover.approveRequest(candidate);
        }
    }
}