package cuoiky;

public class SanhSu extends ThuocTinhChung 
{
	
	public SanhSu(int MaSP, String tenSP, boolean loaiSanPham, String ngayNhapKho, int giaNhapKho, int soLuongTK) 
	{
		super(MaSP, tenSP, loaiSanPham, ngayNhapKho, giaNhapKho, soLuongTK);//SUPER: BIẾN THAM CHIẾU
	}
	
	@Override
	public String ShowInfo() 
	{
		return super.ShowInfo();
	}

	@Override
	public String ShowItemInfo() 
	{
		return super.ShowItemInfo();
	}

}
