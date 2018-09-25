package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CDO {

    public WebDriver driver;
    private Frame frame;

    public CDO(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By headText = By.xpath("//h1[text() = 'Підключення користувачів до Систем Дистанційного Обслуговування (СДО)']");

    public String getHeadingText(){
        frame.tabFrame( "Tab8" );
        return  driver.findElement( headText).getText();
    }
}
