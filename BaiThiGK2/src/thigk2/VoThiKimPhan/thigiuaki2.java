package thigk2.VoThiKimPhan;
import java.util.Scanner;
public class thigiuaki2 {
	// Câu 1: 
	/*
     * TÓM TẮT CÁCH GIẢI:
     * 1. Xác định độ dài các cạnh của hình chữ nhật dựa trên khoảng cách giữa các tọa độ:
     * - Cạnh ngang (trục Ox): a = |x2 - x1|
     * - Cạnh dọc (trục Oy): b = |y1 - y2|
     * Lưu ý: Sử dụng hàm Math.abs() để lấy giá trị tuyệt đối, đảm bảo độ dài luôn là số dương.
     * 2. Áp dụng công thức hình học cơ bản:
     * - Chu vi (P) = 2 * (a + b)
     * - Diện tích (S) = a * b
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH CHỮ NHẬT ---");

        // 1. Hỏi người dùng nhập tọa độ góc trên - trái (x1, y1)
        System.out.println("\nNhập tọa độ góc TRÊN - TRÁI:");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        // 2. Hỏi người dùng nhập tọa độ góc dưới - phải (x2, y2)
        System.out.println("\nNhập tọa độ góc DƯỚI - PHẢI:");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        // 3. Xử lý tính toán: Tính độ dài 2 cạnh theo tóm tắt cách giải
        double chieuDai = Math.abs(x2 - x1);
        double chieuRong = Math.abs(y1 - y2);

        // 4. Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // 5. Xuất kết quả ra màn hình
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.printf("Độ dài cạnh ngang (a) : %.2f\n", chieuDai);
        System.out.printf("Độ dài cạnh dọc (b)   : %.2f\n", chieuRong);
        System.out.printf("Chu vi hình chữ nhật  : %.2f\n", chuVi);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);

        // Đóng Scanner để giải phóng bộ nhớ
        scanner.close();
	}

}
