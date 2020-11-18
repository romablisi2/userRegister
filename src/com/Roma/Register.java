package com.Roma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {

    public List<User> users = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();
    private int id;
    private int count= 1;
    private int[] ids = new int[count++];

    Scanner scanner = new Scanner(System.in);

    public void addUser(){
        System.out.println("Podaj nazwę użytkownika");
        String userName = scanner.nextLine();

            System.out.println("Podaj hasło");
            String password = scanner.nextLine();
            ids[0] = id++;
            User user = new User(userName, password, id);
        if (getUsers().equals(userName)) {
            System.out.println("Nazwa użytkownika jest zajęta");
        } else {
            users.add(user);
            passwords.add(password);
        }
    }
    private String getUsers() {
        String userName = "";
        for (User user : users) {
           userName = user.getUserName();
        }
        return userName;
    }

    public void displayUsers() {

        for(User user : users) {
            user.displayUserInformation();
        }
    }
}
