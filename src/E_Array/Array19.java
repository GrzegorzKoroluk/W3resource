package E_Array;

import java.util.Arrays;

public class Array19 {

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2}, {1, 2}};
        int[][] matrix2 = {{3, 4}, {5, 6}};
        int[][] sum = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for(int i=0; i< sum.length; i++){
            for(int j=0; j< sum.length; j++)
                System.out.print(sum[i][j]);
            System.out.println();
        }

    }
}
