package org.example.exception;

public class WrongPasswordException extends RuntimeException {
    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password) {
        super("Не корректный пароль: %s".formatted(password));
        this.password = password;
    }
//      public WrongPasswordException(String message, String password) {
//        super(message);
//  this.password = password;
//    }
    public WrongPasswordException(String password, String confirmPassword) {
        super("Пароль: %s отличается от: %s".formatted(password, confirmPassword));
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

}

