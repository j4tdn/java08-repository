package java08.ex03;

public class ShapePascal {

    public static void main(String[] args) {
        int n = 4;
        int[][] pascal = new int[n + 2][n + 2];
        printPascalRestangle(pascal, n);
    }

    private static void printPascalRestangle(int[][] pascal, int n) {
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
