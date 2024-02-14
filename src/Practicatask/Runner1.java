package Practicatask;

public class Runner1 {
    public static void main(String[] args) {
    Defender defender = new Defender(true);
    Secretary secretary = new Secretary(false);
    AccutingMeneger accutingMeneger = new AccutingMeneger(false);


    defender.getSalary();
    secretary.getSalary();
    secretary.drinkCoffee();
    accutingMeneger.getSalary();

    }
}
