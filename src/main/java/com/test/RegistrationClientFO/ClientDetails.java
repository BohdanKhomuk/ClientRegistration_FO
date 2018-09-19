package com.test.RegistrationClientFO;

import com.test.Frame;
import com.test.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ClientDetails {

    private WebDriver driver;
    private Frame frame;

    Gender gender = new Gender();

    public ClientDetails (WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By ddl_PASSP = By.id( "ddl_PASSP" );
    private By passpCitizenUA = By.xpath( "//select[@id = 'ddl_PASSP']/option[@value = '1']" );
    private By ed_ORGAN = By.id( "ed_ORGAN" );
    private By ed_SER = By.id( "ed_SER" );
    private By ed_NUMDOC = By.id( "ed_NUMDOC" );
    private By ed_PDATE = By.id( "ed_PDATE" );
    private By ed_DATE_PHOTO = By.id( "ed_DATE_PHOTO" );
    private By ed_BDAY = By.id( "ed_BDAY" );
    private By ddl_SEX = By.id( "ddl_SEX" );
    String fileName = String.format( "//select[@id = 'ddl_SEX']/option[@value = '%s']", gender.gender );
    private By clientSex = By.xpath( fileName );
    //Phone
    private By ed_TELM_CODE = By.id( "ed_TELM_CODE" );
    private By TELM_Operator = By.xpath( "//tr[@class = 'k-alt']//div[@title = '92']" );
    private By ed_TELM = By.id( "ed_TELM" );
    private By ed_TELD_CODE = By.id( "ed_TELD_CODE" );
    private By TELD_Operator = By.xpath( "//td[@role = 'gridcell']/div[@title = '692']" );
    private By ed_TELD = By.id( "ed_TELD" );


    public ClientDetails сlickDdl_PASSP(){
        driver.findElement(ddl_PASSP).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlickPasspCitizenUA(){
        driver.findElement(passpCitizenUA).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlickDddSex(){
        driver.findElement(ddl_SEX).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlickClientSex(){
        driver.findElement(clientSex).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlickTelMCode(){
        driver.findElement(ed_TELM_CODE).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlicTElMOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(TELM_Operator)).doubleClick().build().perform();
        return new ClientDetails( driver );
    }

    public ClientDetails сlickTelDCode(){
        driver.findElement(ed_TELD_CODE).click();
        return new ClientDetails( driver );
    }

    public ClientDetails сlicTElDOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(TELD_Operator)).doubleClick().build().perform();
        return new ClientDetails( driver );
    }

    public ClientDetails enterOrgan(String organ){
        driver.findElement(ed_ORGAN).sendKeys( organ );
        return this;
    }

    public ClientDetails enterSer(String ser){
        driver.findElement(ed_SER).sendKeys( ser );
        return this;
    }

    public ClientDetails enterNumdoc(String numdoc){
        driver.findElement(ed_NUMDOC).sendKeys( numdoc );
        return this;
    }

    public ClientDetails enterPdate(String pdate){
        WebElement date = driver.findElement(ed_PDATE);
        date.click();
        date.clear();
        date.sendKeys( pdate );
        return this;
    }

    public ClientDetails enterDATE_PHOTO(String datePhoto){
        WebElement elDatePhoto = driver.findElement(ed_DATE_PHOTO);
        elDatePhoto.click();
        elDatePhoto.clear();
        elDatePhoto.sendKeys( datePhoto );
        return this;
    }

    public ClientDetails enterBDay(String bDay){
        WebElement elBDAY = driver.findElement(ed_BDAY);
        elBDAY.click();
        elBDAY.clear();
        elBDAY.sendKeys( bDay );
        return this;
    }

    public ClientDetails enterTelM(String telm){
        driver.findElement(ed_TELM).sendKeys( telm );
        return this;
    }

    public ClientDetails enterTelD(String teld){
        driver.findElement(ed_TELD).sendKeys( teld );
        return this;
    }

    public ClientDetails enterDocumentDetails(String organ, String ser, String numDoc, String passpDate, String datePhoto, String birthday){
        frame.tabFrame( "Tab3" );
        this.сlickDdl_PASSP();
        this.сlickPasspCitizenUA();
        this.enterOrgan( organ );
        this.enterSer( ser );
        this.enterNumdoc( numDoc );
        this.enterPdate( passpDate );
        this.enterDATE_PHOTO( datePhoto );
        this.enterBDay( birthday );
        this.сlickDddSex();
        this.сlickClientSex();
        return new ClientDetails( driver );
    }

    public ClientDetails enterNumberPhone(String tel){
        this.сlickTelMCode();
        frame.kContentFrame();
        this.сlicTElMOperator();
        frame.tabFrame( "Tab3" );
        this.enterTelM( tel );
        this.сlickTelDCode();
        this.сlickTelDCode();
        frame.kContentFrame();
        this.сlicTElDOperator();
        frame.tabFrame( "Tab3" );
        this.enterTelD( tel );
        return new ClientDetails( driver );
    }

}
