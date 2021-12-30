
import java.util.Date;
import java.util.Scanner;

public class HangHoa {
	String Loai;
    String MaHang;
	String NAME;
	double Price;
    int SoLuong;
	Date NgayNhapKho;
	HangHoa next;
	Scanner sc = new Scanner(System.in);

	HangHoa(){
		
	}
	
	HangHoa(String _Loai, String _MaHang, String _NAME, double _Price,int _SoLuong, Date _NgayNhapKho){
        Loai = _Loai;
		MaHang = _MaHang;
		NAME = _NAME;
		Price = _Price;
        SoLuong = _SoLuong;
		NgayNhapKho = _NgayNhapKho;

	}
	
	public void NhapThongTin(Scanner scanner) {
        System.out.print("Loại hàng hóa: ");
        Loai = sc.nextLine();
		
		System.out.print("Nhập mã sản phẩm: ");
		MaHang = sc.nextLine();

		System.out.print("Nhập tên sản phẩm: ");
		NAME = sc.nextLine();
		
		System.out.print("Nhập giá sản phẩm: ");
		Price = sc.nextFloat();

        System.out.print("Số lượng hàng hóa tồn kho: ");
        SoLuong = sc.nextInt();
		
		System.out.print("Ngày nhập kho: ");
        sc.nextLong();
		NgayNhapKho = new Date();
	}
	
	public void inThongTin() {
        System.out.println("01001011 01101000 11100001 10111010 10100011 01101111");//Easter Egg nhỏ :3
        System.out.println("Loại hàng: " + Loai);
		System.out.println("tên hàng: " + NAME);
		System.out.println("Mã hàng : " + MaHang);
		System.out.println("Giá : " + Price);
        System.out.println("Số lượng hàng hóa : " + SoLuong);
		System.out.println("Ngày nhập kho : " + NgayNhapKho);
        System.out.println("01010011 11000011 10100001 01110100");
		 
	}
	
	public String GetName() {
		System.out.println(NAME);
		return NAME;
	}
}//01010110 11000011 10101100 00100000 11000100 10010001 11000011 10100011 00100000 01100100 11100001 10111010 10100001 01111001 00100000 01100101 01101101 00100000 01101000 11100001 10111011 10001101 01100011 00100000 01101011 11100001 10111011 10110011 00100000 01101110 11000011 10100000 01111001