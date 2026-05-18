public class Main {
    public static void main(String[] args) {

        QuanLySanPham ql = new QuanLySanPham();

        ql.themSanPham(new SanPham("SP01", "Laptop", 20000, 5));
        ql.themSanPham(new SanPham("SP02", "Chuột", 200, 50));
        ql.themSanPham(new SanPham("SP03", "Bàn phím", 500, 8));

        System.out.println("Danh sach san pham:");
        ql.hienThiTatCa();

        System.out.println("\nTim san pham 'lap':");
        ql.timTheoTen("lap");

        System.out.println("\nSan pham sap het hang:");
        ql.sapHetHang();

        System.out.println("\nTong gia tri kho:");
        System.out.println(ql.tongGiaTriKho());

        System.out.println("\nSap xep gia tang:");
        ql.sapXepTang();
        ql.hienThiTatCa();
    }
}