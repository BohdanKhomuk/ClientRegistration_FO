package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CDO {

    public WebDriver driver;
    private Frame frame;

    public CDO(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    @FindBy(xpath = "//h1[text() = 'Підключення користувачів до Систем Дистанційного Обслуговування (СДО)']")
    @CacheLookup
    private WebElement headText;


    public String getHeadingText(){
        frame.tabFrame( "Tab8" );
        return  headText.getText();
    }
}
