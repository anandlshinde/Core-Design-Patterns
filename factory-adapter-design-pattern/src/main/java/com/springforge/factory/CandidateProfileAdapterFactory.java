package com.springforge.factory;

import com.springforge.adapter.IndeedProfileAdapter;
import com.springforge.adapter.LinkedInProfileAdapter;
import com.springforge.adapter.NaukriProfileAdapter;
import com.springforge.domain.CandidateProfile;
import com.springforge.domain.IndeedProfile;
import com.springforge.domain.LinkedInProfile;
import com.springforge.domain.NaukriProfile;
import com.springforge.enums.SourceType;

public class CandidateProfileAdapterFactory {

    public static CandidateProfile getAdapter(SourceType sourceType, Object rawProfile) {
        switch (sourceType) {
            case LINKEDIN:
                return new LinkedInProfileAdapter((LinkedInProfile) rawProfile);
            case NAUKRI:
                return new NaukriProfileAdapter((NaukriProfile) rawProfile);
            case INDEED:
                return new IndeedProfileAdapter((IndeedProfile) rawProfile);
            default:
                throw new IllegalArgumentException("Unsupported source: " + sourceType);
        }
    }
}
