package functional_interfaces;
// для проверки что метод функциональный(1 абстрактный метод)
@FunctionalInterface
public interface Sounding {
    void makeSounds();
    default void doSomething(){
        System.out.println("Делаю что то");
    }
}
