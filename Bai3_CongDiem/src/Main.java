import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		QuanLiDonHang ql = new QuanLiDonHang();
		ArrayList<String> sp1 = new ArrayList<String>();
		sp1.add("Laptop");
	    sp1.add("Chuot");
	    ArrayList<String> sp2 = new ArrayList<String>();
	    sp2.add("Ban phim");
	    ArrayList<String> sp3 = new ArrayList<String>();
	    sp3.add("Man hinh");
	    DonHang d1 = new DonHang("DH01", "Nam", sp1, 2000, "10/3");
	    DonHang d2 = new DonHang("DH02", "Lan", sp2, 500, "11/3");
	    DonHang d3 = new DonHang("DH03", "Nam", sp3, 1500, "9/3");
	    ql.themDonHang(d1);
	    ql.themDonHang(d2);
	    ql.themDonHang(d3);
	    System.out.println("Danh sach don hang:");
	    ql.hienThiDanhSach();
	    ql.donHangCaoNhat();
	    ql.tongDoanhThu();
	    ql.thongKeKhachHang();
	}
}