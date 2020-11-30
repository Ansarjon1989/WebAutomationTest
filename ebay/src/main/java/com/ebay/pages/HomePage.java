package com.ebay.pages;

import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id = "gh-ac")
    private WebElement searchBar;


    @FindBy(id = "gh-btn")
    private WebElement searchBtn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    @FindBy(linkText = "register")
    private WebElement registerBtn;


    public void typeOnSearchBar() {

        LOGGER.info("sending keys: Java Books");
        searchBar.sendKeys("Java Books");
        ExtentTestManager.log("Typed on search bar ");

    }

    public void clickOnSearchButton() {
        searchBtn.click();
        ExtentTestManager.log("Clicked on Search Button");

    }

    public void clickOnSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }

    public void clickOnRegisterButton(){
        registerBtn.click();
        ExtentTestManager.log("Clicked on Register button");
    }



}
