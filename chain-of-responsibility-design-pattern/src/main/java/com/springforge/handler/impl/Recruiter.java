package com.springforge.handler.impl;

import com.springforge.domain.Candidate;
import com.springforge.handler.Approver;

// Recruiter
public class Recruiter extends Approver {
    @Override
    public void approveRequest(Candidate candidate) {
        System.out.println("Recruiter forwarded candidate: " + candidate.getName());
        if (nextApprover != null) {
            nextApprover.approveRequest(candidate);
        }
    }
}