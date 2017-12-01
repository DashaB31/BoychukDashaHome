package com.selenium.test;

import com.selenium.test.pages.LoginPage;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

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
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id("js-profile-menu-header")).click();
        String title = driver.findElement(By.xpath("//*[@id=\"js-profile-menu-body\"]/div/div[1]/div/span[2]/span[1]")).getText();


        Assert.assertThat(title,is("dboychuk3107@gmail.com"));
    }
}
