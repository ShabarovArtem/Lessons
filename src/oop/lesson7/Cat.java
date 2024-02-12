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

public String hunt() {
        return "Мышь\n";
}
}

