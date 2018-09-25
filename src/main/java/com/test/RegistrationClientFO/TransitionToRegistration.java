package com.test.RegistrationClientFO;

import com.test.LoginPage;
import com.test.Methods.Frame;
import com.test.Methods.Pause;
import com.test.Methods.ReadingFromFile;
import com.test.Methods.WritingtoFile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class TransitionToRegistration {

    public WebDriver driver;
    private Frame frame;
    private Pause pause;

    public TransitionToRegistration(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
    }

    private By registerCustBtn = By.id("registerCustBtn");
    private By registerNew = By.xpath( "//div[@class = 'k-window-content k-content']/div/div/div[2]/button" );
    private By textBoxRNK = By.xpath( "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" );
    private By searchButton = By.xpath( "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']" );
    private By closePopupWindow = By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    private By registrationButton = By.xpath( "//button[@class = 'k-button']" );
    private By btnTaxpayerDetalis = By.id( "bTab1" );
    private By btnEconomicNorms = By.id( "bTab2" );
    private By btnClientDetalis = By.id( "bTab3" );
    private By btnAdditionalInformation = By.id( "bTab4" );
    private By btnAdditionalDetails = By.id( "bTab5" );
    private By btnConnectedPeople = By.id( "bTab6" );
    private By btnClientSegments = By.id( "bTab7" );
    private By btnCDO = By.id( "bTab8" );
    private By btnFilter = By.xpath( "//th[@data-field='Id']/a[1]/span" );
    private By fieldFilter = By.xpath( "//input[@class='k-formatted-value k-input']" );
    private By btnFiltrate = By.xpath( "//button[text() = 'фільтрувати']" );
    private String searchRow = String.format( "//*[text() = '%s']", ReadingFromFile.read( "text.txt" ));
    private By searchRowNum = By.xpath( searchRow );
    private By chooseRowNum = By.xpath( "//*[text() = '']" );
    private By openCustAccsBtn = By.id( "openCustAccsBtn" );
    private By bt_reg = By.id( "bt_reg" );
    private By btnOK = By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    private By infoText = By.xpath( "//div[@id='barsUiAlertDialog']/table/tbody/tr/td[2]" );
    private By clientBtn = By.xpath( "//span[@class = 'ng-binding']" );
    private By closeClientBtn = By.id( "closeCustBtn" );


    private void clickRegisterCustBtn(){
        driver.findElement(registerCustBtn).click();
        new TransitionToRegistration( driver );
    }

    private void clickRegisterNew(){
        driver.findElement( registerNew ).click();
        new TransitionToRegistration( driver );
    }

    private void clickSearchButton(){
        driver.findElement(searchButton).click();
        new TransitionToRegistration( driver );
    }

    private void clickClosePopupWindow(){
        driver.findElement( closePopupWindow ).click();
        new TransitionToRegistration( driver );
    }

    private void clickRegistrationBtn(){
        driver.findElement(registrationButton).click();
        new TransitionToRegistration( driver );
    }

    public void clickTaxpayerDetalisBtn(){
        frame.kContentFrame();
        driver.findElement(btnTaxpayerDetalis).click();
        new TransitionToRegistration( driver );
    }

    public void clickEconomicNormsBtn(){
        frame.kContentFrame();
        driver.findElement(btnEconomicNorms).click();
        new TransitionToRegistration( driver );
    }

    public void clickClientDetailBtn(){
        pause.userDelay( 1000 );
        frame.kContentFrame();
        WebElement element = driver.findElement(btnClientDetalis);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new TransitionToRegistration( driver );
    }

    public void clickAdditionalInformationBtn(){
        frame.kContentFrame();
        driver.findElement(btnAdditionalInformation).click();
        new TransitionToRegistration( driver );
    }

    public void clickAdditionalDetailsBtn(){
        frame.kContentFrame();
        driver.findElement(btnAdditionalDetails).click();
        new TransitionToRegistration( driver );
    }

    public void clickConnectedPeopleBtn(){
        frame.kContentFrame();
        driver.findElement(btnConnectedPeople).click();
        new TransitionToRegistration( driver );
    }

    public void clickClientSegmentsBtn(){
        frame.kContentFrame();
        driver.findElement(btnClientSegments).click();
        new TransitionToRegistration( driver );
    }

    public void clickCDOBtn(){
        frame.kContentFrame();
        driver.findElement(btnCDO).click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnFilter(){
        driver.findElement(btnFilter).click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnFiltrate(){
        driver.findElement(btnFiltrate).click();
        new TransitionToRegistration( driver );
    }

    private void clickSearchRowNum(){
        driver.findElement(searchRowNum).click();
        new TransitionToRegistration( driver );
    }

    private void clickChooseRowNum(){
        driver.findElement(chooseRowNum).click();
        new TransitionToRegistration( driver );
    }

    private void clickOpenCustAccsBtn(){
        driver.findElement(openCustAccsBtn).click();
        new TransitionToRegistration( driver );
    }

    private void clickBt_reg(){
        WebElement element = driver.findElement(bt_reg);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnOK(){
        driver.findElement(btnOK).click();
        new TransitionToRegistration( driver );
    }

    private void clickClientBtn(){
        driver.findElement(clientBtn).click();
        new TransitionToRegistration( driver );
    }

    private void clickCloseClientBtn(){
        driver.findElement(closeClientBtn).click();
        new TransitionToRegistration( driver );
    }

    private void enterRNK(String newrnk){
        driver.findElement(textBoxRNK).sendKeys( newrnk );
    }

    private void enterFieldFilter(String rnk){
        driver.findElement(fieldFilter).sendKeys( rnk );
    }

    private String getInfoText(){
        return  driver.findElement( infoText).getText();
    }


    public void goingToRegister(String newrnk){
        frame.toMainFrame();
        this.clickRegisterCustBtn();
        this.clickRegisterNew();
        this.enterRNK( newrnk );
        this.clickSearchButton();
        if ((LoginPage.getPolygon() == 50)||(LoginPage.getPolygon() == 22)){
             this.clickClosePopupWindow();
        }
        pause.userDelay( 7000 );
        this.clickRegistrationBtn();
        new TransitionToRegistration( driver );
    }

    public void openClient(String rnk){
        pause.userDelay( 3000 );
        frame.toMainFrame();
        this.clickBtnFilter();
        this.enterFieldFilter( rnk );
        this.clickBtnFiltrate();
        this.clickSearchRowNum();
        this.clickChooseRowNum();
        pause.userDelay( 3000 );
        this.clickOpenCustAccsBtn();
        new TransitionToRegistration( driver );
    }

    public void confirmationReg(){
        frame.kContentFrame();
        this.clickBt_reg();
        this.clickBtnOK();
        if (getInfoText().contains("Помилки")) {
            System.out.println((char) 27 + "[34mНе можна створити клієнта під бранчем '/' - " + (char) 27 + "[0m" + getInfoText());
        }
        String t1 = getInfoText().replace("Клієнта РНК=", "");
        String t2 = t1.replace(" успішно збережено", "");
        System.out.println((char) 27 + "[34mРНК Клієнта - " + (char) 27 + "[0m" + t2);
        WritingtoFile.Filewriting("text.txt", t2);
        pause.userDelay( 6000 );
        this.clickBtnOK();

    }

    public void closeClient(String rnk){
        pause.userDelay( 3000 );
        frame.toMainFrame();
        this.clickBtnFilter();
        this.enterFieldFilter( rnk );
        this.clickBtnFiltrate();
        pause.userDelay( 2000 );
        this.clickClientBtn();
        this.clickCloseClientBtn();
        this.clickBtnOK();
        pause.userDelay( 4000 );
        this.clickBtnOK();
    }
}
