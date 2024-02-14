package oop.inheritance;

import oop.inheritance.dogs.Poodle;
import oop.inheritance.dogs.Shepherd;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);
        shepherd.beAngry();
    }
}
