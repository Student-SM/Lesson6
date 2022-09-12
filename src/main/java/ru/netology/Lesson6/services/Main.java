package ru.netology.Lesson6.services;


public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        int expected = 150; //ожидаемый результат
        int actual = service.calcBonus(5000, true);//подсчет фактического результата
        System.out.println("тест 1. " + expected + " == ? == " + actual);// сравниваем ожидаемый и фактический

        expected = 50; //ожидаемый результат
        actual = service.calcBonus(5000, false);//подсчет фактического результата
        System.out.println("тест 2. " + expected + " == ? == " + actual);// сравниваем ожидаемый и фактический

    }
}
