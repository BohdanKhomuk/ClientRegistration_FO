package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TaxpayerDetails {

    public WebDriver driver;
    private Frame frame;

    public TaxpayerDetails(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By headText = By.xpath("//*[@id = 'tb_main']/tbody/tr[1]/td/label");

    public String getHeadingText(){
        frame.tabFrame( "Tab1" );
        return  driver.findElement( headText).getText();
    }
}
