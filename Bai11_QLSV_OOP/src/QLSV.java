import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private List<sinhvien> danhSachSV;

    // Constructor đúng
    public QLSV() {
        danhSachSV = new ArrayList<>();
    }

    public void themsinhvien(sinhvien sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }

    public sinhvien timTheoMa(String ma) {
        for (sinhvien sv : danhSachSV) {
            if (sv.getMaSV().equals(ma)) {
                return sv;
            }
        }
        return null;
    }

    public sinhvien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) return null;

        sinhvien max = danhSachSV.get(0);
        for (sinhvien sv : danhSachSV) {
            if (sv.getDiemTB() > max.getDiemTB()) {
                max = sv;
            }
        }
        return max;
    }

    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) return 0;

        double tong = 0;
        for (sinhvien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return tong / danhSachSV.size();
    }

    public List<sinhvien> locsinhvienTheoDiem(double diem) {
        List<sinhvien> kq = new ArrayList<>();
        for (sinhvien sv : danhSachSV) {
            if (sv.getDiemTB() >= diem) {
                kq.add(sv);
            }
        }
        return kq;
    }

    public void sapXepTheoDiem() {
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    sinhvien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }

    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("\n=== DANH SÁCH ===");
        for (int i = 0; i < danhSachSV.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSV.get(i));
        }
    }

    public boolean xoasinhvien(String ma) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(ma)) {
                System.out.println("Đã xóa: " + danhSachSV.get(i).getHoTen());
                danhSachSV.remove(i);
                return true;
            }
        }
        System.out.println("Không tìm thấy!");
        return false;
    }

    public void hienThiHaisinhvienDauTien() {
        if (danhSachSV.size() >= 2) {
            System.out.println("\n2 sinh viên đầu:");
            danhSachSV.subList(0, 2).forEach(System.out::println);
        }
    }
}