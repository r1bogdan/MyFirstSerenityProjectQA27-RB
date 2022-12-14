package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String keyword){
        homePage.clickSearchButton();
        homePage.setSearchField(keyword);
        homePage.clickSearchButton2();

    }

    @Step
    public void findProductWithNameInListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGridAndOpen(productName));
    }


    @Step
    public void navigateToProductName(String productName){
        searchForKeyword(productName);
        findProductWithNameInListAndOpen(productName);
    }
    @Step
    public void findProductWithInvalidName(){
        Assert.assertEquals("Sorry, but nothing matched your search terms. Please try again with some different keywords.",searchResultsPage.getSearchForInvalidProduct());
    }
}
