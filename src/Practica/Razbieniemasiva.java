package Practica;

import java.util.Arrays;

public class Razbieniemasiva {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";
        String substringName = text.substring(11, text.length()).toLowerCase();
        String[] name = substringName.split(" ");
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);





    }
}
