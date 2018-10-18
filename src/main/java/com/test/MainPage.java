package com.test;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    private By findFunction = By.id("findOpersText");
    private By registerFOClientButton = By.xpath(".//div[@id='oper-3039']/div[2]/span");

    private void typeFunctionName(String name){
        driver.findElement ( findFunction ).clear ();
        driver.findElement(findFunction).sendKeys( name );
    }

    private void clickRegisterFOClientButton(){
        driver.findElement( registerFOClientButton).click();
        new LoginPage( driver );
    }

    public void enterFunction(String name){
        frame.todefCont ();
        pause.userDelay( 2000 );
        this.typeFunctionName( name );
        pause.userDelay( 3000 );
        this.clickRegisterFOClientButton();
        new MainPage( driver );
    }
}
