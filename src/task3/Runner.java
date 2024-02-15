package task3;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Airplane airplane = new Airplane();
        Swim[] pool = {fish, duck};
        Fly[] sky = {airplane, duck};
        for (Swim swim : pool) {
            swim.swim();
        }
        for (Fly fly : sky) {
            fly.fly();
        }


    }
}
