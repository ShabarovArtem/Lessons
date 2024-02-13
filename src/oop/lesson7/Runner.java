package oop.lesson7;

import oop.lesson7.zoo.Zoo;

// метод = это функция для экземпляра класса
//прегрузка метода = методы с одинаковым названием, но с разным колличеством или типом аргументов
//атрибут = переменная, описание которой создает программист при создании класса
public class Runner {
//    public static void main(String[] args) {
//        Cat cat = new Cat("Black",10,"Petr");  //экземпляр класса              // ctrl + P, показать что требует
//        cat.destroySofa("Петра");
//
//        String animal = cat.hunt(true,false);
//        System.out.println(animal);
//        cat.feed("рыба","Корм");
//
public static void main(String[] args) {
    Dog dog = new Dog("Muhtar",-10,"Petr");
    Cat cat = new Cat("Black", 10, "Yuri");
    Zoo zoo = new Zoo(cat, dog);
    zoo.feed();



}
}
