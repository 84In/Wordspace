package Buoi4;
import java.util.Scanner;

import Buoi2backup.Diem;

public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x, int y, String mau) {
		super(x,y);
		this.mau = new String(mau);
	}
	public DiemMau(DiemMau dm) {
		super((Diem) dm);
		this.mau = new String(dm.mau);
	}
	public void GanMau(String mau) {
		this.mau = mau;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		mau = sc.nextLine();
	}
	public void in() {
		super.hienThi();
		System.out.println(" Mau: "+ mau);
	}
	public String toString() {
		return super.toString() + " Mau: " + mau;
	}
	public void tinhtien(int x, int y) {
		super.tinhtien(x, y);
	}
}
