package com.techelevator;

import java.util.Map;

public class Employee extends Person implements Billable{
    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        return 0;
    }
}
