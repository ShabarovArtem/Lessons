package functional_interfaces;

public class Cat implements Sounding {
    @Override
    public void makeSounds() {
        System.out.println("Кошка мяукает");

    }
}
