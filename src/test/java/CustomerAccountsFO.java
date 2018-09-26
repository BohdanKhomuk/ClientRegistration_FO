import com.test.LoginPage;
import com.test.MainPage;
import com.test.Methods.EventHandler;
import com.test.Methods.ReadingFromFile;
import com.test.RegistrationCardFO.CustomerAccounts;
import com.test.TransitionToRegistration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CustomerAccountsFO {

    private static TransitionToRegistration transitionToReg;
    private static CustomerAccounts customerAccounts;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);

    @BeforeMethod
    public static void firstClass() {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String browser = new File( RegistrationCard_FO.class.getResource( "/IEDriverServer.exe" ).getFile()).getPath();
        System.setProperty("webdriver.ie.driver", browser);
        EventFiringWebDriver eventDriver = new EventFiringWebDriver( new InternetExplorerDriver() );

         /* String browser = new File(RegistrationCard_FO.class.getResource("/chromedriver.exe").getFile()).getPath();
        System.setProperty("webdriver.chrome.driver", browser);
        eventDriver = new EventFiringWebDriver(new ChromeDriver(  ));*/
        EventHandler handler = new EventHandler();
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eventDriver.register( handler );
        String polygonAddress = String.format( "http://10.10.17.%s:8080/barsroot/account/login/", LoginPage.getPolygon() );
        eventDriver.get( polygonAddress );
        //eventDriver.get( "http://10.10.10.198:11111/barsroot/" );

        LoginPage loginPage = new LoginPage( eventDriver );
        MainPage mainPage = new MainPage( eventDriver );
        transitionToReg = new TransitionToRegistration( eventDriver );
        customerAccounts = new CustomerAccounts( eventDriver );



        System.out.println((char) 27 + "[33mБлок авторизації" + (char)27 + "[0m");
        loginPage.enterInMainPage( "absadm01", "qwerty" );
        System.out.println((char) 27 + "[33mБлок переходу у функцію створення клієнта(ФО)" + (char)27 + "[0m");
        mainPage.enterFunction( "Реєстрація Клієнтів і Рахунків" + "\n" );
        System.out.println((char) 27 + "[33mРеєстрація клієнта(ФО)" + (char)27 + "[0m");

    }

    @Test
    public void customerAccountTest() {
        System.out.println((char) 27 + "[33mСтворення рахунку клієнта(ФО)" + (char) 27 + "[0m");
        //Find client
        transitionToReg.openCustomerAccounts( ReadingFromFile.read( "text.txt" ) );
        //Open customer accounts
        customerAccounts.createCustAcc( "2620", "1" );
        System.out.println((char) 27 + "[32m[Passed]----------Тест завершено успішно!----------[Passed]" + (char) 27 + "[0m");
    }
}
