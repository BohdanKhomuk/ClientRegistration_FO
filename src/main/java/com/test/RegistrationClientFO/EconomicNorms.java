package com.test.RegistrationClientFO;

import com.test.Methods.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EconomicNorms {

    public WebDriver driver;
    private Frame frame;

    public EconomicNorms(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
    }

    private By ddl_ISE_com = By.id("ddl_ISE_com");
    private By ddl_FS_com = By.id("ddl_FS_com");
    private By ddl_VED_com = By.id("ddl_VED_com");
    private By ddl_K050_com = By.id("ddl_K050_com");
    private By dir_ISE_com = By.xpath("//*[@title = '11002']");
    private By dir_FS_com = By.xpath("//*[@title = '32']");
    private By dir_VED_com = By.xpath("//*[@title = 'N2529']");
    private By dir_K050_com = By.xpath("//*[@title= '192']");


    private void pressISE_com() {
        driver.findElement( ddl_ISE_com ).click();
        new BasicDetails( driver );
    }

    private void pressFS_com() {
        driver.findElement( ddl_FS_com ).click();
        new BasicDetails( driver );
    }

    private void pressVED_com() {
        driver.findElement( ddl_VED_com ).click();
        new BasicDetails( driver );
    }

    private void pressK050_com() {
        driver.findElement( ddl_K050_com ).click();
        new BasicDetails( driver );
    }

    private void pressDirISE_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(dir_ISE_com)).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirFS_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(dir_FS_com)).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirVED_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(dir_VED_com)).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    private void pressDirK050_com() {
        Actions actname = new Actions(driver);
        actname.moveToElement(driver.findElement(dir_K050_com)).doubleClick().build().perform();
        new EconomicNorms( driver );
    }

    public void correctDetails(){
        frame.tabFrame( "Tab2" );
        this.pressISE_com();
        frame.kContentFrame();
        this.pressDirISE_com();
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
