package ru.job4j.array;

/**
 * @Class Класс для поиска в массивах
 * @author RinZ25
 * @since 10.03.2020
 * @version 2
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

    /**
     * Поиск индекса в диапаазоне
     * @param data исходный массив
     * @param el элемент, индекс которого ищется
     * @param start начало диапазона поиска
     * @param finish конец диапазона поиска
     * @return индекс - элемент есть, -1  - элемента нет в данном диапазоне, -2 - неверно заданы границы отрезка
     */
    public static int indexOf(int[] data, int el, int start, int finish){
            if (finish < start || start > data.length || finish > data.length || start < 0 || finish < 0)
                return -2;
            for (int c = start; c <= finish ; c++)
                if (data[c] == el)
                    return c;
        return -1;
    }

    /**
     * Сортировка выборкой
     * @param data исходный массив
     * @return отсортированный массив (исходный)
     */
    public static int[] sort(int[] data){
            for (int i = 0; i < data.length; i++) {
                int temp = data[i];
                int min = MinDiapason.findMin(data, i, data.length - 1);
                int index = indexOf(data, min, i, data.length - 1);
                data[i] = min;
                data[index] = temp;
            }
        return data;
    }
}
