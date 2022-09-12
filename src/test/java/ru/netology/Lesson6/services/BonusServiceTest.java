package ru.netology.Lesson6.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.Lesson6.services.BonusService; //если есть пакет (package ru........;) - то можно не импортить.


public class BonusServiceTest {

    @Test

    public void testInRegistered() { //тест на зарегестрированного пользователя

        BonusService service = new BonusService();

        int expected = 150; //ожидаемый результат
        int actual = service.calcBonus(5000, true);//подсчет фактического результата
        // System.out.println("тест 1. " + expected +" == ? == " + actual);// сравниваем ожидаемый и фактический

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testUnRegistered() { //тест на незарегестрированного пользователя

        BonusService service = new BonusService();

        int expected = 50; //ожидаемый результат
        int actual = service.calcBonus(5000, false);

        Assertions.assertEquals(expected, actual);


    }


}