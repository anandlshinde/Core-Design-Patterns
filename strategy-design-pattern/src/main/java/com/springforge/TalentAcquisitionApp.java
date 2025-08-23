package com.springforge;

import com.springforge.service.RequisitionService;
import com.springforge.strategy.impl.ContractStrategy;
import com.springforge.strategy.impl.FullTimeStrategy;
import com.springforge.strategy.impl.SeasonalStrategy;

public class TalentAcquisitionApp {
    public static void main(String[] args) {




        RequisitionService service = new RequisitionService();

        // Full-time
        service.setStrategy(new FullTimeStrategy());
        service.createRequisition("Software Engineer");

        // Contract
        service.setStrategy(new ContractStrategy());
        service.createRequisition("UI/UX Designer");

        // Seasonal
        service.setStrategy(new SeasonalStrategy());
        service.createRequisition("Customer Support Rep");
    }
}