package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void loginAndSearchForProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Beanie");
        searchSteps.findProductWithNameInListAndOpen("Beanie with Logo");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Belt");
        searchSteps.findProductWithNameInListAndOpen("Belt");

    }
}

