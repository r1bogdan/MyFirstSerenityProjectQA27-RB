package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ProductPage extends BasePage{

    @FindBy(css = ".cart .single_add_to_cart_button")
    private WebElementFacade addToCartButton;

//    @FindBy(css="#quantity_633ada003d078")
//    private WebElementFacade setQtyFieldProducts;

//    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove > a")
//    private WebElementFacade removeFromCartButton;

    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
//    public void clickRemoveFromCart(){
//        clickOn(removeFromCartButton);
//    }
//    public void getQtyFieldProducts(int Qty) {
//        setQtyFieldProducts.clear();
//        setQtyFieldProducts.sendKeys(Qty + "");
//    }
//    public void getSQtyFieldProducts(String Qty) {
//        setQtyFieldProducts.clear();
//        setQtyFieldProducts.sendKeys(Qty + "");
//    }
//    public void clickQtyLogoProductTShirt(int Qty){
//        logoProductTShirt.clear();
//        logoProductTShirt.sendKeys(Qty + "");
//    }
//    public void clickQtyLogoProductBeanie(int Qty){
//        logoProductBeanie.clear();
//        logoProductBeanie.sendKeys(Qty + "");
//    }
}
