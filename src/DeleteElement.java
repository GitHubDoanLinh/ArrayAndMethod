import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int index_del = 0;
        boolean check = false;
        int[] array = {2,3,4,5,6,7};
        int[] array2 = new int[array.length];
        System.out.print("Nhap vao phan tu can xoa: ");
        int x = new Scanner(System.in).nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                check=true;
                index_del=i;
            }
        }
        if(check){
            System.out.println(x+" xuat hien tai vi tri "+ index_del);
        }
        for(int i=0,k=0;i<array.length;i++){
            if(array[i]!=x){
                array2[k]=array[i];// cho các phần tử của mảng array mà != x vào mảng array2
                k++;
            }
        }
        System.out.println("Truoc khi xoa :" + Arrays.toString(array));
        System.out.println("Sau khi xoa :" + Arrays.toString(array2));

    }
}
