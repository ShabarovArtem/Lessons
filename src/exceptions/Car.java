package exceptions;

public class Car {
    private boolean isBroken;
    public Car(boolean isBroken){
        this.isBroken = isBroken;
    }
    public void start() throws CarisBrokenException{
        if (isBroken){
            throw new CarisBrokenException("Машина не работает");
        }
        System.out.println("Машина успешно стартовала");
    }
}
