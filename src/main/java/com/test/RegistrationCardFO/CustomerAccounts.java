package com.test.RegistrationCardFO;

import com.test.Methods.CheckPageAvailability;
import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.test.LoginPage.getPolygon;

public class CustomerAccounts {

    public WebDriver driver;
    private Frame frame;
    private Pause pause;
    private CheckPageAvailability checkPageAvailability;

    public CustomerAccounts(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
        this.checkPageAvailability = new CheckPageAvailability ( driver );

    }

    @FindBy(id = "btOpen")
    @CacheLookup
    private WebElement btOpen;
    @FindBy(id = "btEdit")
    @CacheLookup
    private WebElement btEdit;
    @FindBy(id = "btClose")
    @CacheLookup
    private WebElement btClose;
    @FindBy(id = "r_1")
    private WebElement score;
    @FindBy(id = "td_29")
    private WebElement scoreDBAnew;
    @FindBy(id = "closureReason5")
    @CacheLookup
    private WebElement closureReason5;
    @FindBy(id = "alertify-ok")
    @CacheLookup
    private WebElement alertifyOk;
    //Basic details ----------------------------------//
    @FindBy(id = "tbNbs")
    @CacheLookup
    private WebElement tbNbs;
    @FindBy(id = "bAccountMask")
    @CacheLookup
    private WebElement bAccountMask;
    @FindBy(id = "ddOb22")
    @CacheLookup
    private WebElement ddOb22;
    @FindBy(id = "td_21")
    @CacheLookup
    private WebElement td_21;
    @FindBy(id = "tbNlsAlt")
    @CacheLookup
    private WebElement tbNlsAlt;
    //-----------------------------------------------//
    //Financial details -----------------------------//
    @FindBy(id = "bTab1")
    @CacheLookup
    private WebElement bTab1;
    @FindBy(id = "ddVidBlkD")
    @CacheLookup
    private WebElement ddVidBlkD;
    @FindBy(id = "ddVidBlkK")
    @CacheLookup
    private WebElement ddVidBlkK;
    //-----------------------------------------------//
    //Access rights ---------------------------------//
    @FindBy(id = "bTab2")
    @CacheLookup
    private WebElement bTab2;
    @FindBy(id = "btAdd")
    @CacheLookup
    private WebElement btAdd;
    //-----------------------------------------------//
    //Special parameters ----------------------------//
    @FindBy(id = "bTab3")
    private WebElement bTab3;
    @FindBy(id = "VALUE_5")
    @CacheLookup
    private WebElement VALUE_5;
    @FindBy(id = "VALUE_4")
    @CacheLookup
    private WebElement VALUE_4;
    @FindBy(id = "VALUE_3")
    @CacheLookup
    private WebElement VALUE_3;
    @FindBy(id = "VALUE_2")
    @CacheLookup
    private WebElement VALUE_2;
    @FindBy(id = "VALUE")
    @CacheLookup
    private WebElement VALUE;
    @FindBy(xpath = "//input[@type='button' and @value='Зберегти']")
    @CacheLookup
    private WebElement saveBtn;
    @FindBy(id = "btnSPECPARAM")
   // @CacheLookup
    private WebElement btnSPECPARAM;
    @FindBy(id = "btnSPECPARAM_INT")
    @CacheLookup
    private WebElement btnSPECPARAM_INT;
    @FindBy(id = "btnDPT")
    @CacheLookup
    private WebElement btnDPT;
    @FindBy(id = "btnBPK")
    @CacheLookup
    private WebElement btnBPK;
    @FindBy(id = "btnCVK")
    @CacheLookup
    private WebElement btnCVK;
    @FindBy(id = "btnOTHERS")
    @CacheLookup
    private WebElement btnOTHERS;
    @FindBy(id = "HREF_1")
    private WebElement SPPI;
    @FindBy(id = "r_1")
    private WebElement Yes;
    //---------------------------------------------//
    @FindBy(id = "btSave")
    private WebElement btSave;
    @FindBy(id = "btOk")
    private WebElement btOk;
    @FindBy(xpath = "//*[@value='Ok']")
    private WebElement buttonOK;
    @FindBy(id = "btFind")
    private WebElement btFind;
    @FindBy(id = "tbFindNls")
    private WebElement findNls;

