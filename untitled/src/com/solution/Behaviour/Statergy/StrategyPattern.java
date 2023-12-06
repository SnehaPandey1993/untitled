package com.solution.Behaviour.Statergy;

public class StrategyPattern {
    private Strategy strategy;

    public StrategyPattern(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float a,float b){
        return strategy.calculate(a,b);
    }
}
