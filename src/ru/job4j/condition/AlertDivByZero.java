package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-4);
    }

    public static void possibleDiv(int number){
        if (0 == number)
            System.out.println( "Could not div by 0  " + number);
        if (0 > number)
            System.out.println("This is negative numbers  " + number);
    }
}
