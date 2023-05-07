import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap vao kich thuoc mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap vap gia tri cac phan tu ");
        for(int k=0;k<arr.length;k++){
            System.out.print("arr["+k+"] = ");
            arr[k] = sc.nextInt();
        }
        System.out.println("mang da nhap la : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        int index=1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
                index=j;
            }
        }
        System.out.println("\nmax = "+ max +" tai vi tri "+index);
    }
}
