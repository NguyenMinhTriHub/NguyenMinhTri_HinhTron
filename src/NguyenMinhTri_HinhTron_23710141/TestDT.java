package NguyenMinhTri_HinhTron_23710141;

public class TestDT {
	public static void main(String[]args) {
		ToaDo t1=new ToaDo("A",3,7);
		HinhTron h1=new HinhTron(20,t1);
		System.out.println("Hinh tron tam:"+t1.toString()+h1);
	}
}
