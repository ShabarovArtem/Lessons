package oop.inheritance;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
    }
}
