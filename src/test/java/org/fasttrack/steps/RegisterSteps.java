package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage() {
        homePage.clickAccountLink();
        // homePage.clickLoginLink();
    }

    @Step
    public void setRegisterUserEmail(String email) {
        registerPage.setRegisterEmailField(email);
    }

    @Step
    public void setRegisterPassword(String password) {
        registerPage.setRegisterPasswordField(password);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyUserIsRegisterIn(String userName) {
        Assert.assertEquals("" + userName + "", accountPage.getWelcomeText());
    }

    @Step
    public void verifyUserNotRegisterIn(){
        Assert.assertEquals("ERROR: The password you entered for the email address r1bogdan@yahoo.com is incorrect. Lost your password?",loginPage.getErrorMessage());
    }

    @Step
    public void doRegister(String email, String pass){
        navigateToRegisterPage();
        setRegisterUserEmail(email);
        setRegisterPassword(pass);
        clickRegister();
    }
}
