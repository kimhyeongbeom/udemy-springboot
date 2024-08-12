package com.leopard2.game3;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationSevice {

    DataService dataService;

    public BusinessCalculationSevice(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0 );
    }
} 