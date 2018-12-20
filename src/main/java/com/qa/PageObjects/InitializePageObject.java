package com.qa.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitializePageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public InitializePageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,40);
    }
}
