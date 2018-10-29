package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TaxpayerDetails {

    public WebDriver driver;
    private Frame frame;

    public TaxpayerDetails(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }
    @FindBy(xpath = "//*[@id = 'tb_main']/tbody/tr[1]/td/label")
    @CacheLookup
    private WebElement headText;

    public String getHeadingText(){
        frame.tabFrame( "Tab1" );
        return  headText.getText();
    }
}
