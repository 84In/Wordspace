package Buoi4;

import java.util.Scanner;

public class SDDiemMau {
	public static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10,"Trang");
		A.in();
		DiemMau B = new DiemMau();
		B.nhap();
		B.tinhtien(10, 8);
		B.in();
		B.GanMau("Vang");
		B.in();
	}

}
