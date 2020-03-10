package ru.job4j.array;

/**
 * @Class Табличка умножения
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class Matrix {
    /**
     * Возвращаем таблицу умножения размера size
     * @param size размер таблицы умножения
     * @return матрица - таблица умножения, null size < 0
     */
    public int[][] multiple(int size) {
            if (size < 0)
                return null;
        int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++)
                    matrix[i][j] = (i + 1) * (j + 1);
        return matrix;
    }
}
