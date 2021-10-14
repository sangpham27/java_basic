package entities;

public class DienThoai {

	private String madt;
	private String ten;
	private double gia;
	private int soluong;

	public String getMadt() {
		return madt;
	}

	public void setMadt(String madt) {
		this.madt = madt;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	// constructor
	
	public DienThoai() {
		System.out.println("Constructor khong tham so!");
	}
	
	public DienThoai(String madt) {
		System.out.println("Constructor 1 tham so la ma dien thoai: " + madt + " !");
	}
	
	public DienThoai(String madt, String tendt) {
		System.out.println("Constructor 2 tham so");
	}
	
	public DienThoai(double gia) {
		System.out.println("Constructor 1 tham so la gia!");
	}
	
	
}
