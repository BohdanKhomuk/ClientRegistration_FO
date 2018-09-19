import com.test.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class JTest {

    private static FindElement findElement;
    private static Frame frame;
    public static EventFiringWebDriver eventDriver;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);

    RandomWordsAndNumber random = new RandomWordsAndNumber();
    Gender gender = new Gender();
    WritingtoFile writingtoFile = new WritingtoFile();

    @BeforeClass
    public static void firstClass() {
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
    public void userLoginTest() throws Exception {
        userDelay( 1000 );



        System.out.println( (char) 27 + "[33mБлок авторизації" + (char) 27 + "[0m" );
        // User_Name clear and add


        WebElement element = (new WebDriverWait( eventDriver, 5 )).until(ExpectedConditions.presenceOfElementLocated( By.id( "txtUserName" )) );
        System.out.println( "Plass" + element);

        //List<WebElement> elems = eventDriver.findElements(By.xpath("{your_xPath}");
        //Assert.assertTrue( "Console message", elems.size() > 0 );

        Assert.assertEquals(true, "");

        WebElement loginField = eventDriver.findElement( By.id( "txtUserName" ) );
        loginField.clear();
        loginField.sendKeys( "absadm01" );
        // Password
        WebElement passwordField = eventDriver.findElement( By.id( "txtPassword" ) );
        passwordField.clear();
        passwordField.sendKeys( "qwerty" );
        findElement.pressOnId( "btLogIn" );
    }
}
