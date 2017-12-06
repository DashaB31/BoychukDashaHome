package com.selenium.test;

import com.selenium.test.pages.LoginPage;
import org.apache.log4j.Logger;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class LoginPageTest {
    private static final Logger LOGGER = Logger.getLogger(LoginPageTest.class);
    private WebDriver driver;

    @Before
    public void setUp() {

        LOGGER.info("Chrome will be started");
        File fileFF = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        LOGGER.info("Chrome is started");

        Timeout.seconds(20);
    }

    @After
    public void tearDown() throws Exception {
        //     driver.quit();
    }

    @Test
    public void successfulLogin() throws InterruptedException {
        LoginPage loginPage = doLogin();
        String title = loginPage.getLoginName();
        assertEquals(LoginPage.LOGIN, title);
    }

    public LoginPage doLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login();
        return loginPage;
    }
}
