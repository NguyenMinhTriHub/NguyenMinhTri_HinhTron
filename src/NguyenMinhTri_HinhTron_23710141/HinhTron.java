package NguyenMinhTri_HinhTron_23710141;

public class HinhTron {
	public static final double PI=3.1416;
	private double banKinh;
	private ToaDo tam;
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public HinhTron() {}
	public HinhTron(double banKinh, ToaDo tam) {
		this.banKinh = banKinh;
		this.tam = tam;
	}
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	@Override
	public String toString() {
		String s1="";
		s1=s1+s1.format("Ban kinh:%-5s;Dien tich:%-10s;",getBanKinh(),getDienTich());
		return s1;
	}
}
