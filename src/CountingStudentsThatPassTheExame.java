import java.util.Scanner;

public class CountingStudentsThatPassTheExame {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập vào kích thước mảng:");
            size = new Scanner(System.in).nextInt();
            if(size>30){
                System.out.println("Kích thước mảng không được > 30");
            }
        }while (size>30);
        array = new int[size];
        System.out.println("nhập vào điểm học sinh:");
        for(int i=0;i<array.length;i++){
            System.out.print("array["+i+"] = ");
            array[i] = new Scanner(System.in).nextInt();
        }
        int count=0;
        System.out.println("Danh sách điểm đã nhập : ");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
            if(array[j]>=5 && array[j]<=10){
                count++;
            }
        }
        System.out.println("\nsố lượng học sinh thi đỗ = "+count);
    }
}
