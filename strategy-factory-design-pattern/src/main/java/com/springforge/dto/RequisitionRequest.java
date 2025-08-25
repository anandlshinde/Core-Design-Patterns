package com.springforge.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisitionRequest {
    private String workerType;   // FULL_TIME / CONTRACT / SEASONAL
    private Double salary;       // applicable for FULL_TIME
    private Double hourlyRate;   // applicable for CONTRACT
    private String duration;     // applicable for SEASONAL
}
