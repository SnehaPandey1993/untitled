package com.solution.Structure.AdapterPattern.Adapter;

import com.solution.Structure.AdapterPattern.Adaptee.WeightingMachine;

public class WeightingMachineAdapterImpl implements WeightingMachineAdapter{
    WeightingMachine weightingMachine;

    public WeightingMachineAdapterImpl(WeightingMachine weightingMachine) {
        this.weightingMachine = weightingMachine;
    }

    @Override
    public double getWeightInKG() {
        double datainpound=weightingMachine.getWeightInPound();
         double weightinkg= datainpound*0.25;
        return weightinkg;
    }
}
