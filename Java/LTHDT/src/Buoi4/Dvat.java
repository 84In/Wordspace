package Buoi4;

import java.util.Scanner;

public abstract class Dvat {
	private String giong;
	private String maulong;
	private float cannang;
	public abstract void keu();
	public Dvat() {
		giong =  new String();
		maulong =  new String();
		cannang = (float) 0.0;
	}
	public Dvat(Dvat dv) {
		giong = new String(dv.giong);
		maulong = new String(dv.maulong);
		cannang = dv.cannang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau long: ");
		maulong = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cannang = sc.nextFloat();
	}
	public void in() {
		System.out.println("Giong: "+giong);
		System.out.println("Mau long: "+maulong);
		System.out.println("Can nang: "+cannang);
		keu();
	}
}
