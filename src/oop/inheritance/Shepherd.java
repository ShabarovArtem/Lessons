package oop.inheritance;

public class Shepherd extends Dog{
    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");

    }
}
