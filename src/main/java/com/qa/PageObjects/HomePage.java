package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends InitializePageObject{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void VerifyHomePage(){
        System.out.println("In Home Page verify");

    }
}
