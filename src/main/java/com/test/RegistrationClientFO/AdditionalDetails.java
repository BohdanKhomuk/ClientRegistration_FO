package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(id = "gvMain_ctl02_imgEdHelp")
    private WebElement ctl02Help;
    @FindBy(xpath = "//div[@title = '2']")
    @CacheLookup
    private WebElement businessEntities;
    @FindBy(xpath = "//button[@class = 'delete-confirm k-button k-primary']")

    private WebElement chooseBtn;
    @FindBy(xpath = "//a[contains(text(),'Фін.мон')]")
    @CacheLookup
    private WebElement btnFinMon;
    @FindBy(xpath = "//td[contains(text(),'Відсутні')]")
    @CacheLookup
    private WebElement gridcellMissing;
    @FindBy(id = "gvMain_ctl03_edEdVal")
    @CacheLookup
    private WebElement ctl03Val;
    @FindBy(id = "gvMain_ctl04_edEdVal")
    @CacheLookup
    private WebElement ctl04Val;
    @FindBy(id = "gvMain_ctl05_edEdVal")
    @CacheLookup
    private WebElement ctl05Val;
    @FindBy(id = "gvMain_ctl10_edEdVal")
    @CacheLookup
    private WebElement ctl10Val;
    @FindBy(id = "gvMain_ctl11_edEdVal")
    @CacheLookup
    private WebElement ctl11Val;
    @FindBy(id = "gvMain_ctl06_imgEdHelp")
    @CacheLookup
    private WebElement ctl06Help;
    @FindBy(xpath = "//div[@title = 'YES']")
    @CacheLookup
    private WebElement gridcellYes;
    @FindBy(id = "gvMain_ctl08_imgEdHelp")
    @CacheLookup
    private WebElement ctl08Help;
    @FindBy(xpath = "//tr[@class = 'k-alt']/td")
    @CacheLookup
    private WebElement gridcellUnsatisfactory;
    @FindBy(id = "gvMain_ctl09_imgEdHelp")
    @CacheLookup
    private WebElement ctl09Help;
    @FindBy(xpath = "//div[@title = 'Задовільний']")
    @CacheLookup
    private WebElement gridcellSatisfactory;
    @FindBy(xpath = "//a[contains(text(),'Інші')]")
    @CacheLookup
    private WebElement btnOther;
    @FindBy(id = "gvMain_ctl03_imgEdHelp")
    @CacheLookup
    private WebElement ctl03Help;
    @FindBy(xpath = "//div[@title = '1']")
    @CacheLookup
    private WebElement gridcellLeadership;
    @FindBy(linkText = "Загальні")
    @CacheLookup
    private WebElement generalText;
    @FindBy(linkText = "Фін.мон.")
    @CacheLookup
    private WebElement finMonText;
    @FindBy(linkText = "БПК")
    @CacheLookup
    private WebElement bpkText;
    @FindBy(linkText = "Санкції")
    @CacheLookup
    private WebElement sanctionsText;
    @FindBy(linkText = "Для Кредитного реєстру")
    @CacheLookup
    private WebElement creditRegisterText;
    @FindBy(linkText = "Інші")
    @CacheLookup
    private WebElement otherText;
    @FindBy(linkText = "Критерії ризику")
    @CacheLookup
    private WebElement riskCriteriaText;


    private void pressCt102Help(){
        ctl02Help.click();
        new AdditionalDetails( driver );
    }

    private void pressBusinessEntities(){
        businessEntities.click();
        new AdditionalDetails( driver );
    }

    private void pressChooseBtn(){
        chooseBtn.click();
        new AdditionalDetails( driver );
    }

    private void pressBtnFinMon(){
        btnFinMon.click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellMissing(){
        gridcellMissing.click();
        new AdditionalDetails( driver );
    }

    private void pressCt106Help(){
        ctl06Help.click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellYes(){
        gridcellYes.click();
        new AdditionalDetails( driver );
    }

    private void pressCt108Help(){
        ctl08Help.click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellUnsatisfactory(){
        gridcellUnsatisfactory.click();
        new AdditionalDetails( driver );
    }

    private void pressCt109Help(){
        ctl09Help.click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellSatisfactory(){
        gridcellSatisfactory.click();
        new AdditionalDetails( driver );
    }

    private void pressBtnOther(){
        btnOther.click();
        new AdditionalDetails( driver );
    }

    private void pressCt103Help(){
        ctl03Help.click();
        new AdditionalDetails( driver );
    }

    private void pressGridcellLeadership(){
        gridcellLeadership.click();
        new AdditionalDetails( driver );
    }

    private void enterCt103Val(String citizenship){
        ctl03Val.sendKeys( citizenship );
    }

    private void enterCt104Val(String firstFilldData){
        ctl04Val.click();
        ctl04Val.clear();
        ctl04Val.sendKeys( firstFilldData );
    }

    private void enterCt105Val(String dateOfIdentification){
        ctl05Val.click();
        ctl05Val.clear();
        ctl05Val.sendKeys( dateOfIdentification );
    }

    private void enterCt110Val(String position){
        ctl10Val.sendKeys( position );
    }

    private void enterCt111Val(String sourcesFunds){
        ctl11Val.sendKeys( sourcesFunds );
    }

    public String getGeneralText(){
        frame.tabFrame( "Tab5" );
        return  generalText.getText();
    }

    public String getFinMonText(){
        frame.tabFrame( "Tab5" );
        return  finMonText.getText();
    }

    public String getBPKText(){
        frame.tabFrame( "Tab5" );
        return  bpkText.getText();
    }

    public String getSanctionsText(){
        frame.tabFrame( "Tab5" );
        return  sanctionsText.getText();
    }

    public String getCreditRegisterText(){
        frame.tabFrame( "Tab5" );
        return  creditRegisterText.getText();
    }

    public String getOtherText(){
        frame.tabFrame( "Tab5" );
        return  otherText.getText();
    }

    public String getRiskCriteriaText(){
        frame.tabFrame( "Tab5" );
        return  riskCriteriaText.getText();
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
