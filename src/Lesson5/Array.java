package Lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
  //      int[] array = new int[2];
  //      System.out.println(Arrays.toString(array));
 //       array[0] = x;
//        int [] array = new int[]{x,y};
//        int [] array = {x,y};
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[1]);
        int [] array = {x,y};
        int [] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 1;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
