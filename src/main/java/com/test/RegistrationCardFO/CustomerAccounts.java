package com.test.RegistrationCardFO;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        //btOpen.click();
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
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", td_21);
       // td_21.click();
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
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", btSave);
        //btSave.click();
        new CustomerAccounts( driver );
    }

    private void clickBtOk(){
        WebDriverWait w = new WebDriverWait(driver, 1000);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(btOk));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", btOk);
        //new Actions(driver).moveToElement(btOk).doubleClick().build().perform();
        //btOk.click();
        new CustomerAccounts( driver );
    }

    private void clickButtonOK(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(buttonOK));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", buttonOK);
        //new Actions(driver).moveToElement(buttonOK).doubleClick().build().perform();
        //buttonOK.click();
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
        //btClose.click();
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

    private void clickScoreDBA(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf(scoreDBA));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //new Actions(driver).moveToElement(scoreDBA).doubleClick().build().perform();
        //scoreDBA.click();
        new CustomerAccounts( driver );
    }

    private void clickScoreDBAnew(){
        WebDriverWait w = new WebDriverWait(driver, 100);
        WebElement element = w.until ( ExpectedConditions.visibilityOf ( scoreDBAnew));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", scoreDBAnew);
        //new Actions(driver).moveToElement(scoreDBA).doubleClick().build().perform();
        //scoreDBA.click();
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

    public String getTextBtnOTHERS(){
        return  btnOTHERS.getText();
    }

    public String getTextNLSALT_1(){
        return  NLSALT_1.getText();
    }

    public void saveOptions(){
//        frame.toMainFrame();
        frame.todefCont ();
        List<WebElement> linkElements1 = driver.findElements(By.tagName("head"));
        System.out.println ( linkElements1 );
        this.clickBtSave();
        pause.userDelay( 3000 );
        frame.toTab3FrameAcc();

        //Confirmation window 1
        ArrayList<String> tabs12 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Win " + tabs12 );
        String mainWindows21 = driver.getWindowHandle();
        System.out.println ( "21first " + mainWindows21 );
        //pause.userDelay( 1000 );
        driver.switchTo().window(tabs12.get(2));
        WebElement elementID1 = driver.findElement(By.xpath ("//*[@id]"));
        String id1 = elementID1.getAttribute("id");     // for getting id of each element
        System.out.println ( "id1 " + id1 );
        if (!id1.equals ( "T1" )){
            driver.switchTo().window(tabs12.get(1)); // первый таб
            String mainWindows13 = driver.getWindowHandle();
            System.out.println ( "Win32 " + mainWindows13 );
            WebElement elementID3 = driver.findElement(By.xpath ("//*[@id]"));
            String id112 = elementID3.getAttribute("id");     // for getting id of each element
            System.out.println ( "id112 " +id112 );
            if (!id112.equals ( "T1" )){
                driver.switchTo().window(tabs12.get(0)); // первый таб
                String mainWindows113 = driver.getWindowHandle();
                System.out.println ( "Win31 " + mainWindows113 );
                WebElement elementID31 = driver.findElement(By.xpath ("//*[@id]"));
                String id1121 = elementID31.getAttribute("id");     // for getting id of each element
                System.out.println ( "id1121 " +id1121 );
                if (!id1121.equals ( "T1" )){
                    driver.switchTo().window(tabs12.get(2)); // первый таб
                    String mainWindows133 = driver.getWindowHandle();
                    System.out.println ( "Win33 " + mainWindows133 );
                    WebElement elementID123 = driver.findElement(By.xpath ("//*[@id]"));
                    String id123 = elementID123.getAttribute("id");     // for getting id of each element
                    System.out.println ( "id123 " +id123 );
                }
            }
        }
        String mainWindows4 = driver.getWindowHandle();
        System.out.println ( "Win4 " + mainWindows4 );


        //List<WebElement> linkElements = driver.findElements(By.tagName("head"));
        //System.out.println ( id );
        this.clickBtOk();
        driver.switchTo().window(tabs12.get(1));
        pause.userDelay(2000);

        //Confirmation window 2
        if (getPolygon() == 24 || getPolygon() == 40) {
            //frame.todefCont ();
            //this.clickBTab3();
            pause.userDelay ( 10000 );
            ArrayList<String> tabs1234567 = new ArrayList<> ( driver.getWindowHandles ( ) );
            pause.userDelay ( 2000 );
            driver.switchTo ( ).window ( tabs1234567.get ( 1 ) );
            System.out.println ( "Win " + tabs1234567 );
            String mainWindows211 = driver.getWindowHandle ( );
            System.out.println ( "21first " + mainWindows211 );
            WebElement elementID = driver.findElement ( By.xpath ( "//*[@id]" ) );
            String id = elementID.getAttribute ( "id" );     // for getting id of each element
            System.out.println ( "id " + id );
            ArrayList<String> tabs123 = new ArrayList<> ( driver.getWindowHandles ( ) );
            if (!id.equals ( "T1" )) {
                driver.switchTo ( ).window ( tabs123.get ( 0 ) ); // первый таб
                String mainWindows13 = driver.getWindowHandle ( );
                System.out.println ( "Win32 " + mainWindows13 );
                WebElement elementID3 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                String id112 = elementID3.getAttribute ( "id" );     // for getting id of each element
                System.out.println ( "id112 " + id112 );
                if (!id112.equals ( "T1" )) {
                    driver.switchTo ( ).window ( tabs123.get ( 1 ) ); // первый таб
                    String mainWindows113 = driver.getWindowHandle ( );
                    System.out.println ( "Win31 " + mainWindows113 );
                    WebElement elementID31 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                    String id1121 = elementID31.getAttribute ( "id" );     // for getting id of each element
                    System.out.println ( "id1121 " + id1121 );
                    if (!id1121.equals ( "T1" )) {
                        driver.switchTo ( ).window ( tabs123.get ( 2 ) ); // первый таб
                        String mainWindows133 = driver.getWindowHandle ( );
                        System.out.println ( "Win33 " + mainWindows133 );
                        WebElement elementID123 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                        String id123 = elementID123.getAttribute ( "id" );     // for getting id of each element
                        System.out.println ( "id123 " + id123 );
                    }
                }
            }
            String mainWindows421 = driver.getWindowHandle ( );
            System.out.println ( "Win4 " + mainWindows421 );
            this.clickButtonOK ( );
            pause.userDelay ( 5000 );
            ArrayList<String> tabs4400 = new ArrayList<> ( driver.getWindowHandles ( ) );
            driver.switchTo ( ).window ( tabs4400.get ( 0 ) );
            System.out.println ( "Win44 " + tabs4400 );
            String mainWindows44 = driver.getWindowHandle ( );
            System.out.println ( "21first44 " + mainWindows44 );
            WebElement elementID44 = driver.findElement ( By.xpath ( "//*[@id]" ) );
            String id44 = elementID44.getAttribute ( "id" );     // for getting id of each element
            System.out.println ( "id44 " + id44 );
            ArrayList<String> tabs44 = new ArrayList<> ( driver.getWindowHandles ( ) );

            driver.switchTo ( ).window ( tabs4400.get ( 0 ) );
            if (!id44.equals ( "ctl00" )) {
                driver.switchTo ( ).window ( tabs44.get ( 1 ) );// первый таб
                String mainWindows441 = driver.getWindowHandle ( );
                System.out.println ( "Win44 " + mainWindows441 );
                WebElement elementID441 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                String id442 = elementID441.getAttribute ( "id" );     // for getting id of each element
                System.out.println ( "id441 " + id442 );
                if (!id442.equals ( "ctl00" )) {
                    driver.switchTo ( ).window ( tabs44.get ( 0 ) ); // первый таб
                    String mainWindows442 = driver.getWindowHandle ( );
                    System.out.println ( "Win442 " + mainWindows442 );
                    WebElement elementID442 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                    String id443 = elementID442.getAttribute ( "id" );     // for getting id of each element
                    System.out.println ( "id443 " + id443 );
                    if (!id443.equals ( "ctl00" )) {
                        driver.switchTo ( ).window ( tabs44.get ( 2 ) ); // первый таб
                        String mainWindows444 = driver.getWindowHandle ( );
                        System.out.println ( "Win444" + mainWindows444 );
                        WebElement elementID444 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                        String id444 = elementID444.getAttribute ( "id" );     // for getting id of each element
                        System.out.println ( "id444 " + id444 );
                    }
                }
            }


            this.clickBTab3();
            String mainWindows = driver.getWindowHandle();
            System.out.println ( "Win01 " + mainWindows );
            driver.switchTo ().window ( mainWindows ).close ();

            ArrayList<String> tabs1237 = new ArrayList<> ( driver.getWindowHandles ( ) );
            System.out.println ( "tabs1237" + tabs1237 );
            driver.switchTo ( ).window ( tabs1237.get ( 0 ) );
            System.out.println ( "Win7 " + tabs1237 );
            String mainWindows2117 = driver.getWindowHandle ( );
            System.out.println ( "21first7 " + mainWindows2117 );
            WebElement elementID7 = driver.findElement ( By.xpath ( "//*[@id]" ) );
            String id7 = elementID7.getAttribute ( "id" );     // for getting id of each element
            System.out.println ( "id7 " + id7 );
            if (!id7.equals ( "body" )) {
                driver.switchTo ( ).window ( tabs1237.get ( 1 ) ); // первый таб
                String mainWindows137 = driver.getWindowHandle ( );
                System.out.println ( "Win327 " + mainWindows137 );
                WebElement elementID37 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                String id1127 = elementID37.getAttribute ( "id" );     // for getting id of each element
                System.out.println ( "id1127 " + id1127 );
                if (!id1127.equals ( "body" )) {
                    driver.switchTo ( ).window ( tabs1237.get ( 0 ) ); // первый таб
                    String mainWindows1137 = driver.getWindowHandle ( );
                    System.out.println ( "Win317 " + mainWindows1137 );
                    WebElement elementID317 = driver.findElement ( By.xpath ( "//*[@id]" ) );
                    String id11217 = elementID317.getAttribute ( "id" );     // for getting id of each element
                    System.out.println ( "id11217 " + id11217 );
                }
            }
            String mainWindows4217 = driver.getWindowHandle ( );
            System.out.println ( "Win47 " + mainWindows4217 );

            //driver.switchTo().window(tabs123.get(0));
        }

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

        ArrayList<String> tabs12344 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "tabs12344 " + tabs12344 );
        String mainWindows21344 = driver.getWindowHandle();
        System.out.println ( "21first344 " + mainWindows21344 );
        driver.switchTo().window(tabs123443.get(1));

        if (!id1344.equals ( "ctl00" )){
            driver.switchTo().window(tabs12344.get(0)); // первый таб
            String mainWindows13344 = driver.getWindowHandle();
            System.out.println ( "Win32344 " + mainWindows13344 );
            WebElement elementID3344 = driver.findElement(By.xpath ("//*[@id]"));
            String id112344 = elementID3344.getAttribute("id");     // for getting id of each element
            System.out.println ( "id112344 " +id112344 );
            if (!id112344.equals ( "ctl00" )){
                driver.switchTo().window(tabs12344.get(1)); // первый таб
                String mainWindows11344 = driver.getWindowHandle();
                System.out.println ( "Win3144 " + mainWindows11344 );
                WebElement elementID31344 = driver.findElement(By.xpath ("//*[@id]"));
                String id1121344 = elementID31344.getAttribute("id");     // for getting id of each element
                System.out.println ( "id1121344 " +id1121344 );
            }
        }

        String mainWindows4344 = driver.getWindowHandle();
        System.out.println ( "Win4344 " + mainWindows4344 );

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
        ArrayList<String> tabs22222222 = new ArrayList<> (driver.getWindowHandles()); //Получение списка табов
        driver.switchTo().window(tabs22222222.get(2)); // первый таб
        String mainWindows3 = driver.getWindowHandle();
        System.out.println ( "Win323 " + mainWindows3 );
        ArrayList<String> tabs2 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "id22313213113 " +tabs2 );
        WebElement elementID2 = driver.findElement(By.xpath ("//*[@id]"));
        String id2 = elementID2.getAttribute("id");     // for getting id of each element
        System.out.println ( "id2 " +id2 );
        if (!id2.equals ( "webService" )){
            driver.switchTo().window(tabs2.get(1)); // первый таб
            String mainWindows13 = driver.getWindowHandle();
            System.out.println ( "Win32 " + mainWindows13 );
            WebElement elementID3 = driver.findElement(By.xpath ("//*[@id]"));
            String id112 = elementID3.getAttribute("id");     // for getting id of each element
            System.out.println ( "id112 " +id112 );
            if (!id112.equals ( "webService" )){
                driver.switchTo().window(tabs2.get(0)); // первый таб
                String mainWindows113 = driver.getWindowHandle();
                System.out.println ( "Win31 " + mainWindows113 );
                WebElement elementID31 = driver.findElement(By.xpath ("//*[@id]"));
                String id1121 = elementID31.getAttribute("id");     // for getting id of each element
                System.out.println ( "id1121 " +id1121 );
                if (!id1121.equals ( "webService" )){
                    driver.switchTo().window(tabs2.get(2)); // первый таб
                    String mainWindows133 = driver.getWindowHandle();
                    System.out.println ( "Win33 " + mainWindows133 );
                    WebElement elementID123 = driver.findElement(By.xpath ("//*[@id]"));
                    String id123 = elementID123.getAttribute("id");     // for getting id of each element
                    System.out.println ( "id123 " +id123 );
                }
            }
        }
        String mainWindows4 = driver.getWindowHandle();
        System.out.println ( "Win4 " + mainWindows4 );
        /*for(String windowsHandls : driver.getWindowHandles()){
            if(!windowsHandls.equals(mainWindows123)) {
                driver.switchTo().window(windowsHandls);
            }
        }*/
        this.clickTd_21();
        driver.switchTo().window(mainWindows);
        //frame.toMainFrame();
        //Special parameters
        this.clickBTab3();
        frame.toTab3FrameAcc();
        if (getPolygon () == 24 || getPolygon () == 53){
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
            //driver.switchTo().window(mainWindows);
            //this.clickYes ();
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
            //driver.switchTo().window(mainWindows);
            //this.clickYes ();
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
        //frame.toMainFrame();
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
        //this.clickBtOpen();
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
       // frame.toMainFrame();
        this.clickBTab1();
        frame.toTab1FrameAcc();
        this.clickDdVidBlkD();


        String mainWindows3 = driver.getWindowHandle(); //запоминаем первое окно
        ArrayList<String> tabs121 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Win " + tabs121 );
        String mainWindows211 = driver.getWindowHandle();
        System.out.println ( "21first " + mainWindows211 );
        driver.switchTo().window(tabs121.get(2));
        WebElement elementID1 = driver.findElement(By.xpath ("//*[@id]"));
        String id1 = elementID1.getAttribute("id");     // for getting id of each element
        System.out.println ( "id1 " + id1 );
        ArrayList<String> tabs12 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Winrewsaf " + tabs12 );
        String mainWindows21 = driver.getWindowHandle();
        System.out.println ( "21first dfsdsf" + mainWindows21 );
        driver.switchTo().window(tabs12.get(2));
        if (!id1.equals ( "webService" )){
            driver.switchTo().window(tabs12.get(1)); // первый таб
            String mainWindows13 = driver.getWindowHandle();
            System.out.println ( "Win32 " + mainWindows13 );
            WebElement elementID3 = driver.findElement(By.xpath ("//*[@id]"));
            String id112 = elementID3.getAttribute("id");     // for getting id of each element
            System.out.println ( "id112 " +id112 );
            if (!id112.equals ( "webService" )){
                driver.switchTo().window(tabs12.get(0)); // первый таб
                String mainWindows113 = driver.getWindowHandle();
                System.out.println ( "Win31 " + mainWindows113 );
                WebElement elementID31 = driver.findElement(By.xpath ("//*[@id]"));
                String id1121 = elementID31.getAttribute("id");     // for getting id of each element
                System.out.println ( "id1121 " +id1121 );
                if (!id1121.equals ( "webService" )){
                    driver.switchTo().window(tabs12.get(2)); // первый таб
                    String mainWindows133 = driver.getWindowHandle();
                    System.out.println ( "Win33 " + mainWindows133 );
                    WebElement elementID123 = driver.findElement(By.xpath ("//*[@id]"));
                    String id123 = elementID123.getAttribute("id");     // for getting id of each element
                    System.out.println ( "id123 " +id123 );
                }
            }
        }
        String mainWindows4 = driver.getWindowHandle();
        System.out.println ( "Win4qwe " + mainWindows4 );
        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows3);
        frame.toTab1FrameAcc();
        this.clickDdVidBlkK();


        String mainWindows45 = driver.getWindowHandle(); //запоминаем первое окно
        ArrayList<String> tabs123 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Win " + tabs123 );
        String mainWindows213 = driver.getWindowHandle();
        System.out.println ( "21first3 " + mainWindows213 );
        //pause.userDelay( 1000 );
        driver.switchTo().window(tabs123.get(2));
        WebElement elementID13 = driver.findElement(By.xpath ("//*[@id]"));
        String id13 = elementID13.getAttribute("id");     // for getting id of each element
        System.out.println ( "id13 " + id13 );
        if (!id13.equals ( "webService" )){
            driver.switchTo().window(tabs123.get(1)); // первый таб
            String mainWindows133 = driver.getWindowHandle();
            System.out.println ( "Win323 " + mainWindows133 );
            WebElement elementID33 = driver.findElement(By.xpath ("//*[@id]"));
            String id1123 = elementID33.getAttribute("id");     // for getting id of each element
            System.out.println ( "id1123 " +id1123 );
            if (!id1123.equals ( "webService" )){
                driver.switchTo().window(tabs123.get(0)); // первый таб
                String mainWindows113 = driver.getWindowHandle();
                System.out.println ( "Win31 " + mainWindows113 );
                WebElement elementID313 = driver.findElement(By.xpath ("//*[@id]"));
                String id11213 = elementID313.getAttribute("id");     // for getting id of each element
                System.out.println ( "id11213 " +id11213 );
                if (!id11213.equals ( "webService" )){
                    driver.switchTo().window(tabs123.get(2)); // первый таб
                    String mainWindows1333 = driver.getWindowHandle();
                    System.out.println ( "Win333 " + mainWindows1333 );
                    WebElement elementID1233 = driver.findElement(By.xpath ("//*[@id]"));
                    String id1233 = elementID1233.getAttribute("id");     // for getting id of each element
                    System.out.println ( "id1233 " +id1233 );
                }
            }
        }
        String mainWindows43 = driver.getWindowHandle();
        System.out.println ( "Win43 " + mainWindows43 );

        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows45);
        frame.todefCont ();
        //frame.toMainFrame();
        //Access rights ---------------------------------//
        this.clickBTab2();
        frame.toTab2FrameAcc();
        this.clickBtAdd();
        String mainWindows5 = driver.getWindowHandle(); //запоминаем первое окно

        String mainWindows4588 = driver.getWindowHandle(); //запоминаем первое окно
        ArrayList<String> tabs12388 = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "Win 88" + tabs12388 );
        String mainWindows21388 = driver.getWindowHandle();
        System.out.println ( "21first388 " + mainWindows21388 );
        //pause.userDelay( 1000 );
        driver.switchTo().window(tabs12388.get(2));
        WebElement elementID1388 = driver.findElement(By.xpath ("//*[@id]"));
        String id1388 = elementID1388.getAttribute("id");     // for getting id of each element
        System.out.println ( "id1388 " + id1388 );
        if (!id13.equals ( "webService" )){
            driver.switchTo().window(tabs12388.get(1)); // первый таб
            String mainWindows13388 = driver.getWindowHandle();
            System.out.println ( "Win323 " + mainWindows13388 );
            WebElement elementID3388 = driver.findElement(By.xpath ("//*[@id]"));
            String id112388 = elementID3388.getAttribute("id");     // for getting id of each element
            System.out.println ( "id112388 " +id112388 );
            if (!id112388.equals ( "webService" )){
                driver.switchTo().window(tabs12388.get(0)); // первый таб
                String mainWindows11388 = driver.getWindowHandle();
                System.out.println ( "Win3188 " + mainWindows11388 );
                WebElement elementID31388 = driver.findElement(By.xpath ("//*[@id]"));
                String id1121388 = elementID31388.getAttribute("id");     // for getting id of each element
                System.out.println ( "id1121388 " +id1121388 );
                if (!id1121388.equals ( "webService" )){
                    driver.switchTo().window(tabs12388.get(2)); // первый таб
                    String mainWindows133388 = driver.getWindowHandle();
                    System.out.println ( "Win33388 " + mainWindows133388 );
                    WebElement elementID123388 = driver.findElement(By.xpath ("//*[@id]"));
                    String id123388 = elementID123388.getAttribute("id");     // for getting id of each element
                    System.out.println ( "id123388 " +id123388 );
                }
            }
        }
        String mainWindows4388 = driver.getWindowHandle();
        System.out.println ( "Win4388" + mainWindows4388 );

        this.clickScoreDBAnew();
        driver.switchTo().window(mainWindows5);
        //frame.toMainFrame();
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
