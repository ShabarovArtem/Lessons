package VivodMasiva;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180,178,190};
        int[] group2 = {165,195,193};
        int[][] multiArray = {group1,group2};

        upperFor:
        for (int[] array : multiArray) {
//            System.out.println(Arrays.toString(array));
            for (int number : array) {
                System.out.println(number);
                if (number == 178) {
                    System.out.println("Человек найден");
                    break upperFor;
                }
            }

        }
        System.out.println("Программа работает дальше");
    }
}
