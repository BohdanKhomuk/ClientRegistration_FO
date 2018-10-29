package com.test.RegistrationCardFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static com.test.LoginPage.getPolygon;

public class CustomerAccounts {

    public WebDriver driver;
    private Frame frame;
    private Pause pause;

    public CustomerAccounts(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
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
    @FindBy(id = "NLSALT_1")
    @CacheLookup
    private WebElement NLSALT_1;
    @FindBy(id = "r_9")
    private WebElement scoreDBA;
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
    @CacheLookup
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
    //---------------------------------------------//
    @FindBy(id = "btSave")
    private WebElement btSave;
    @FindBy(id = "btOk")
    private WebElement btOk;
    @FindBy(xpath = "//input[@type='button' and @value='Ok']")
    private WebElement buttonOK;


    private void clickBtOpen(){
        btOpen.click();
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
        td_21.click();
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
        btSave.click();
        new CustomerAccounts( driver );
    }

    private void clickBtOk(){
        btOk.click();
        new CustomerAccounts( driver );
    }

    private void clickButtonOK(){
        buttonOK.click();
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
        btClose.click();
        new CustomerAccounts( driver );
    }

    private void clickScore(){
        score.click();
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

    private void clickScoreDBA(){
        scoreDBA.click();
        new CustomerAccounts( driver );
    }

    private void clickBtAdd(){
        btAdd.click();
        new CustomerAccounts( driver );
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

    public String getTextBtnOTHERS(){
        return  btnOTHERS.getText();
    }

    public String getTextNLSALT_1(){
        return  NLSALT_1.getText();
    }

    public void saveOptions(){
        frame.toMainFrame();
        this.clickBtSave();
        pause.userDelay( 2000 );
        frame.toTab3Frame();
        //Confirmation window 1
        String mainWindows1 = driver.getWindowHandle();
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows1)){
                driver.switchTo().window(windowsHandls);
            }
        }
        this.clickBtOk();
        driver.switchTo().window(mainWindows1);
        pause.userDelay(4000);
        //Confirmation window 2
        if (getPolygon() == 22 || getPolygon() == 40){
           /* Actions action = new Actions(driver);
            action.sendKeys(Keys.ESCAPE).build().perform();*/
            frame.toMainFrame();
            this.clickBTab3();
            frame.toTab3Frame();
            String mainWindows2 = driver.getWindowHandle();
            pause.userDelay( 1000 );
            for(String windowsHandls : driver.getWindowHandles()){
                if(!windowsHandls.equals(mainWindows2)){
                driver.switchTo().window(windowsHandls);
                }
            }
            this.clickButtonOK();
            driver.switchTo().window(mainWindows2);
        }
        // Return to page with accounts
        driver.switchTo().defaultContent();
        if (getPolygon() == 50 ){
            driver.navigate().back();
        }
        pause.userDelay( 2000 );
        driver.navigate().back();
        frame.toMainFrame();
        new CustomerAccounts( driver );
    }

    public void createCustAcc(String nsb, String value){
        this.clickBtOpen();
        //Basic details
        pause.userDelay( 3000 );
        frame.toTab0Frame();
        this.enterTbNbs( nsb );
        this.clickBAccountMask();
        this.clickDdOb22();
        String mainWindows = driver.getWindowHandle(); //запоминаем первое окно
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows)){
                driver.switchTo().window(windowsHandls);
            }
        }
        this.clickTd_21();
        driver.switchTo().window(mainWindows);
        frame.toMainFrame();
        //Special parameters
        this.clickBTab3();
        frame.toTab3Frame();
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
        this.clickScore();
        this.clickBtEdit();
        pause.userDelay( 2000 );
        frame.toTab0Frame();
        this.entertbNlsAlt( nlsAlt );
        //Financial details -----------------------------//
        frame.toMainFrame();
        this.clickBTab1();
        frame.toTab1Frame();
        this.clickDdVidBlkD();
        String mainWindows3 = driver.getWindowHandle(); //запоминаем первое окно
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows3)){
                driver.switchTo().window(windowsHandls);
            }
        }
        this.clickScoreDBA();
        driver.switchTo().window(mainWindows3);
        frame.toTab1Frame();
        this.clickDdVidBlkK();
        String mainWindows4 = driver.getWindowHandle(); //запоминаем первое окно
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows4)){
                driver.switchTo().window(windowsHandls);
            }
        }
        this.clickScoreDBA();
        driver.switchTo().window(mainWindows4);
        frame.toMainFrame();
        //Access rights ---------------------------------//
        this.clickBTab2();
        frame.toTab2Frame();
        this.clickBtAdd();
        String mainWindows5 = driver.getWindowHandle(); //запоминаем первое окно
        pause.userDelay( 1000 );
        for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows5)){
                driver.switchTo().window(windowsHandls);
            }
        }
        this.clickScoreDBA();
        driver.switchTo().window(mainWindows5);
        frame.toMainFrame();
        //Special parameters
        this.clickBTab3();
        frame.toTab3Frame();
        new CustomerAccounts( driver );
    }

    public void closeCustAcc(){
        this.clickScore();
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
        //this.clickButtonOK();
        driver.switchTo().window(mainWindows6);
        new CustomerAccounts( driver );
    }
}
