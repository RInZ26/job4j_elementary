package ru.job4j.array;

/**
 * @Class Ищем и находим минимум
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class Min {
    /**
     * Поиск минимума в массиве
     * @param array исходный массив
     * @return минимум
     */
    public static int findMin(int[] array) {
        int min = array[0];
            for (int i = 0; i < array.length; i++)
                if (min > array[i])
                    min = array[i];
        return min;
    }
}
