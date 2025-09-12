package com.springforge.adapter;

import com.springforge.domain.CandidateProfile;
import com.springforge.domain.IndeedProfile;

public class IndeedProfileAdapter implements CandidateProfile {
    private final IndeedProfile profile;

    public IndeedProfileAdapter(IndeedProfile profile) {
        this.profile = profile;
    }

    @Override
    public String getFullName() {
        return profile.getCandidateName();
    }

    @Override
    public String getEmail() {
        return profile.getContactEmail();
    }

    @Override
    public String getPhone() {
        return profile.getPhoneNo();
    }
}
