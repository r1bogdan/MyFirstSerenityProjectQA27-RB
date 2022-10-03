package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void clickPlaceOrder(){
        checkoutPage.setPlaceOrder();
        waitABit(5000);
    }
    @Step
    public void getbillingFirstNameField(String bfirstname){
        checkoutPage.setbillingFirstNameField(bfirstname);
    }
    @Step
    public void getbillingLastNameField(String blastname){
        checkoutPage.setbillingLastNameField(blastname);
    }
    @Step
    public void getBillingAddress1(String bAddress1){
        checkoutPage.setBillingAddress1Field(bAddress1);
    }
    @Step
    public void getbillingCityField(String bCity){
        checkoutPage.setbillingCityField(bCity);
    }
    @Step
    public void setfindCountyInListAndClick(String bCounty){
        checkoutPage.setBillingCountyField();
        checkoutPage.findCountyInListAndClick(bCounty);
    }
    @Step
    public void getbillingPostCodeField(String bPostcode){
        checkoutPage.setbillingPostCodeField(bPostcode);
    }
    @Step
    public void getbillingPhoneField(String bPhone){
        checkoutPage.setbillingPhoneField(bPhone);
    }
    @Step
    public void getBillingEmailField(String bEmail){
        checkoutPage.setbillingEmailField(bEmail);
    }

    @Step
    public void setBillingDetailsAndPlaceOrder(String bfirstname, String blastname,String bAddress1, String bCounty, String bCity,  String bPostcode,String bPhone, String bEmail){
        getbillingFirstNameField(bfirstname);
        getbillingLastNameField(blastname);
        getBillingAddress1(bAddress1);
        getbillingCityField(bCity);
        setfindCountyInListAndClick(bCounty);
        getbillingPostCodeField(bPostcode);
        getbillingPhoneField(bPhone);
        getBillingEmailField(bEmail);
        clickPlaceOrder();


    }

}
