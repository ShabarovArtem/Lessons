package Practica;

public class Sortirovka {
    public static void main(String[] args) {
        int[] numbers2 = {3, 2, 10, 5, 8};
//        1 задание
//
////            for (int i =0; i<numbers2.length;i++){
////                if(!(numbers2[i] % 2 > 0)){
////                    System.out.println(numbers2[i]);
////                }
////            }
//        for (int number : numbers2) {
//                if(number % 2 == 0){
//                    System.out.println(number);
//                }
//            }
//
//        }
//        2 задание
        for (int i =0; i<numbers2.length;i++) {
                if(i % 2 == 0){
                    System.out.println(numbers2[i]);
                }
            }
        }
    }