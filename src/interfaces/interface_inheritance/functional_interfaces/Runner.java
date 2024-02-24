package interfaces.interface_inheritance.functional_interfaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSounds();

        Sounding bird = () -> System.out.println("Птица поет"); // Выражением -> System.out.println("Птица поет"); создали класс Bird
        //puplic class Bird implements Sounding{
        //public void makeSound("Птица поет"){
        //System.out.println();
        //}} как класс создали, сразу удалили, существует только реализация интерфейса Sounding
        bird.makeSounds();

    }
}
