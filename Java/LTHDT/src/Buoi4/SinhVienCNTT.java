package Buoi4;
import java.util.Scanner;

import Buoi2backup.Date;
import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan;
	private String matkhau;
	private String email;
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(String maso, String name, Date birthday, String tkhoan, String mkhau, String gemail) {
		super(maso, name, birthday);
		taikhoan = new String(tkhoan);
		matkhau = new String(mkhau);
		email = new String(gemail);
	}
	public SinhVienCNTT(SinhVienCNTT s) {
		super((SinhVien) s);
		taikhoan = new String(s.taikhoan);
		matkhau = new String(s.matkhau);
		email = new String(s.email);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Tai khoan:");
		taikhoan = sc.nextLine();
		System.out.println("Mat khau:");
		matkhau = sc.nextLine();
		System.out.println("Email:");
		email = sc.nextLine();
	}
	public void nhapHP() {
		super.nhapHP();
	}
	public void in() {
		super.in();
		System.out.println("Tai khoan: "+ taikhoan + " Email: " + email);
	}
	public String toString() {
		return super.toString() + "\nTai khoan: " + taikhoan + " Email: " + email;
	}
	public void doiMatKhau(String newpass) {
		matkhau = new String(newpass);
	}
	public String getEmail() {
		return email;
	}
}
