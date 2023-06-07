package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class BaiTapTongHopMang {
	/* nhập vào 1 mảng ngẫu nhiên n số, sau đó
	 * xuất toàn bộ mảng
	 * tính tổng mảng
	 * với K là 1 số nhập từ bàn phím, hỏi k xuất hiện bao nhiêu lần
	 * tìm phần tử lớn nhất và nhỏ nhất
	 * xuất các số nguyên tố 
	 * sắp xếp các mảng tăng và giảm dần 
	 */
	static int M[];
	public static void menu()
	{
		System.out.println("1:Nhập mảng");
		System.out.println("2:Xuất mảng");
		System.out.println("3:Tổng mảng");
		System.out.println("4:Tìm kiếm");
		System.out.println("5:Lớn nhất");
		System.out.println("6:Nhỏ nhất");
		System.out.println("7:Số nguyên tố");
		System.out.println("8:sắp xếp tăng");
		System.out.println("9:sắp xếp giảm");
		System.out.println("-1: thoát ");
		System.out.println("mời bạn lựa chọn : ");
		int chose = new Scanner(System.in).nextInt();
		switch (chose)
		{
			case 1:
				nhapmang();
				break;
			case 2:
				xuatmang();
				break;
			case 3:
				tinhtong();
				break;
			case 4:
				timkiem();
				break;
			case 5:
				timmax();
				break;
			case 6:
				timmin();
				break;
			case 7:
				songuyento();
				break;
			case 8:
				sapxeptangdan();
				break;
			case 9:
				sapxepgiam();
				break;
			case -1:
				System.err.println("cam on ban da tham gia tro choi ");
				System.exit(0);
		
		}
	}

	private static void timmin() {
		// TODO Auto-generated method stub
		int min = M[0];
		for(int i=0;i<M.length;i++)
		{
			if(M[i] < min)
			{
				min = M[i];
				
			}
		}
		System.out.println("so nho nhat trong mang la : "+min);
		
	}

	private static void sapxepgiam() {
		// TODO Auto-generated method stub
		for(int i=0;i<M.length;i++)
		{
			for(int j=i+1;j<M.length;j++)
			{
				if(M[i]<M[j])
				{
					int temp = M[i];
					M[i] = M[j];
					M[j] = temp;
				}
			}
		}
		
	}

	private static void sapxeptangdan() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<M.length;i++)
		{
			for(int j=i+1;j<M.length;j++)
			{
				if(M[i]>M[j])
				{
					int temp = M[i];
					M[i] = M[j];
					M[j] = temp;
				}
			}
		}
	}

	private static void songuyento() {
		// TODO Auto-generated method stub
		System.out.println("so nguyen to : ");
		for(int i=0;i<M.length;i++)
		{
			int dem=0;
			for(int j=1;j<=M[i];j++) 
			{
				if(M[i]%j==0)
					dem++;
			}
			if(dem==2)
				System.out.print(M[i] + "\t");
		}
		System.out.println();
	}

	private static void timmax() {
		// TODO Auto-generated method stub
		int max = M[0];
		for(int i=0;i<M.length;i++)
		{
			if(M[i] > max)
			{
				max = M[i];
				
			}
		}
		System.out.println("so lon nhat trong mang la : "+max);
		
	}

	private static void timkiem() {
		// TODO Auto-generated method stub
		int solan=0;
		System.out.println("Nhap vao so ban muon tim : ");
		int  k = new Scanner(System.in).nextInt();
		String s = "";
		for(int i=0;i<M.length;i++)
		{
			if(M[i]==k)
			{
				solan ++;
				s+=i+" ; ";
			}
				
		}
		if(solan==0)
			System.out.println(k + " khong xuat hien trong mang ");
		else
			System.out.println(k + " co xuat hien trong mang ");
			System.out.println("thay "+k+" tai vi tri "+s);
	}

	private static void tinhtong() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int x : M)
		{
			sum+=x;
		}
		System.out.println("tong cua mang = "+sum);
		
		
	}

	private static void xuatmang() {
		// TODO Auto-generated method stub
		System.out.println("Cac phan tu trong mang la : ");
		for(int i=0;i<M.length;i++)
			System.out.print(M[i]+ "\t");
			System.out.println();
	}

	private static void nhapmang() {
		// TODO Auto-generated method stub
		System.out.println("moi ban nhap vao so phan tu cua mang : ");
		int n = new Scanner(System.in).nextInt();
		M = new int[n];// khoi tao lai mang M
		Random rd = new Random();
		for(int i=0;i<M.length;i++)
		{
			M[i] = rd.nextInt(100);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			menu();
		}

	}

}
