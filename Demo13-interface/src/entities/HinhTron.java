package entities;

public class HinhTron extends HinhHoc implements IHinhHoc {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public HinhTron(String tenhinh, double r) {
		super(tenhinh);
		this.r = r;
	}

	public HinhTron() {
		super();
	}

	@Override
	public double dienTich() {
		return Math.PI*this.r*this.r;
	}

	@Override
	public double chuVi() {
		return this.r*2*Math.PI;
	}

	@Override
	public void print() {
		System.out.println("Ten hinh tron: " + this.getTenhinh());
	}
	
	
	
	
	
}
