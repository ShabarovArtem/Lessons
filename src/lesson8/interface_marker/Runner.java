package lesson8.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        if (bird instanceof Alive){
            System.out.println("Живой");
        }
        if (airplane instanceof Alive){
            System.out.println("Живой");
        } else {
            System.out.println("ne Живой");
        }
    }
}