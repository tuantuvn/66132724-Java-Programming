import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN ===\n"); 
        
        QLSV qlsv = new QLSV();

        qlsv.themsinhvien(new sinhvien("SV001", "Nguyễn Văn A", 8.5));
        qlsv.themsinhvien(new sinhvien("SV002", "Trần Thị B", 7.2));
        qlsv.themsinhvien(new sinhvien("SV003", "Lê Văn C", 6.8));
        qlsv.themsinhvien(new sinhvien("SV004", "Phạm Thị D", 9.1));
        qlsv.themsinhvien(new sinhvien("SV005", "Hoàng Văn E", 5.5));

        // Hiển thị danh sách
        qlsv.hienThiDanhSach();

        // Tìm sinh viên
        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        sinhvien sv = qlsv.timTheoMa("SV003");
        System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));

        // Tìm điểm cao nhất
        System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        sinhvien svMax = qlsv.timDiemCaoNhat();
        System.out.println(svMax != null ? svMax : "Không có sinh viên");

        // Điểm trung bình
        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        System.out.println("TB lớp: " + qlsv.tinhDiemTrungBinhLop());

        // Lọc
        System.out.println("\n=== SINH VIÊN >= 8.0 ===");
        List<sinhvien> ds = qlsv.locsinhvienTheoDiem(8.0);
        if (!ds.isEmpty()) {
            ds.forEach(System.out::println);
        } else {
            System.out.println("Không có");
        }

        // Sắp xếp
        System.out.println("\n=== SAU KHI SẮP XẾP ===");
        qlsv.sapXepTheoDiem();
        qlsv.hienThiDanhSach();

        // Xóa
        System.out.println("\n=== XÓA SV002 ===");
        qlsv.xoasinhvien("SV002");
        qlsv.hienThiDanhSach();

        // 2 SV đầu
        qlsv.hienThiHaisinhvienDauTien();
    }
}