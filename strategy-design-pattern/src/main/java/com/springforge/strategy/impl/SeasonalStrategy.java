package com.springforge.strategy.impl;

import com.springforge.strategy.RequisitionStrategy;

public class SeasonalStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(String role) {
        System.out.println("Creating SEASONAL requisition for role: " + role);
        System.out.println("-> Requires temporary budget and short duration approval");
    }
}