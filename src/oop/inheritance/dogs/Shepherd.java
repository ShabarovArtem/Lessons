package oop.inheritance.dogs;

public class Shepherd extends Dog {
    public Shepherd(){
        super(27);
    }
    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");

    }
    @Override
    public void beAngry() {
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();

        System.out.println("Овчарка ууспокоилась");

    }

    @Override
    public void eat() {
        System.out.println("Овчарка ест");
    }
}
