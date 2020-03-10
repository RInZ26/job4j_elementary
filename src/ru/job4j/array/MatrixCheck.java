package ru.job4j.array;

/**
 * Класс для проверок матриц!
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
            if (row > board.length) {
                return false;
            }
            for (int c = 0; c < board[0].length; c++) {
                if (board[row][c] != 'X') {
                    return false;
                }
            }
        return true;
    }

    /**
     * Столбец в двухмерном массиве целиком заполнен символом 'X'
     * @param board проверяемая матрица
     * @param column проверяемый столбец в board
     * @return true - столбец заполнен нужным символом, false - нет / некорректные данные
     */
    public static boolean monoVertical(char[][] board, int column) {
            if (column > board[0].length) {
                return false;
            }
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    /**
     * Извлечение диагонали у матрицы
     * @param board заданная матрица
     * @return массив равный диагонали board
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] array = new char[board[0].length];
            for (int c = 0; c < board[0].length; c++) {
                array[c] = board[c][c];
            }
        return array;
    }

    /**
     * Проверка на выигрышную позицию в игре сокобан
     * @param board матрица
     * @return true - победа, false - нет
     */
    public static boolean isWin(char[][] board) {
        char[] diagArr = extractDiagonal(board);
            for (int c = 0; c < diagArr.length; c++) {
                if (diagArr[c] == 'X') {
                    if (monoHorizontal(board, c) || monoVertical(board, c)) {
                        return true;
                    }
                }
            }
        return false;
    }
}
