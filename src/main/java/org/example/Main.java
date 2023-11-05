package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Please enter your hobby:");
        String hobby = scanner.nextLine();

        System.out.println("My name is: " + userName + "\nMy hobby is: " + hobby);
    }
}