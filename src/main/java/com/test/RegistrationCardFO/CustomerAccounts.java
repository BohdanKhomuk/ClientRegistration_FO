package com.test.RegistrationCardFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CustomerAccounts {

    public WebDriver driver;
    private Frame frame;

    public CustomerAccounts(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By btOpen = By.id("btOpen");
    private By tbNbs = By.id("tbNbs");
    private By bAccountMask = By.id("bAccountMask");
    private By ddOb22 = By.id("ddOb22");
    private By td_21 = By.id("td_21");
    private By bTab3 = By.id("bTab3");
    private By VALUE_5 = By.id("VALUE_5");
    private By VALUE_4 = By.id("VALUE_4");
    private By VALUE_3 = By.id("VALUE_3");
    private By VALUE_2 = By.id("VALUE_2");
    private By VALUE = By.id("VALUE");
    private By saveBtn = By.xpath("//input[@type='button' and @value='Зберегти']");
    private By btSave = By.id( "btSave" );


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

    private void clickBTab3(){
        driver.findElement( bTab3 ).click();
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

    public void createCustAcc(String nsb, String value){
        this.clickBtOpen();
        frame.toTab0Frame();
        this.enterTbNbs( nsb );
        this.clickBAccountMask();
        this.clickDdOb22();
        String mainWindows = driver.getWindowHandle(); //запоминаем первое окно
        //Переход на второе окно
        for(String windowsHandls : driver.getWindowHandles()){
            driver.switchTo().window(windowsHandls);
        }
        this.clickTd_21();
        driver.switchTo().window(mainWindows);
        frame.toMainFrame();
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
        frame.toMainFrame();
        this.clickBtSave();
        new CustomerAccounts( driver );
    }
}
