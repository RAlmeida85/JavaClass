package com.ralmeida;

public class Main {

    // Abstract class define methods but do not define implementation of these methods
    // implementation is left to whatever class that implements it.

    public static void main(String[] args) {

        Dog dog = new Dog("Jimmy");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Loro");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Zeca");
        penguin.eat();
        penguin.fly();
    }
}
