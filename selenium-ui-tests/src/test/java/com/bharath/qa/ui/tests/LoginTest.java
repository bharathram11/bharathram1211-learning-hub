package com.bharath.qa.ui.tests;

import static org.testng.Assert.assertTrue;

import com.bharath.qa.ui.base.BaseTest;
import com.bharath.qa.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(description = "Verifies successful login for a public demo application")
    public void shouldLoginSuccessfully() {
        LoginPage loginPage = new LoginPage(driver).open();

        loginPage.login("tomsmith", "SuperSecretPassword!");

        assertTrue(loginPage.getFlashMessage().contains("You logged into a secure area!"),
                "Successful login message was not displayed.");
    }
}
