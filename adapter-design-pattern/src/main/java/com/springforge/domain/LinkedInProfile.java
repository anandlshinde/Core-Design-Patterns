package com.springforge.domain;

public class LinkedInProfile {
    private String firstName;
    private String lastName;
    private String mailId;
    private String contactNumber;

    public LinkedInProfile(String firstName, String lastName, String mailId, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMailId() { return mailId; }
    public String getContactNumber() { return contactNumber; }
}
