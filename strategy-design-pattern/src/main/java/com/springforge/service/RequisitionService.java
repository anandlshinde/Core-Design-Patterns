package com.springforge.service;

import com.springforge.strategy.RequisitionStrategy;

public class RequisitionService {
    private RequisitionStrategy strategy;

    public void setStrategy(RequisitionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createRequisition(String role) {
        if (strategy == null) {
            throw new IllegalStateException("No requisition strategy set!");
        }
        strategy.createRequisition(role);
    }
}