package java08.ex02;

import java08.App;

public class Ex02 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 0, 8, 7}, {1, 9, 0, 9}, {2, 0, 6, 5}, {1, 2, 4, 5}};
        zeroMatrix(array);
        App.printArray(array);
    }

    private static void zeroMatrix(int[][] a) {
        int[] row = new int[a.length];
        int[] col = new int[a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    a[i][j] = 0;
                }
            }
        }
    }
}
