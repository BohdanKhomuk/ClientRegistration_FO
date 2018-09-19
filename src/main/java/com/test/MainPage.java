package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public WebDriver driver;

    public Pause pause;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.pause = new Pause();
    }

    private By findFunction = By.id("findOpersText");
    private By registerFOClientButton = By.xpath(".//div[@id='oper-3039']/div[2]/span");

    public MainPage typeFunctionName(String name){
        driver.findElement(findFunction).sendKeys( name );
        return this;
    }

    public LoginPage clickRegisterFOClientButton(){
        driver.findElement( registerFOClientButton).click();
        return new LoginPage( driver );
    }

    public MainPage enterFunction(String name){
        pause.userDelay( 2000 );
        this.typeFunctionName( name );
        this.clickRegisterFOClientButton();
        return new MainPage( driver );
    }
}
