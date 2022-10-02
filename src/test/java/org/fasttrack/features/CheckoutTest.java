package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("Beanie with Logo");
        cartSteps.addProductToCart();
//        checkoutSteps.
    }
}
