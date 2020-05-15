package java08.ex03;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddleElement {
    private static Scanner ip = new Scanner(System.in);
    private static Random rd = new Random();

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int[][] array = new int[m][n];
        inputArray(array);
        outputArray(array);
        if(checkHorseSaddleElement(array)){
            System.out.println("==> Has horse saddle element");
        }else{
            System.out.println("==> Don't have horse saddle element");
        }
    }

    private static void inputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 1 + rd.nextInt(99);
            }
        }
    }

    private static void outputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int minNumberRow(int[][] array, int row) {
        int min = array[row][0];
        for (int j = 0; j < array[0].length; j++) {
            if (array[row][j] < min) {
                min = array[row][j];
            }
        }
        return min;
    }

    private static int maxNumberCol(int[][] array, int col) {
        int max = array[0][col];
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] > max) {
                max = array[i][col];
            }
        }
        return max;
    }

    private static boolean checkHorseSaddleElement(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == minNumberRow(array, i) && array[i][j] == maxNumberCol(array, j)) {
                    System.out.println("Horse saddle element is " + array[i][j]);
                    return true;
                }
            }
        }
        return false;
    }
}
