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
    }

    @After
    public void tearDown() throws Exception {
        //     driver.quit();
    }

    @Test
    public void successfulLogin() throws InterruptedException {
        doLogin();

        WebElement  header = driver.findElement(By.className("i i_man i_man_white"));
        Assert.assertThat(header, not(null));

        String title = header.getText();
        Assert.assertThat(title,is("dboychuk3107@gmail.com"));
    }

    public void doLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login();
        Timeout.seconds(10);

        WebElement profileHead = driver.findElement(By.cssSelector("#js-profile-switcher"));
     //   Assert.assertThat(profileHead, not(null));
        profileHead.click();
    }
}
