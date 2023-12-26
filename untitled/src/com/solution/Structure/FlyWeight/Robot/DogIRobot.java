package com.solution.Structure.FlyWeight.Robot;

public class DogIRobot implements IRobot{
    private String type;

    public DogIRobot(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    private Sprites sprites;

    public String getType() {
        return type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("DOG:::::x:::"+x+":::y:::"+y);

    }
}
