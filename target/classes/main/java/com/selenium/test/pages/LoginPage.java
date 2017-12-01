package com.selenium.test.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;


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
        inputLogin.sendKeys("dboychuk3107@gmail.com");
        WebElement inputPassword = driver.findElement(By.id("U_PASS"));
        inputPassword.clear();
        inputPassword.sendKeys("MC8e9Y36MJ");
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[2]/div[2]/div/a"));
        buttonLogin.click();


    }
}