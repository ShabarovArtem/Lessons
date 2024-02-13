package Practica;
import Practica.Car;
public class Cars {
    public static void main(String[] args) {
//        String carMark = "Audi";
//        String carModel = "Q3";
//        double price = 15_000.00;
//        Boolean hasAutomaticTrans = true;
//        String result = """
//                Привет, я менеджр салона %s
//                У нас есть модель - %s за %f
//                Есть ли у вас автоматическая коробка передач?
//                %s
//                """.formatted(carMark, carModel,price,hasAutomaticTrans ? "да": "нет");
//        System.out.println(result);
        Car zvorykinCar = new Car("ZvorykinCar");
        zvorykinCar.investigateSpeed100();

    }
}
