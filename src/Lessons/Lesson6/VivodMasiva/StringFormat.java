package Lessons.Lesson6.VivodMasiva;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Артём";
        int age = 20;
//        String phrase = String.format("Меня зовут %s. Мне %d лет.", name,age);
//        System.out.println(phrase);
        System.out.printf("Меня зовут %s. Мне %d лет.", name,age);

    }
}
