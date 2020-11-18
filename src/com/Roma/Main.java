package com.Roma;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean menuReset = true;
        Register register = new Register();

        while (menuReset){
            System.out.println("Wybierz opcję");
        System.out.println("1. Zarejestruj użytkownika");
        System.out.println("2. Lista użytkowników");
        System.out.println("3. Wyjście");
            int menuChoice = scanner.nextInt();
            switch (menuChoice) {
            case 1 -> register.addUser();
            case 2 -> register.displayUsers();
            case 3 -> {
                System.out.println("Elo");
                menuReset = false;
            }
            }
        }
    }
}
