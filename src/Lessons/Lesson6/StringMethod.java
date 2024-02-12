package Lessons.Lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world";
        String upperCase = text.toUpperCase();// ctrk+alt+v
        System.out.println(upperCase);

        String textLower = text.toLowerCase();
        System.out.println(textLower);  //нижний регистр

        int length = text.length();  // длина
        System.out.println(length);

        boolean containsHello = text.contains("Hello"); // есть ли в тексте текст
        System.out.println(containsHello);

        String replacedtexst = text.replaceAll("r", "a"); // заменить куски текста
        System.out.println(replacedtexst);

        String repeat = text.repeat(10); // повторить
        System.out.println(containsHello);

        String names = "Yuri;Olga;Petr;Vasya";
        String[] splitggg = names.split(";");
        System.out.println(Arrays.toString(splitggg)); //разбить текст на массив стринг

        String world1 = "hi ";
        String world2 = "friend";
        String result = world1 + world2;
        System.out.println(result);

        boolean startsWith = text.startsWith("Hel"); // начинается ли с этого
        System.out.println(startsWith);

        boolean endWith = text.endsWith("world"); // заканчивается ли с этого
        System.out.println(endWith);

        String fistfive = text.substring(0, 5); // substring - подстрока
        System.out.println(fistfive);

        String hellowww = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(hellowww);



    }
}
