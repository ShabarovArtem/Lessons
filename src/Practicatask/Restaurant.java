package Practicatask;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog(){
        if (sausageCount>0 && breadCount>1){
            sausageCount--;
            breadCount -=2;
            System.out.println("Хотдог приготолен");
        } else {
            System.out.println("Нет игредиентов");
        }
    }
    public void addProduct(){
        sausageCount += 100;
        breadCount +=200;
    }
}
