package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;
public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien S = new SinhVienCNTT();
		S.nhap();
		S.nhapHP();
		System.out.println("Thong tin SV s: "+ S);
		System.out.println("So luong sinh vien can nhap: ");
		int n = sc.nextInt();
		SinhVien[] ds = new SinhVien[n];
		int c = 0;
		for (int i = 0; i < ds.length; i++) {
			System.out.println("Nhap sinh vien thu "+(i+1)+" :");
			System.out.println("Ban chon SV(1) hay SVCNTT(2): ");
			c = sc.nextInt();
			if (c == 1) ds[i] = new SinhVien();
			else		ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		sc.nextLine();
		System.out.println("Nhap dia chi email can tim: ");
		String Email = new String();
		Email = sc.nextLine();
		for (int i = 0; i < ds.length; ++i) {
			if (ds[i].getEmail().compareTo(Email) == 0) {
				System.out.println(ds[i]);
				System.out.println("==============");
			}
		}
	}
}
