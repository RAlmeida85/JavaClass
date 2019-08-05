package com.ralmeida;

public class Car extends Vehicle {

    private int doors;
    private int engine;

    public Car(String name, int doors, int engine) {
        super(name);
        this.doors = doors;
        this.engine = engine;
    }

}
