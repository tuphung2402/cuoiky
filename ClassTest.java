package cuoiky;

import java.util.Scanner;

public class ClassTest 
{

	public static void main(String[] args) 
	{
		
		NhapThongTin thongtin = new NhapThongTin();
		Scanner in = new Scanner(System.in);
		
		
		showMenu();
		
		while(true)
		{
			
			System.out.print("Chọn: ");
			int choose = in.nextInt();
			
			switch(choose)
			{
			case 1:
				thongtin.add();
				break;
				
			case 2:
				System.out.println();
				System.out.println("__________ DANH SÁCH SẢN PHẨM __________");
				thongtin.xuatRaMH();
				System.out.println();
				break;
				
			case 3:
				thongtin.suaTT();
				break;
				
			case 4:
				thongtin.timKiemTT();
				break;
				
			case 5:
				thongtin.xoaThongTin();
				break;
				
			case 6:
				thongtin.sX();
				break;
			
			case 7:
				System.out.println("_____________________________________");
				System.out.println("|									|");
				System.out.println("|	Họ và tên: Trần Ngọc Minh Tú	|");
				System.out.println("|___________________________________|");
				System.out.println("|									|");
				System.out.println("|	Mã số sinh viên: 2004110018		|");
				System.out.println("|___________________________________|");
				System.out.println("|									|");
				System.out.println("|	Lớp: K14DCPM01					|");
				System.out.println("|___________________________________|");

			case 8:
				System.out.println("CẢM ƠN BẠN ĐÃ TRUY CẬP");
				System.exit(0);
				break;
				
			default:
				System.out.println();
				System.out.println("XIN VUI LÒNG CHỌN LẠI");
				System.out.println();
				break;
				
			}
			
		menu();
	}	
}
	
	public static void menu()
	{
		System.out.println("_______________ MENU ________________");
		System.out.println("|   1. NHẬP THÔNG TIN SẢN PHẨM      |");
		System.out.println("|   2. XUẤT THÔNG TIN SẢN PHẨM      |");
		System.out.println("|   3. SỬA THÔNG TIN SẢN PHẨM       |");
		System.out.println("|   4. TÌM KIẾM THÔNG TIN SẢN PHẨM  |");
		System.out.println("|   5. XÓA THÔNG TIN SẢN PHẨM       |");
		System.out.println("|   6. SẮP XẾP THÔNG TIN SẢN PHẨM   |");
		System.out.println("|	7. XEM THÔNG TIN SINH VIÊN		|");
		System.out.println("|   8. THOÁT KHỎI CHƯƠNG TRÌNH      |");
		System.out.println("|___________________________________|");
	}

}