    private void clickBtOpen(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btOpen);
        new CustomerAccounts( driver );
    }

    private void clickBAccountMask(){
        bAccountMask.click();
        new CustomerAccounts( driver );
    }

    private void clickDdOb22(){
        ddOb22.click();
        new CustomerAccounts( driver );
    }

    private void clickTd_21(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(td_21));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        new CustomerAccounts( driver );
    }

    private void clickDdVidBlkD(){
        ddVidBlkD.click();
        new CustomerAccounts( driver );
    }

    private void clickDdVidBlkK(){
        ddVidBlkK.click();
        new CustomerAccounts( driver );
    }

    private void clickSaveBtn(){
        saveBtn.click();
        new CustomerAccounts( driver );
    }

    private void clickBtSave(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(btSave));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        new CustomerAccounts( driver );
    }

    private void clickBtOk(){
        WebDriverWait w = new WebDriverWait(driver, 1000);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(btOk));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        new CustomerAccounts( driver );
    }

    private void clickButtonOK(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(buttonOK));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        new CustomerAccounts( driver );
    }


    private void clickClosureReason5(){
        closureReason5.click();
        new CustomerAccounts( driver );
    }

    private void clickAlertifyOk(){
        alertifyOk.click();
        new CustomerAccounts( driver );
    }

    private void clickBtEdit(){
        btEdit.click();
        new CustomerAccounts( driver );
    }

    private void clickBtClose(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btClose);
        new CustomerAccounts( driver );
    }

    private void clickScore(){
        score.click();
        new CustomerAccounts( driver );
    }

    private void clickBtFind(){
        btFind.click();
        new CustomerAccounts( driver );
    }

    private void clickBTab1(){
        bTab1.click();
        new CustomerAccounts( driver );
    }

    private void clickBTab2(){
        bTab2.click();
        new CustomerAccounts( driver );
    }

    private void clickBTab3(){
        bTab3.click();
        new CustomerAccounts( driver );
    }

    private void clickScoreDBAnew(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf ( scoreDBAnew));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        new CustomerAccounts( driver );
    }

    private void clickBtAdd(){
        btAdd.click();
        new CustomerAccounts( driver );
    }

    private void clickBtOther(){
        btnOTHERS.click ();
        new CustomerAccounts ( driver );
    }

    private void clickSPPI(){
        SPPI.click ();
        new CustomerAccounts ( driver );
    }

    private void clickYes(){
        Yes.click ();
        new CustomerAccounts ( driver );
    }

    private void clickSpecparam(){
        btnSPECPARAM.click ();
        new CustomerAccounts ( driver );
    }

    private void pressValue_5(){
        Actions actname = new Actions(driver);
        actname.moveToElement(VALUE_5).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_4(){
        Actions actname = new Actions(driver);
        actname.moveToElement(VALUE_4).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_3(){
        Actions actname = new Actions(driver);
        actname.moveToElement(VALUE_3).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_2(){
        Actions actname = new Actions(driver);
        actname.moveToElement(VALUE_2).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void enterTbNbs(String nbs){
        tbNbs.sendKeys( nbs );
    }

    private void enterNls(String nls){
        findNls.sendKeys( nls );
    }

    private void enterValue(String value){
        VALUE.sendKeys( value );
    }

    private void entertbNlsAlt(String nlsAlt){
        tbNlsAlt.sendKeys( nlsAlt );
    }

    public String getTextBtnSPECPARAM(){
        return  btnSPECPARAM.getText();
    }

    public String getTextBtnSPECPARAM_INT(){
        return  btnSPECPARAM_INT.getText();
    }

    public String getTextBtnDPT(){
        return  btnDPT.getText();
    }

    public String getTextBtnBPK(){
        return  btnBPK.getText();
    }

    public String getTextBtnCVK(){
        return  btnCVK.getText();
    }

    public void saveOptions(){
        frame.todefCont ();
        List<WebElement> linkElements1 = driver.findElements(By.tagName("head"));
        System.out.println ( linkElements1 );
        this.clickBtSave();
        pause.userDelay( 3000 );
        frame.toTab3FrameAcc();

        //Confirmation window 1
        ArrayList<String> tabs12 = new ArrayList<> (driver.getWindowHandles());
        checkPageAvailability.threePage ("T1" );
        this.clickBtOk();
        driver.switchTo().window(tabs12.get(1));
        pause.userDelay(2000);

        //Confirmation window 2
        pause.userDelay ( 10000 );
        checkPageAvailability.threePage ( "T1" );
        this.clickButtonOK ( );
        pause.userDelay ( 3000 );
        checkPageAvailability.twoPage ( "ctl00" );

        this.clickBTab3();
        String mainWindows = driver.getWindowHandle();
        System.out.println ( "Win01 " + mainWindows );
        driver.switchTo ().window ( mainWindows ).close ();
        pause.userDelay ( 2500    );
        ArrayList<String> tabs1237 = new ArrayList<> ( driver.getWindowHandles ( ) );
        System.out.println ( "tabs1237" + tabs1237 );
        driver.switchTo ( ).window ( tabs1237.get ( 0 ) );
        System.out.println ( "Win7 " + tabs1237 );
        String mainWindows2117 = driver.getWindowHandle ( );
        System.out.println ( "21first7 " + mainWindows2117 );
        WebElement elementID7 = driver.findElement ( By.xpath ( "//*[@id]" ) );
        String id7 = elementID7.getAttribute ( "id" );     // for getting id of each element
        System.out.println ( "id7 " + id7 );
        new CustomerAccounts ( driver );
    }

    public void createCustAcc(String nsb, String value){

        pause.userDelay ( 3000 );
        this.clickBtOpen();
        pause.userDelay( 10000 );

        ArrayList<String> tabs123443 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Witabs123443n3 " + tabs123443 );
        String mainWindows213443 = driver.getWindowHandle();
        System.out.println ( "21first3443 " + mainWindows213443 );

        driver.switchTo().window(tabs123443.get(0));
        WebElement elementID13 = driver.findElement(By.xpath ("//*[@id]"));
        String id1344 = elementID13.getAttribute("id");     // for getting id of each element
        System.out.println ( "id1344 " + id1344 );
        checkPageAvailability.twoPage ( "ctl00" );
        frame.toTab0FrameAcc();
        this.enterTbNbs( nsb );
        this.clickBAccountMask();
        this.clickBAccountMask();
        String mainWindows = driver.getWindowHandle(); //запоминаем первое окно
        System.out.println ( "Win01 " + mainWindows );
        ArrayList<String> tabs12 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Win " + tabs12 );
        this.clickDdOb22();
        pause.userDelay( 4000 );
        new Actions(driver).moveByOffset(1, 1).click().build().perform();
        checkPageAvailability.threePage ( "webService" );
        this.clickTd_21();
        driver.switchTo().window(mainWindows);
        //Special parameters
        this.clickBTab3();
        frame.toTab3FrameAcc();
        if (getPolygon () == 24 || getPolygon () == 53 ){
            this.clickBtOther ();
            frame.toTab3FrameAcc();
            this.clickSPPI ();
            String mainWindows10 = driver.getWindowHandle(); //запоминаем первое окно
            pause.userDelay( 1000 );
            for(String windowsHandls : driver.getWindowHandles()){
                if(!windowsHandls.equals(mainWindows10)){
                    driver.switchTo().window(windowsHandls);
                }
            }
            this.clickYes();
            driver.switchTo().window(mainWindows10);
            frame.toTab3FrameAcc ();
            this.clickSpecparam ();
        }
        //Other
        if ( getPolygon () == 53){
            this.clickBtOther ();
            frame.toTab3Frame();
            this.clickSPPI ();
            String mainWindows10 = driver.getWindowHandle(); //запоминаем первое окно
            pause.userDelay( 1000 );
            for(String windowsHandls : driver.getWindowHandles()){
                if(!windowsHandls.equals(mainWindows10)){
                    driver.switchTo().window(windowsHandls);
                }
            }
            this.clickYes();
            driver.switchTo().window(mainWindows10);
            frame.toTab3Frame ();
            this.clickSpecparam ();
        }
        this.pressValue_5();
        this.enterValue( value );
        this.clickSaveBtn();
        this.pressValue_4();
        this.enterValue( value );
        this.clickSaveBtn();
        this.pressValue_3();
        this.enterValue( value );
        this.clickSaveBtn();
        this.pressValue_2();
        this.enterValue( value );
        this.clickSaveBtn();
        this.saveOptions();
        new CustomerAccounts( driver );
    }

    public void editCustAcc(String nlsAlt){
        pause.userDelay( 2000 );
        frame.toMainFrame();
        this.clickBtFind ();
        pause.userDelay( 3000 );
        this.clickScore();
        String mainWindows22 = driver.getWindowHandle();

        this.clickBtEdit();
        pause.userDelay( 3000 );
        String mainWindows21444 = driver.getWindowHandle();
        System.out.println ( "21first444 " + mainWindows21444 );
        for(String windowsHandls1234 : driver.getWindowHandles()){
            if(!windowsHandls1234.equals(mainWindows22)){
                driver.switchTo().window(windowsHandls1234);
            }
        }

        frame.toTab0FrameAcc();
        this.entertbNlsAlt( nlsAlt );
        //Financial details -----------------------------//
        frame.todefCont ();
        this.clickBTab1();
        frame.toTab1FrameAcc();
        this.clickDdVidBlkD();


        String mainWindows3 = driver.getWindowHandle(); //запоминаем первое окно
        checkPageAvailability.threePage ( "webService" );
        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows3);
        frame.toTab1FrameAcc();
        this.clickDdVidBlkK();
        String mainWindows45 = driver.getWindowHandle(); //запоминаем первое окно
        checkPageAvailability.threePage ( "webService" );
        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows45);
        frame.todefCont ();
        //Access rights ---------------------------------//
        this.clickBTab2();
        frame.toTab2FrameAcc();
        this.clickBtAdd();
        String mainWindows5 = driver.getWindowHandle(); //запоминаем первое окно

        checkPageAvailability.threePage ( "webService" );
        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows5);
        frame.todefCont ();
        //Special parameters
        this.clickBTab3();
        frame.toTab3FrameAcc();
        this.clickSpecparam ();
        new CustomerAccounts( driver );
    }

    public void closeCustAcc(String nls){
        pause.userDelay( 2000 );
        frame.toMainFrame();
        this.enterNls ( nls );
        this.clickBtFind ();
        pause.userDelay ( 1300 );
        this.clickScore();
        pause.userDelay ( 2000 );
        this.clickBtClose();
        this.clickClosureReason5();
        this.clickAlertifyOk();
        pause.userDelay( 500 );
        String mainWindows6 = driver.getWindowHandle();
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows6)){
                driver.switchTo().window(windowsHandls);
            }
        }
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
        driver.switchTo().window(mainWindows6);
        new CustomerAccounts( driver );
    }
}
