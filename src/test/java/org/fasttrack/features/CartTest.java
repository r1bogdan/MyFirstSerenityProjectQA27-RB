package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");
    }

//    @Test
//    public void removeAllItemsFromCartAndCheckCartIfItIsEmptyTest(){
//        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
//        searchSteps.navigateToProductName("Beanie with Logo");
//        cartSteps.addProductToCart();
////        CartSteps.CheckCart();
//        cartSteps.emptyCart();
////        cartSteps.verifyCartIsEmptyMessage();
//    }






    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("Beanie with Logo");

       // cartSteps.checkSubtotalPrice();
        //cartSteps.checkTotalPrice();
    }

}
