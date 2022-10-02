package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(css = "#primary > main > div.woocommerce-message")
    private WebElementFacade successMessage;

//    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove")
//    private List<WebElementFacade> removeProductsList;

    @FindBy(css = ".product-subtotal .woocommerce-Price-amount amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.cart-subtotal > td > span")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.shipping > td > span")
    private WebElementFacade taxPrice;

    @FindBy(css = "#post-5 > div > div > div > div > table > tbody > tr.order-total > td > strong > span")
    private WebElementFacade totalCartPrice;

    public String getSuccessMessage(){
        System.out.println(successMessage.getText().replace("View cart\n", ""));
        return successMessage.getText().replace("View cart\n", "");
    }

    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;

//    public void clickUpdateCart(){
//        clickOn(updateCart);}



//    public void removeProducts(){
//            if (removeProductsList.size() > 0) {
//                for(int i = 1; i <= removeProductsList.size(); i++){
//                    waitABit(2000);
//                    removeProductsList.get(0).click()}
//                }
//            }
//        }


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
