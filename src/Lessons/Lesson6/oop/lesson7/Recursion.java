package Lessons.Lesson6.oop.lesson7;
//рекурсия = функция вызывает саму себя
public class Recursion {
    public int sum(int number){
        if (number < 1){
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }
}
