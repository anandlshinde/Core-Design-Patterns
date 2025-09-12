package com.springforge.adapter;

import com.springforge.domain.CandidateProfile;
import com.springforge.domain.NaukriProfile;

public class NaukriProfileAdapter implements CandidateProfile {
    private final NaukriProfile profile;

    public NaukriProfileAdapter(NaukriProfile profile) {
        this.profile = profile;
    }

    @Override
    public String getFullName() {
        return profile.getFullName();
    }

    @Override
    public String getEmail() {
        return profile.getEmailAddress();
    }

    @Override
    public String getPhone() {
        return profile.getMobile();
    }
}
