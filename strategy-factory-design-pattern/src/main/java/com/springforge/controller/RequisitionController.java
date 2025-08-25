package com.springforge.controller;

import com.springforge.dto.RequisitionRequest;
import com.springforge.service.RequisitionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requisitions")
public class RequisitionController {

    private final RequisitionService service;

    public RequisitionController(RequisitionService service) {
        this.service = service;
    }

    @PostMapping
    public String createRequisition(@RequestBody RequisitionRequest request) {
        return service.processRequisition(request);
    }
}
