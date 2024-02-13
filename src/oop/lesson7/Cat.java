package oop.lesson7;

import java.util.Arrays;

public class Cat {
    //абстракция - выделение нужных свойств
    private String color;
    private double weight;
    private String ownerName;

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
    public void feed(String giver, String ...product){
        System.out.printf("Человек %s даёт еду.Кот поел: %s\n", giver, Arrays.toString(product));
    }
}

