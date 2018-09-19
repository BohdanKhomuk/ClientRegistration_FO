package com.test.RegistrationClientFO;

import com.test.Frame;
import com.test.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AdditionalDetails {

    private WebDriver driver;
    private Frame frame;
    private Pause pause;

    public AdditionalDetails (WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
    }

    private By ctl02Help = By.id( "gvMain_ctl02_imgEdHelp" );
    private By businessEntities = By.xpath( "//div[@title = '2']" );
    private By chooseBtn = By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    private By btnFinMon = By.xpath( "//a[contains(text(),'Фін.мон')]" );
    private By gridcellMissing = By.xpath( "//td[contains(text(),'Відсутні')]" );
    private By ctl03Val = By.id( "gvMain_ctl03_edEdVal" );
    private By ctl04Val = By.id( "gvMain_ctl04_edEdVal" );
    private By ctl05Val = By.id( "gvMain_ctl05_edEdVal" );
    private By ctl10Val = By.id( "gvMain_ctl10_edEdVal" );
    private By ctl11Val = By.id( "gvMain_ctl11_edEdVal" );
    private By ctl06Help = By.id( "gvMain_ctl06_imgEdHelp" );
    private By gridcellYes = By.xpath( "//div[@title = 'YES']" );
    private By ctl08Help = By.id( "gvMain_ctl08_imgEdHelp" );
    private By gridcellUnsatisfactory = By.xpath( "//tr[@class = 'k-alt']/td" );
    private By ctl09Help = By.id( "gvMain_ctl09_imgEdHelp" );
    private By gridcellSatisfactory = By.xpath( "//div[@title = 'Задовільний']" );
    private By btnOther = By.xpath( "//a[contains(text(),'Інші')]" );
    private By ctl03Help = By.id( "gvMain_ctl03_imgEdHelp" );
    private By gridcellLeadership = By.xpath( "//div[@title = '1']" );


    public AdditionalDetails clickCt102Help(){
        driver.findElement(ctl02Help).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickBusinessEntities(){
        driver.findElement(businessEntities).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickChooseBtn(){
        driver.findElement(chooseBtn).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickBtnFinMon(){
        driver.findElement(btnFinMon).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickGridcellMissing(){
        driver.findElement(gridcellMissing).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickCt106Help(){
        driver.findElement(ctl06Help).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickGridcellYes(){
        driver.findElement(gridcellYes).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickCt108Help(){
        driver.findElement(ctl08Help).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickGridcellUnsatisfactory(){
        driver.findElement(gridcellUnsatisfactory).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickCt109Help(){
        driver.findElement(ctl09Help).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickGridcellSatisfactory(){
        driver.findElement(gridcellSatisfactory).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickBtnOther(){
        driver.findElement(btnOther).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickCt103Help(){
        driver.findElement(ctl03Help).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails clickGridcellLeadership(){
        driver.findElement(gridcellLeadership).click();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails enterCt103Val(String citizenship){
        driver.findElement(ctl03Val).sendKeys( citizenship );
        return this;
    }

    public AdditionalDetails enterCt104Val(String firstFilldData){
        WebElement firstData = driver.findElement(ctl04Val);
        firstData.click();
        firstData.clear();
        firstData.sendKeys( firstFilldData );
        return this;
    }

    public AdditionalDetails enterCt105Val(String dateOfIdentification){
        WebElement idetification = driver.findElement(ctl05Val);
        idetification.click();
        idetification.clear();
        idetification.sendKeys( dateOfIdentification );
        return this;
    }

    public AdditionalDetails enterCt110Val(String position){
        driver.findElement(ctl10Val).sendKeys( position );
        return this;
    }

    public AdditionalDetails enterCt111Val(String sourcesFunds){
        driver.findElement(ctl11Val).sendKeys( sourcesFunds );
        return this;
    }

    public AdditionalDetails enterGeneral(){
        frame.tabFrame( "Tab5" );
        this.clickCt102Help();
        frame.kContentFrame();
        this.clickBusinessEntities();
        this.clickChooseBtn();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails enterFinMon(String citizenship, String firstFilldData, String dateOfIdentification, String position, String sourcesFunds){
        frame.tabFrame( "Tab5" );
        this.clickBtnFinMon();
        pause.userDelay( 2000 );
        this.clickCt102Help();
        frame.kContentFrame();
        this.clickGridcellMissing();
        this.clickChooseBtn();
        frame.tabFrame( "Tab5" );
        this.enterCt103Val( citizenship );
        this.enterCt104Val( firstFilldData );
        this.enterCt105Val( dateOfIdentification );
        this.enterCt110Val( position );
        this.enterCt111Val( sourcesFunds );
        this.clickCt106Help();
        frame.kContentFrame();
        this.clickGridcellYes();
        this.clickChooseBtn();
        frame.tabFrame( "Tab5" );
        this.clickCt108Help();
        frame.kContentFrame();
        this.clickGridcellUnsatisfactory();
        this.clickChooseBtn();
        frame.tabFrame( "Tab5" );
        this.clickCt109Help();
        frame.kContentFrame();
        this.clickGridcellSatisfactory();
        this.clickChooseBtn();
        return new AdditionalDetails( driver );
    }

    public AdditionalDetails enterOther(){
        frame.tabFrame( "Tab5" );
        this.clickBtnOther();
        pause.userDelay( 2000 );
        this.clickCt103Help();
        frame.kContentFrame();
        this.clickGridcellLeadership();
        this.clickChooseBtn();
        return new AdditionalDetails( driver );
    }
}
