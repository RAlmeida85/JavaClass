package com.ralmeida;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Maltes", 30, 3, 2, 4, 1, 18, "long white silk");

        dog.eat();
    }
}
