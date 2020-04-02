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
}


