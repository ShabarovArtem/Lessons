package nested_classes;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("23aa", "33324b", PassportTypenumber.FOREIGN);
        System.out.println(human);
//        Human.Heart heart = human.new Heart(280.0);

    }
}
