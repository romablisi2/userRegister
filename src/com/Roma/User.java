package com.Roma;

public class User {
    private final String userName;
    private final String password;
    private final int id;

    public User(String userName, String password, int id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    //turututu
    public void displayUserInformation() {
        System.out.println("Nazwa użytkownika: " + userName);
        System.out.println("hasło " + password);
        System.out.println("ID " + id);
    }
}
