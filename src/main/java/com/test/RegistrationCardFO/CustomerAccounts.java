package com.test.RegistrationCardFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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

    private By btOpen = By.id("btOpen");
    private By btEdit = By.id("btEdit");
    private By btClose = By.id("btClose");
    private By score = By.id("r_1");
    private By NLSALT_1 = By.id("NLSALT_1");
    private By scoreDBA = By.id("r_9");
    private By closureReason5 = By.id("closureReason5");
    private By alertifyOk = By.id("alertify-ok");
    //Basic details ----------------------------------//
    private By tbNbs = By.id("tbNbs");
    private By bAccountMask = By.id("bAccountMask");
    private By ddOb22 = By.id("ddOb22");
    private By td_21 = By.id("td_21");
    private By tbNlsAlt = By.id("tbNlsAlt");
    //-----------------------------------------------//
    //Financial details -----------------------------//
    private By bTab1 = By.id("bTab1");
    private By ddVidBlkD = By.id("ddVidBlkD");
    private By ddVidBlkK = By.id("ddVidBlkK");
    //-----------------------------------------------//
    //Access rights ---------------------------------//
    private By bTab2 = By.id("bTab2");
    private By btAdd = By.id("btAdd");
    //-----------------------------------------------//
    //Special parameters ----------------------------//
    private By bTab3 = By.id("bTab3");
    private By VALUE_5 = By.id("VALUE_5");
    private By VALUE_4 = By.id("VALUE_4");
    private By VALUE_3 = By.id("VALUE_3");
    private By VALUE_2 = By.id("VALUE_2");
    private By VALUE = By.id("VALUE");
    private By saveBtn = By.xpath("//input[@type='button' and @value='Зберегти']");
    private By btnSPECPARAM = By.id("btnSPECPARAM");
    private By btnSPECPARAM_INT = By.id("btnSPECPARAM_INT");
    private By btnDPT = By.id("btnDPT");
    private By btnBPK = By.id("btnBPK");
    private By btnCVK = By.id("btnCVK");
    private By btnOTHERS = By.id("btnOTHERS");
    //---------------------------------------------//
    private By btSave = By.id( "btSave" );
    private By btOk = By.id( "btOk" );
    private By buttonOK = By.xpath( "//input[@type='button' and @value='Ok']" );


    private void clickBtOpen(){
        driver.findElement(btOpen).click();
        new CustomerAccounts( driver );
    }

    private void clickBAccountMask(){
        driver.findElement(bAccountMask).click();
        new CustomerAccounts( driver );
    }

    private void clickDdOb22(){
        driver.findElement(ddOb22).click();
        new CustomerAccounts( driver );
    }

    private void clickTd_21(){
        driver.findElement( td_21 ).click();
        new CustomerAccounts( driver );
    }

    private void clickDdVidBlkD(){
        driver.findElement( ddVidBlkD ).click();
        new CustomerAccounts( driver );
    }

    private void clickDdVidBlkK(){
        driver.findElement( ddVidBlkK ).click();
        new CustomerAccounts( driver );
    }

    private void clickSaveBtn(){
        driver.findElement( saveBtn ).click();
        new CustomerAccounts( driver );
    }

    private void clickBtSave(){
        driver.findElement( btSave ).click();
        new CustomerAccounts( driver );
    }

    private void clickBtOk(){
        driver.findElement( btOk ).click();
        new CustomerAccounts( driver );
    }

    private void clickButtonOK(){
        driver.findElement( buttonOK ).click();
        new CustomerAccounts( driver );
    }


    private void clickClosureReason5(){
        driver.findElement( closureReason5 ).click();
        new CustomerAccounts( driver );
    }

    private void clickAlertifyOk(){
        driver.findElement( alertifyOk ).click();
        new CustomerAccounts( driver );
    }

    private void clickBtEdit(){
        driver.findElement( btEdit ).click();
        new CustomerAccounts( driver );
    }

    private void clickBtClose(){
        driver.findElement( btClose ).click();
        new CustomerAccounts( driver );
    }

    private void clickScore(){
        driver.findElement( score ).click();
        new CustomerAccounts( driver );
    }

    private void clickBTab1(){
        driver.findElement( bTab1 ).click();
        new CustomerAccounts( driver );
    }

    private void clickBTab2(){
        driver.findElement( bTab2 ).click();
        new CustomerAccounts( driver );
    }

    private void clickBTab3(){
        driver.findElement( bTab3 ).click();
        new CustomerAccounts( driver );
    }

    private void clickScoreDBA(){
        driver.findElement( scoreDBA ).click();
        new CustomerAccounts( driver );
    }

    private void clickBtAdd(){
        driver.findElement( btAdd ).click();
        new CustomerAccounts( driver );
    }

    private void pressValue_5(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(VALUE_5)).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_4(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(VALUE_4)).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_3(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(VALUE_3)).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void pressValue_2(){
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(VALUE_2)).doubleClick().build().perform();
        new CustomerAccounts( driver );
    }

    private void enterTbNbs(String nbs){
        driver.findElement(tbNbs).sendKeys( nbs );
    }

    private void enterValue(String value){
        driver.findElement(VALUE).sendKeys( value );
    }

    private void entertbNlsAlt(String nlsAlt){
        driver.findElement(tbNlsAlt).sendKeys( nlsAlt );
    }

    public String getTextBtnSPECPARAM(){
        return  driver.findElement( btnSPECPARAM ).getText();
    }

    public String getTextBtnSPECPARAM_INT(){
        return  driver.findElement( btnSPECPARAM_INT ).getText();
    }

    public String getTextBtnDPT(){
        return  driver.findElement( btnDPT ).getText();
    }

    public String getTextBtnBPK(){
        return  driver.findElement( btnBPK ).getText();
    }

    public String getTextBtnCVK(){
        return  driver.findElement( btnCVK ).getText();
    }

    public String getTextBtnOTHERS(){
        return  driver.findElement( btnOTHERS ).getText();
    }

    public String getTextNLSALT_1(){
        return  driver.findElement( NLSALT_1 ).getText();
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
