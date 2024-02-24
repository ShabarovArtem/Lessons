package Task4;

import equals_and_hashcode.Child;

public class runner {
    public static void main(String[] args) {
        user user1 = new user("Artem","123456");
        user user2 = new user("Artem","654321");


        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
