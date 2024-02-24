package exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
//        ArithmeticException e = new ArithmeticException("Ошибка");
        try {
            int[] ints = new int[2];
            System.out.println(ints[3]);
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Произошла ошибка связанная с делением" + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Произошла ошибка связанная с массивом" + e.getMessage());
        }
//        throw new ArithmeticException("Деление на ноль");

        System.out.println("Действия после");
    }
}
