package com.ebaytest;

import com.base.TestBase;
import com.ebay.data.DataProviders;
import com.ebay.pages.HomePage;
import com.ebay.pages.RegisterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData")
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
        homePage.clickOnSearchButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }


    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials")
    public void validateUserBeingAbleToLogin(String userName, String password) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();

    }

    @Test
    public void validateUserBeingAbleRegister() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        homePage.clickOnRegisterButton();
        registerPage.validateURL();
        registerPage.validateCreateAccountDisplayed();

    }

    @Test
    public void fieldsValidationOnRegisterPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        homePage.clickOnRegisterButton();
        registerPage.validateFields();

    }

    @Test(enabled = true)
    public void fieldsValidationOnRegisterPageUsingSoftAssert() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        homePage.clickOnRegisterButton();
        registerPage.validateFieldsUsingSoftAssert();

    }


}
