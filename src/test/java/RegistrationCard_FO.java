

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;


public class RegistrationCard_FO {

    private static FindElement findElement;
    private static Frame frame;
    public static EventFiringWebDriver eventDriver;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);

    RandomWordsAndNumber random = new RandomWordsAndNumber();
    Sex sex = new Sex();

    @BeforeClass
    public static void main() {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String browser = new File( RegistrationCard_FO.class.getResource( "/IEDriverServer.exe" ).getFile()).getPath();
        System.setProperty("webdriver.ie.driver", browser);
        eventDriver = new EventFiringWebDriver( new InternetExplorerDriver(  ) );

       /* String browser = new File(RegistrationCard_FO.class.getResource("/chromedriver.exe").getFile()).getPath();
        System.setProperty("webdriver.chrome.driver", browser);
        eventDriver = new EventFiringWebDriver(new ChromeDriver(  ));*/
        EventHandler handler = new EventHandler();
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eventDriver.register( handler );
        eventDriver.get("http://10.10.17.22:8080/barsroot/account/login/");

        findElement = new FindElement(eventDriver);
        frame = new Frame(eventDriver);

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
    public void userLogin() throws Exception {
        userDelay(1000);
        // User_Name clear and add
        WebElement loginField = eventDriver.findElement(By.id("txtUserName"));
        loginField.clear();
        loginField.sendKeys("absadm01");
        // Password
        WebElement passwordField = eventDriver.findElement(By.id("txtPassword"));
        passwordField.clear();
        passwordField.sendKeys("qwerty");
        findElement.pressOnId(  "btLogIn" );
        WebElement error = eventDriver.findElement(By.xpath("//div[@id='messSumary']"));
        if (error.getText().contains("Вхід"))
        {userDelay(2000);
            eventDriver.quit();
            LOG.error((char) 27 + "[31mНеверный Логин/пароль " + (char)27 + "[0m");
            //30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
        }
        if (error.getText().contains("Користувач"))
        {userDelay(2000);
            eventDriver.quit();
            LOG.error((char) 27 + "[31mПользователь заблокирован " + (char)27 + "[0m");
            //30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.
        }
        findElement.pressOnId( "btChangDate" );
        // Find element
        eventDriver.findElement(By.id("findOpersText")).sendKeys( "Реєстрація Клієнтів і Рахунків"  + "\n" );
        // Enter in function
        userDelay(6000);
        findElement.pressOnXpath( ".//div[@id='oper-3039']/div[2]/span" );
        frame.toMainFrame();
        findElement.pressOnId( "registerCustBtn" );
        findElement.pressOnXpath( "//div[@class = 'k-window-content k-content']/div/div/div[2]/button" );
        userDelay(3000);
        eventDriver.findElement( By.xpath( "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 10, 99999 ) );
        findElement.pressOnXpath( "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']" );
       // pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']"  );
        userDelay( 6000 );
        findElement.pressOnXpath( "//button[@class = 'k-button']" );

//      Basic details
        frame.tabFrame( "Tab0" );
        findElement.pressOnId( "bt_FullDopRekv" );
        userDelay( 1000 );
        eventDriver.findElement( By.id( "ed_FIO_LN" ) ).sendKeys( sex.Surname() );
        eventDriver.findElement( By.id( "ed_FIO_FN" ) ).sendKeys( sex.Name() );
        eventDriver.findElement( By.id( "ed_FIO_MN" ) ).sendKeys( sex.Patronymic() );
//        userDelay( 1000 );
//        Actions action = new Actions( eventDriver );
//        action.sendKeys( Keys.ESCAPE ).perform();
//        action.sendKeys( Keys.ESCAPE ).perform();
//        action.sendKeys( Keys.ESCAPE ).perform();
        //eventDriver.findElement( By.xpath( "//button/span" ) ).click();

        // Clien adress
        findElement.pressOnId( "btnOpenWindowAddress" );
        userDelay( 2000 );
        frame.fullAddressFrame();
        eventDriver.findElement(By.id( "legalIndex" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 100000, 999999 ));
        eventDriver.findElement(By.id( "legalRegion" ) ).sendKeys( "Київська обл.");
        eventDriver.findElement(By.xpath( "//span[@role = 'presentation']/input[@ng-model = 'legalArea']" ) ).sendKeys( "Обухівський район");
        findElement.pressOnXpath("//span[@class = 'k-input ng-scope']"   );
        findElement.pressOnXpath("//ul[@id='legalSettlemetDropDown_listbox']/li[2]"   );
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
        findElement.pressOnId(  "btnSaveAddress");
        // IPN
        frame.tabFrame( "Tab0" );
        eventDriver.findElement(By.id("ed_OKPO")).sendKeys( "0000000000" );

//      Client details
        userDelay( 1000 );
        frame.kContentFrame();
        findElement.pressOnId( "bTab3" );
        userDelay( 1000 );
        frame.tabFrame( "Tab3" );
        findElement.pressOnId( "ddl_PASSP" );
        findElement.pressOnXpath( "//select[@id = 'ddl_PASSP']/option[@value = '1']" );
        eventDriver.findElement( By.id( "ed_ORGAN" )).sendKeys( "Овручським районним управлінням");
        eventDriver.findElement( By.id( "ed_SER" ) ).sendKeys( random.randomStringBig( 2 ) );
        eventDriver.findElement( By.id( "ed_NUMDOC" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 100000, 999999 ) );

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
        findElement.pressOnId( "ddl_SEX" );
        String fileName = String.format( "//select[@id = 'ddl_SEX']/option[@value = '%s']", sex.sex );
        findElement.pressOnXpath(fileName  );
        findElement.pressOnId( "ed_TELM_CODE" );
        userDelay( 1000 );
        // Mobile phohe
        frame.kContentFrame();
        findElement.pressOnXpath( "//tr[@class = 'k-alt']//div[@title = '96']" );
        findElement.pressOnXpath( "//span[@disabled='disabled']" );
        userDelay( 1000 );
        frame.tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELM" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 1000000, 9999999 ) );
        findElement.pressOnId( "ed_TELD_CODE" );
        findElement.pressOnId( "ed_TELD_CODE" );
        userDelay( 5000 );
        frame.kContentFrame();
        findElement.pressOnXpath( "//td[@role = 'gridcell']/div[@title = '692']" );
        findElement.pressOnXpath( "//span[@disabled='disabled']" );
        frame.tabFrame( "Tab3" );
        eventDriver.findElement( By.id( "ed_TELD" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 100000, 999999 ) );
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
        frame.kContentFrame();
        findElement.pressOnId("bTab4" );
        frame.tabFrame( "Tab4" );
        findElement.pressOnId("bt_help" );
        frame.kContentFrame();
        findElement.pressOnXpath("//div[@title = '11301']" );
        findElement.pressOnXpath("//button[@class = 'delete-confirm k-button k-primary']"   );

//         Additional details
        findElement.pressOnId( "bTab5" );
        // general
        userDelay( 2000 );
        frame.tabFrame( "Tab5" );
        findElement.pressOnId( "gvMain_ctl02_imgEdHelp"  );
        frame.kContentFrame();
        findElement.pressOnXpath( "//div[@title = '2']" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        // Fin.mon.
        userDelay( 3000 );
        frame.tabFrame( "Tab5" );
        findElement.pressOnXpath( "//a[contains(text(),'Фін.мон.')]" );
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
        findElement.pressOnId( "gvMain_ctl05_imgEdHelp" );
        frame.kContentFrame();
        findElement.pressOnXpath( "//div[@title = 'YES']" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 3000 );
        frame.tabFrame( "Tab5" );
        findElement.pressOnId( "gvMain_ctl07_imgEdHelp"  );
        frame.kContentFrame();
        findElement.pressOnXpath( "//tr[@class = 'k-alt']/td" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 2000 );
        frame.tabFrame( "Tab5" );
        findElement.pressOnId( "gvMain_ctl08_imgEdHelp" );
        frame.kContentFrame();
        findElement.pressOnXpath( "//div[@title = 'Задовільний']"  );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
        userDelay( 2000 );
        frame.tabFrame( "Tab5" );
        eventDriver.findElement( By.id( "gvMain_ctl09_edEdVal" )).sendKeys( random.randomStringBig( 1 ) + random.randomStringLittle( 10 ));
        eventDriver.findElement( By.id( "gvMain_ctl10_edEdVal" )).sendKeys( random.randomStringBig( 1 ) + random.randomStringLittle( 10 ));
        //Other
        findElement.pressOnXpath( "//a[contains(text(),'Інші')]"  );
        findElement.pressOnId( "gvMain_ctl03_imgEdHelp");
        frame.kContentFrame();
        findElement.pressOnXpath( "//div[@title = '1']" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );

//      press the "Register" button
        findElement.pressOnId( "bt_reg" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    }


    @AfterClass
    public static void tearDown() {
        //eventDriver.quit();
    }
}
