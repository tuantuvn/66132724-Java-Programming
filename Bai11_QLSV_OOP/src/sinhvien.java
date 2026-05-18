public class sinhvien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public sinhvien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }

    @Override
    public String toString() {
        return maSV + " - " + hoTen + " - " + diemTB;
    }
}