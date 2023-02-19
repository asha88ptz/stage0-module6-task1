package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog(String color) {
        super(color, 4, true);
    }

    public Dog() {
        this("brown");
    }
}
