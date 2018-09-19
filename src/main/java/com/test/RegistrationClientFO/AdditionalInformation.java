package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AdditionalInformation {

    private WebDriver driver;
    private Frame frame;

    public AdditionalInformation (WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By bt_help  = By.id( "bt_help" );
    private By groupBtn = By.xpath( "//div[@title = '11301']" );
    private By chooseBtn = By.xpath( "//button[@class = 'delete-confirm k-button k-primary']"  );

    private void pressBt_help(){
        driver.findElement(bt_help).click();
        new AdditionalInformation( driver );
    }

    private void pressGroupBtn(){
        driver.findElement(groupBtn).click();
        new AdditionalInformation( driver );
    }

    private void pressChooseBtn(){
        driver.findElement(chooseBtn).click();
        new AdditionalInformation( driver );
    }

    public void fillingISP(){
        frame.tabFrame( "Tab4" );
        this.pressBt_help();
        frame.kContentFrame();
        this.pressGroupBtn();
        this.pressChooseBtn();
        new AdditionalInformation( driver );
    }
}
