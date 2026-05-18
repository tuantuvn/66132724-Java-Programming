package baitap_oop_HOCSINH;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // cau 2a
        HocSinh h1 = new HocSinh("Vo Thi Kim Phan", "66CNTT3", (short) 20);
        HocSinh h2 = new HocSinh("Nguyen Van B", "66CNTT2", (short) 36);

        Scanner sc = new Scanner(System.in);

        // cau 3a
        System.out.print("Nhap so hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine(); // fix loi

        ArrayList<HocSinh> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hoc sinh thu " + (i + 1));

            System.out.print("Ten: ");
            String ten = sc.nextLine();

            System.out.print("Lop: ");
            String lop = sc.nextLine();

            System.out.print("Tuoi: ");
            short tuoi = sc.nextShort();
            sc.nextLine(); // fix loi

            HocSinh hs = new HocSinh(ten, lop, tuoi); // tạo mới mỗi lần
            ds.add(hs);
        }

        // cau 3b
        System.out.println("\nDanh sach hoc sinh:");
        for (HocSinh a : ds) {
            System.out.println(a);
        }

        // cau 4a (them 1 hoc sinh)
        System.out.println("\nNhap them 1 hoc sinh:");

        System.out.print("Ten: ");
        String ten = sc.nextLine();

        System.out.print("Lop: ");
        String lop = sc.nextLine();

        System.out.print("Tuoi: ");
        short tuoi = sc.nextShort();
        sc.nextLine();

        HocSinh hsMoi = new HocSinh(ten, lop, tuoi);
        ds.add(hsMoi);

        // cau 4b
        System.out.println("\nDanh sach sau khi them:");
        for (HocSinh a : ds) {
            System.out.println(a);
        }

        // cau 5a (xoa hoc sinh ten Hoa)
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getTenHS().equals("Hoa")) {
                ds.remove(i);
                break;
            }
        }

        // cau 5b
        System.out.println("\nDanh sach sau khi xoa ten Hoa:");
        for (HocSinh a : ds) {
            System.out.println(a);
        }

        sc.close();
    }
}