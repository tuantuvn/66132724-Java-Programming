import java.util.ArrayList;

public class DonHang {

    String maDH;
    String tenKH;
    ArrayList<String> danhSachSanPham;
    double tongTien;
    String ngayDat;

    public DonHang(String maDH, String tenKH, ArrayList<String> danhSachSanPham, double tongTien, String ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    public void hienThi() {
        System.out.println("Ma DH: " + maDH);
        System.out.println("Ten KH: " + tenKH);
        System.out.println("San pham: " + danhSachSanPham);
        System.out.println("Tong tien: " + tongTien);
        System.out.println("Ngay dat: " + ngayDat);
        System.out.println("----------------------");
    }
}