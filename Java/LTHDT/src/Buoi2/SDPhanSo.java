package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//	 PhanSo a = new PhanSo(3,7);
//	 PhanSo b = new PhanSo(4,9);
	 PhanSo temp = new PhanSo();
//	 System.out.println("Phan so a la:");
//	 a.inPS();
//	 System.out.println("Phan so b la:");
//	 b.inPS();
	 PhanSo x = new PhanSo();
	 PhanSo y = new PhanSo();
	 System.out.println("Nhap phan so x:");
	 x.nhapPS();
	 System.out.println("Nhap phan so y:");
	 y.nhapPS();
	 temp = x.giaTriNghichDao();
	 temp.inPS();
	 temp = x.cong(y);
	 System.out.println("tong");
	 temp.inPS();
	 System.out.println("hieu");
	 temp = x.tru(y);
	 temp.inPS();
	 System.out.println("Nhap vao n=");
	 int n = scanner.nextInt();
	 PhanSo A[] = new PhanSo[n];
	 PhanSo tong = new PhanSo(0, 1);
	 for (int i = 0; i < A.length; i++) {
		 //cap phat tung phan tu;
		 A[i] = new PhanSo();
	 }
	 for (int i = 0; i < A.length; i++) {
		 A[i].nhapPS();
		 
	 }
	 PhanSo maxPS = new PhanSo();
	 for (int i = 0; i < n; i++) {
		 tong = tong.cong(A[i]);
		 if(A[i].lonHon(maxPS)) maxPS = A[i];
	 }
	 System.out.println("tong la");
	 tong.inPS();
	 System.out.println("so lon nhat");
	 maxPS.inPS();
	 System.out.println("Phan so lon nhat la: "); maxPS.inPS();
	 for(int i = 0; i < A.length - 1; i++) {
		 for (int j = i+1; j < A.length; j++) {
			 if(A[i].lonHon(A[j])) {
				 temp = A[i];
				 A[i] = A[j];
				 A[j] = temp;
			 }
		 }
	 }
	 for (int i = 0; i < A.length; i++) {
		 A[i].inPS();
	 }
	 
	}
}
