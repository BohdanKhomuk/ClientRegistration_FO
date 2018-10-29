package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ConnectedPeople {

    public WebDriver driver;
    private Frame frame;

    public ConnectedPeople(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    @FindBy(xpath = "//*[@id = 'ctl00_body_pnlCusts']/fieldset/legend")
    @CacheLookup
    private WebElement headText;

    public String getHeadingText(){
        frame.tabFrame( "Tab6" );
        return  headText.getText();
    }
}
