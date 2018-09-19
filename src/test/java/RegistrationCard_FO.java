

import com.test.*;
import com.test.RegistrationClientFO.AdditionalDetails;
import com.test.RegistrationClientFO.AdditionalInformation;
import com.test.RegistrationClientFO.BasicDetails;
import com.test.RegistrationClientFO.ClientDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
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
    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static TransitionToRegistration transitionToReg;
    public static BasicDetails basicDetails;
    public static ClientDetails clientDetails;
    public static AdditionalInformation addInformation;
    public static AdditionalDetails addDetails;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);

    RandomWordsAndNumber random = new RandomWordsAndNumber();
    Gender gender = new Gender();
    WritingtoFile writingtoFile = new WritingtoFile();
    ReadingFromFile readingFromFile = new ReadingFromFile();
    RandomWordsAndNumber randomGeneration = new RandomWordsAndNumber();

    @BeforeClass
    public static void firstClass() {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String browser = new File( RegistrationCard_FO.class.getResource( "/IEDriverServer.exe" ).getFile()).getPath();
        System.setProperty("webdriver.ie.driver", browser);
        eventDriver = new EventFiringWebDriver( new InternetExplorerDriver(  ) );

/*        String browser = new File(RegistrationCard_FO.class.getResource("/chromedriver.exe").getFile()).getPath();
        System.setProperty("webdriver.chrome.driver", browser);
        eventDriver = new EventFiringWebDriver(new ChromeDriver(  ));*/
        EventHandler handler = new EventHandler();
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eventDriver.register( handler );
        String polygonAddress = String.format( "http://10.10.17.%s:8080/barsroot/account/login/", loginPage.polygon );
        eventDriver.get( polygonAddress );

        //eventDriver.get( "http://10.10.10.198:11111/barsroot/" );

        findElement = new FindElement(eventDriver);
        frame = new Frame(eventDriver);
        loginPage = new LoginPage( eventDriver );
        mainPage = new MainPage( eventDriver );
        transitionToReg = new TransitionToRegistration( eventDriver );
        basicDetails = new BasicDetails( eventDriver );
        clientDetails = new ClientDetails( eventDriver );
        addInformation = new AdditionalInformation( eventDriver );
        addDetails = new AdditionalDetails( eventDriver );
    }

    @Test
    public void userLoginTest() throws Exception {

        System.out.println((char) 27 + "[33mБлок авторизації" + (char)27 + "[0m");
        loginPage.enterInMainPage( "absadm01", "qwerty" );
        System.out.println((char) 27 + "[33mБлок переходу у функцію створення клієнта(ФО)" + (char)27 + "[0m");


        mainPage.enterFunction( "Реєстрація Клієнтів і Рахунків" + "\n" );
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО)" + (char)27 + "[0m");
        transitionToReg.goingToRegister( RandomWordsAndNumber.randomNumber( 10, 99999 ) );

//      Basic details
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО): Основні реквізити" + (char) 27 + "[0m");
        basicDetails.enterFIO( gender.Surname(), gender.Name(), gender.Patronymic() );
        LOG.error((char) 27 + "[32mАвторизація успішна " + (char)27 + "[0m");
        // Clien adress
        basicDetails.enterAddress( RandomWordsAndNumber.randomNumber( 100000, 999999  ), "Київська обл.", "Обухівський район", "Обухівв", "Варвари", "54");
        // IPN
        basicDetails.enterOKPO( "0000000000" );

//      Client details
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО): Реквізити клієнта" + (char) 27 + "[0m");
        transitionToReg.clickClientDetailBtn();
        clientDetails.enterDocumentDetails("Овручським районним управлінням",  random.randomStringBig( 2 ), RandomWordsAndNumber.randomNumber( 100000, 999999 ), "10102010", "05022018", "10101992" );
        clientDetails.enterNumberPhone( RandomWordsAndNumber.intRandomNumber( 999999999 ) );

//        Additional information
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО): Дод. інформація" + (char) 27 + "[0m");
        transitionToReg.clickAdditionalInformationBtn();
        addInformation.fillingISP();

//         Additional details
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО): Дод. реквізити" + (char) 27 + "[0m");
        transitionToReg.clickAdditionalDetailsBtn();
        addDetails.enterGeneral();
        addDetails.enterFinMon( "Українець", "05022017", "05032017", random.randomStringBig( 1 ) + random.randomStringLittle( 10 ), random.randomStringBig( 1 ) + random.randomStringLittle( 10 ) );
        addDetails.enterOther();


//      press the "Register" button
        findElement.pressOnId( "bt_reg" );
        findElement.pressOnXpath( "//button[@class = 'delete-confirm k-button k-primary']" );

        WebElement info = eventDriver.findElement(By.xpath("//div[@id='barsUiAlertDialog']/table/tbody/tr/td[2]"));
        String t = info.getText();
        if (info.getText().contains("Помилки")) {
            System.out.println((char) 27 + "[34mНе можна створити клієнта під бранчем '/' - " + (char) 27 + "[0m" + t);
        } else {}
        String t1 = t.replace("Клієнта РНК=", "");
        String t2 = t1.replace(" успішно збережено", "");
        System.out.println((char) 27 + "[34mРНК Клієнта - " + (char) 27 + "[0m" + t2);
        writingtoFile.Filewriting("text.txt", t2);
        findElement.pressOnXpath( "//button[@class='delete-confirm k-button k-primary']" );


        System.out.println((char) 27 + "[33mРедагування карточки клієнта(ФО)" + (char) 27 + "[0m");

        //open client for registration
        frame.toMainFrame();
        findElement.pressOnXpath( "//*[@id = 'ng-app']/body/div[9]/div[1]/div/a/span" );
        findElement.pressOnXpath( "//*[@id = 'ng-app']/body/div[5]/div[1]/div/a/span" );
        findElement.pressOnXpath( "//th[@data-field='Id']/a[1]/span" );
        eventDriver.findElement( By.xpath( "//input[@class='k-formatted-value k-input']") ).sendKeys( readingFromFile.read( "text.txt" ) );
        //userDelay(2000);
        findElement.pressOnXpath( "//button[text() = 'фільтрувати']" );
       // userDelay(2000);
        String searchRow = String.format( "//*[text() = '%s']", readingFromFile.read( "text.txt"  ));
        findElement.pressOnXpath( searchRow );
        findElement.pressOnXpath( "//*[text() = '']" );
       // userDelay(2000);
        findElement.pressOnId( "openCustAccsBtn" );

        //correct client
        //Basic details
        frame.tabFrame( "Tab0" );
        eventDriver.findElement( By.id( "ed_SAB" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 1000, 9999 ) );

        //taxpayer details
        //userDelay( 1000 );
        frame.kContentFrame();
        findElement.pressOnId( "bTab1" );
        WebElement text1 = eventDriver.findElement( By.linkText( "Заповнити реквізити платника податків" ) );
        Assert.assertEquals( "Заповнити реквізити платника податків", text1 );

        //economic standards
        //userDelay( 1000 );
        frame.kContentFrame();
        findElement.pressOnId( "bTab2" );
        WebElement text2 = eventDriver.findElement( By.linkText( "Заповнити реквізити платника податків" ) );
        Assert.assertEquals( "Заповнити реквізити платника податків", text2 );

        //client details
       // userDelay( 1000 );
        frame.kContentFrame();
        findElement.pressOnId( "bTab3" );
       // userDelay( 1000 );
        frame.tabFrame( "Tab3");
        eventDriver.findElement( By.id( "ed_BPLACE" ) ).sendKeys("м.Київ" );
        eventDriver.findElement( By.id( "ed_TELW" ) ).sendKeys( RandomWordsAndNumber.randomNumber( 1000, 9999 ) );
        WebElement text3 = eventDriver.findElement( By.linkText( "Заповнити Персональні реквізити" ) );
        Assert.assertEquals( "Заповнити Персональні реквізити", text3 );

        //Additional information
         //userDelay( 1000 );
         frame.kContentFrame();
         findElement.pressOnId("bTab4" );
         frame.tabFrame( "Tab4" );
         findElement.pressOnId( "ed_NOMPDV" );
         WebElement text4 = eventDriver.findElement( By.linkText( "Менеджер клієнту (код)" ) );
         Assert.assertEquals( "Менеджер клієнту (код)", text4 );



                    System.out.println((char) 27 + "[32m[Passed]----------Тест завершено успішно!----------[Passed]" + (char) 27 + "[0m");

    }


    @AfterClass
    public static void tearDown() {
        //eventDriver.quit();
    }
}
