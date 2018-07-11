import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class FindElement {

    public EventFiringWebDriver eventDriver;

    FindElement(EventFiringWebDriver eventFiringWebDriver){
        this.eventDriver = eventFiringWebDriver;
    }

    public void pressOnXpath(String attribute) {
        (new WebDriverWait(eventDriver, 10000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(attribute)));
        eventDriver.findElement(By.xpath(attribute)).click();
    }

    public void pressOnId(String attribute) {
        (new WebDriverWait(eventDriver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id(attribute)));
        eventDriver.findElement(By.id(attribute)).click();
    }

}
