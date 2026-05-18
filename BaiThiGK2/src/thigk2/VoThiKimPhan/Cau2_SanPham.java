package thigk2.VoThiKimPhan;

public class Cau2_SanPham {
    private String maSP;
    private String tenSP;
    private String loaiSP;
    private double giaBan;

    // Constructor
    public Cau2_SanPham(String maSP, String tenSP, String loaiSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.giaBan = giaBan;
    }

    // Getter / Setter
    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }

    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

    public String getLoaiSP() { return loaiSP; }
    public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

    public double getGiaBan() { return giaBan; }
    public void setGiaBan(double giaBan) { this.giaBan = giaBan; }

    // toString
    @Override
    public String toString() {
        return String.format("Mã: %-10s | Tên: %-20s | Loại: %-20s | Giá: %,.0f VNĐ",
                maSP, tenSP, loaiSP, giaBan);
    }
}