package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {


    @Test
    public void removeProductFromCart(){
        //loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("Polo");
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.removeFromCart();
    }


    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Belt");
    }






    @Test
    public void AddTwoProductToCartTest() {
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Belt");
    }

    @Test
    public void AddThreeProductToCartTest() {
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Belt");

        searchSteps.navigateToProductName("Hoodie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Hoodie with Logo");
    }
    @Test
    public void AddFourProductToCartTest() {
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Belt");

        searchSteps.navigateToProductName("Hoodie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Hoodie with Logo");

        searchSteps.navigateToProductName("Cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Cap");
    }
    @Test
    public void loginAndAddToCartTenProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("Belt");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Belt");

        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

        searchSteps.navigateToProductName("Long Sleeve Tee");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Long Sleeve Tee");

        searchSteps.navigateToProductName("Hoodie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Hoodie with Logo");

        searchSteps.navigateToProductName("Cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Cap");

        searchSteps.navigateToProductName("Sunglasses");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Sunglasses");

        searchSteps.navigateToProductName("Single");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Single");

        searchSteps.navigateToProductName("T-Shirt with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("T-Shirt with Logo");

        searchSteps.navigateToProductName("Cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Cap");

        searchSteps.navigateToProductName("Polo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Polo");

    }



}
