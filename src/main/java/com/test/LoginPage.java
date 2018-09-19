package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public static int polygon = 50; //22 - Test; 40 - RC; 50 - Master//

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;    }

    private By userName = By.id("txtUserName");
    private By passwordField = By.id("txtPassword");
    private By buttonLogin = By.id( "btLogIn" );
    private By buttonChangDate = By.id( "btChangDate" );


    public LoginPage typeUserName(String name){
        driver.findElement( userName ).clear();
        driver.findElement( userName).sendKeys( name );
        return this;
    }

    public LoginPage typePassword(String password){
        driver.findElement( passwordField ).clear();
        driver.findElement( passwordField).sendKeys( password );
        return this;
    }

    public LoginPage clickButtonLogin(){
        driver.findElement( buttonLogin).click();
        return new LoginPage( driver );
    }

    public LoginPage clickButtonChangDate(){
        driver.findElement( buttonChangDate).click();
        return new LoginPage( driver );
    }

    public LoginPage enterInMainPage(String name, String password){
        this.typeUserName( name );
        this.typePassword( password );
        this.clickButtonLogin();
        this.clickButtonChangDate();
        return new LoginPage( driver );
    }
}
