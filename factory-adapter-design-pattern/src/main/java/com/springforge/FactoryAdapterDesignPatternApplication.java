package com.springforge;

import com.springforge.domain.CandidateProfile;
import com.springforge.domain.IndeedProfile;
import com.springforge.domain.LinkedInProfile;
import com.springforge.domain.NaukriProfile;
import com.springforge.enums.SourceType;
import com.springforge.factory.CandidateProfileAdapterFactory;
import com.springforge.service.CandidateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryAdapterDesignPatternApplication {

	public static void main(String[] args) {

		CandidateService service = new CandidateService();

		// LinkedIn candidate
		LinkedInProfile linkedIn = new LinkedInProfile("Anand", "Shinde", "anand@gmail.com", "9876543210");
		CandidateProfile linkedInCandidate =
				CandidateProfileAdapterFactory.getAdapter(SourceType.LINKEDIN, linkedIn);
		service.processCandidate(linkedInCandidate);

		// Naukri candidate
		NaukriProfile naukri = new NaukriProfile("Rahul Patil", "rahul@naukri.com", "9876501234");
		CandidateProfile naukriCandidate =
				CandidateProfileAdapterFactory.getAdapter(SourceType.NAUKRI, naukri);
		service.processCandidate(naukriCandidate);

		// Indeed candidate
		IndeedProfile indeed = new IndeedProfile("Priya Sharma", "priya@indeed.com", "8765432190");
		CandidateProfile indeedCandidate =
				CandidateProfileAdapterFactory.getAdapter(SourceType.INDEED, indeed);
		service.processCandidate(indeedCandidate);
	}

}
