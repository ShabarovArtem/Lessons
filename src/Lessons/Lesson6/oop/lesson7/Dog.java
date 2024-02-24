package Lessons.Lesson6.oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";
    {
        System.out.println("Собака родилась");// блок инициализации
    }
    public Dog(){

    }
    public Dog(String name, int weight, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public void setWeight(int newWeight){
        if (newWeight<1){
            this.weight = 5;
        }else {
            this.weight = newWeight;
        }
    }
public String getOwner(){
        return "Mr"+owner;
}
    public void feed(String giver, String ...product){
        System.out.printf("Человек %s даёт еду. Собака поел: %s\n", giver, Arrays.toString(product));
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
