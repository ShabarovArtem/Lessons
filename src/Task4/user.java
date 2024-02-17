package Task4;

import equals_and_hashcode.Child;

public class user {
    private String login;
    private int password;

    public user(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return this.getLogin().length();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if (obj instanceof user user2){
            return this.getLogin().equals(user2.getLogin()) && this.getPassword() == user2.getPassword();
        }
        return false;
    }
}
