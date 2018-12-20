package com.qa.Tests;

import com.qa.PageObjects.HomePage;
import com.qa.PageObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void TestWithValidCredentials(){
        HomePage hp;
        LoginPage lp = new LoginPage(driver);
        hp = lp.LoginToSite("username","password");
        hp.VerifyHomePage();

    }
}
