package com.springforge.strategy.impl;

import com.springforge.strategy.RequisitionStrategy;

public class ContractStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(String role) {
        System.out.println("Creating CONTRACT requisition for role: " + role);
        System.out.println("-> Requires Vendor approval & contract duration check");
    }
}