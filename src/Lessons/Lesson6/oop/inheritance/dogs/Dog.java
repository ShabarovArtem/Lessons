package Lessons.Lesson6.oop.inheritance.dogs;

import Lessons.Lesson6.oop.inheritance.Alive;

public abstract class Dog extends Alive {
    protected final int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "Canis";

    public void beAngry(){
        System.out.println("Собака рычит");
    }


    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark(){
        System.out.println("Собака лает");
    }
    public abstract void run();
    public void eat(){
        System.out.println("Собака ест");
    }
}
