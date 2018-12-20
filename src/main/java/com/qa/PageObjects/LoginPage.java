package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends InitializePageObject{

    @FindBy(id="email")
    public WebElement userName;

    @FindBy(id="pass")
    public WebElement password;

    @FindBy(id="loginbutton")
    public WebElement loginButton;

    @FindBy(xpath="//a[text()='Home']")
    public WebElement lnkHome;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage LoginToSite(String uname, String pass){
        userName.sendKeys(uname);
        password.sendKeys(pass);
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(lnkHome));
        return new HomePage(driver);
    }
}
