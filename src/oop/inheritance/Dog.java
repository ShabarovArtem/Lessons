package oop.inheritance;

public abstract class Dog extends Alive{
    public int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark(){
        System.out.println("Собака лает");
    }
    public abstract void run();
}
