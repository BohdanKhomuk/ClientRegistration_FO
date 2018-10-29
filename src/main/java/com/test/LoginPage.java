package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private static int polygon = 22; //22 - Test; 40 - RC; 50 - Master//

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;    }

    @FindBy(id = "txtUserName")
    @CacheLookup
    private WebElement userName;
    @FindBy(id = "txtPassword" )
    @CacheLookup
    private WebElement passwordField;
    @FindBy(id = "btLogIn")
    @CacheLookup
    private WebElement buttonLogin;
    @FindBy(id = "btChangDate")
    @CacheLookup
    private WebElement buttonChangDate;

    public static int getPolygon() {
        return polygon;
    }

    public static void setPolygon(int polygon) {
        LoginPage.polygon = polygon;
    }

    private void typeUserName(String name){
        userName.clear();
        userName.sendKeys( name );
    }

    private void typePassword(String password){
        passwordField.clear();
        passwordField.sendKeys( password );
    }

    private void clickButtonLogin(){
        buttonLogin.click();
        new LoginPage( driver );
    }

    private void clickButtonChangDate(){
        buttonChangDate.click();
        new LoginPage( driver );
    }

    public void enterInMainPage(String name, String password){
        this.typeUserName( name );
        this.typePassword( password );
        this.clickButtonLogin();
        this.clickButtonChangDate();
        new LoginPage( driver );
    }
}
