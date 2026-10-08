import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhavp số thu nhat (a): ");
        int a = scanner.nextInt();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai (b): ");
        int b = scanner.nextInt();

        // Tính tổng
        int tong = a + b;

        // Hiển thị kết quả
        System.out.println("Tong cua " + a + " + " + b + " la: " + tong);
        
        // Đóng scanner
        scanner.close();
    }
}
