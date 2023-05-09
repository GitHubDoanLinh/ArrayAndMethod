// A simple java program to find
// sum of diagonals

import java.io.*;
import java.util.Scanner;

public class SumsOfDiagonals {

    public static void main(String[] args) {

//        System.out.println("NHAP VAO KICH THUOC HANG");
//        int m = new Scanner(System.in).nextInt();
//        System.out.println("NHAP VAO KICH THUOC COT");
//        int n = new Scanner(System.in).nextInt();
//        int[][] twoDArr = new int[m][n];
//        System.out.println("Nhap vao gia tri cho " + twoDArr.length + " hàng và " +
//                twoDArr[0].length + " cột: ");
//        for (int row = 0; row < twoDArr.length; row++) {
//            for (int column = 0; column < twoDArr[row].length; column++) {
//                System.out.print("twoDArr[" + row + "]" + "[" + column + "] = ");
//                twoDArr[row][column] = new Scanner(System.in).nextInt();


        int[][] a = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {1, 2, 3, 4},
                     {5, 6, 7, 8}};

        printDiagonalSums(a, 4);
    }


    static void printDiagonalSums(int[][] mat, int n) {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal
                // diagonal
                if (i == j)
                    principal += mat[i][j];

                // Condition for secondary
                // diagonal
                if ((i + j) == (n - 1))
                    secondary += mat[i][j];
            }
        }

        System.out.println("Principal Diagonal:"
                + principal);

        System.out.println("Secondary Diagonal:"
                + secondary);
    }

}


