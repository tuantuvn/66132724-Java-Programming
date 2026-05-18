import java.util.ArrayList;

public class QuanLiDonHang {
    ArrayList<DonHang> danhSach = new ArrayList<DonHang>();
    public void themDonHang(DonHang dh) {
        danhSach.add(dh);
    }
    public void hienThiDanhSach() {
        for (int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).hienThi();
        }
    }
    public void donHangCaoNhat() {
        DonHang max = danhSach.get(0);
        for (int i = 1; i < danhSach.size(); i++) {
            if (danhSach.get(i).tongTien > max.tongTien) {
                max = danhSach.get(i);
            }
        }
        System.out.println("Don hang co gia tri cao nhat:");
        max.hienThi();
    }
    public void tongDoanhThu() {
        double tong = 0;
        for (int i = 0; i < danhSach.size(); i++) {
            tong += danhSach.get(i).tongTien;
        }
        System.out.println("Tong doanh thu: " + tong);
    }
    public void thongKeKhachHang() {
        for (int i = 0; i < danhSach.size(); i++) {
            String ten = danhSach.get(i).tenKH;
            int dem = 0;

            for (int j = 0; j < danhSach.size(); j++) {
                if (danhSach.get(j).tenKH.equals(ten)) {
                    dem++;
                }
            }
            System.out.println(ten + " co " + dem + " don hang");
        }
    }
}