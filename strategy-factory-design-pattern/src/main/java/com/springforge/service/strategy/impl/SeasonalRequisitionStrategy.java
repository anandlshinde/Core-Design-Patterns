package com.springforge.service.strategy.impl;

import com.springforge.dto.RequisitionRequest;
import com.springforge.service.strategy.RequisitionStrategy;
import org.springframework.stereotype.Component;

@Component("SEASONAL")
public class SeasonalRequisitionStrategy implements RequisitionStrategy {
    @Override
    public void createRequisition(RequisitionRequest request) {
        System.out.println("Creating SEASONAL requisition for duration: " + request.getDuration());
    }
}
