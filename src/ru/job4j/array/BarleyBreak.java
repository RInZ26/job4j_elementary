package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
            for (int i = 0; i < 9; i++) {
                matrix[i / matrix.length][i % matrix[0].length] = i + 1;
            }

            for (int[] array : matrix) {
                for (int n : array) {
                    System.out.println(n);
                }
            }
    }
}
