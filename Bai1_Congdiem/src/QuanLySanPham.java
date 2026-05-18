
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySanPham {

    private ArrayList<SanPham> danhSach = new ArrayList<>();
    public void themSanPham(SanPham sp) {
        danhSach.add(sp);
    }
    public void xoaSanPham(String ma) {
        danhSach.removeIf(sp -> sp.getMaSP().equals(ma));
    }
    public void timTheoTen(String ten) {
        for (SanPham sp : danhSach) {
            if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
                sp.hienThi();
            }
        }
    }
    public void sapXepTang() {
        Collections.sort(danhSach, Comparator.comparingDouble(SanPham::getGia));
    }
    public void sapXepGiam() {
        Collections.sort(danhSach, Comparator.comparingDouble(SanPham::getGia).reversed());
    }
    public double tongGiaTriKho() {
        double tong = 0;
        for (SanPham sp : danhSach) {
            tong += sp.tongGiaTri();
        }
        return tong;
    }
    public void sapHetHang() {
        for (SanPham sp : danhSach) {
            if (sp.getSoLuong() < 10) {
                sp.hienThi();
            }
        }
    }
    public void hienThiTatCa() {
        for (SanPham sp : danhSach) {
            sp.hienThi();
        }
    }
}