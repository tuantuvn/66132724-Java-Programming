package thigk2.VoThiKimPhan;

import java.util.ArrayList;
import java.util.Scanner;

public class Cau2_Main {

    /*
     * TÓM TẮT CÁCH GIẢI:
     * 1. Tạo lớp Cau2_SanPham gồm các thuộc tính: mã, tên, loại, giá.
     * 2. Trong hàm main:
     *    - Tạo ArrayList<Cau2_SanPham> để lưu danh sách.
     *    - Hard-code 3 sản phẩm ban đầu và in ra màn hình.
     *    - Nhập thêm 1 sản phẩm từ bàn phím và thêm vào danh sách.
     *    - In lại danh sách sau khi thêm.
     *    - Lọc và in sản phẩm loại "thực phẩm chức năng".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cau2_SanPham> danhSach = new ArrayList<>();

        // 1. Hard-code
        danhSach.add(new Cau2_SanPham("SP001", "Sữa tươi", "Đồ uống", 15000));
        danhSach.add(new Cau2_SanPham("SP002", "Vitamin C", "thực phẩm chức năng", 120000));
        danhSach.add(new Cau2_SanPham("SP003", "Bánh mì", "Thực phẩm", 10000));

        // 2. In danh sách ban đầu
        System.out.println("--- DANH SÁCH BAN ĐẦU ---");
        for (Cau2_SanPham sp : danhSach) {
            System.out.println(sp);
        }

        // 3. Nhập thêm
        System.out.println("\n--- NHẬP SẢN PHẨM MỚI ---");

        System.out.print("Mã: ");
        String ma = sc.nextLine();

        System.out.print("Tên: ");
        String ten = sc.nextLine();

        System.out.print("Loại: ");
        String loai = sc.nextLine();

        System.out.print("Giá: ");
        double gia = sc.nextDouble();

        danhSach.add(new Cau2_SanPham(ma, ten, loai, gia));

        // 4. In lại
        System.out.println("\n--- DANH SÁCH SAU KHI THÊM ---");
        for (Cau2_SanPham sp : danhSach) {
            System.out.println(sp);
        }

        // 5. Lọc
        System.out.println("\n--- THỰC PHẨM CHỨC NĂNG ---");
        boolean timThay = false;

        for (Cau2_SanPham sp : danhSach) {
            if (sp.getLoaiSP().equalsIgnoreCase("thực phẩm chức năng")) {
                System.out.println(sp);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không có sản phẩm nào!");
        }

        sc.close();
    }
}