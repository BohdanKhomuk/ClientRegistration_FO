package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ClientSegments {

    public WebDriver driver;
    private Frame frame;

    public ClientSegments(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By headText = By.xpath("//*[@id = 'ctl00_body_pnlCustsSegments']/fieldset/legend");

    public String getHeadingText(){
        frame.tabFrame( "Tab7" );
        return  driver.findElement( headText).getText();
    }
}
