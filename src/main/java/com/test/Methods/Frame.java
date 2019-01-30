package com.test.Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {
    private EventFiringWebDriver eventDriver;

    public Frame(EventFiringWebDriver eventFiringWebDriver){
        this.eventDriver = eventFiringWebDriver;
    }

    public void todefCont(){
        eventDriver.switchTo().defaultContent();
    }

    public void toMainFrame(){
        todefCont();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("mainFrame")));
    }

    public void toTab0Frame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("Tab0")));
    }

    public void toTab0FrameAcc(){
        todefCont();
        //toMainFrame();
        WebElement element = eventDriver.findElement ( By.id("Tab0"));
        WebDriverWait w = new WebDriverWait(eventDriver, 10000);
        WebElement pause = w.until (ExpectedConditions.visibilityOf (element));
        Actions builder = new Actions(eventDriver);
        builder.moveToElement(pause);
        eventDriver.switchTo().frame(pause);
        builder.perform();
    }

    public void toTab1Frame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("Tab1")));
    }

    public void toTab1FrameAcc(){
        todefCont();
        //toMainFrame();
        WebElement element = eventDriver.findElement ( By.id("Tab1"));
        WebDriverWait w = new WebDriverWait(eventDriver, 10000);
        WebElement pause = w.until ( ExpectedConditions.visibilityOf ( element));
        Actions builder = new Actions(eventDriver);
        builder.moveToElement(pause);
        eventDriver.switchTo().frame(pause);
        builder.perform();
    }

    public void toTab2Frame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("Tab2")));
    }

    public void toTab2FrameAcc(){
        todefCont();
        //toMainFrame();
        WebElement element = eventDriver.findElement ( By.id("Tab2"));
        WebDriverWait w = new WebDriverWait(eventDriver, 10000);
        WebElement pause = w.until ( ExpectedConditions.visibilityOf ( element));
        Actions builder = new Actions(eventDriver);
        builder.moveToElement(pause);
        eventDriver.switchTo().frame(pause);
        builder.perform();
    }

    public void toTab3Frame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("Tab3")));
    }

    public void toTab3FrameAcc(){
        todefCont();
        //toMainFrame();
        WebElement element = eventDriver.findElement ( By.id("Tab3"));
        WebDriverWait w = new WebDriverWait(eventDriver, 10000);
        WebElement pause = w.until ( ExpectedConditions.visibilityOf ( element));
        Actions builder = new Actions(eventDriver);
        builder.moveToElement(pause);
        eventDriver.switchTo().frame(pause);
        builder.perform();
    }


    public void kContentFrame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.className("k-content-frame")));
    }

    public void fullAddressFrame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame( eventDriver.findElement(By.xpath( "//iframe[@title = 'Повна адреса клієнта']" )) );
    }
    public void tabFrame(String path){
        todefCont();
        toMainFrame();
        kContentFrame();
        eventDriver.switchTo().frame( path );
    }
}
