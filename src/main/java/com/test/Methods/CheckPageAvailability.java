package com.test.Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class CheckPageAvailability {

    public WebDriver driver;


    public CheckPageAvailability(WebDriver driver) {
        this.driver = driver;
    }
    public void threePage(String searchEl){

        ArrayList<String> tabs0 = new ArrayList<> ( driver.getWindowHandles ( ) );
        driver.switchTo ( ).window ( tabs0.get ( 1 ) );
        System.out.println ( "Win0 " + tabs0 );
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "List_win " + tabs );
        String mainWindows = driver.getWindowHandle();
        System.out.println ( "Main_win " + mainWindows );
        driver.switchTo().window(tabs.get(2));
        WebElement elementID = driver.findElement(By.xpath ("//*[@id]"));
        String id = elementID.getAttribute("id");     // for getting id of each element
        System.out.println ( "First_id " + id );
        if (!id.equals ( searchEl )){
            driver.switchTo().window(tabs.get(1)); // первый таб
            String mainWindows1 = driver.getWindowHandle();
            System.out.println ( "First_win " + mainWindows1 );
            WebElement elementID1 = driver.findElement(By.xpath ("//*[@id]"));
            String id1 = elementID1.getAttribute("id");     // for getting id of each element
            System.out.println ( "Second_id " +id1 );
            if (!id1.equals ( searchEl )){
                driver.switchTo().window(tabs.get(0)); // первый таб
                String mainWindows2 = driver.getWindowHandle();
                System.out.println ( "Second_win " + mainWindows2 );
                WebElement elementID2 = driver.findElement(By.xpath ("//*[@id]"));
                String id2 = elementID2.getAttribute("id");     // for getting id of each element
                System.out.println ( "Third_id " +id2 );
                if (!id2.equals ( searchEl )){
                    driver.switchTo().window(tabs.get(2)); // первый таб
                    String mainWindows3 = driver.getWindowHandle();
                    System.out.println ( "Third_win " + mainWindows3 );
                    WebElement elementID3 = driver.findElement(By.xpath ("//*[@id]"));
                    String id3 = elementID3.getAttribute("id");     // for getting id of each element
                    System.out.println ( "Four_id " +id3 );
                }
            }
        }
        String mainWindows4 = driver.getWindowHandle();
        System.out.println ( "Win4 " + mainWindows4 );
    }

    public void twoPage(String searchEl){
        ArrayList<String> tabs0 = new ArrayList<> ( driver.getWindowHandles ( ) );
        driver.switchTo ( ).window ( tabs0.get ( 1 ) );
        System.out.println ( "Win0 " + tabs0 );
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        System.out.println ( "List_win " + tabs );
        String mainWindows = driver.getWindowHandle();
        System.out.println ( "Main_win " + mainWindows );
        driver.switchTo().window(tabs.get(0));
        WebElement elementID = driver.findElement(By.xpath ("//*[@id]"));
        String id = elementID.getAttribute("id");     // for getting id of each element
        System.out.println ( "First_id " + id );
        if (!id.equals ( searchEl )){
            driver.switchTo().window(tabs.get(1)); // первый таб
            String mainWindows1 = driver.getWindowHandle();
            System.out.println ( "First_win " + mainWindows1 );
            WebElement elementID1 = driver.findElement(By.xpath ("//*[@id]"));
            String id1 = elementID1.getAttribute("id");     // for getting id of each element
            System.out.println ( "Second_id " +id1 );
            if (!id1.equals ( searchEl )){
                driver.switchTo().window(tabs.get(0)); // первый таб
                String mainWindows2 = driver.getWindowHandle();
                System.out.println ( "Second_win " + mainWindows2 );
                WebElement elementID2 = driver.findElement(By.xpath ("//*[@id]"));
                String id2 = elementID2.getAttribute("id");     // for getting id of each element
                System.out.println ( "Third_id " +id2 );
            }
        }
        String mainWindows4 = driver.getWindowHandle();
        System.out.println ( "Win4 " + mainWindows4 );
    }
}
