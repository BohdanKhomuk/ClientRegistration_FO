package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AdditionalInformation {

    private WebDriver driver;
    private Frame frame;

    public AdditionalInformation (WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    @FindBy(id = "bt_help")
    @CacheLookup
    private WebElement bt_help;
    @FindBy(xpath = "//div[@title = '11301']")
    @CacheLookup
    private WebElement groupBtn;
    @FindBy(xpath = "//button[@class = 'delete-confirm k-button k-primary']")
    @CacheLookup
    private WebElement chooseBtn;
    @FindBy(id = "ed_NOTES")
    @CacheLookup
    private WebElement ed_NOTES;
    @FindBy(id = "ddl_CRISK")
    @CacheLookup
    private WebElement ddl_CRISK;
    @FindBy(xpath = "//*[@id = 'ddl_CRISK']/option[@value = '3']")
    @CacheLookup
    private WebElement dir_CRISK;
    @FindBy(id = "ddl_MB")
    @CacheLookup
    private WebElement ddl_MB;
    @FindBy(xpath = "//*[@id = 'ddl_MB']/option[@value = '3']")
    @CacheLookup
    private WebElement dir_MB;
    @FindBy(id = "ed_ADR_ALT")
    @CacheLookup
    private WebElement ed_ADR_ALT;
    @FindBy(id = "ed_LIM")
    @CacheLookup
    private WebElement ed_LIM;
    @FindBy(id = "ed_LIM_KASS")
    @CacheLookup
    private WebElement ed_LIM_KASS;
    @FindBy(id = "ed_NOM_DOG")
    @CacheLookup
    private WebElement ed_NOM_DOG;
    @FindBy(id = "ed_NOMPDV")
    @CacheLookup
    private WebElement ed_NOMPDV;
    @FindBy(id = "ed_RNKP")
    @CacheLookup
    private WebElement ed_RNKP;
    @FindBy(id = "ed_NOTESEC")
    @CacheLookup
    private WebElement ed_NOTESEC;


    private void pressBt_help(){
        bt_help.click();
        new AdditionalInformation( driver );
    }

    private void pressGroupBtn(){
        groupBtn.click();
        new AdditionalInformation( driver );
    }

    private void pressChooseBtn(){
        chooseBtn.click();
        new AdditionalInformation( driver );
    }

    private void pressCrisk(){
        ddl_CRISK.click();
        new AdditionalInformation( driver );
    }

    private void pressDirCrisk(){
        dir_CRISK.click();
        new AdditionalInformation( driver );
    }

    private void pressMB(){
        ddl_MB.click();
        new AdditionalInformation( driver );
    }

    private void pressDirMB(){
       dir_MB.click();
        new AdditionalInformation( driver );
    }

    private void enterNotes(String notes){
        ed_NOTES.sendKeys( notes );
    }

    private void enterAdrAlt(String adrAlt){
        ed_ADR_ALT.sendKeys( adrAlt );
    }

    private void enterLim(String lim){
        ed_LIM.sendKeys( lim );
    }

    private void enterLimKass(String limKass){
        ed_LIM_KASS.sendKeys( limKass );
    }

    private void enterNumDoc(String numDoc){
        ed_NOM_DOG.sendKeys( numDoc );
    }

    private void enterNumPdv(String numPDV){
        ed_NOMPDV.sendKeys( numPDV );
    }

    private void enterRNKP(String rnkp){
        ed_RNKP.sendKeys( rnkp );
    }

    private void enterNotesEc(String notesEc){
        ed_NOTESEC.sendKeys( notesEc );
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
