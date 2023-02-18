package Buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		a.nhap();
		a.themHP("LTHDT", "");
		System.out.println("Thong tin sinh vien a\n " + a);
		System.out.println("Diem trung binh: "+ a.diemTB());
		System.out.println("Nhap so luong sinh vien:");
		int n = sc.nextInt();
		SinhVien list[] = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			list[i] = new SinhVien();
			list[i].nhap();
			list[i].nhapHP();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}
		float maxDTB = (float) 0.0;
		System.out.println("===========================");
		System.out.println("Danh sach sinh vien bi canh cao hoc vu:");
		for (int i = 0; i < n; i++) {
			if (list[i].diemTB()<= 1.0 || list[i].getsoluongHP() == 0) {
				System.out.println(list[i]);
			}
			if (list[i].diemTB() > maxDTB) maxDTB = list[i].diemTB();
		}
		System.out.println("====Het danh sach======");
		System.out.println("Sinh vien co diem tb cao nhat la: ");
		for (int i = 0; i < n; i++) {
			if (list[i].diemTB() == maxDTB) {
				System.out.println(list[i]);
			}
		}
		for (int i = 0; i < n - 1; i++) {
			String temp1 = new String(list[i].getHoTen());
			for (int j = i + 1; j < n; j++) {
				String temp2 = new String(list[j].getHoTen());
				if(temp1.compareTo(temp2) > 0) {
					SinhVien temp = new SinhVien(list[i]);
					list[i] = new SinhVien(list[j]);
					list[j] = new SinhVien(temp);
				}
			}
		}
		System.out.println("====Danh sach sao khi da sort================\n");
		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}
	}

}
