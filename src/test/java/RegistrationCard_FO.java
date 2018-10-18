import com.test.LoginPage;
import com.test.MainPage;
import com.test.Methods.EventHandler;
import com.test.Methods.Gender;
import com.test.Methods.RandomWordsAndNumber;
import com.test.Methods.ReadingFromFile;
import com.test.RegistrationCardFO.CustomerAccounts;
import com.test.RegistrationClientFO.*;
import com.test.TransitionToRegistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static com.test.LoginPage.getPolygon;


public class RegistrationCard_FO {

    private static EventFiringWebDriver eventDriver;
    private static TransitionToRegistration transitionToReg;
    private static BasicDetails basicDetails;
    private static ClientDetails clientDetails;
    private static AdditionalInformation addInformation;
    private static AdditionalDetails addDetails;
    private static TaxpayerDetails taxpayerDetails;
    private static EconomicNorms economicNorms;
    private static ConnectedPeople connectedPeople;
    private static ClientSegments clientSegments;
    private static CDO cdo;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);
    private static MainPage mainPage;
    private static CustomerAccounts customerAccounts;

    private RandomWordsAndNumber random = new RandomWordsAndNumber();
    private Gender gender = new Gender();

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
        eventDriver.get( "http://10.10.17." + getPolygon() + ":8080/barsroot/account/login/" );

        //eventDriver.get( "http://10.10.10.198:11111/barsroot/" );

        LoginPage loginPage = new LoginPage( eventDriver );

        transitionToReg = new TransitionToRegistration( eventDriver );
        basicDetails = new BasicDetails( eventDriver );
        clientDetails = new ClientDetails( eventDriver );
        addInformation = new AdditionalInformation( eventDriver );
        addDetails = new AdditionalDetails( eventDriver );
        taxpayerDetails = new TaxpayerDetails( eventDriver );
        economicNorms = new EconomicNorms( eventDriver );
        connectedPeople = new ConnectedPeople(eventDriver);
        clientSegments = new ClientSegments(eventDriver);
        cdo = new CDO( eventDriver );
        mainPage = new MainPage ( eventDriver );
        customerAccounts = new CustomerAccounts( eventDriver );


        System.out.println((char) 27 + "[33mБлок авторизації" + (char)27 + "[0m");
        loginPage.enterInMainPage( "absadm01", "qwerty" );
        System.out.println((char) 27 + "[33mБлок переходу у функцію створення клієнта(ФО)" + (char)27 + "[0m");
    }

    @Test (priority = 1)//(enabled = false)
    public void createClientCard() throws Exception {
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
        addDetails.enterFinMon( "Українець", "05022017", "05032017", random.randomStringBig( 1 ) + random.randomStringLittle( 10 ),
                random.randomStringBig( 1 ) + random.randomStringLittle( 10 ) );
        addDetails.enterOther();

//      press the "Register" button
        transitionToReg.confirmationReg();
        System.out.println((char) 27 + "[32m[Passed]----------Тест завершено успішно!----------[Passed]" + (char) 27 + "[0m");
        //transitionToReg.closeWindowReg ();
    }

    @Test(priority = 2)//(enabled = false)
    public void customerAccountTest() {
        mainPage.enterFunction( "Реєстрація Клієнтів і Рахунків" + "\n" );
        System.out.println((char) 27 + "[33mСтворення рахунку клієнта(ФО)" + (char) 27 + "[0m");
        //Find client
        transitionToReg.openCustomerAccounts( ReadingFromFile.read( "ClientRNK.txt" ) );
        //Open customer accounts
        customerAccounts.createCustAcc( "2620", "1" );
        System.out.println((char) 27 + "[32m[Passed]----------Тест створення рахунку клієнта(ФО) завершено успішно!----------[Passed]" + (char) 27 + "[0m");

        System.out.println((char) 27 + "[33mРеєстрація рахунку клієнта(ФО)" + (char) 27 + "[0m");
        customerAccounts.editCustAcc( "213" );
        Assert.assertEquals("  НБУ   ", customerAccounts.getTextBtnSPECPARAM());
        Assert.assertEquals("  Ощадбанк   ", customerAccounts.getTextBtnSPECPARAM_INT());
        Assert.assertEquals("  Депозити   ", customerAccounts.getTextBtnDPT());
        Assert.assertEquals("  БПК   ", customerAccounts.getTextBtnBPK());
        Assert.assertEquals(" ЦВК  ", customerAccounts.getTextBtnCVK());
        Assert.assertEquals("  Інші   ", customerAccounts.getTextBtnOTHERS());
        customerAccounts.saveOptions();
        System.out.println((char) 27 + "[32m[Passed]----------Тест редагування рахунку клієнта(ФО) завершено успішно!----------[Passed]" + (char) 27 + "[0m");

        System.out.println((char) 27 + "[33mВидалення рахунку клієнта(ФО)" + (char) 27 + "[0m");
        Assert.assertEquals( "213", customerAccounts.getTextNLSALT_1() );
        customerAccounts.closeCustAcc();
        System.out.println((char) 27 + "[32m[Passed]----------Тест видалення рахунку клієнта(ФО) завершено успішно!----------[Passed]" + (char) 27 + "[0m");

    }

    @Test (priority = 3)//(enabled = false)
    public void editingClientCard() {
        mainPage.enterFunction( "Реєстрація Клієнтів і Рахунків" + "\n" );
        System.out.println((char) 27 + "[33mРедагування карточки клієнта(ФО)" + (char) 27 + "[0m");
        transitionToReg.openClient( ReadingFromFile.read( "ClientRNK.txt" ) );

        basicDetails.enterSAB( RandomWordsAndNumber.intRandomNumber( 9999 ) );

        transitionToReg.clickTaxpayerDetalisBtn();
        Assert.assertEquals( "Заповнити реквізити платника податків", taxpayerDetails.getHeadingText() );

        transitionToReg.clickEconomicNormsBtn();
        economicNorms.correctDetails();

        transitionToReg.clickClientDetailBtn();
        Assert.assertEquals( "Заповнити Персональні реквізити",  clientDetails.getHeadingText() );
        clientDetails.correctClientDetail( random.randomStringBig( 12 ), RandomWordsAndNumber.intRandomNumber( 999999 ));

        transitionToReg.clickAdditionalInformationBtn();
        addInformation.correctDetail( random.randomStringLittle( 12 ), random.randomStringLittle( 12 ), RandomWordsAndNumber.intRandomNumber( 100 ), RandomWordsAndNumber.intRandomNumber( 100 ),
                RandomWordsAndNumber.intRandomNumber( 100 ), RandomWordsAndNumber.intRandomNumber( 100 ), RandomWordsAndNumber.intRandomNumber( 100 ), random.randomStringLittle( 23 ));

        transitionToReg.clickAdditionalDetailsBtn();
        Assert.assertEquals( "Загальні", addDetails.getGeneralText() );
        Assert.assertEquals( "Фін.мон.", addDetails.getFinMonText() );
        Assert.assertEquals( "БПК", addDetails.getBPKText() );
        Assert.assertEquals( "Санкції", addDetails.getSanctionsText() );
        if (getPolygon() == 22){
            Assert.assertEquals( "Для Кредитного реєстру", addDetails.getCreditRegisterText() );
        }
        Assert.assertEquals( "Інші", addDetails.getOtherText() );
        Assert.assertEquals( "Критерії ризику", addDetails.getRiskCriteriaText() );

        transitionToReg.clickConnectedPeopleBtn();
        Assert.assertEquals( "Пов`язані особи", connectedPeople.getHeadingText() );

        transitionToReg.clickClientSegmentsBtn();
        Assert.assertEquals( "Загальна інформація", clientSegments.getHeadingText() );

        transitionToReg.clickCDOBtn();
        Assert.assertEquals( "Підключення користувачів до Систем Дистанційного Обслуговування (СДО)", cdo.getHeadingText() );

        transitionToReg.confirmationReg();
        //transitionToReg.clickCloseRegCart ();
    }


    @Test(priority = 4)//(enabled = false)
    public void closeClientCard(){
        mainPage.enterFunction( "Реєстрація Клієнтів і Рахунків" + "\n" );
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО)" + (char)27 + "[0m");
        System.out.println((char) 27 + "[33mЗакриття карточки клієнта(ФО)" + (char) 27 + "[0m");
        transitionToReg.closeClient(ReadingFromFile.read( "ClientRNK.txt" ));
    }

    @AfterClass
    public static void tearDown() {
        eventDriver.quit();
    }
}
