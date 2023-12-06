package com.solution.Behaviour.Template;

public class Snooker extends Game{
    @Override
    public void initialize() {
        System.out.println("snokker game initialized!!!Start Playing");
    }

    @Override
    public void start() {
        System.out.println("snooker Started! welcome");
    }

    @Override
    public void end() {
        System.out.println("snooker end");
    }
}
