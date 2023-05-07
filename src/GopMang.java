import java.util.Scanner;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        System.out.println("nhap vao gia tri cua mang thu nhat:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = new Scanner(System.in).nextInt();
        }
        int[] array2 = new int[5];
        System.out.println("nhap vao gia tri cua mang thu hai:");
        for (int j = 0; j < array2.length; j++) {
            System.out.print("array2[" + j + "] = ");
            array2[j] = new Scanner(System.in).nextInt();
        }

        int length = array1.length + array2.length;

        int[] array3 = new int[length];
        int pos = 0;
        for (int element : array1) {
            array3[pos] = element;
            pos++;
        }
        for (int element : array2) {
            array3[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(array3));
    }
}

