package Lesson5;

public class Continue {
    public static void main(String[] args) {
        int[] results = {3, 2, 10, 6, 8};
        for (int result : results) {
            System.out.println(result);
            if (result == 6) {
                continue;
            }
            System.out.println(result);
        }
    }
}
