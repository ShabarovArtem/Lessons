package Lessons.Lesson6.oop.basics;

public interface Moveable {
    void move();
    default void back(){
        System.out.println("Comeback");
    }
}
