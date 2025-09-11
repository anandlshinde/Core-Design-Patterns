package com.springforge.adapter;

import com.springforge.domain.CandidateProfile;
import com.springforge.domain.LinkedInProfile;

public class LinkedInProfileAdapter implements CandidateProfile {
    private final LinkedInProfile profile;

    public LinkedInProfileAdapter(LinkedInProfile profile) {
        this.profile = profile;
    }

    @Override
    public String getFullName() {
        return profile.getFirstName() + " " + profile.getLastName();
    }

    @Override
    public String getEmail() {
        return profile.getMailId();
    }

    @Override
    public String getPhone() {
        return profile.getContactNumber();
    }
}
