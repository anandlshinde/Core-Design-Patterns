package com.springforge.service;

import com.springforge.dto.RequisitionRequest;
import com.springforge.factory.RequisitionFactory;
import org.springframework.stereotype.Service;

@Service
public class RequisitionService {

    private final RequisitionFactory factory;

    public RequisitionService(RequisitionFactory factory) {
        this.factory = factory;
    }

    public String processRequisition(RequisitionRequest request) {
        factory.getStrategy(request.getWorkerType())
               .createRequisition(request);
        return "Requisition created for type: " + request.getWorkerType();
    }
}
