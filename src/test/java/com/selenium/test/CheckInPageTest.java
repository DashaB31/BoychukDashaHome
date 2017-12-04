package com.selenium.test;

import com.selenium.test.pages.CheckInPage;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.hamcrest.core.Is.is;

public class CheckInPageTest {
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
    public void checInPage() throws InterruptedException {
        CheckInPage testingPage = new CheckInPage(driver);
        testingPage.newUserLoginPage("https://leboutique.com/");
        testingPage.newUser();
        String answer = testingPage.getAnswer();
        LOGGER.info("answer="+answer);
        Assert.assertThat(answer, is("Для подтверждения регистрации на ваш адрес электронной почты отправлен email"));


    }
}

