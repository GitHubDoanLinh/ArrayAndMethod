import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);// dk trong ngoac thoa man thi lap vo han
        array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("array["+i+"] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements in array:");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j] + "\t");
        }
        System.out.println("\nReverse array: ");
        for(int k=array.length-1;k>=0;k--){
            System.out.print(array[k] + "\t");
        }
    }
}