package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import com.test.Methods.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ClientDetails {

    private WebDriver driver;
    private Frame frame;

    private Gender gender = new Gender();

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
    private String fileName = String.format( "//select[@id = 'ddl_SEX']/option[@value = '%s']", gender.gender );
    private By clientSex = By.xpath( fileName );
    //Phone
    private By ed_TELM_CODE = By.id( "ed_TELM_CODE" );
    private By TELM_Operator = By.xpath( "//tr[@class = 'k-alt']//div[@title = '92']" );
    private By ed_TELM = By.id( "ed_TELM" );
    private By ed_TELD_CODE = By.id( "ed_TELD_CODE" );
    private By TELD_Operator = By.xpath( "//td[@role = 'gridcell']/div[@title = '692']" );
    private By ed_TELD = By.id( "ed_TELD" );


    private void pressDdl_PASSP(){
        driver.findElement(ddl_PASSP).click();
        new ClientDetails( driver );
    }

    private void pressPasspCitizenUA(){
        driver.findElement(passpCitizenUA).click();
        new ClientDetails( driver );
    }

    private void pressDddSex(){
        driver.findElement(ddl_SEX).click();
        new ClientDetails( driver );
    }

    private void pressClientSex(){
        driver.findElement(clientSex).click();
        new ClientDetails( driver );
    }

    private void pressTelMCode(){
        driver.findElement(ed_TELM_CODE).click();
        new ClientDetails( driver );
    }

    private void pressTElMOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(TELM_Operator)).doubleClick().build().perform();
        new ClientDetails( driver );
    }

    private void pressTelDCode(){
        driver.findElement(ed_TELD_CODE).click();
        new ClientDetails( driver );
    }

    private void pressTElDOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(TELD_Operator)).doubleClick().build().perform();
        new ClientDetails( driver );
    }

    private void enterOrgan(String organ){
        driver.findElement(ed_ORGAN).sendKeys( organ );
    }

    private void enterSer(String ser){
        driver.findElement(ed_SER).sendKeys( ser );
    }

    private void enterNumdoc(String numdoc){
        driver.findElement(ed_NUMDOC).sendKeys( numdoc );
    }

    private void enterPdate(String pdate){
        WebElement date = driver.findElement(ed_PDATE);
        date.click();
        date.clear();
        date.sendKeys( pdate );
    }

    private void enterDATE_PHOTO(String datePhoto){
        WebElement elDatePhoto = driver.findElement(ed_DATE_PHOTO);
        elDatePhoto.click();
        elDatePhoto.clear();
        elDatePhoto.sendKeys( datePhoto );
    }

    private void enterBDay(String bDay){
        WebElement elBDAY = driver.findElement(ed_BDAY);
        elBDAY.click();
        elBDAY.clear();
        elBDAY.sendKeys( bDay );
    }

    private void enterTelM(String telm){
        driver.findElement(ed_TELM).sendKeys( telm );
    }

    private void enterTelD(String teld){
        driver.findElement(ed_TELD).sendKeys( teld );
    }

    public void enterDocumentDetails(String organ, String ser, String numDoc, String passpDate, String datePhoto, String birthday){
        frame.tabFrame( "Tab3" );
        this.pressDdl_PASSP();
        this.pressPasspCitizenUA();
        this.enterOrgan( organ );
        this.enterSer( ser );
        this.enterNumdoc( numDoc );
        this.enterPdate( passpDate );
        this.enterDATE_PHOTO( datePhoto );
        this.enterBDay( birthday );
        this.pressDddSex();
        this.pressClientSex();
        new ClientDetails( driver );
    }

    public void enterNumberPhone(String tel){
        this.pressTelMCode();
        frame.kContentFrame();
        this.pressTElMOperator();
        frame.tabFrame( "Tab3" );
        this.enterTelM( tel );
        this.pressTelDCode();
        this.pressTelDCode();
        frame.kContentFrame();
        this.pressTElDOperator();
        frame.tabFrame( "Tab3" );
        this.enterTelD( tel );
        new ClientDetails( driver );
    }

}
