package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage{

    @FindBy(css = "#product-36 > div.summary.entry-summary > form > button")
    private WebElementFacade addToCartButton;


    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
}
