package com.ralmeida;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is peacking!");
    }

    @Override
    public void breath() {
        System.out.println("Breathing!!!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping wings");
    }
}
