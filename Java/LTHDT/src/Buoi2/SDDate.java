package Buoi2;
import Buoi2backup.Date;
public class SDDate {

	public static void main(String[] args) {
		Date lich = new Date();
		Date temp = new Date();
		lich.nhap();
		lich.in();
		temp = lich.ngayHomSau();
		temp.in();
		temp = lich.congNgay(3);
		temp.in();
		lich.in();
	}

}
