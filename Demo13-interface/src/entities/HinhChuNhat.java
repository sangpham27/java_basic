package entities;

public class HinhChuNhat extends HinhHoc implements IHinhHoc {
	private double dai;
	private double rong;
	
	public double getDai() {
		return dai;
	}
	
	public void setDai(double dai) {
		this.dai = dai;
	}
	
	public double getRong() {
		return rong;
	}
	
	public void setRong(double rong) {
		this.rong = rong;
	}
	
	public HinhChuNhat(String tenhinh, double dai, double rong) {
		super(tenhinh);
		this.dai = dai;
		this.rong = rong;
	}
	
	public HinhChuNhat() {
		super();
	}

	@Override
	public double dienTich() {
		return this.dai*this.rong;
	}

	@Override
	public double chuVi() {
		return (this.dai+this.rong)*2;
	}

	@Override
	public void print() {
		System.out.println("Ten hinh chu nhat: " + this.getTenhinh());
		
	}
	
	
	
}
