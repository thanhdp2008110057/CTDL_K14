
 import java.util.Scanner;
 
 public class Kho {
     Node head = null;
     Node tail = null;
     HangHoa hangHoa;
     HangHoa headHangHoa;
     public Kho(){
 }
 boolean isEmpty(){
     boolean empty =true;
     if (head == null) {
         empty = true;
     } else {
         empty = false;
     }
     return empty;
 }
         public void ThemHang(Scanner scanner){
         System.out.println("Ngài muốn thêm loại hàng nào ?");
         System.out.println("(1) Thêm hàng vào đầu danh sách");
         System.out.println("(2) Thêm hàng vào cuối danh sách");
         System.out.println("Lựa chọn (1) hoặc (2)");
         int Them = scanner.nextInt();
         
         
         if (Them == 1) {// Thêm đầu
             HangHoa hangHoa = new HangHoa();
             Node newNode = new Node(hangHoa);
             newNode.data.NhapThongTin(scanner);
             if (isEmpty()==true) {
                 head = newNode;
                 tail = newNode;
             }else{
                 newNode.next = head;
                 head  = newNode;  
             } 
             System.out.println("Đã thêm hàng hóa");    
         }else if (Them == 2) { // Thêm cuối
             HangHoa hangHoa = new HangHoa();
             Node newNode = new Node(hangHoa);
             newNode.data.NhapThongTin(scanner);
             if (isEmpty()==true) {
                 head = newNode;
                 tail = newNode;
             }else{
                 tail.next = newNode;
                 tail  = newNode;          
             }
             System.out.println("Đã thêm hàng hóa");
         }
     }
     public void XoaHang(Scanner scanner){
         System.out.println("Ngài muốn xóa loại hàng nào ?");
         System.out.println("(1) Xóa hàng hóa đầu danh sách");
         System.out.println("(2) Xóa hàng hóa cuối danh sách");
         System.out.println("Lựa chọn (1) hoặc (2)");
         int Xoa = scanner.nextInt();
         
         if (Xoa == 1) {  //xóa món hàng đầu
                 if(head == null){
                     System.out.println("Trong");
                     return;
                 }
                 head = head.next;
                 System.out.println("Đã xóa hàng hóa đầu danh sách");
             }
         if (Xoa == 2) //xóa món hàng cuối
                 if (isEmpty()) {
                     
                 }
                 Node temp;
                 temp = head;
                 while (temp !=null) {
                    if (temp.next == tail) {
                        tail = temp;
                        tail.next = null;
                    } 
                    temp = temp.next;
                    System.out.println("Đã xóa hàng hóa cuối danh sách");
                 }
             }
         void TimTheoLoai(){
                 try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhập loại hàng hóa cần tìm: ");
                     String loaiCanTim = sc.nextLine();
                     Node current = head;
                     while(current != null){
                         if(current.data.Loai.equals(loaiCanTim)){
                             System.out.println("Loại hàng cần tìm: ");
                             current.data.inThongTin();               
                         }
                         current = current.next;
                     }
                }
                 System.out.println("Kh6ng có loại hàng cần tìm");
             }
             void TimTheoGia(){
                 try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhập giá hàng hóa cần tìm: ");
                     double giaCanTim = sc.nextDouble();
                     Node current = head;
                     while(current != null){
                         if(current.data.Price == giaCanTim){
                             System.out.println("Giá hàng hóa cần tìm: ");
                             current.data.inThongTin();                
                         }
                         current = current.next;
                     }
                }
                 System.out.println("không có hàng hóa cần tìm.");
             }
 public void in() {
     Node current = head;
     if (head == null) {
         System.out.println("trong");
     } else {
         while (current != null) {
             current.data.inThongTin();
             current = current.next;
         }
     }
 }
 void thongKe(Scanner scanner){
     Node current = head;
     int Max1 = 0;
     double Max2 = 0;
     if (head == null) {
         System.out.println("trong");
     } else {
         while (current != null) {
             Max1 += current.data.SoLuong;
             Max2 += current.data.Price; 
             current = current.next;
         }
     }
     System.out.println("Tổng số lượng hàng hóa nhập kho: " +Max1);
     System.out.println("Tổng giá trị hàng hóa nhập kho: " +Max2);     
 }
 
 void print(){
     if (head==null) {
         System.out.println("Trong");
         return;
     }
     }
     
 }//01000101 01101101 00100000 01100011 11000011 10100001 01101101 00100000 11000110 10100001 01101110 00100000 01110100 01101000 11100001 10111010 10100111 01111001