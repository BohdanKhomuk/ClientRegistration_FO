package com.test;

import com.test.Methods.Frame;
import com.test.Methods.Pause;
import com.test.Methods.ReadingFromFile;
import com.test.Methods.WritingtoFile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(id = "registerCustBtn")
    @CacheLookup
    private WebElement registerCustBtn;
    @FindBy(xpath = "//div[@class = 'k-window-content k-content']/div/div/div[2]/button")
    @CacheLookup
    private WebElement registerNew;
    @FindBy(xpath = "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" )
    @CacheLookup
    private WebElement textBoxRNK;
    @FindBy(xpath = "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']")
    @CacheLookup
    private WebElement searchButton;
    @FindBy(xpath = "//button[@class = 'delete-confirm k-button k-primary']")
    @CacheLookup
    private WebElement closePopupWindow;
    @FindBy(xpath = "//button[@class = 'k-button']")
    @CacheLookup
    private WebElement registrationButton;
    @FindBy(id = "bTab1")
    @CacheLookup
    private WebElement btnTaxpayerDetalis;
    @FindBy(id = "bTab2")
    @CacheLookup
    private WebElement btnEconomicNorms;
    @FindBy(id = "bTab3")
    @CacheLookup
    private WebElement btnClientDetalis;
    @FindBy(id = "bTab4")
    @CacheLookup
    private WebElement btnAdditionalInformation;
    @FindBy(id = "bTab5")
    @CacheLookup
    private WebElement btnAdditionalDetails;
    @FindBy(id = "bTab6")
    @CacheLookup
    private WebElement btnConnectedPeople;
    @FindBy(id = "bTab7")
    @CacheLookup
    private WebElement btnClientSegments;
    @FindBy(id = "bTab8")
    @CacheLookup
    private WebElement btnCDO;
    @FindBy(xpath = "//th[@data-field='Id']/a[1]/span")
    @CacheLookup
    private WebElement btnFilter;
    @FindBy(xpath = "//input[@class='k-formatted-value k-input']")
    @CacheLookup
    private WebElement fieldFilter;
    @FindBy(xpath = "//button[text() = 'фільтрувати']")
    @CacheLookup
    private WebElement btnFiltrate;
    @FindBy(id= "openCustAccsBtn")
    @CacheLookup
    private WebElement openCustAccsBtn;
    @FindBy(id = "bt_reg")
    @CacheLookup
    private WebElement bt_reg;
    @FindBy(xpath = "//button[@class = 'delete-confirm k-button k-primary']")
    private WebElement btnOK;
    @FindBy(xpath = "//div[@id='barsUiAlertDialog']/table/tbody/tr/td[2]")
    @CacheLookup
    private WebElement infoText;
    @FindBy(xpath = "//span[@class = 'ng-binding']")
    @CacheLookup
    private WebElement clientBtn;
    @FindBy(id = "closeCustBtn")
    @CacheLookup
    private WebElement closeClientBtn;
    @FindBy(xpath = "//div[6]//a[2]/spa")
    @CacheLookup
    private WebElement closeRegCart;
    @FindBy(xpath = "//div[5]/div[1]//a/span")
    @CacheLookup
    private WebElement closeSearchWindow;

    private void clickRegisterCustBtn(){
        registerCustBtn.click();
        new TransitionToRegistration( driver );
    }

    private void clickRegisterNew(){
        registerNew.click();
        new TransitionToRegistration( driver );
    }

    private void clickSearchButton(){
        searchButton.click();
        new TransitionToRegistration( driver );
    }

    private void clickClosePopupWindow(){
        closePopupWindow.click();
        new TransitionToRegistration( driver );
    }

    private void clickRegistrationBtn(){
        registrationButton.click();
        new TransitionToRegistration( driver );
    }

    public void clickTaxpayerDetalisBtn(){
        frame.kContentFrame();
        btnTaxpayerDetalis.click();
        new TransitionToRegistration( driver );
    }

    public void clickEconomicNormsBtn(){
        frame.kContentFrame();
        btnEconomicNorms.click();
        new TransitionToRegistration( driver );
    }

    public void clickClientDetailBtn(){
        pause.userDelay( 1000 );
        frame.kContentFrame();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", btnClientDetalis);
        btnClientDetalis.click();
        new TransitionToRegistration( driver );
    }

    public void clickAdditionalInformationBtn(){
        frame.kContentFrame();
        btnAdditionalInformation.click();
        new TransitionToRegistration( driver );
    }

    public void clickAdditionalDetailsBtn(){
        frame.kContentFrame();
        btnAdditionalDetails.click();
        new TransitionToRegistration( driver );
    }

    public void clickConnectedPeopleBtn(){
        frame.kContentFrame();
        btnConnectedPeople.click();
        new TransitionToRegistration( driver );
    }

    public void clickClientSegmentsBtn(){
        frame.kContentFrame();
        btnClientSegments.click();
        new TransitionToRegistration( driver );
    }

    public void clickCDOBtn(){
        frame.kContentFrame();
        btnCDO.click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnFilter(){
        btnFilter.click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnFiltrate(){
        btnFiltrate.click();
        new TransitionToRegistration( driver );
    }

    private void clickSearchRowNum(){
        String searchRow = String.format( "//*[contains(text(),'%s')]", ReadingFromFile.read( "ClientRNK.txt" ));
        By searchRowNum = By.xpath( searchRow );
        driver.findElement(searchRowNum).click();
        new TransitionToRegistration( driver );
    }

    private void clickOpenCustAccsBtn(){
        openCustAccsBtn.click();
        new TransitionToRegistration( driver );
    }

    private void clickBt_reg(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", bt_reg);
        bt_reg.click();
        new TransitionToRegistration( driver );
    }

    private void clickBtnOK(){
        btnOK.click();
        new TransitionToRegistration( driver );
    }

    private void clickClientBtn(){
        clientBtn.click();
        new TransitionToRegistration( driver );
    }

    private void clickCloseClientBtn(){
        closeClientBtn.click();
        new TransitionToRegistration( driver );
    }

    private void enterRNK(String newrnk){
        textBoxRNK.sendKeys( newrnk );
    }

    private void enterFieldFilter(String rnk){
        fieldFilter.sendKeys( rnk );
    }

    private String getInfoText(){
        return  infoText.getText();
    }


    public void goingToRegister(String newrnk){
        frame.toMainFrame();
        this.clickRegisterCustBtn();
        if ((LoginPage.getPolygon() == 50)){
            pause.userDelay( 1500 );
        }
        this.clickRegisterNew();
        this.enterRNK( newrnk );
        this.clickSearchButton();
        if ((LoginPage.getPolygon() == 50)||(LoginPage.getPolygon() == 44)||(LoginPage.getPolygon() == 24) ){
             this.clickClosePopupWindow();
        }
        pause.userDelay( 5000 );
        this.clickRegistrationBtn();
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
        WritingtoFile.Filewriting( "ClientRNK.txt", t2);
        pause.userDelay( 5000 );
        this.clickBtnOK();
        pause.userDelay( 5000 );
    }

    private void findCard(String rnk){
        pause.userDelay( 3000 );
        frame.toMainFrame();
        this.clickBtnFilter();
        this.enterFieldFilter( rnk );
        this.clickBtnFiltrate();
    }

    public void openClient(String rnk){
        this.findCard( rnk );
        pause.userDelay( 3000 );
        this.clickSearchRowNum();
        new TransitionToRegistration( driver );
    }

    public void closeClient(String rnk){
        this.findCard( rnk );
        pause.userDelay( 3000 );
        this.clickClientBtn();
        this.clickCloseClientBtn();
        this.clickBtnOK();
        pause.userDelay( 4000 );
        this.clickBtnOK();
        new TransitionToRegistration( driver );
    }

    public void openCustomerAccounts(String rnk){
        pause.userDelay( 2000 );
        this.findCard( rnk );
        pause.userDelay( 3000 );
        this.clickClientBtn();
        pause.userDelay( 3000 );
        this.clickOpenCustAccsBtn();
        new TransitionToRegistration( driver );
    }
}
