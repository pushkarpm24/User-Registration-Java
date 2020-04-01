package com.bridgelabz.userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static String namePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";

    public static void main(String[] args) {
        System.out.println("USER REGISTRATION..");
    }
    public boolean checkName(String firstName) {
        return Pattern.matches(namePattern,firstName);
    }
}
