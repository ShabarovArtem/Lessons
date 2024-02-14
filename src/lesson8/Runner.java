package lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Car audi = new Car("audi");

        Car.printBrads();
        System.out.println();
        Car.printBrads();
        System.out.println(Car.BMW_INFO);
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));


   }
}
