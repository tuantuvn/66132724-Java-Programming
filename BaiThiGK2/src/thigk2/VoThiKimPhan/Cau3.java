package thigk2.VoThiKimPhan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cau3 {

    /*
     * TÓM TẮT CÁCH GIẢI:
     * 1. Tạo file chứa 80 số thực (mỗi dòng 1 số).
     * 2. Dùng BufferedReader để đọc file từng dòng.
     * 3. Chuyển từng dòng thành số thực (double) và lưu vào ArrayList.
     * 4. In danh sách số ra màn hình.
     * 5. Kiểm tra xem giá trị X (X = 12) có trong danh sách hay không.
     */

    public static void main(String[] args) {
        ArrayList<Double> danhSach = new ArrayList<>();
        String fileName = "data.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            // Đọc từng dòng
            while ((line = br.readLine()) != null) {
                double so = Double.parseDouble(line);
                danhSach.add(so);
            }

            br.close();

            // In danh sách
            System.out.println("--- DANH SÁCH SỐ ---");
            for (double x : danhSach) {
                System.out.println(x);
            }

            // Kiểm tra X = 12
            double X = 12;
            boolean timThay = false;

            for (double x : danhSach) {
                if (x == X) {
                    timThay = true;
                    break;
                }
            }

            // Kết quả
            if (timThay) {
                System.out.println("\nCó giá trị " + X + " trong danh sách");
            } else {
                System.out.println("\nKhông có giá trị " + X + " trong danh sách");
            }

        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }
    }
}