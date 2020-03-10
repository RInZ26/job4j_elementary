package ru.job4j.array;

/**
 * @Class Класс для проверок матриц!
 * @author RinZ26
 * @since 10.03.2020
 * @version 1
 */
public class MatrixCheck {
    /**
     * Строка в дмухмерном массиве целиком заполнена символом 'X'
     * @param board проверяемая матрица
     * @param row проверяемая строка в board
     * @return true - строка заполнена нужным символом, false - нет / некорректные данные
     */
    public static boolean monoHorizontal(char[][] board, int row) {
            if (row > board.length)
                return false;
            for (int c = 0; c < board[0].length; c++)
                if (board[row][c] != 'X')
                    return false;
        return true;
    }
}
