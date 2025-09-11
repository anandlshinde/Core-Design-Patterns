package com.springforge.domain;

public class NaukriProfile {
    private String fullName;
    private String emailAddress;
    private String mobile;

    public NaukriProfile(String fullName, String emailAddress, String mobile) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.mobile = mobile;
    }

    public String getFullName() { return fullName; }
    public String getEmailAddress() { return emailAddress; }
    public String getMobile() { return mobile; }
}
