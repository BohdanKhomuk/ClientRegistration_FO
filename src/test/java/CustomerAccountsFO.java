import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CustomerAccountsFO {

    private static FindElement findElement;
    private static Frame frame;
    public static EventFiringWebDriver eventDriver;
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);

    RandomWordsAndNumber random = new RandomWordsAndNumber();
    Sex sex = new Sex();
    private static RegistrationCard_FO registrationCard_fo = new RegistrationCard_FO();
    WritingtoFile writingtoFile = new WritingtoFile();
    ReadingFromFile readingFromFile = new ReadingFromFile();

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
        String polygonAddress = String.format( "http://10.10.17.%s:8080/barsroot/account/login/", registrationCard_fo.polygon );
        eventDriver.get( polygonAddress );

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
    public void customerAccountTest() throws Exception {
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


        //Find client
        System.out.println(readingFromFile.read("text.txt"));
        frame.toMainFrame();
        findElement.pressOnXpath( "//th[@data-field='Id']/a[1]/span" );
        eventDriver.findElement( By.xpath( "//input[@class='k-formatted-value k-input']") ).sendKeys( readingFromFile.read( "text.txt" ) );
        userDelay(2000);
        findElement.pressOnXpath( "//button[text() = 'фільтрувати']" );
        userDelay(2000);
        findElement.pressOnXpath( "//td[@role]/div" );
        userDelay(2000);
        findElement.pressOnId( "openCustAccsBtn" );

        //Open customer accounts
        userDelay(2000);
        findElement.pressOnId( "btOpen" );
        userDelay(2000);
        frame.toTab0Frame();
        eventDriver.findElement( By.id( "tbNbs" ) ).sendKeys( "2620" );
        findElement.pressOnId( "bAccountMask" );
        findElement.pressOnId( "ddOb22" );
        userDelay(2000);
        String mainWindows = eventDriver.getWindowHandle(); //запоминаем первое окно
        //Переход на второе окно
        for(String windowsHandls : eventDriver.getWindowHandles()){
            eventDriver.switchTo().window(windowsHandls);
        }
        userDelay(5000);
        findElement.pressOnId( "td_21" );
        //Возврат обратно на первое окно
        eventDriver.switchTo().window(mainWindows);
        userDelay(2000);
        frame.toMainFrame();
        findElement.pressOnId( "bTab3" );
        frame.toTab3Frame();
        findElement.doubleClick( "//td[@id='VALUE_5']" );
        eventDriver.findElement( By.id( "VALUE" ) ).sendKeys( "1" );
        findElement.pressOnXpath( "//input[@type='button' and @value='Зберегти']" );
        userDelay(2000);
        findElement.doubleClick( "//td[@id='VALUE_4']" );
        eventDriver.findElement( By.id( "VALUE" ) ).sendKeys( "1" );
        findElement.pressOnXpath( "//input[@type='button' and @value='Зберегти']" );
        userDelay(2000);
        findElement.doubleClick( "//td[@id='VALUE_3']" );
        eventDriver.findElement( By.id( "VALUE" ) ).sendKeys( "1" );
        findElement.pressOnXpath( "//input[@type='button' and @value='Зберегти']" );
        userDelay(2000);
        findElement.doubleClick( "//td[@id='VALUE_2']" );
        eventDriver.findElement( By.id( "VALUE" ) ).sendKeys( "1" );
        findElement.pressOnXpath( "//input[@type='button' and @value='Зберегти']" );
        userDelay(2000);

        frame.toMainFrame();
        findElement.pressOnId( "btSave" );
    }
}
