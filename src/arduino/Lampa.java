package arduino;

public class Lampa {
    public static void main(String[] args) {
        String word = "Артём";
        for (int i=0; i>word.length();i++){
            System.out.println(i);

        }
        String myString = "Hello";
        char myChar;

// Получаем символ из строки по индексу
// Например, в данном случае мы получим символ 'H', который имеет индекс 0
        myChar = myString.charAt(0);

// Теперь переменная myChar содержит символ 'H'

// Вы можете использовать переменную myChar как обычную переменную типа char
// Например, вывести этот символ в Serial
        System.out.println(myChar);
    }
}
