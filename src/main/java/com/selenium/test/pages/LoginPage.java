package com.selenium.test.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertNotNull;

public class LoginPage {

    private WebDriver driver;

    public final static String      LOGIN = "dboychuk3107@gmail.com";

//    @FindBy(name = "_username")
//    private WebElement name;
//    @FindBy(id = "password")
//    private WebElement passwordElement;
//    @FindBy(xpath = "//button")
//    private WebElement enterButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void openLoginPage() {

        driver.get("https://leboutique.com/");
        WebElement enterButton = driver.findElement(By.className("header__btn-auth"));
        enterButton.click();

    }


    public void login() {
        WebElement inputLogin = driver.findElement(By.id("USER_LOGIN"));
        inputLogin.clear();
        inputLogin.sendKeys(LOGIN);
        WebElement inputPassword = driver.findElement(By.id("U_PASS"));
        inputPassword.clear();
        inputPassword.sendKeys("MC8e9Y36MJ");
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[2]/div[2]/div/a"));
        buttonLogin.click();
    }

    public String getLoginName() {
        WebElement profileHead = driver.findElement(By.id("js-profile-switcher"));
        assertNotNull(profileHead);
        try {
            Thread.sleep(1000);
            profileHead.click();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        assertNotNull(driver.findElement(By.xpath("//*[@id=\"js-profile-menu-body\"]/div/div[1]/div/span[2]/span[1]")));

        return driver.findElement(By.xpath("//*[@id=\"js-profile-menu-body\"]/div/div[1]/div/span[2]/span[1]")).getText();
    }
}