package cuoiky;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class NhapThongTin 
{
	
	static ClassList cll = new ClassList();
	
	static Scanner in = new Scanner(System.in);
	
	public void add() 
	{
		
		System.out.println("_________________________________________________");
		System.out.print("Nhập số sản phẩm cần nhập thông tin: ");
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) 
		{
			System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
			
			System.out.print("Nhập mã sản phẩm: ");
			int MaSP = in.nextInt();
			
			sc.nextLine();
			System.out.print("Nhập tên sản phẩm: ");
			String tenSP = in.nextLine();	
			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
			String ngayNhapKho = formatter.format(date);
			
			System.out.print("Nhập giá nhập kho: ");
			int giaNhapKho = in.nextInt();
			
			System.out.print("Nhập số lượng tồn kho: ");
			int soLuongTK = in.nextInt();	
			
			showMenu();
			boolean loaiSanPham = false;
			
			int sanpham = in.nextInt();
			
			if(sanpham == 1) 
			{
				
				loaiSanPham = true;
				
				in.nextLine();
				ThuocTinhChung tp = new ThucPham(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
				
				cll.them(tp);
				
				System.out.println();
				
			}
			else 
			{
				
				if(sanpham == 2) 
				{
					loaiSanPham = true;
					
					System.out.println();	
					
					in.nextLine();
					ThuocTinhChung ss = new SanhSu(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
					
						cll.them(ss);
						
						System.out.println();
						
					}
					else 
					{
						
						if(sanpham == 3)
						{
							
						in.nextLine();					
						ThuocTinhChung dienmay = new DienMay(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);
						
						cll.them(dienmay);
						
						System.out.println();
					}
				}
			}
		}
	}

	  
	 public void xuatRaMH() 
	 {
		 cll.xuat();
		 
	 }
	 
	 public void suaTT() 
	 {
		 cll.sua();
	 }
	 
	 public void timKiemTT() 
	 {
		 cll.timKiem();
	 }
	 
	 public void sX() 
	 {
		cll.sapXep();
	 }
	 
	 public void xoaThongTin() 
	 {
		 
		 System.out.println("__________________________________________");
		 
		 System.out.print("Nhập vị trí cần xóa: ");
		 
		 int n = in.nextInt();
		 
		 cll.xoa(n);
	 }
	 
	 
	 public void showMenu() 
	{

		 
			System.out.println("--------------------------------------------------");
			
			System.out.println("____________________CHỌN SẢN PHẨM ___________________");
			System.out.println("|			1. Thực phẩm 							|");
			System.out.println("|			2. Sành sứ 								|");
			System.out.println("|			3. Điện máy 							|");
			System.out.println("|___________________________________________________|");
			System.out.print("Sản phẩm là thực phẩm, sành sứ hay điện máy?: ");		 
	 }
}
