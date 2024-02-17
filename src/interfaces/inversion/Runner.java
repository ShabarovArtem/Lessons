package interfaces.inversion;

public class Runner {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terier terier = new Terier();

        DogZoo dogZoo = new DogZoo(terier, shepherd);

    }
}
