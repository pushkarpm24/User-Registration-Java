package com.bridgelabz.userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static String namePattern = "[A-Z][a-zA-Z]{2}[a-zA-Z]*";
    static String emailPattern = "abc[.][a-zA-Z]+@bl[.]co[.][a-z]*";
    static String mobileNumberPattern = "^[0-9]{2}\\s[1-9][0-9]{9}";
    static String passwordPattern = "(?=.*[A-Z]).{8,}";

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
    public boolean checkMobileNumber(String mobileNumber) {
        boolean result = mobileNumber.matches(mobileNumberPattern);
        return result;
    }
    public boolean checkPassword(String password) {
        boolean result = password.matches(passwordPattern);
        return result;
    }
}
