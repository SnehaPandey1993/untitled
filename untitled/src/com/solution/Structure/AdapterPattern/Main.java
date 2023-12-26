package com.solution.Structure.AdapterPattern;

import com.solution.Structure.AdapterPattern.Adaptee.WeightingMachineForBabies;
import com.solution.Structure.AdapterPattern.Adapter.WeightingMachineAdapter;
import com.solution.Structure.AdapterPattern.Adapter.WeightingMachineAdapterImpl;

public class Main {
    public static void main(String args[]){
        WeightingMachineAdapter wma= new WeightingMachineAdapterImpl(new WeightingMachineForBabies());
        System.out.println(wma.getWeightInKG());
        }

}
