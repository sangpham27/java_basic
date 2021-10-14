package entities;

public class HinhVuong extends HinhHoc implements IHinhHoc{
	private double a;
	
	public HinhVuong() {
		super();
	}

	public HinhVuong(String tenhinh, double a) {
		super(tenhinh);
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double dienTich() {
		return this.a*this.a;
	}

	@Override
	public double chuVi() {
		return this.a*4;
	}

	@Override
	public void print() {
		System.out.println("Ten hinh vuong: " + this.getTenhinh());
		
	}
	
	
	
}
