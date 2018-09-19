package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class TransitionToRegistration {

    public WebDriver driver;
    public Frame frame;
    public Pause pause;
    public LoginPage loginPage;

    public TransitionToRegistration(WebDriver driver) {
        this.driver = driver;
        this.frame = new Frame( (EventFiringWebDriver) driver );
        this.pause = new Pause();
        this.loginPage = new LoginPage( driver );
    }

    private By registerCustBtn = By.id("registerCustBtn");
    private By registerNew = By.xpath( "//div[@class = 'k-window-content k-content']/div/div/div[2]/button" );
    private By textBoxRNK = By.xpath( "//div[@class = 'k-window-content k-content']/div//input[@class ='k-textbox ng-pristine ng-invalid ng-invalid-required']" );
    private By searchButton = By.xpath( "//div[@class = 'k-window-content k-content']/div//button[@class = 'btn btn btn-primary']" );
    private By closePopupWindow = By.xpath( "//button[@class = 'delete-confirm k-button k-primary']" );
    private By registrationButton = By.xpath( "//button[@class = 'k-button']" );
    private By btnClientDetalis = By.id( "bTab3" );
    private By btnAdditionalInformation = By.id( "bTab4" );
    private By btnAdditionalDetails = By.id( "bTab5" );



    public TransitionToRegistration clickRegisterCustBtn(){
        driver.findElement(registerCustBtn).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickRegisterNew(){
        driver.findElement( registerNew ).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickSearchButton(){
        driver.findElement(searchButton).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickClosePopupWindow(){
        driver.findElement( closePopupWindow ).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickRegistrationBtn(){
        driver.findElement(registrationButton).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickClientDetailBtn(){
        pause.userDelay( 1000 );
        frame.kContentFrame();
        WebElement element = driver.findElement(btnClientDetalis);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickAdditionalInformationBtn(){
        frame.kContentFrame();
        driver.findElement(btnAdditionalInformation).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration clickAdditionalDetailsBtn(){
        frame.kContentFrame();
        driver.findElement(btnAdditionalDetails).click();
        return new TransitionToRegistration( driver );
    }

    public TransitionToRegistration enterRNK(String rnk){
        driver.findElement(textBoxRNK).sendKeys( rnk );
        return this;
    }

    public TransitionToRegistration goingToRegister(String rnk){
        frame.toMainFrame();
        this.clickRegisterCustBtn();
        this.clickRegisterNew();
        this.enterRNK( rnk );
        this.clickSearchButton();
        if ((loginPage.polygon == 50)||(loginPage.polygon == 22)){
             this.clickClosePopupWindow();
        }
        pause.userDelay( 7000 );
        this.clickRegistrationBtn();
        return new TransitionToRegistration( driver );
    }
}
