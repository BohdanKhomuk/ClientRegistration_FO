package com.test;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MainPage {

    public WebDriver driver;
    private Pause pause;
    private Frame frame;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.pause = new Pause();
        this.frame = new Frame ( (EventFiringWebDriver) driver );
    }

    @FindBy(id = "findOpersText")
    @CacheLookup
    private WebElement findFunction;
    @FindBy(xpath = "//div[@id='oper-3039']/div[2]/span")
    @CacheLookup
    private WebElement registerFOClientButton;


    private void typeFunctionName(String name){
        findFunction.clear ();
        findFunction.sendKeys( name );
    }

    private void clickRegisterFOClientButton(){
        registerFOClientButton.click();
        new LoginPage( driver );
    }

    public void enterFunction(String name){
        frame.todefCont ();
        pause.userDelay( 2000 );
        this.typeFunctionName( name );
        pause.userDelay( 2500 );
        this.clickRegisterFOClientButton();
        new MainPage( driver );
    }
}
