package org.example;

import org.example.servis.ValidationService;

import static org.example.servis.ValidationService.validate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework17_2");
        validate("login", "pass", "pass");
        System.out.println("Good - \uD83D\udE09");

    }
}