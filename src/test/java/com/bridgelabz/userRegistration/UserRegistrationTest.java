package com.bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user = new UserRegistration();
    @Test
    public void givenUserFirstName_validThenTrue() {
        boolean firstName = user.checkName("Pushkar");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenUserFirstName_invalidThenFalse() {
        boolean firstName = user.checkName("pushkar");
        Assert.assertFalse(firstName);
    }
    @Test
    public void givenUserLastName_validThenTrue() {
        boolean lastName = user.checkName("Morey");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenUserLastName_invalidThenFalse() {
        boolean lastName = user.checkName("morey");
        Assert.assertFalse(lastName);
    }
}
