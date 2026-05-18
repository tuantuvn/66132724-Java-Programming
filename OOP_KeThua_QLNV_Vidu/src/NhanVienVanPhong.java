
public class NhanVienVanPhong extends NhanVien{
	private double soGioLamThem;
	private double luongThemMoiGio;
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() + soGioLamThem*luongThemMoiGio;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm thêm : " + soGioLamThem);
        System.out.println("Lương cho mỗi giờ làm thêm : " + luongThemMoiGio);
        System.out.println("Lương được nhận: " + tinhLuong());
	}
	@Override
	public String toString() {
		String chuoiXuat=super.toString();
		chuoiXuat = chuoiXuat + "\nSố giờ làm thêm : " + soGioLamThem;
		chuoiXuat = chuoiXuat + "\nLương cho mỗi giờ làm thêm : " + luongThemMoiGio;
		chuoiXuat = chuoiXuat + "\nLương được nhận: " + tinhLuong();
		return chuoiXuat;
	}
}
