package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * / ^.
 * @author RinZ26
 * @since 06.03.2020
 * @version 1
 */
public class Calculator {
    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int result = one + two;
        System.out.println(result);
        one = 10;
        two = 11;
        System.out.println(result);
    }

    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
    */
    public static double add(double first, double second) {
        return first + second;
    }
}