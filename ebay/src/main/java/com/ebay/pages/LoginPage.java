package com.ebay.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "userid")
    private WebElement emailField;


    @FindBy(id = "signin-continue-btn")
    private WebElement continueBtn;

    @FindBy(id = "pass")
    private WebElement passwordField;

    public void typeOnEmailField(String username) {
        emailField.sendKeys(username);
        ExtentTestManager.log("Typed username");
    }

    public void clickOnContinueButton() {
        continueBtn.click();
        ExtentTestManager.log("Clicked on continue button");

    }

    public void typeOnPasswordField(String password) {
        passwordField.sendKeys(password);
        ExtentTestManager.log("Password entered");
    }

}