package com.test.RegistrationClientFO;

import com.test.LoginPage;
import com.test.Methods.Frame;
import com.test.Methods.Gender;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class ClientDetails {

    private WebDriver driver;
    private Frame frame;
    private Pause pause;


    private Gender gender = new Gender();

    public ClientDetails (WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause ();
    }

    @FindBy(id = "ddl_PASSP")
    @CacheLookup
    private WebElement ddl_PASSP;
    @FindBy(xpath = "//select[@id = 'ddl_PASSP']/option[@value = '1']")
    @CacheLookup
    private WebElement passpCitizenUA;
    @FindBy(id = "ed_ORGAN")
    @CacheLookup
    private WebElement ed_ORGAN;
    @FindBy(id = "ed_SER")
    @CacheLookup
    private WebElement ed_SER;
    @FindBy(id = "ed_NUMDOC")
    @CacheLookup
    private WebElement ed_NUMDOC;
    @FindBy(id = "ed_PDATE")
    @CacheLookup
    private WebElement ed_PDATE;
    @FindBy(id = "ed_DATE_PHOTO")
    @CacheLookup
    private WebElement ed_DATE_PHOTO;
    @FindBy(id = "ed_BDAY")
    @CacheLookup
    private WebElement ed_BDAY;
    @FindBy(id = "ddl_SEX")
    @CacheLookup
    private WebElement ddl_SEX;
    private String fileName = String.format( "//select[@id = 'ddl_SEX']/option[@value = '%s']", gender.gender );
    private By clientSex = By.xpath ( fileName );
    @FindBy(id = "ed_BPLACE")
    @CacheLookup
    private WebElement ed_BPLACE;
    //Phone
    @FindBy(id = "ed_TELM_CODE")
    @CacheLookup
    private WebElement ed_TELM_CODE;
    @FindBy(xpath = "//tr[@class = 'k-alt']//div[@title = '92']")
    @CacheLookup
    private WebElement TELM_Operator;
    @FindBy(id = "ed_TELM")
    @CacheLookup
    private WebElement ed_TELM;
    @FindBy(id = "ed_TELD_CODE")
    @CacheLookup
    private WebElement ed_TELD_CODE;
    @FindBy(xpath = "//td[@role = 'gridcell']/div[@title]")
    @CacheLookup
    private WebElement TELD_Operator;
    @FindBy(id = "ed_TELD")
    @CacheLookup
    private WebElement ed_TELD;
    @FindBy(id = "ed_TELW")
    @CacheLookup
    private WebElement ed_TELW;
    //Text
    @FindBy(xpath = "//*[@id = 'tblMain']/tbody/tr[1]/td/label")
    private WebElement headText;


    private void pressDdl_PASSP(){
        ddl_PASSP.click();
        new ClientDetails( driver );
    }

    private void pressPasspCitizenUA(){
        passpCitizenUA.click();
        new ClientDetails( driver );
    }

    private void pressDddSex(){
        ddl_SEX.click();
        new ClientDetails( driver );
    }

    private void pressClientSex(){
        driver.findElement(clientSex).click();
        new ClientDetails( driver );
    }

    private void pressTelMCode(){
        ed_TELM_CODE.click();
        new ClientDetails( driver );
    }

    private void pressTElMOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(TELM_Operator).doubleClick().build().perform();
        new ClientDetails( driver );
    }

    private void pressTelDCode(){
        ed_TELD_CODE.click();
        new ClientDetails( driver );
    }

    private void pressTElDOperator(){
        Actions actname = new Actions(driver);
        actname.moveToElement(TELD_Operator).doubleClick().build().perform();
        new ClientDetails( driver );
    }

    private void enterOrgan(String organ){
        ed_ORGAN.sendKeys( organ );
    }

    private void enterSer(String ser){
        ed_SER.sendKeys( ser );
    }

    private void enterNumdoc(String numdoc){
        ed_NUMDOC.sendKeys( numdoc );
    }

    private void enterPdate(String pdate){
        ed_PDATE.click();
        ed_PDATE.clear();
        ed_PDATE.sendKeys( pdate );
    }

    private void enterDATE_PHOTO(String datePhoto){
        ed_DATE_PHOTO.click();
        ed_DATE_PHOTO.clear();
        ed_DATE_PHOTO.sendKeys( datePhoto );
    }

    private void enterBDay(String bDay){
        ed_BDAY.click();
        ed_BDAY.clear();
        ed_BDAY.sendKeys( bDay );
    }

    private void enterTelM(String telm){
        ed_TELM.sendKeys( telm );
    }

    private void enterTelD(String teld){
        ed_TELD.sendKeys( teld );
    }

    private void enterBPLACE(String bPlace){
        ed_BPLACE.sendKeys( bPlace );
    }

    private void enterTELW(String telW){
        ed_TELW.sendKeys( telW );
    }

    public String getHeadingText(){
        frame.tabFrame( "Tab3" );
        return headText.getText();
    }

    public void correctClientDetail(String bPlace, String telW){
        frame.tabFrame( "Tab3" );
        this.enterBPLACE( bPlace );
        this.enterTELW( telW );
        new ClientDetails( driver );
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
