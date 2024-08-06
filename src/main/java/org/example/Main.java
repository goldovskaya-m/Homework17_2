package org.example;

import org.example.exception.WrongLoginException;
import org.example.exception.WrongPasswordException;
import org.example.servis.ValidationService;

import static org.example.servis.ValidationService.validate;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Homework17_2");
            validate("login", "pass", "pass");
            System.out.println("Good - \uD83D\udE09");
            // } catch (WrongLoginException e) {
            //     System.out.println("Случилась ошибка");
            //     e.printStackTrace();
            //  } catch (WrongPasswordException e) {
            //     System.out.println(e.getMessage());
        } catch (WrongPasswordException a) {
            System.out.println("Bad - \uD83D\uDE22");
        } catch (WrongLoginException b) {
            System.out.println("Very bad - \uD83D\uDE21");
        } finally {
            System.out.println(100);

        }

        //   } catch (WrongPasswordException | WrongLoginException a) {
        //       System.out.println("!");
        //   }

        while (true) {
        }
    }
}


