package by.itacademy;

import java.io.Serializable;

public class User implements Serializable { //Serializable предназначена для передачи байт кода, сериализует поля, нет смысла сериализовать метода

    public static final long serialVersionUID = 1L;

    private String login;
    private transient String password; // transient запрещает сериализацию поля

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
