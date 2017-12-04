package com.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckInPage {
    private WebDriver _browser;

    public CheckInPage(WebDriver driver) {
        _browser = driver;
    }

    public void newUserLoginPage(String url) {

        _browser.get(url);
        WebElement enterButton = _browser.findElement(By.className("header__btn-auth"));
        enterButton.click();
        enterButton = _browser.findElement(By.xpath("//a[contains(text(), 'Новый пользователь')]"));
        enterButton.click();

    }

    public void newUser() {
        WebElement inputEmail = _browser.findElement(By.xpath("//*[@id=\"registration-form\"]/form/div[2]/div[1]/div[1]/input"));
        inputEmail.clear();
        inputEmail.sendKeys("dboychuk31071@gmail.com");
        WebElement iAgree = _browser.findElement(By.xpath("//*[@id=\"registration-confirm\"]/i"));
        iAgree.click();
        WebElement fieldWoman = _browser.findElement(By.cssSelector("#registration-form > form > div.b-left > div.controls.submit-controls.js-gender > div > a.btn.btn-48.s-yellow.js-submit"));
        fieldWoman.click();

    }

    public String getAnswer() {
        _browser.findElement(By.xpath("//*[@id=\"registration-form\"]/form/div[1]/p"));
        return _browser.findElement(By.className("js-message-text")).getText();
    }
}
