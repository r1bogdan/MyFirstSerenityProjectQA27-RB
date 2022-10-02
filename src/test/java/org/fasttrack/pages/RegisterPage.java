package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage {

    @FindBy(id = "reg_email")
    private WebElementFacade registeremailField;

    @FindBy(id = "reg_password")
    private WebElementFacade registerpasswordField;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;

//    @FindBy(css = "#post-7 > div > div > ul > li")
//    private WebElementFacade errorMessageElement;

    public void setRegisterEmailField(String value) {
        typeInto(registeremailField, value);
    }

    public void setRegisterPasswordField(String value) {
        typeInto(registerpasswordField, value);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

//    public String getErrorMessage(){
//        return errorMessageElement.getText();
//    }

}
