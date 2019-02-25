package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;    }

    public static int getPolygon() {
        //24  - Test; 40 - RC; 50 - Master//
        return 50;
    }

    @FindBy(id = "txtUserName")
    @CacheLookup
    private WebElement userName;
    @FindBy(id = "txtPassword" )
    @CacheLookup
    private WebElement passwordField;
    @FindBy(id = "btLogIn")
    @CacheLookup
    private WebElement buttonLogin;
    @FindBy(id = "btChangDate")
    @CacheLookup
    private WebElement buttonChangDate;
    @FindBy(id = "btnBranches")
    @CacheLookup
    private WebElement branch;
    @FindBy(xpath = "(//span[@class = 'k-in'])[2]")
    @CacheLookup
    private WebElement branchCA;


    public void enterInMainPage(String name, String password){
        userName.clear();
        userName.sendKeys( name );
        passwordField.clear();
        passwordField.sendKeys( password );
        buttonLogin.click();
        buttonChangDate.click();
        branch.click ( );
        branchCA.click ( );
        new LoginPage( driver );
    }
}
