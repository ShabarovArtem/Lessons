package Lessons.Lesson6.oop.lesson7.zoo;

import Lessons.Lesson6.oop.lesson7.Cat;
import Lessons.Lesson6.oop.lesson7.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat,Dog dog){
//        if (cat == null){
//            this.cat = new Cat();
//        }
        this.cat = cat;
        this.dog = dog;

    }
    public void feed() {
        cat.feed("Yuri","Рыбу");
        dog.feed("Yuri","Рыбу" );
    }
}
