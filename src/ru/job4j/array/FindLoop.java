package ru.job4j.array;

/**
 * @Class Класс для поиска в массивах
 * @author RinZ25
 * @since 10.03.2020
 * @version 1
 */
public class FindLoop {
    /**
     * Метод для поиска индекса заданного элемента в массиве
     @param data массив, в котором производится поиск элемента
     @param el элемент, индекс которого ищется
     @return результат индекс - элемент есть /   -1 - элемента нет
     */
    public int indexOf(int[] data, int el) {
        for (int c = 0; c < data.length; c++)
            if (data[c] == el)
                return c;
        return -1;
    }
}
