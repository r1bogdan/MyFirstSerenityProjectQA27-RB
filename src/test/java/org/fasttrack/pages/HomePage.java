package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade accountLink;

   // @FindBy(css = "a[title='Log In']")
    //private WebElementFacade loginLink;

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > i")
    private WebElementFacade searchButton;

    @FindBy( css = "#masthead > div > div.header-top.cl > div.search-box > form > input[type=text]")
    private WebElementFacade searchField;

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > form > button > i")
    private WebElementFacade searchButton2;




    public void clickAccountLink() {
        clickOn(accountLink);
    }

    //public void clickLoginLink() {
    //    clickOn(loginLink);
   // }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton2(){
        clickOn(searchButton2);
    }


}
