package task3;

public class Duck implements Swim, Fly{


    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");

    }
}
