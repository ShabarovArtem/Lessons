package Task4;

import equals_and_hashcode.Child;

import java.util.Objects;

public class user {
    private String login;
    private String password;

    public user(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        user user = (user) o;
//        return password == user.password && Objects.equals(login, user.login);
        if (o == null) {
            return false;
        } if (o instanceof user anotheruser){
            return this.login.equals(anotheruser.login) && this.password.equals(anotheruser.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }

}
