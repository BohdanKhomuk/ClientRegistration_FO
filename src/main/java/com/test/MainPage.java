package com.test;

import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public WebDriver driver;
    private Pause pause;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.pause = new Pause();
    }

    private By findFunction = By.id("findOpersText");
    private By registerFOClientButton = By.xpath(".//div[@id='oper-3039']/div[2]/span");

    private void typeFunctionName(String name){
        driver.findElement(findFunction).sendKeys( name );
    }

    private void clickRegisterFOClientButton(){
        driver.findElement( registerFOClientButton).click();
        new LoginPage( driver );
    }

    public void enterFunction(String name){
        pause.userDelay( 2000 );
        this.typeFunctionName( name );
        this.clickRegisterFOClientButton();
        new MainPage( driver );
    }
}
