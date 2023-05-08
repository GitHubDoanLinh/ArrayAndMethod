import java.util.Scanner;

public class FindMinPart2 {
    public static void main(String[] args) {
        System.out.print("nhập vào kích thước cho mảng: ");
        int n = new Scanner(System.in).nextInt();
        int [] array = new int[n];
        for(int i=0;i<array.length;i++){
            System.out.print("array["+i+"] = ");
            array[i] = new Scanner(System.in).nextInt();
        }
        int min = array[0];
        for(int j=0;j<array.length;j++){
            if(array[j]<min){
                min = array[j];
            }
        }
        System.out.println("Min of array = "+min);
    }
}
