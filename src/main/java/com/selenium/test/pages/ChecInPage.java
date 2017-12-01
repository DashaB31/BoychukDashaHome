package com.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChecInPage {
    private WebDriver driver;

    public ChecInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newUserLoginPage() {

        driver.get("https://leboutique.com/");
        WebElement enterButton = driver.findElement(By.className("header__btn-auth"));
        enterButton.click();
        enterButton = driver.findElement(By.className("class=\'control-link\'"));
        enterButton.click();

    }

    public void newUser() {
        WebElement inputEmail = driver.findElement(By.className("class=\'js-email-value\'"));
        inputEmail.clear();
        inputEmail.sendKeys("dboychuk31071@gmail.com");
        WebElement iAgree = driver.findElement(By.xpath("//*[@id=\"registration-confirm\"]/i"));
        iAgree.click();
        WebElement fieldWoman = driver.findElement(By.cssSelector("#registration-form > form > div.b-left > div.controls.submit-controls.js-gender > div > a.btn.btn-48.s-yellow.js-submit"));
        fieldWoman.click();

    }
}
