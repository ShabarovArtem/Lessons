package Practicatask;

public class Defender extends Human{

    public Defender(boolean isMan){
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получмл 15к");
    }
}
