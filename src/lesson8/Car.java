package lesson8;

public class Car {
    private String brand;
    private static int countCars = 0;
    public final static String BMW_INFO = "Bnw - car";
    public final static String AUDI_INFO = "Audi - car";
    public final static String KIA_INFO = "Kia - car";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];
    static{
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;


    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }
    public int getCountCars() {
        return countCars;
    }
    public static void printBrads(){
        System.out.println("Перечень доступных брендов? bmw, audi, kia");
    }
}
