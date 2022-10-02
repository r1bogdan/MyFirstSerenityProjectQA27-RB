package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade errorMessageElement;

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

}
