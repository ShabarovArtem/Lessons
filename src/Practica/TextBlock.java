package Practica;

public class TextBlock {
    public static void main(String[] args) {
        String name1 = "Юрий";
        String text = """
                Привет, как теья зовут?
                Меня зовут %s. А тебя?""".formatted(name1);


    }
}
