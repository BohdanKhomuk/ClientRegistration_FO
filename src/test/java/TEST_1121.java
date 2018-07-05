

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TEST_1121 {

    //private static WebDriver driver;
    public static EventFiringWebDriver eventDriver;

    RandomWords random = new RandomWords();
 //   Frame frame = new Frame();

    public void todefCont(){
        eventDriver.switchTo().defaultContent();
    }

    public void toMainFrame(){
        todefCont();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("mainFrame")));
        userDelay( 3000 );
    }

    public void kContentFrame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.className("k-content-frame")));
    }

    public void fullAddressFrame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame( eventDriver.findElement(By.xpath( "//iframe[@title = 'Повна адреса клієнта']" )) );
    }
    public void tabFrame(String path){
        todefCont();
        toMainFrame();
        kContentFrame();
        eventDriver.switchTo().frame( path );
    }

    public void pressOnXpath(String attribute) {
        (new WebDriverWait(eventDriver, 10000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(attribute)));
        eventDriver.findElement(By.xpath(attribute)).click();
    }

    public void pressOnId(String attribute) {
        (new WebDriverWait(eventDriver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id(attribute)));
        eventDriver.findElement(By.id(attribute)).click();
    }

    @BeforeClass
    public static void main() {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String browser = new File(TEST_1121.class.getResource( "/IEDriverServer.exe" ).getFile()).getPath();
        System.setProperty("webdriver.ie.driver", browser);
        eventDriver = new EventFiringWebDriver( new InternetExplorerDriver(  ) );

       /* String browser = new File(TEST_1121.class.getResource("/chromedriver.exe").getFile()).getPath();
        System.setProperty("webdriver.chrome.driver", browser);
        eventDriver = new EventFiringWebDriver(new ChromeDriver(  ));*/
        EventHandler handler = new EventHandler();
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eventDriver.register( handler );
        eventDriver.get("http://10.10.17.40:8080/barsroot/account/login/");

    }
    public void userDelay(int time) {
        try {Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace(); }
    }
    public void mousemove(String path) {
        WebElement el = eventDriver.findElement(By.xpath(path));
        Actions actions = new Actions(eventDriver);
        actions.moveToElement(el).build().perform();
        userDelay(1000);
    }
    @Test
    public void userLogin() throws FileNotFoundException {
        userDelay(1000);
        // User_Name clear and add
        WebElement loginField = eventDriver.findElement(By.id("txtUserName"));
        loginField.clear();
        loginField.sendKeys("absadm01");
        // Password
        WebElement passwordField = eventDriver.findElement(By.id("txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("qwerty");
        pressOnId(  "btLogIn" );
        pressOnId( "btChangDate" );
        // Find element
        eventDriver.findElement(By.id("findOpersText")).sendKeys( "Реєстрація Клієнтів і Рахунків"  + "\n" );
        // Enter in function
        userDelay(6000);
        pressOnXpath( ".//div[@id='oper-3039']/div[2]/span" );
        toMainFrame();
        pressOnId( "registerCustBtn" );
        pressOnXpath( "//div[@class = 'k-window-content k-content']/div/div/div[2]/button" );
        userDelay(3000);
        eventDriver.findElement( By.xpath( "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" ) ).sendKeys( RandomWords.randomNumber( 10, 99999 ) );
        pressOnXpath( "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']"  );
        pressOnXpath( "//button[@class = 'k-button']" );

//      Basic details
        tabFrame( "Tab0" );
        pressOnId( "bt_FullDopRekv" );
        userDelay( 1000 );
        eventDriver.findElement( By.id( "ed_FIO_LN" ) ).sendKeys( random.Sourname() );
        eventDriver.findElement( By.id( "ed_FIO_FN" ) ).sendKeys( random.Name() );
        eventDriver.findElement( By.id( "ed_FIO_MN" ) ).sendKeys( random.Patronymic() );
//        userDelay( 1000 );
//        Actions action = new Actions( eventDriver );
//        action.sendKeys( Keys.ESCAPE ).perform();
//        action.sendKeys( Keys.ESCAPE ).perform();
//        action.sendKeys( Keys.ESCAPE ).perform();
        //eventDriver.findElement( By.xpath( "//button/span" ) ).click();

        // Clien adress
        pressOnId( "btnOpenWindowAddress" );
        userDelay( 2000 );
        fullAddressFrame();
        eventDriver.findElement(By.id( "legalIndex" ) ).sendKeys( RandomWords.randomNumber( 100000, 999999 ));
        eventDriver.findElement(By.id( "legalRegion" ) ).sendKeys( "Київська обл.");
        eventDriver.findElement(By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalArea']" ) ).sendKeys( "Обухівський район");
        pressOnXpath("//span[@class = 'k-input ng-scope']"   );
        pressOnXpath("//ul[@id='legalSettlemetDropDown_listbox']/li[2]"   );
        eventDriver.findElement(By.xpath( "//input[@ng-model = 'legalSettlement']" ) ).sendKeys( "Обухівв" );
       // userDelay( 10000 );
//        eventDriver.findElement(By.xpath( "//span[@class = 'k-dropdown-wrap k-state-disabled']/span/span" ) ).click();
//        userDelay( 3000 );
//        eventDriver.findElement(By.xpath( "//ul[@id='legalStreetDropDown_listbox']/li[3]" ) ).click();
        eventDriver.findElement(By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalStreet']" ) ).sendKeys( "Варвари" );
//        eventDriver.findElement(By.xpath( "//div[8]/span[2]/span/span" ) ).click();
//        userDelay( 3000 );
//        eventDriver.findElement(By.xpath( "//ul[@id='legalHouseDropDown_listbox']/li[2]" ) ).click();
        eventDriver.findElement(By.xpath( "//input[@ng-model = 'legalHouse']" ) ).sendKeys( "54" );
        //        eventDriver.findElement(By.id( "btnSaveAddress" ) ).click();
        pressOnId(  "btnSaveAddress");
        // IPN
        tabFrame( "Tab0" );
        eventDriver.findElement(By.id("ed_OKPO")).sendKeys( "0000000000" );

//      Client details
        userDelay( 1000 );
        kContentFrame();
        pressOnId( "bTab3" );
        userDelay( 1000 );
        tabFrame( "Tab3" );
        pressOnId( "ddl_PASSP" );
        pressOnXpath( "//select[@id = 'ddl_PASSP']/option[@value = '1']" );
        eventDriver.findElement( By.id( "ed_SER" ) ).sendKeys( random.randomStringBig( 2 ) );
        eventDriver.findElement( By.id( "ed_NUMDOC" ) ).sendKeys( RandomWords.randomNumber( 100000, 999999 ) );
        eventDriver.findElement( By.id( "ed_ORGAN" )).sendKeys( "Овручським районним управлінням");
//        eventDriver.findElement( By.id( "bt_help" ) ).click();
//        kContentFrame();
//        userDelay( 10000 );
//        eventDriver.findElement( By.xpath( "//div[@title = '313']" )).click();
//        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
//        userDelay( 1000 );
//        tabFrame( "Tab3" );
        userDelay( 3000 );
        WebElement PDATE = eventDriver.findElement( By.id( "ed_PDATE" ) );
        PDATE.click();
        PDATE.clear();
        userDelay( 2000 );
        PDATE.sendKeys( "10102010" );
        WebElement Photo = eventDriver.findElement( By.id( "ed_DATE_PHOTO" ) );
        Photo.click();
        Photo.clear();
        userDelay( 3000 );
        Photo.sendKeys( Keys.END + "05022018");
        WebElement BDay = eventDriver.findElement( By.id( "ed_BDAY" ) );
        BDay.click();
        BDay.clear();
        userDelay( 2000 );
        BDay.sendKeys( Keys.END + "10101992");
        pressOnId( "ddl_SEX" );
        pressOnXpath("//select[@id = 'ddl_SEX']/option[@value = '1']"  );
        pressOnId( "ed_TELM_CODE" );
        userDelay( 1000 );
        // Mobile phohe
        kContentFrame();
        pressOnXpath( "//tr[@class = 'k-alt']//div[@title = '96']" );
        pressOnXpath( "//span[@disabled='disabled']" );
        userDelay( 1000 );
        tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELM" ) ).sendKeys( RandomWords.randomNumber( 1000000, 9999999 ) );
        pressOnId( "ed_TELD_CODE" );
        pressOnId( "ed_TELD_CODE" );
        userDelay( 5000 );
        kContentFrame();
        pressOnXpath( "//td[@role = 'gridcell']/div[@title = '692']" );
        pressOnXpath( "//span[@disabled='disabled']" );
        tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELD" ) ).sendKeys( RandomWords.randomNumber( 100000, 999999 ) );
//        WebElement data = eventDriver.findElement( By.id( "ed_ORGAN" ) );
//        data.click();
//        data.sendKeys( Keys.END );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );
//        data.sendKeys( Keys.BACK_SPACE );

//        Additional information
        userDelay( 1000 );
        kContentFrame();
        pressOnId("bTab4" );
        tabFrame( "Tab4" );
        pressOnId("bt_help" );
        kContentFrame();
        pressOnXpath("//div[@title = '11301']" );
        pressOnXpath("//button[@class = 'delete-confirm k-button k-primary']"   );

//         Additional details
        pressOnId( "bTab5" );
        // general
        userDelay( 2000 );
        tabFrame( "Tab5" );
        pressOnId( "gvMain_ctl02_imgEdHelp"  );
        kContentFrame();
        pressOnXpath( "//div[@title = '2']" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        // Fin.mon.
        userDelay( 3000 );
        tabFrame( "Tab5" );
        pressOnXpath( "//a[contains(text(),'Фін.мон.')]" );
        userDelay( 5000 );
        eventDriver.findElement( By.id( "gvMain_ctl02_edEdVal" )).sendKeys( random.randomStringBig( 1 ) + random.randomStringLittle( 10 ) );
        WebElement firstFilldData = eventDriver.findElement( By.id( "gvMain_ctl03_edEdVal" ) );
        firstFilldData.click();
        firstFilldData.clear();
        userDelay( 3000 );
        firstFilldData.sendKeys( Keys.END + "05022017");
        WebElement dateOfIdentification = eventDriver.findElement( By.id( "gvMain_ctl04_edEdVal" ) );
        dateOfIdentification.click();
        dateOfIdentification.clear();
        userDelay( 3000 );
        dateOfIdentification.sendKeys( Keys.END + "05032017");
        pressOnId( "gvMain_ctl05_imgEdHelp" );
        kContentFrame();
        pressOnXpath( "//div[@title = 'YES']" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 3000 );
        tabFrame( "Tab5" );
        pressOnId( "gvMain_ctl07_imgEdHelp"  );
        kContentFrame();
        pressOnXpath( "//tr[@class = 'k-alt']/td" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 2000 );
        tabFrame( "Tab5" );
        pressOnId( "gvMain_ctl08_imgEdHelp" );
        kContentFrame();
        pressOnXpath( "//div[@title = 'Задовільний']"  );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 2000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl09_edEdVal" )).sendKeys( random.randomStringBig( 1 ) + random.randomStringLittle( 10 ));
        eventDriver.findElement( By.id( "gvMain_ctl10_edEdVal" )).sendKeys( random.randomStringBig( 1 ) + random.randomStringLittle( 10 ));
        //Other
        pressOnXpath("//a[contains(text(),'Інші')]"  );
        pressOnId( "gvMain_ctl03_imgEdHelp");
        kContentFrame();
        pressOnXpath( "//div[@title = '1']" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );

//      press the "Register" button
        pressOnId( "bt_reg" );
        pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    }


    @AfterClass
    public static void tearDown() {
        //eventDriver.quit();
    }
}
