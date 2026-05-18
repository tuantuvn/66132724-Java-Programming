
public class Main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("123", "Nguyễn Thành Nguyên", 360000);
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("321", "OKOKOK", 2300000, 3, 200000);
		nvVanPhong1.hienThiThongTin();
	}
}
