package com.springforge.handler;

import com.springforge.domain.Candidate;
//Handler
public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveRequest(Candidate candidate);
}