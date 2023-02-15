package java101.arrays;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix={{1,2,3},{4,5,6}};

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int[][] matrixTranspose=new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixTranspose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Matrix Transpose:");
        for (int i = 0; i < matrixTranspose.length; i++) {
            for (int j = 0; j < matrixTranspose[i].length; j++) {
                System.out.print(matrixTranspose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
