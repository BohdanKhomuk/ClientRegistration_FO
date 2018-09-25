package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    private By fullDopRekv = By.id( "bt_FullDopRekv" );
    private By FIO_LN = By.id( "ed_FIO_LN" );
    private By FIO_FN = By.id( "ed_FIO_FN" );
    private By FIO_MN = By.id( "ed_FIO_MN" );
    private By btnOpenWindowAddress = By.id( "btnOpenWindowAddress" );
    private By legalIndex = By.id( "legalIndex" );
    private By legalRegion = By.id( "legalRegion" );
    private By legalArea = By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalArea']" );
    private By settlement = By.xpath( "//span[@class = 'k-input ng-scope']" );
    private By legalCity = By.xpath( "//ul[@id='legalSettlemetDropDown_listbox']/li[2]" );
    private By legalSettlement = By.xpath( "//input[@ng-model = 'legalSettlement']" );
    private By legalStreet = By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalStreet']" );
    private By legalHouse = By.xpath( "//input[@ng-model = 'legalHouse']" );
    private By btnSaveAddress = By.id( "btnSaveAddress" );
    private By ed_OKPO = By.id( "ed_OKPO" );
    private By ed_SAB = By.id( "ed_SAB" );


    private void pressFullDopRekv() {
        driver.findElement( fullDopRekv ).click();
        new BasicDetails( driver );
    }

    private void pressBtnOpenWindowAddress() {
        driver.findElement( btnOpenWindowAddress ).click();
        new BasicDetails( driver );
    }

    private void pressSettlement() {
        driver.findElement( settlement ).click();
        new BasicDetails( driver );
    }

    private void pressCity() {
        driver.findElement( legalCity ).click();
        new BasicDetails( driver );
    }

    private void pressBtnSaveAddress() {
        driver.findElement( btnSaveAddress ).click();
        new BasicDetails( driver );
    }

    private void enterFIO_LN(String name) {
        driver.findElement( FIO_LN ).sendKeys( name );
    }

    private void enterFIO_FN(String name) {
        driver.findElement( FIO_FN ).sendKeys( name );
    }

    private void enterFIO_MN(String name) {
        driver.findElement( FIO_MN ).sendKeys( name );
    }

    private void enterLegalIndex(String index) {
        driver.findElement( legalIndex ).sendKeys( index );
    }

    private void enterLegalRegion(String region) {
        driver.findElement( legalRegion ).sendKeys( region );
    }

    private void enterLegalArea(String area) {
        driver.findElement( legalArea ).sendKeys( area );
    }

    private void enterLegalSettlement(String settlement) {
        driver.findElement( legalSettlement ).sendKeys( settlement );
    }

    private void enterLegalStreet(String street) {
        driver.findElement( legalStreet ).sendKeys( street );
    }

    private void enterLegalHouse(String house) {
        driver.findElement( legalHouse ).sendKeys( house );
    }

    public void enterOKPO(String okpo) {
        frame.tabFrame( "Tab0" );
        driver.findElement( ed_OKPO ).sendKeys( okpo );
    }

    public void enterSAB(String sab) {
        frame.tabFrame( "Tab0" );
        driver.findElement( ed_SAB ).sendKeys( sab );
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
