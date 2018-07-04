import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;

public class Frame {

    private static EventFiringWebDriver eventDriver;

    public static void testFrame() {
        eventDriver = new EventFiringWebDriver( new InternetExplorerDriver(  ) );
    }

    public void todefCont(){
        eventDriver.switchTo().defaultContent();
    }

    public void toMainFrame(){
        todefCont();
        eventDriver.switchTo().frame(eventDriver.findElement(By.id("mainFrame")));
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
