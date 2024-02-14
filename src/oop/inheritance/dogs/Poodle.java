package oop.inheritance.dogs;

public class Poodle extends Dog {

    public void run(){
        System.out.println("Собака бежит медленно");
    }
    public Poodle(){
        super (28);

}
    @Override
    public void breath() {
        System.out.println("Пудель дышит");

    }
}
