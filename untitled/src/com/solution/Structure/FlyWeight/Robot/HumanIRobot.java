package com.solution.Structure.FlyWeight.Robot;

public class HumanIRobot implements IRobot{
    private String type;
    private Sprites sprites;

    public String getType() {
        return type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public HumanIRobot(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("HUman::::x:::"+x+":::y:::"+y);

    }
}
