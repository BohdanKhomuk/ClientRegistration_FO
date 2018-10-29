package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EconomicNorms {

    public WebDriver driver;
    private Frame frame;

    public EconomicNorms(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    @FindBy(id = "ddl_ISE_com")
    @CacheLookup
    private WebElement ddl_ISE_com;
    @FindBy(id = "ddl_FS_com")
    @CacheLookup
    private WebElement ddl_FS_com;
    @FindBy(id = "ddl_VED_com")
    @CacheLookup
    private WebElement ddl_VED_com;
    @FindBy(id = "ddl_K050_com")
    @CacheLookup
    private WebElement ddl_K050_com;
    @FindBy(xpath = "//*[@title = '11002']")
    @CacheLookup
    private WebElement dir_ISE_com;
    @FindBy(xpath = "//*[@title = '32']")
    @CacheLookup
    private WebElement dir_FS_com;
    @FindBy(xpath = "//*[@title = 'N2529']")
    @CacheLookup
    private WebElement dir_VED_com;
    @FindBy(xpath = "//*[@title= '192']")
    @CacheLookup
    private WebElement dir_K050_com;


    private void pressISE_com() {
        ddl_ISE_com.click();
        new BasicDetails( driver );
    }

    private void pressFS_com() {
        ddl_FS_com.click();
        new BasicDetails( driver );
    }

    private void pressVED_com() {
        ddl_VED_com.click();
        new BasicDetails( driver );
    }

    private void pressK050_com() {
        ddl_K050_com.click();
        new BasicDetails( driver );
    }

    private void pressDirISE_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(dir_ISE_com).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirFS_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(dir_FS_com).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirVED_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(dir_VED_com).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirK050_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(dir_K050_com).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    public void correctDetails(){
        /*frame.tabFrame( "Tab2" );
        this.pressISE_com();
        frame.kContentFrame();
        this.pressDirISE_com();*/
        frame.tabFrame( "Tab2" );
        this.pressFS_com();
        frame.kContentFrame();
        this.pressDirFS_com();
        frame.tabFrame( "Tab2" );
        this.pressVED_com();
        frame.kContentFrame();
        this.pressDirVED_com();
/*        frame.tabFrame( "Tab2" );
        this.pressK050_com();
        frame.kContentFrame();
        this.pressDirK050_com();*/

    }
}
