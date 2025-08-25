package com.springforge.factory;

import com.springforge.service.strategy.RequisitionStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RequisitionFactory {

    private final Map<String, RequisitionStrategy> strategies;

    public RequisitionFactory(Map<String, RequisitionStrategy> strategies) {
        this.strategies = strategies;
    }

    public RequisitionStrategy getStrategy(String workerType) {
        RequisitionStrategy strategy = strategies.get(workerType.toUpperCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid worker type: " + workerType);
        }
        return strategy;
    }
}
