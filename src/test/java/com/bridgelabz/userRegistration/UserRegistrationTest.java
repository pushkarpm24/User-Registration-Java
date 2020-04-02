package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {
    UserRegistration user = new UserRegistration();
    @Test
    public void givenUserFirstName_validThenTrue() {
        boolean result = user.checkFirstName("Pushkar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenUserLastName_validThenTrue() {
        boolean result = user.checkLastName("Morey");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_validThenTrue() {
        boolean result = user.checkEmailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_validThenTrue() {
        boolean result = user.checkMobileNumber("91 7768076656");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_validThenTrue() {
        boolean result = user.checkPassword("p*ush8karM");
        Assert.assertTrue(result);
    }
}


