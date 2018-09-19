package com.test;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test {

 /*   public static EventFiringWebDriver eventDriver;*/

    public static void main(String[] args) throws FileNotFoundException {

       /* RandomWordsAndNumber randomWords = new RandomWordsAndNumber();
        Gender gender = new Gender();*/


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
/*
        System.out.println( eventDriver.findElement( By.xpath( "Locator" ) ).getSize());
*/





       /* float min = 0.1;
        int max = 9.99;*/
/*        int random_number = min + (int) (Math.random() * max);
        String b = String.valueOf(random_number);*/

        double random_number = (Math.random()*(2)) + 0.1;
        int random_number1 = (int)(Math.random()*(3) + 1);
       // System.out.println( Arrays.toString( RandomWordsAndNumber.randomNumber( 90, 90 ) ) );
        System.out.println( "random " + random_number );
        System.out.println( "random1 " + random_number1 );
/*        System.out.println( gender.Name() );
        System.out.println( gender.Patronymic() );*/
}

}
