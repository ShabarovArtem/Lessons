package Practica;

import java.util.Arrays;

public class Razbieniemasiva {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";
        String substringName = text.substring(11).toLowerCase();
        String[] name = substringName.split(" ");
        for (String world : name){
            System.out.println(world);
            System.out.println(world.length());
        }





    }
}
