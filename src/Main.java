import java.util.Scanner;
public class Main {

    static Scanner nhap = new Scanner(System.in);
	public static Kho kho = new Kho();
    public static void main(String[] args) { 
        try (//HangHoa.add("Thực phẩm ", "HH00120", "thịt gà", "70.000", "100", "11");
                //HangHoa.add("Thực phẩm ", "HH00121", "cá", "40.000", "100", "10");
                //HangHoa.add("Thực phẩm ", "HH00122", "trứng", "50.000", "100", "10");
                //HangHoa.add("Thực phẩm ", "HH00123", "sữa", "20.000", "100", "10");
                //HangHoa.add("Thực phẩm ", "HH00124", "rau", "10.000", "100", "10");
                //HangHoa.add("Thực phẩm ", "HH00125", "củ", "15.000", "120", "10");
                //HangHoa.add("Thực phẩm ", "HH00126", "quả", "45.000", "150", "10");
                //HangHoa.add("Sành Sứ ", "HH00235", "chén", "130.000", "50", "11");
                //HangHoa.add("Sành Sứ ", "HH00236", "dĩa", "200.000", "150", "11");
                //HangHoa.add("Sành Sứ", "HH00237", "bát", "150.000", "150", "11");
                //HangHoa.add("Sành Sứ", "HH00238", "bình gốm", "100.000", "60", "11");
                //HangHoa.add("Điện Máy", "HH00310", "laptop", "15.000.000", "20", "11");
                //HangHoa.add("Điện Máy ", "HH00311", "điện thoại", "5.000.000", "10", "10");
                //HangHoa.add("Điện Máy ", "HH00312", "tủ lạnh", "10.000.000", "5", "10");
                //HangHoa.add("Điện Máy ", "HH00313", "TV", "4.000.000", "10", "10");
                //HangHoa.add("Điện Máy", "HH00314", "Loa ", "8.000.000", "9", "10");
                //HangHoa.add("Điện Máy", "HH00315", "máy giặc", "12.000.000", "10", "10");
                //HangHoa.add("Điện Máy", "HH00316", "đèn led", "50.000", "50", "10");
        Scanner sc = new Scanner(System.in)) {
            int Key;
            do{
            	System.out.println();
            	System.out.println("01001101 01100101_MENU_01101110 01110101");//Easter Egg nhỏ nhỏ :3
                System.out.println("1)  Thêm hàng			");
                System.out.println("2)  Xóa hàng 	");
                System.out.println("3)  Tìm hàng theo loại ");
                System.out.println("4)  Tìm hàng theo giá ");
                System.out.println("5)  In thông tin hàng hóa");
                System.out.println("6)  Thống kê hàng hóa 	");
                System.out.println("7)  Exit         		");
                System.out.println("01010110 01110101 01101001");
                System.out.print(" Mời chọn chức năng: ");
                Key = sc.nextInt();
                switch(Key){
            	case 1:	 ThemHang(kho);break;
                case 2:  XoaHang(kho);break;
                case 3:  TimTheoLoai(kho);break;
                case 4:  TimTheoGia(kho);break;
                case 5:  in(kho);break;
                case 6: ThongKe(kho);break;
                default: break;
            }

   } while(Key != 0);
        }
}

public static void ThemHang(Kho kho) {
    kho.ThemHang(nhap);
}
public static void XoaHang(Kho kho) {
    kho.XoaHang(nhap);
}
public static void TimTheoGia(Kho kho) {
    kho.TimTheoGia();
}
public static void TimTheoLoai(Kho kho) {
    kho.TimTheoLoai();
}
public static void in(Kho kho) {
    kho.in();
}
public static void ThongKe(Kho kho) {
    kho.thongKe(nhap);
}

}//01000011 01101000 11000011 10111010 01100011 00100000 01110100 01101000 11100001 10111010 10100111 01111001 00100000 01101110 11000100 10000011 01101101 00100000 01101101 11100001 10111011 10011011 01101001