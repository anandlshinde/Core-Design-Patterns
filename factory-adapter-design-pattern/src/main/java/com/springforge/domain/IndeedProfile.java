package com.springforge.domain;

public class IndeedProfile {
    private String candidateName;
    private String contactEmail;
    private String phoneNo;

    public IndeedProfile(String candidateName, String contactEmail, String phoneNo) {
        this.candidateName = candidateName;
        this.contactEmail = contactEmail;
        this.phoneNo = phoneNo;
    }

    public String getCandidateName() { return candidateName; }
    public String getContactEmail() { return contactEmail; }
    public String getPhoneNo() { return phoneNo; }
}
