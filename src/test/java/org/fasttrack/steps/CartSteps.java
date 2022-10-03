package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickAddToCart();
    }


    @Step
    public void checkSuccessMessage(String productName){
        Assert.assertEquals(("“" + productName + "” has been added to your cart.").toLowerCase(), cartPage.getSuccessMessage().toLowerCase());
    }
    @Step
    public void viewCart() {
        homePage.clickCartMenuButton();
    }
    @Step
    public void proceedToCheckOut() {
        cartPage.clickProceedToCheckOutButton();
    }
    public void removeFromCart() {
        cartPage.removeFromCartButton();
    }
    @Step
    public void viewCartWhenProductAdded() {
        cartPage.clickViewCartButton();
    }
    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
}
