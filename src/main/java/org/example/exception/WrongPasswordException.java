package org.example.exception;

public class WrongPasswordException extends RuntimeException {
    private String message;

    public WrongPasswordException() {
        super("Не корректный логин");
    }

    public WrongPasswordException(String message) {
        super(message);

    }
}
