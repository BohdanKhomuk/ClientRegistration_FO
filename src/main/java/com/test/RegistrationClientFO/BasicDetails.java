package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BasicDetails {

    public WebDriver driver;
    private Pause pause;
    private Frame frame;

    public BasicDetails(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
    }

    @FindBy(id = "bt_FullDopRekv")
    @CacheLookup
    private WebElement fullDopRekv;
    @FindBy(id = "ed_FIO_LN")
    @CacheLookup
    private WebElement FIO_LN;
    @FindBy(id = "ed_FIO_FN")
    @CacheLookup
    private WebElement FIO_FN;
    @FindBy(id = "ed_FIO_MN")
    @CacheLookup
    private WebElement FIO_MN;
    @FindBy(id = "btnOpenWindowAddress")
    @CacheLookup
    private WebElement btnOpenWindowAddress;
    @FindBy(id = "legalIndex")
    @CacheLookup
    private WebElement legalIndex;
    @FindBy(id = "legalRegion")
    @CacheLookup
    private WebElement legalRegion;
    @FindBy(xpath = "//span[@role = 'presentation']/input[@ng-model = 'legalArea']")
    @CacheLookup
    private WebElement legalArea;
    @FindBy(xpath = "//span[@class = 'k-input ng-scope']")
    @CacheLookup
    private WebElement settlement;
    @FindBy(xpath = "//ul[@id='legalSettlemetDropDown_listbox']/li[2]")
    @CacheLookup
    private WebElement legalCity;
    @FindBy(xpath = "//input[@ng-model = 'legalSettlement']")
    @CacheLookup
    private WebElement legalSettlement;
    @FindBy(xpath = "//span[@role = 'presentation']/input[@ng-model = 'legalStreet']")
    @CacheLookup
    private WebElement legalStreet;
    @FindBy(xpath = "//input[@ng-model = 'legalHouse']")
    @CacheLookup
    private WebElement legalHouse;
    @FindBy(id = "btnSaveAddress")
    @CacheLookup
    private WebElement btnSaveAddress;
    @FindBy(id = "ed_OKPO")
    @CacheLookup
    private WebElement ed_OKPO;
    @FindBy(id = "ed_SAB")
    @CacheLookup
    private WebElement ed_SAB;


    private void pressFullDopRekv() {
        fullDopRekv.click();
        new BasicDetails( driver );
    }

    private void pressBtnOpenWindowAddress() {
        btnOpenWindowAddress.click();
        new BasicDetails( driver );
    }

    private void pressSettlement() {
        settlement.click();
        new BasicDetails( driver );
    }

    private void pressCity() {
        legalCity.click();
        new BasicDetails( driver );
    }

    private void pressBtnSaveAddress() {
        btnSaveAddress.click();
        new BasicDetails( driver );
    }

    private void enterFIO_LN(String name) {
        FIO_LN.sendKeys( name );
    }

    private void enterFIO_FN(String name) {
        FIO_FN.sendKeys( name );
    }

    private void enterFIO_MN(String name) {
        FIO_MN.sendKeys( name );
    }

    private void enterLegalIndex(String index) {
        legalIndex.sendKeys( index );
    }

    private void enterLegalRegion(String region) {
        legalRegion.sendKeys( region );
    }

    private void enterLegalArea(String area) {
        legalArea.sendKeys( area );
    }

    private void enterLegalSettlement(String settlement) {
        legalSettlement.sendKeys( settlement );
    }

    private void enterLegalStreet(String street) {
        legalStreet.sendKeys( street );
    }

    private void enterLegalHouse(String house) {
        legalHouse.sendKeys( house );
    }

    public void enterOKPO(String okpo) {
        frame.tabFrame( "Tab0" );
        ed_OKPO.sendKeys( okpo );
    }

    public void enterSAB(String sab) {
        frame.tabFrame( "Tab0" );
        ed_SAB.sendKeys( sab );
    }


    public void enterFIO(String surname, String name, String patronymic) {
        frame.tabFrame( "Tab0" );
        this.pressFullDopRekv();
        this.enterFIO_LN( surname );
        this.enterFIO_FN( name );
        this.enterFIO_MN( patronymic );
        new BasicDetails( driver );
        new BasicDetails( driver );
    }

    public void enterAddress(String index, String region, String area, String settlement, String street, String house) {
        this.pressBtnOpenWindowAddress();
        pause.userDelay( 2000 );
        frame.fullAddressFrame();
        this.enterLegalIndex( index );
        this.enterLegalRegion( region );
        this.enterLegalArea( area );
        this.pressSettlement();
        this.pressCity();
        this.enterLegalSettlement( settlement );
        this.enterLegalStreet( street );
        this.enterLegalHouse( house );
        this.pressBtnSaveAddress();
        new BasicDetails( driver );
    }
}
