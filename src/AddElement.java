import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 0, 0 };

        System.out.println("Mảng ban đầu: \n"
                + Arrays.toString(arr));

        System.out.print("Nhập vào số cần chèn: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào vị tri cần chèn: ");
        int index = new Scanner(System.in).nextInt();
        if(index <=-1 || index >= arr.length-1){
            System.out.println("không có vị trí này");
        }
        else {
            int tmp =0;
            int tmp2=0;
            boolean check=false;
            for(int i=0;i<arr.length-1;i++){
                if(i==index){
                    tmp=arr[i];
                    arr[i] = x;
                    check=true;
                    continue;
                }
                if(check){
                    tmp2=arr[i];
                    arr[i]=tmp;
                    tmp=tmp2;

                }

            }
            System.out.println("Mảng sau khi chèn: \n"
                    + Arrays.toString(arr)+" tmp "+tmp);
        }
    }
}
