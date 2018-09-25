package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ConnectedPeople {

    public WebDriver driver;
    private Frame frame;

    public ConnectedPeople(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By headText = By.xpath("//*[@id = 'ctl00_body_pnlCusts']/fieldset/legend");

    public String getHeadingText(){
        frame.tabFrame( "Tab6" );
        return  driver.findElement( headText).getText();
    }
}
