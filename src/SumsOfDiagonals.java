// A simple java program to find
// sum of diagonals

import java.io.*;
import java.util.Scanner;

public class SumsOfDiagonals {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {1, 2, 3, 4},
                     {5, 6, 7, 8}};

        printDiagonalSums(a,  4);
    }


    static void printDiagonalSums(int[][] mat, int n) {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            // tong duong cheo phu
                if (i == j)
                    principal += mat[i][j];

//                // tong duong cheo phu
//                if ((i + j) == (n - 1))
//                    secondary += mat[i][j];
            }
        }

        System.out.print("Tổng của đường chéo chính: "
                + principal);
//        System.out.println("Secondary Diagonal:"
//                + secondary);
    }

}


