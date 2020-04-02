package com.bridgelabz.userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static String namePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";
    static String emailPattern = "abc[.][a-zA-Z]+@bl[.]co[.][a-z]*";

    public boolean checkFirstName(String firstname) {
        boolean result = firstname.matches(namePattern);
        return result;
    }
    public boolean checkLastName(String lastName) {
        boolean result = lastName.matches(namePattern);
        return result;
    }
    public boolean checkEmailId(String emailId) {
        boolean result = emailId.matches(emailPattern);
        return result;
    }
}
