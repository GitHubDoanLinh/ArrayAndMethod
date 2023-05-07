import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"obama", "putin", "xinjiping", "marken", "abe", "nptrong"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(input_name)){// so sanh hai chuoi
                System.out.println("vị trí của tổng thống có trong danh sách "+input_name+" là : "+i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("tên nhập vào không có trong danh sách !");
        }

    }
}
