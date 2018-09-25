package com.test.Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

    private EventFiringWebDriver eventDriver;

    public FindElement(EventFiringWebDriver eventFiringWebDriver){
        this.eventDriver = eventFiringWebDriver;
    }

    public void pressOnXpath(String attribute) {
        (new WebDriverWait(eventDriver, 10000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(attribute)));
        eventDriver.findElement(By.xpath(attribute)).click();
    }

    public void pressOnId(String attribute) {
        (new WebDriverWait(eventDriver, 1000)).until(ExpectedConditions.presenceOfElementLocated(By.id(attribute)));
        eventDriver.findElement(By.id(attribute)).click();
    }

    public void doubleClick(String path) {
        Actions actName = new Actions(eventDriver);
        actName.moveToElement(eventDriver.findElement(By.xpath(path))).doubleClick().build().perform();
    }

}
