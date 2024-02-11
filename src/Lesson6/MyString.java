package Lesson6;

public class MyString {
    public static void main(String[] args) {
        String text = new String("hey");
        String text2 = new String("hey");
        System.out.println(text.equals(text2)); // equals нужен чтобы строчки сравнивались по значению, а не по ссылке. тут text сравнивают с text2

    }
}
