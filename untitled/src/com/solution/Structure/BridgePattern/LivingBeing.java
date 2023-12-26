package com.solution.Structure.BridgePattern;

public abstract class LivingBeing {
    BreatheImplementor breatheImplementor;

    public LivingBeing(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
