package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(css = "#primary > main > div.woocommerce-message")
    private WebElementFacade successMessage;



    @FindBy(css = ".product-subtotal .woocommerce-Price-amount amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.cart-subtotal > td > span")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css="#post-5 > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove > a")
    private WebElementFacade removeProductFromCartButton;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.shipping > td > span")
    private WebElementFacade taxPrice;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.order-total > td > strong > span")
    private WebElementFacade totalCartPrice;
    @FindBy(css = "#post-5 > div > div > div > div > div > a")
    private WebElementFacade proceedToCheckOutButton;

    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCartButton;

    public String getSuccessMessage(){
        System.out.println(successMessage.getText().replace("View cart\n", ""));
        return successMessage.getText().replace("View cart\n", "");
    }

    public int getProductsSubtotal() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
        }
        return sum;

    }
    public void removeFromCartButton() {
        clickOn(removeProductFromCartButton);
    }


    public void clickProceedToCheckOutButton() {
        clickOn(proceedToCheckOutButton);
    }
    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }


    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

}
