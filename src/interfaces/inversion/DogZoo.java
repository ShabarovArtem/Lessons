package interfaces.inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Dog poodle, Dog shepherd) {
        System.out.println("Конструктор для любых двух собак");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
    public DogZoo(Poodle poodle, Shepherd shepherd) {
        System.out.println("Конструктор для пуделя и овчарки");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
