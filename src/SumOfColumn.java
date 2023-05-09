import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        System.out.println("NHAP VAO KICH THUOC HANG");
        int m = new Scanner(System.in).nextInt();
        System.out.println("NHAP VAO KICH THUOC COT");
        int n = new Scanner(System.in).nextInt();
        int[][] twoDArr = new int[m][n];
        System.out.println("Nhap vao gia tri cho " + twoDArr.length + " hàng và " +
                twoDArr[0].length + " cột: ");
        for (int row = 0; row < twoDArr.length; row++) {
            for (int column = 0; column < twoDArr[row].length; column++) {
                System.out.print("twoDArr[" + row + "]" + "[" + column + "] = ");
                twoDArr[row][column] = new Scanner(System.in).nextInt();
            }
        }
        int sum = 0;
        System.out.print("nhập vào cột muốn tính tổng: ");
        int x = new Scanner(System.in).nextInt();
        if (x >= n || x < 0) {
            System.out.println("không có cột này ! ");
        } else {
            for (int i = 0; i < twoDArr.length; i++) {
                sum += twoDArr[i][x];
            }
        }
        System.out.println(sum);
    }
}
