package com.springforge.service.strategy;


import com.springforge.dto.RequisitionRequest;

public interface RequisitionStrategy {
    void createRequisition(RequisitionRequest request);
}
