package com.springforge.service.strategy.impl;

import com.springforge.dto.RequisitionRequest;
import com.springforge.service.strategy.RequisitionStrategy;
import org.springframework.stereotype.Component;

@Component("CONTRACT")
public class ContractRequisitionStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(RequisitionRequest request) {
        System.out.println("Creating CONTRACT requisition with hourly rate: " + request.getHourlyRate());
    }
}
