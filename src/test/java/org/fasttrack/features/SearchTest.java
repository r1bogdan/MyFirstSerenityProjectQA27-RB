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
    @Test
    public void loginAndSearchForThirdProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Hoodie");
        searchSteps.findProductWithNameInListAndOpen("Hoodie with Logo");
    }
    @Test
    public void SearchForProductNameTest(){
        searchSteps.searchForKeyword("Album");
        searchSteps.findProductWithNameInListAndOpen("Album");
    }


    @Test
    public void searchForInvalidProduct() {
        searchSteps.searchForKeyword("!belt");
        searchSteps.findProductWithInvalidName();
    }
}

