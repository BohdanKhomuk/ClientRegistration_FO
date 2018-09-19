package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

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

    public void toTab3Frame(){
        todefCont();
        toMainFrame();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("Tab3")));
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
