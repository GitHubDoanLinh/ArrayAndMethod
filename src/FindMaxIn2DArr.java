import java.util.Scanner;

public class FindMaxIn2DArr {
    public static void main(String[] args) {
        System.out.println("NHAP VAO KICH THUOC HANG");
        int m = new Scanner(System.in).nextInt();
        System.out.println("NHAP VAO KICH THUOC COT");
        int n = new Scanner(System.in).nextInt();
        int[][] twoDArr = new int[m][n];
        System.out.println("Nhap vao gia tri cho "+ twoDArr.length +" hàng và "+
                twoDArr[0].length + " cột: ");
        for(int row = 0; row<twoDArr.length;row++){
            for(int column=0;column<twoDArr[row].length;column++){
                System.out.print("twoDArr["+row+"]"+"["+column+"] = ");
                twoDArr[row][column] = new Scanner(System.in).nextInt();
            }
        }
        int max = twoDArr[0][0];
        int x = 0,y=0;
        for(int i = 0; i<twoDArr.length;i++){
            for(int j=0;j<twoDArr[i].length;j++){
                if(twoDArr[i][j]>max){
                    max = twoDArr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("max = "+ max+ "tai vi tri ["+x+"]["+y+"]");



    }
}
