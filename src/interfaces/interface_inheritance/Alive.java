package interfaces.interface_inheritance;

public interface Alive extends Eatable,Moveable {
    @Override
    default void eat() {
        Eatable.super.eat();// обращение к конкретному методу eat в Eatable
    }
}
