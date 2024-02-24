package exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (Exception e){
//            System.exit(0); исключение при котором finally не сработает
            throw new ArithmeticException("Новая ошибка");
        } finally {
            System.out.println("Программа работает дальше");
        }

    }
}
