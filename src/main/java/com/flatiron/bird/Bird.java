package com.flatiron.bird;

public abstract class Bird {
    private String name;

    Bird() {
        this.name = "unknown";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Yum! I like to eat!");
    }

    public abstract void makeSound();

}
