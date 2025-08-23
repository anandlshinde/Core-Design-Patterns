package com.springforge.strategy.impl;

import com.springforge.strategy.RequisitionStrategy;

public class FullTimeStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(String role) {
        System.out.println("Creating FULL-TIME requisition for role: " + role);
        System.out.println("-> Requires HR approval & permanent budget allocation");
    }
}