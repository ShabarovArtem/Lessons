package oop.lesson7;
// метод = это функция для экземпляра класса
public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Black",10,"Petr");  //экземпляр класса              // ctrl + P, показать что требует
//        System.out.println(cat);
//        System.out.println(cat.color);
//        cat.color = "red";
//        System.out.println(cat.color);
        cat.destroySofa("Петра");

        String animal = cat.hunt();
        System.out.println(animal);

    }
}
