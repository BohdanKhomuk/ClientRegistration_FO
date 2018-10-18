package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static int polygon = 40; //22 - Test; 40 - RC; 50 - Master//

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;    }

    private By userName = By.id("txtUserName");
    private By passwordField = By.id("txtPassword");
    private By buttonLogin = By.id( "btLogIn" );
    private By buttonChangDate = By.id( "btChangDate" );

    public static int getPolygon() {
        return polygon;
    }

    public static void setPolygon(int polygon) {
        LoginPage.polygon = polygon;
    }

    private void typeUserName(String name){
        driver.findElement( userName ).clear();
        driver.findElement( userName).sendKeys( name );
    }

    private void typePassword(String password){
        driver.findElement( passwordField ).clear();
        driver.findElement( passwordField).sendKeys( password );
    }

    private void clickButtonLogin(){
        driver.findElement( buttonLogin).click();
        new LoginPage( driver );
    }

    private void clickButtonChangDate(){
        driver.findElement( buttonChangDate).click();
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
