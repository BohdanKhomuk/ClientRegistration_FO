

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TEST_1121 {

    //private static WebDriver driver;
    private static EventFiringWebDriver eventDriver;
    private static EventHandler handler;

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



    @BeforeClass
    public static void main() {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String browser = new File(TEST_1121.class.getResource( "/IEDriverServer.exe" ).getFile()).getPath();
        System.setProperty("webdriver.ie.driver", browser);
        eventDriver = new EventFiringWebDriver( new InternetExplorerDriver(  ) );

       /* String browser = new File(TEST_1121.class.getResource("/chromedriver.exe").getFile()).getPath();
        System.setProperty("webdriver.chrome.driver", browser);
        eventDriver = new EventFiringWebDriver(new ChromeDriver(  ));*/
        handler = new EventHandler();
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eventDriver.register(handler);
        eventDriver.get("http://10.10.17.40:8080/barsroot/account/login/");
        //eventDriver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

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
        userDelay(1000);
        eventDriver.findElement(By.id("btLogIn")).click();
        userDelay(2000);
        eventDriver.findElement(By.id("btChangDate")).click();
        userDelay(1000);
        // Find element
        WebElement search = eventDriver.findElement(By.id("findOpersText"));
        search.sendKeys( "Реєстрація Клієнтів і Рахунків"  + "\n" );
        userDelay(10000);
        // Enter in function
        eventDriver.findElement(By.xpath(".//div[@id='oper-3039']/div[2]/span")).click();
        userDelay( 5000);
        toMainFrame();
        eventDriver.findElement(By.id("registerCustBtn")).click();
        userDelay( 10000);
        eventDriver.findElement( By.xpath( "//div[@class = 'k-window-content k-content']/div/div/div[2]/button" ) ).click();
        userDelay(5000);
        WebElement IPN = eventDriver.findElement( By.xpath( "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" ) );
        IPN.sendKeys( "111" );
        userDelay( 5000);
        eventDriver.findElement( By.xpath( "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']")).click();
        userDelay( 5000);
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
        userDelay( 5000 );
        eventDriver.findElement( By.xpath( "//button[@class = 'k-button']" )).click();

//      Basic details
        userDelay( 3000);
        tabFrame( "Tab0" );
        eventDriver.findElement(By.id("bt_FullDopRekv")).click();
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
        userDelay( 1000 );
        eventDriver.findElement( By.id( "btnOpenWindowAddress" ) ).click();
        userDelay( 2000 );
        fullAddressFrame();
        eventDriver.findElement(By.id( "legalIndex" ) ).sendKeys( "213428");
        eventDriver.findElement(By.id( "legalRegion" ) ).sendKeys( "Київська обл.");
        eventDriver.findElement(By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalArea']" ) ).sendKeys( "Обухівський район");
        userDelay( 5000 );
        eventDriver.findElement(By.xpath( "//span[@class = 'k-input ng-scope']" ) ).click();
        userDelay( 2000 );
        eventDriver.findElement(By.xpath( "//ul[@id='legalSettlemetDropDown_listbox']/li[2]" ) ).click();
        eventDriver.findElement(By.xpath( "//input[@ng-model = 'legalSettlement']" ) ).sendKeys( "Обухівв" );
        userDelay( 10000 );
//        eventDriver.findElement(By.xpath( "//span[@class = 'k-dropdown-wrap k-state-disabled']/span/span" ) ).click();
//        userDelay( 3000 );
//        eventDriver.findElement(By.xpath( "//ul[@id='legalStreetDropDown_listbox']/li[3]" ) ).click();
        eventDriver.findElement(By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalStreet']" ) ).sendKeys( "Варвари" );
//        eventDriver.findElement(By.xpath( "//div[8]/span[2]/span/span" ) ).click();
//        userDelay( 3000 );
//        eventDriver.findElement(By.xpath( "//ul[@id='legalHouseDropDown_listbox']/li[2]" ) ).click();
        eventDriver.findElement(By.xpath( "//input[@ng-model = 'legalHouse']" ) ).sendKeys( "54" );
        eventDriver.findElement(By.id( "btnSaveAddress" ) ).click();
        // IPN
        tabFrame( "Tab0" );
        eventDriver.findElement(By.id("ed_OKPO")).sendKeys( "0000000000" );

//      Client details
        userDelay( 1000 );
        kContentFrame();
        eventDriver.findElement( By.id("bTab3") ).click();
        userDelay( 1000 );
        tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ddl_PASSP" ) ).click();
        eventDriver.findElement( By.xpath( "//select[@id = 'ddl_PASSP']/option[@value = '1']" )).click();
        eventDriver.findElement( By.id( "ed_SER" ) ).sendKeys( RandomWords.generateRandomWords( 2 ) );
        eventDriver.findElement( By.id( "ed_NUMDOC" ) ).sendKeys( "432459" );
        eventDriver.findElement( By.id( "ed_ORGAN" )).sendKeys( "Овручським районним управлінням");
//        eventDriver.findElement( By.id( "bt_help" ) ).click();
//        kContentFrame();
//        userDelay( 10000 );
//        eventDriver.findElement( By.xpath( "//div[@title = '313']" )).click();
//        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
//        userDelay( 1000 );
//        tabFrame( "Tab3" );
        userDelay( 5000 );
        WebElement PDATE = eventDriver.findElement( By.id( "ed_PDATE" ) );
        PDATE.click();
        PDATE.clear();
        userDelay( 3000 );
        PDATE.sendKeys( "10102010" );
//        userDelay( 5000 );
//        PDATE.sendKeys( "10102010");
        WebElement Photo = eventDriver.findElement( By.id( "ed_DATE_PHOTO" ) );
        Photo.click();
        Photo.clear();
        userDelay( 3000 );
        Photo.sendKeys( Keys.END + "05022018");
//        userDelay( 5000 );
//        Photo.sendKeys( "05022018");
        WebElement BDay = eventDriver.findElement( By.id( "ed_BDAY" ) );
        BDay.click();
        BDay.clear();
        userDelay( 3000 );
        BDay.sendKeys( Keys.END + "10101992");
//        userDelay( 5000 );
//        BDay.sendKeys( "10101992");
        eventDriver.findElement( By.id( "ddl_SEX" ) ).click();
        eventDriver.findElement( By.xpath( "//select[@id = 'ddl_SEX']/option[@value = '1']" )).click();
        eventDriver.findElement( By.id( "ed_TELM_CODE" ) ).click();
        userDelay( 1000 );
        // Mobile phohe
        kContentFrame();
        eventDriver.findElement( By.xpath( "//tr[@class = 'k-alt']//div[@title = '96']" ) ).click();
        eventDriver.findElement( By.xpath( "//span[@disabled='disabled']" ) ).click();
        userDelay( 1000 );
        tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELM" ) ).sendKeys( "2313423" );
        eventDriver.findElement( By.id( "ed_TELD_CODE" ) ).click();
        userDelay( 10000 );
        eventDriver.findElement( By.id( "ed_TELD_CODE" ) ).click();
        userDelay( 10000 );
        kContentFrame();
        eventDriver.findElement( By.xpath( "//td[@role = 'gridcell']/div[@title = '692']" ) ).click();
        eventDriver.findElement( By.xpath( "//span[@disabled='disabled']" ) ).click();
        tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELD" ) ).sendKeys( "123213" );
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
        eventDriver.findElement( By.id("bTab4") ).click();
        userDelay( 2000 );
        tabFrame( "Tab4" );
        eventDriver.findElement( By.id( "bt_help" ) ).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//div[@title = '11301']" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();

//         Additional details
        userDelay( 3000 );
        eventDriver.findElement( By.id("bTab5") ).click();
        // general
        userDelay( 3000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl02_imgEdHelp" ) ).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//div[@title = '2']" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
        // Fin.mon.
        userDelay( 3000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.xpath( "//a[contains(text(),'Фін.мон.')]" )).click();
        userDelay( 10000 );
        eventDriver.findElement( By.id( "gvMain_ctl02_edEdVal" )).sendKeys( RandomWords.generateRandomWords( 3 ) );
        userDelay( 5000 );
        eventDriver.findElement( By.id( "gvMain_ctl03_edEdVal" )).sendKeys( "11111111" );
        userDelay( 5000 );
        eventDriver.findElement( By.id( "gvMain_ctl04_edEdVal" )).sendKeys( "11111111" );
        eventDriver.findElement( By.id( "gvMain_ctl05_imgEdHelp" ) ).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//div[@title = 'YES']" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
        userDelay( 3000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl07_imgEdHelp" ) ).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//tr[@class = 'k-alt']/td" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
        userDelay( 3000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl08_imgEdHelp" ) ).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//div[@title = 'Задовільний']" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();
        userDelay( 3000 );
        tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl09_edEdVal" )).sendKeys( RandomWords.generateRandomWords( 3 ));
        eventDriver.findElement( By.id( "gvMain_ctl10_edEdVal" )).sendKeys( RandomWords.generateRandomWords( 3 ));
        //Other
        eventDriver.findElement( By.xpath( "//a[contains(text(),'Інші')]" )).click();
        userDelay( 3000 );
        eventDriver.findElement( By.id( "gvMain_ctl03_imgEdHelp" )).click();
        kContentFrame();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//div[@title = '1']" )).click();
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" )).click();

//        press the "Register" button
        userDelay( 3000 );
        eventDriver.findElement( By.id( "bt_reg" )).click();
        userDelay( 10000 );
        eventDriver.findElement( By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" ) ).click();

        //eventDriver.switchTo().defaultContent();
        //eventDriver.switchTo().frame(eventDriver.findElement(By.id("mainFrame")));
        //eventDriver.switchTo().frame( eventDriver.findElement( By.className( "k-content-frame" ) ) );
        //userDelay( 1000 );
        //Alert alert = eventDriver.switchTo().alert();
        //eventDriver.findElement( By.xpath( "//input[@ng-change= 'changeLegalIndex()']" ) ).sendKeys( "12345" );



        /*eventDriver.findElement(By.xpath(".//input[@name='name_1']")).sendKeys("0Cat2");
        eventDriver.findElement(By.xpath(".//button[@name='submitAddcategoryAndBackToParent']")).click();
        (new WebDriverWait(eventDriver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='alert alert-success']/button")));
        eventDriver.findElement(By.xpath(".//span[@class='title_box active']/a[1]/i")).click();
        userDelay(5000);
        (new WebDriverWait(eventDriver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//table/tbody/tr/td[3][contains(text(), '0Cat2')]")));
        mousemove(".//table/tbody/tr/td[3][contains(text(), '0Cat2')]");
        userDelay(5000);*/
    }
    @AfterClass
    public static void tearDown() {
        //eventDriver.quit();
    }
}
