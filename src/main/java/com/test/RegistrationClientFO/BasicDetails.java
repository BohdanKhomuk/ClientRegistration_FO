package com.test.RegistrationClientFO;

import com.test.Frame;
import com.test.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BasicDetails {

    public WebDriver driver;
    public Pause pause;

    public Frame frame;

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


    public BasicDetails сlickFullDopRekv() {
        driver.findElement( fullDopRekv ).click();
        return new BasicDetails( driver );
    }

    public BasicDetails сlickBtnOpenWindowAddress() {
        driver.findElement( btnOpenWindowAddress ).click();
        return new BasicDetails( driver );
    }

    public BasicDetails сlickSettlement() {
        driver.findElement( settlement ).click();
        return new BasicDetails( driver );
    }

    public BasicDetails сlickCity() {
        driver.findElement( legalCity ).click();
        return new BasicDetails( driver );
    }

    public BasicDetails сlickBtnSaveAddress() {
        driver.findElement( btnSaveAddress ).click();
        return new BasicDetails( driver );
    }

    public BasicDetails enterFIO_LN(String name) {
        driver.findElement( FIO_LN ).sendKeys( name );
        return this;
    }

    public BasicDetails enterFIO_FN(String name) {
        driver.findElement( FIO_FN ).sendKeys( name );
        return this;
    }

    public BasicDetails enterFIO_MN(String name) {
        driver.findElement( FIO_MN ).sendKeys( name );
        return this;
    }

    public BasicDetails enterLegalIndex(String index) {
        driver.findElement( legalIndex ).sendKeys( index );
        return this;
    }

    public BasicDetails enterLegalRegion(String region) {
        driver.findElement( legalRegion ).sendKeys( region );
        return this;
    }

    public BasicDetails enterLegalArea(String area) {
        driver.findElement( legalArea ).sendKeys( area );
        return this;
    }

    public BasicDetails enterLegalSettlement(String settlement) {
        driver.findElement( legalSettlement ).sendKeys( settlement );
        return this;
    }

    public BasicDetails enterLegalStreet(String street) {
        driver.findElement( legalStreet ).sendKeys( street );
        return this;
    }

    public BasicDetails enterLegalHouse(String house) {
        driver.findElement( legalHouse ).sendKeys( house );
        return this;
    }

    public BasicDetails enterOKPO(String okpo) {
        frame.tabFrame( "Tab0" );
        driver.findElement( ed_OKPO ).sendKeys( okpo );
        return this;
    }


    public BasicDetails enterFIO(String surname, String name, String patronymic) {
        frame.tabFrame( "Tab0" );
        this.сlickFullDopRekv();
        this.enterFIO_LN( surname );
        this.enterFIO_FN( name );
        this.enterFIO_MN( patronymic );
        return new BasicDetails( driver );
    }

    public BasicDetails enterAddress(String index, String region, String area, String settlement, String street, String house) {
        this.сlickBtnOpenWindowAddress();
        pause.userDelay( 2000 );
        frame.fullAddressFrame();
        this.enterLegalIndex( index );
        this.enterLegalRegion( region );
        this.enterLegalArea( area );
        this.сlickSettlement();
        this.сlickCity();
        this.enterLegalSettlement( settlement );
        this.enterLegalStreet( street );
        this.enterLegalHouse( house );
        this.сlickBtnSaveAddress();
        return new BasicDetails( driver );
    }
}
