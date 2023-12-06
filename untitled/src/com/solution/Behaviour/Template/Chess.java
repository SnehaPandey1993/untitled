package com.solution.Behaviour.Template;

public class Chess extends Game{
    @Override
    public void initialize() {
        System.out.println("Chess game initialized!!!Start Playing");
    }

    @Override
    public void start() {
        System.out.println("Chess game Started!!!welcome");

    }

    @Override
    public void end() {
        System.out.println("Chess end");
    }
}
