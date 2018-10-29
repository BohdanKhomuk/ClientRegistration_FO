package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ClientSegments {

    public WebDriver driver;
    private Frame frame;

    public ClientSegments(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    @FindBy(xpath = "//*[@id = 'ctl00_body_pnlCustsSegments']/fieldset/legend")
    @CacheLookup
    private WebElement headText;


    public String getHeadingText(){
        frame.tabFrame( "Tab7" );
        return  headText.getText();
    }
}
