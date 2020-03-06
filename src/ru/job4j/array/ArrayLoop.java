package ru.job4j.array;

/**
 * @Class Класс для заполнения массива элементами
 * @author RinZ26
 * @since 06.03.2020
 * @version 1
 */
public class ArrayLoop {
    /**
     * Заполнение массива
     * @param args args
    * */
    public static void main(String[] args) {
        int[] numbers = new int[5];
            for (int i = 0; i < numbers.length; i++)
                numbers[i] = i * 2 + 3;
    }
}
