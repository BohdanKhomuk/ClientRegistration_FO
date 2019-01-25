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
        return 24;
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

/*    private void typeUserName(String name){
        userName.clear();
        userName.sendKeys( name );
    }

    private void typePassword(String password){
        passwordField.clear();
        passwordField.sendKeys( password );
    }

    private void clickButtonLogin(){
        buttonLogin.click();
        new LoginPage( driver );
    }

    private void clickButtonChangDate(){
        buttonChangDate.click();
        new LoginPage( driver );
    }

    private void clickBranch(){
        branch.click();
        new LoginPage ( driver );
    }

    private void clickBranchCA(){
        branchCA.click();
        new LoginPage ( driver );
    }

    public void enterInMainPage(String name, String password){
        this.typeUserName( name );
        this.typePassword( password );
        this.clickButtonLogin();
        this.clickButtonChangDate();
        this.clickBranch ();
        this.clickBranchCA ();
        new LoginPage( driver );
    }*/

    public void enterInMainPage(String name, String password){
        userName.clear();
        userName.sendKeys( name );
        passwordField.clear();
        passwordField.sendKeys( password );
        buttonLogin.click();
        buttonChangDate.click();
       if (getPolygon () == 24) {
            branch.click ( );
            branchCA.click ( );
        }
        new LoginPage( driver );
    }
}
