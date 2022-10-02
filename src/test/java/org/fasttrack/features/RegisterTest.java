package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{


    @Test
    public void registerWithValidCredentialsTest() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setRegisterUserEmail("test3@test.com");
        registerSteps.setRegisterPassword("123456789test!!!");
        registerSteps.clickRegister();
        registerSteps.verifyUserIsRegisterIn( "test3");
    }



}
