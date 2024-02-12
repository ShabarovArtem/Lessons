package oop.lesson7;

public class Cat {
    //абстракция - выделение нужных свойств
    String color;
    double weight;
    String ownerName;

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;

    }
public void destroySofa(String sofaOwner){
        System.out.printf("cat destroy %s\n", sofaOwner);

}

public String hunt(boolean isDay) {
        if (isDay){
            return "Мышь\n";
        }
            return "Сова\n";

}
    public String hunt(boolean isDay,boolean success){
        if (success){if (isDay){
            return "Мышь\n";
        }
            return "Сова\n";

        }   return "ничего\n";
    }
}

