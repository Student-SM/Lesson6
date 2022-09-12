package ru.netology.Lesson6.services;

public class BonusService {

    public int calcBonus(int amount, boolean inRegistered) { //заводим переменную подсчета бонуса(calcBonus),
        // сумму покупки и зарегестрированн пользователь или нет.
        int percent = inRegistered ? 3 : 1;//завели процент,если зарегестрирован то 3,если нет то 1.
        int bonus = amount * percent / 100;//завели бонус,считаем по формуле
        if (bonus > 500) { //если бонус больше 500,то бонус = 500
            bonus = 500;
        }
        return bonus;//выводим бонус
    }
}
