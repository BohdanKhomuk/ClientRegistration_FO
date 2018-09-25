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
    private By ed_NOTES = By.id( "ed_NOTES" );
    private By ddl_CRISK = By.id( "ddl_CRISK" );
    private By dir_CRISK = By.xpath( "//*[@id = 'ddl_CRISK']/option[@value = '3']" );
    private By ddl_MB = By.id( "ddl_MB" );
    private By dir_MB = By.xpath( "//*[@id = 'ddl_MB']/option[@value = '3']" );
    private By ed_ADR_ALT = By.id( "ed_ADR_ALT" );
    private By ed_LIM = By.id( "ed_LIM" );
    private By ed_LIM_KASS = By.id( "ed_LIM_KASS" );
    private By ed_NOM_DOG = By.id( "ed_NOM_DOG" );
    private By ed_NOMPDV = By.id( "ed_NOMPDV" );
    private By ed_RNKP = By.id( "ed_RNKP" );
    private By ed_NOTESEC = By.id( "ed_NOTESEC" );

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

    private void pressCrisk(){
        driver.findElement(ddl_CRISK).click();
        new AdditionalInformation( driver );
    }

    private void pressDirCrisk(){
        driver.findElement(dir_CRISK).click();
        new AdditionalInformation( driver );
    }

    private void pressMB(){
        driver.findElement(ddl_MB).click();
        new AdditionalInformation( driver );
    }

    private void pressDirMB(){
        driver.findElement(dir_MB).click();
        new AdditionalInformation( driver );
    }

    private void enterNotes(String notes){
        driver.findElement(ed_NOTES).sendKeys( notes );
    }

    private void enterAdrAlt(String adrAlt){
        driver.findElement(ed_ADR_ALT).sendKeys( adrAlt );
    }

    private void enterLim(String lim){
        driver.findElement(ed_LIM).sendKeys( lim );
    }

    private void enterLimKass(String limKass){
        driver.findElement(ed_LIM_KASS).sendKeys( limKass );
    }

    private void enterNumDoc(String numDoc){
        driver.findElement(ed_NOM_DOG).sendKeys( numDoc );
    }

    private void enterNumPdv(String numPDV){
        driver.findElement(ed_NOMPDV).sendKeys( numPDV );
    }

    private void enterRNKP(String rnkp){
        driver.findElement(ed_RNKP).sendKeys( rnkp );
    }

    private void enterNotesEc(String notesEc){
        driver.findElement(ed_NOTESEC).sendKeys( notesEc );
    }

    public void fillingISP(){
        frame.tabFrame( "Tab4" );
        this.pressBt_help();
        frame.kContentFrame();
        this.pressGroupBtn();
        this.pressChooseBtn();
        new AdditionalInformation( driver );
    }

    public void correctDetail(String notes, String adrAlt, String lim, String limKass, String numDoc, String numPDV, String rnkp, String noteEc){
        frame.tabFrame( "Tab4" );
        this.enterNotes( notes );
        this.enterAdrAlt( adrAlt );
        this.enterLim( lim );
        this.enterLimKass( limKass );
        this.enterNumDoc( numDoc );
        this.enterNumPdv( numPDV );
        this.enterRNKP( rnkp );
        this.enterNotesEc( noteEc );
        this.pressCrisk();
        this.pressDirCrisk();
        this.pressMB();
        this.pressDirMB();
        new AdditionalInformation( driver );
    }
}
