package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
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
    private By generalText = By.linkText( "Загальні" );
    private By finMonText = By.linkText( "Фін.мон." );
    private By bpkText = By.linkText( "БПК" );
    private By sanctionsText = By.linkText( "Санкції" );
    private By creditRegisterText = By.linkText( "Для Кредитного реєстру" );
    private By otherText = By.linkText( "Інші" );
    private By riskCriteriaText = By.linkText( "Критерії ризику" );


    private void pressCt102Help(){
        driver.findElement(ctl02Help).click();
        new AdditionalDetails( driver );
    }

    private void pressBusinessEntities(){
        driver.findElement(businessEntities).click();
        new AdditionalDetails( driver );
    }

    private void pressChooseBtn(){
        driver.findElement(chooseBtn).click();
        new AdditionalDetails( driver );
    }

    private void pressBtnFinMon(){
        driver.findElement(btnFinMon).click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellMissing(){
        driver.findElement(gridcellMissing).click();
        new AdditionalDetails( driver );
    }

    private void pressCt106Help(){
        driver.findElement(ctl06Help).click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellYes(){
        driver.findElement(gridcellYes).click();
        new AdditionalDetails( driver );
    }

    private void pressCt108Help(){
        driver.findElement(ctl08Help).click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellUnsatisfactory(){
        driver.findElement(gridcellUnsatisfactory).click();
        new AdditionalDetails( driver );
    }

    private void pressCt109Help(){
        driver.findElement(ctl09Help).click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellSatisfactory(){
        driver.findElement(gridcellSatisfactory).click();
        new AdditionalDetails( driver );
    }

    private void pressBtnOther(){
        driver.findElement(btnOther).click();
        new AdditionalDetails( driver );
    }

    private void pressCt103Help(){
        driver.findElement(ctl03Help).click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellLeadership(){
        driver.findElement(gridcellLeadership).click();
        new AdditionalDetails( driver );
    }

    private void enterCt103Val(String citizenship){
        driver.findElement(ctl03Val).sendKeys( citizenship );
    }

    private void enterCt104Val(String firstFilldData){
        WebElement firstData = driver.findElement(ctl04Val);
        firstData.click();
        firstData.clear();
        firstData.sendKeys( firstFilldData );
    }

    private void enterCt105Val(String dateOfIdentification){
        WebElement idetification = driver.findElement(ctl05Val);
        idetification.click();
        idetification.clear();
        idetification.sendKeys( dateOfIdentification );
    }

    private void enterCt110Val(String position){
        driver.findElement(ctl10Val).sendKeys( position );
    }

    private void enterCt111Val(String sourcesFunds){
        driver.findElement(ctl11Val).sendKeys( sourcesFunds );
    }

    public String getGeneralText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( generalText ).getText();
    }

    public String getFinMonText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( finMonText ).getText();
    }

    public String getBPKText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( bpkText ).getText();
    }

    public String getSanctionsText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( sanctionsText ).getText();
    }

    public String getCreditRegisterText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( creditRegisterText ).getText();
    }

    public String getOtherText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( otherText ).getText();
    }

    public String getRiskCriteriaText(){
        frame.tabFrame( "Tab5" );
        return  driver.findElement( riskCriteriaText ).getText();
    }

    public void enterGeneral(){
        frame.tabFrame( "Tab5" );
        this.pressCt102Help();
        frame.kContentFrame();
        this.pressBusinessEntities();
        this.pressChooseBtn();
        new AdditionalDetails( driver );
    }

    public void enterFinMon(String citizenship, String firstFilldData, String dateOfIdentification, String position, String sourcesFunds){
        frame.tabFrame( "Tab5" );
        this.pressBtnFinMon();
        pause.userDelay( 2000 );
        this.pressCt102Help();
        frame.kContentFrame();
        this.pressGridcellMissing();
        this.pressChooseBtn();
        frame.tabFrame( "Tab5" );
        this.enterCt103Val( citizenship );
        this.enterCt104Val( firstFilldData );
        this.enterCt105Val( dateOfIdentification );
        this.enterCt110Val( position );
        this.enterCt111Val( sourcesFunds );
        this.pressCt106Help();
        frame.kContentFrame();
        this.pressGridcellYes();
        this.pressChooseBtn();
        frame.tabFrame( "Tab5" );
        this.pressCt108Help();
        frame.kContentFrame();
        this.pressGridcellUnsatisfactory();
        this.pressChooseBtn();
        frame.tabFrame( "Tab5" );
        this.pressCt109Help();
        frame.kContentFrame();
        this.pressGridcellSatisfactory();
        this.pressChooseBtn();
        new AdditionalDetails( driver );
    }

    public void enterOther(){
        frame.tabFrame( "Tab5" );
        this.pressBtnOther();
        pause.userDelay( 2000 );
        this.pressCt103Help();
        frame.kContentFrame();
        this.pressGridcellLeadership();
        this.pressChooseBtn();
        new AdditionalDetails( driver );
    }
}
