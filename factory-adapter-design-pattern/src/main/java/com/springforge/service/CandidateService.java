package com.springforge.service;

import com.springforge.domain.CandidateProfile;

public class CandidateService {
    public void processCandidate(CandidateProfile profile) {
        System.out.println("Processing Candidate...");
        System.out.println("Name  : " + profile.getFullName());
        System.out.println("Email : " + profile.getEmail());
        System.out.println("Phone : " + profile.getPhone());
        System.out.println("---------------------------");
    }
}
