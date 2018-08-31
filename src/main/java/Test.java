import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test {

    public static EventFiringWebDriver eventDriver;

    public static void main(String[] args) throws FileNotFoundException {

        RandomWordsAndNumber randomWords = new RandomWordsAndNumber();
        Sex sex = new Sex();


          //АЛЕРТЫ
//        eventDriver.switchTo().alert().dismiss();  //no
//        eventDriver.switchTo().alert().accept();  //yes


          //ПРЕЕХОД МЕЖДУ ОКНАМИ ИЛИ РАБОТА С ВКЛАДКАМИ БРАУЗЕРА
//        String mainWindows = eventDriver.getWindowHandle(); запоминаем первое окно
//
//        //Переход на второе окно
//        for(String windowsHandls : eventDriver.getWindowHandles()){
//            eventDriver.switchTo().window( windowsHandls );
//        }
//        //Возврат обратно на первое окно
//        eventDriver.switchTo().window( mainWindows );


        //ПРОВЕРКА СОСТОЯНИЯ ЭЛЕМЕНТА
//        WebElement button1 = eventDriver.findElement( By.xpath( "Locator1" ) );
//        WebElement button2 = eventDriver.findElement( By.xpath( "Locator2" ) );
//        WebElement button3 = eventDriver.findElement( By.xpath( "Locator3" ) );
//
//        // Поверка элемента на включенность(активность)
//        System.out.println( button1.isEnabled());
//
//        //Нажатие на активный элемент
//        if(button1.isEnabled()) button1.click();
//
//        //Нажатие на выделенный ли элемент
//        if (button2.isSelected()) button2.click();
//
//        //Проверка на видимость элемента
//        System.out.println( button3.isDisplayed() );


        //ПРОВЕРКА НА НАЛИЧИЕ ЭЛЕМЕНТА
        //Наличие элементов с данным икспасом
        System.out.println( eventDriver.findElement( By.xpath( "Locator" ) ).getSize());





        int min = 91;
        int max = 9;
        int random_number = min + (int) (Math.random() * max);
        String b = String.valueOf(random_number);

        System.out.println( Arrays.toString( RandomWordsAndNumber.randomNumber( 90, 90 ) ) );
        System.out.println( b );
        System.out.println( sex.Name() );
        System.out.println( sex.Patronymic() );
    }

}
