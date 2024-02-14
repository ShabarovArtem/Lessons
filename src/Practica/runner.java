package Practica;

public class runner {
    public static void main(String[] args) {
        Car audi = new Car("audi", 400);
//        audi.investigateSpeed100();

        Car bmw = new Car("bmw", 400);
//        audi.investigateSpeed100();


        Garage garage = new Garage();
        garage.setCar1(audi);
        garage.setCar2(bmw);
        garage.getInfoAboutCars();
    }

}
