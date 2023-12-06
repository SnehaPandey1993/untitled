package com.solution.Behaviour.Command.AirCondition;

public class TurnOnAC implements CommandI{
    AirConditioner ac;

    public TurnOnAC(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
      ac.turnACon();
    }

    @Override
    public void undo() {
    ac.turnACoff();
    }
}
