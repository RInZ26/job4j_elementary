package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
       return value / 70;
    }

    public static int rubleToDollar(int value) {
        //return value / 60;
        return -2;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
       /*System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dollar + " dollar.");*/

        //test rToD
        int expected = 2;
        boolean passed = expected == rubleToDollar(140);
        System.out.println(passed ? "Result is true" : "Result is false");

        //test rToE
        expected = 4;
        passed = expected == rubleToEuro(280);
        System.out.println("Result is " + passed);
    }
}
