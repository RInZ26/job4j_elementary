package ru.job4j.array;

/**
 * Клаcc для работы с массивами
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class Defragment {
    /**
     * Дефрагментация массива
     * @param array  исходный массив
     * @return скомпресованный массив
     */
    public static String[] compress(String[] array) {
        int pointer = -1; // указатель на последнюю ячейку со значением
            for (int c = 0; c < array.length; c++) {
                if (array[c] != null) {
                    array[++pointer] = array[c];
                }
            }
            if (pointer > -1) {
                for (int c = pointer + 1; c < array.length; c++) {
                    array[c] = null;
                }
            }
        return array;
    }
}
