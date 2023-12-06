package com.solution.Behaviour.Command.AirCondition;

public class TurnOffAC implements CommandI{
    AirConditioner ac;
    @Override
    public void execute() {
        ac.turnACoff();
    }

    @Override
    public void undo() {
    ac.turnACoff();
    }
}
