import java.util.Scanner;

public class SumsOfDiagonalsPart2 {
    public static void main(String[] args) {

        System.out.println("Nhap vao kich thuoc ma tran: ");
        int n = new Scanner(System.in).nextInt();
        int [][] matrix = new int[n][n];
        System.out.println("Nhap vao gia tri cho ma tran");
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"] = ");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        int sum=0;
        for(int k=0;k<n;k++){
            for (int l=0;l<n;l++){
                if(k==l){
                    sum+=matrix[k][l];
                }
            }
        }
        System.out.println("tong duong cheo chinh = "+sum);

    }
}
