package com.flatiron.bird;

public class Parrot extends Bird {

    Parrot() {
        setName("Iago");
    }

    @Override
    public void eat() {
        System.out.println("Yum! I like to eat crackers!");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }
}
