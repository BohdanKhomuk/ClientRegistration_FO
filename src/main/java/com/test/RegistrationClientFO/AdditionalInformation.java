package com.test.RegistrationClientFO;

import com.test.Frame;
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

    public AdditionalInformation clickBt_help(){
        driver.findElement(bt_help).click();
        return new AdditionalInformation( driver );
    }

    public AdditionalInformation clickGroupBtn(){
        driver.findElement(groupBtn).click();
        return new AdditionalInformation( driver );
    }

    public AdditionalInformation clickChooseBtn(){
        driver.findElement(chooseBtn).click();
        return new AdditionalInformation( driver );
    }

    public AdditionalInformation fillingISP(){
        frame.tabFrame( "Tab4" );
        this.clickBt_help();
        frame.kContentFrame();
        this.clickGroupBtn();
        this.clickChooseBtn();
        return new AdditionalInformation( driver );
    }
}
