package ru.job4j.array;

/**
 * @Class Поиск минмимума в диапазоне !!!
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class MinDiapason {
    /**
     * Поиск минимума в диапазоне массива
     * @param array заданный массив
     * @param start начало диапазона
     * @param finish конец диапазона
     * @return минимум, -1 - значения границ некорректны
     */
    public static int findMin (int[] array, int start, int finish) {
            if (finish < start || start > array.length || finish > array.length || start < 0 || finish < 0)
                return -1;
        int min = array[start];
            for (int i = start + 1; i <= finish ; i++)
                if (min > array[i])
                    min = array[i];
        return min;
    }
}
