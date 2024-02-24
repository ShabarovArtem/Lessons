package exceptions;

public class Runner {
    public static void main(String[] args) throws CarisBrokenException {
        Car car = new Car(true);
        car.start();
    }
}
