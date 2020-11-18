package com.Roma;

public class User {
    private String userName;
    private String password;
    private int id;

    public User(String userName, String password, int id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void displayUserInformation() {
        System.out.println("Nazwa użytkownika: " + userName);
        System.out.println("hasło " + password);
        System.out.println("ID " + id);
    }
}
