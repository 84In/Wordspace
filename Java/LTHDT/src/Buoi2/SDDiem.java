package Buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem();
		C.doiDiem((-1)*B.giaTriX(), (-1)*B.giaiTriY());
		C.hienThi();
		System.out.println(B.khoangCach());
		System.out.println(A.khoangCach(B));
	}

}
