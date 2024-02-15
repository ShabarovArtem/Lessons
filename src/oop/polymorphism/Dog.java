package oop.polymorphism;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void move() {
    }
}
