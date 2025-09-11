package com.springforge;

import com.springforge.adapter.IndeedProfileAdapter;
import com.springforge.adapter.LinkedInProfileAdapter;
import com.springforge.adapter.NaukriProfileAdapter;
import com.springforge.domain.CandidateProfile;
import com.springforge.domain.IndeedProfile;
import com.springforge.domain.LinkedInProfile;
import com.springforge.domain.NaukriProfile;
import com.springforge.service.CandidateService;

public class AdapterDesignPatternApplication {
    public static void main(String[] args) {
        CandidateService service = new CandidateService();

        // LinkedIn candidate
        LinkedInProfile linkedIn = new LinkedInProfile("Anand", "Shinde", "anand@gmail.com", "9876543210");
        CandidateProfile linkedInCandidate = new LinkedInProfileAdapter(linkedIn);
        service.processCandidate(linkedInCandidate);

        // Naukri candidate
        NaukriProfile naukri = new NaukriProfile("Rahul Patil", "rahul@naukri.com", "9876501234");
        CandidateProfile naukriCandidate = new NaukriProfileAdapter(naukri);
        service.processCandidate(naukriCandidate);

        // Indeed candidate
        IndeedProfile indeed = new IndeedProfile("Priya Sharma", "priya@indeed.com", "8765432190");
        CandidateProfile indeedCandidate = new IndeedProfileAdapter(indeed);
        service.processCandidate(indeedCandidate);
    }
}
