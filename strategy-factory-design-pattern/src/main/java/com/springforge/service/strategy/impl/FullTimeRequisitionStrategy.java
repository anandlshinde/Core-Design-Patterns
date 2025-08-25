package com.springforge.service.strategy.impl;

import com.springforge.dto.RequisitionRequest;
import com.springforge.service.strategy.RequisitionStrategy;
import org.springframework.stereotype.Component;

@Component("FULL_TIME")
public class FullTimeRequisitionStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(RequisitionRequest request) {
        System.out.println("Creating FULL_TIME requisition with salary: " + request.getSalary());
    }
}
