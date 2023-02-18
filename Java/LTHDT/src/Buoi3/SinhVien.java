package Buoi3;
import java.util.Scanner;
import buoi1.Tachname;
import Buoi2backup.Date;
public class SinhVien {
	private String mssv;
	private String hoten;
	private Date ngsinh;
	private int soluonghp;
	private String tenhp[];
	private String diem[];
	public SinhVien() {
		mssv = new String();
		hoten = new String();
		ngsinh  = new Date();
		soluonghp = 0;
		tenhp = new String[100];
		diem = new String[100];
	}
	public SinhVien(String massv, String hten, Date ngaysinh) {
		mssv = new String(massv);
		hoten = new String(hten);
		ngsinh  = new Date(ngaysinh);
	}
	public SinhVien(SinhVien sv) {
		mssv = new String(sv.mssv);
		hoten = new String(sv.hoten);
		ngsinh  = new Date(sv.ngsinh);
		soluonghp = sv.soluonghp;
		for (int i = 0; i < soluonghp; i++) {
			tenhp[i] = new String(sv.tenhp[i]);
			diem[i] = new String(sv.diem[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien:");
		mssv = sc.nextLine();
		System.out.println("Nhap ho ten sinh vien:");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngsinh.nhap();
	}
	public void nhapHP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoc phan:");
		soluonghp = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soluonghp; i++) {
			System.out.println("Nhap mon thu "+(i+1)+" :");
			tenhp[i] = sc.nextLine();
			System.out.println("Nhap diem mon thu "+(i+1)+" :");
			diem[i] = sc.nextLine();
		}
	}
	public void in() {
		System.out.println("Ma so sinh vien: " + mssv);
		System.out.println("Ho ten: " + hoten);
		System.out.println("Ngay sinh: ");
		ngsinh.in();
		for (int i = 0; i < soluonghp; ++i) {
			System.out.println("Mon thu "+(i+1)+": "+tenhp[i]);
			System.out.println("Diem mon thu "+(i+1)+": "+diem[i]);
		}
	}
	public String toString() {
		String temp = new String();
		temp += "==============\nMa so sinh vien: "+ mssv+"\nHo ten sinh vien: "+hoten+"\n";
		temp += "Ngay sinh: "+ ngsinh+"\nSo luong mon hp: "+soluonghp;
		for (int i = 0; i < soluonghp; i++) {
			temp += "\nTen mon thu "+(i+1)+" : "+tenhp[i]+"\nDiem mon thu "+(i+1)+" : "+diem[i];
		}
		return temp;
	}
	public float diemTB() {
		float tb = 0;
		for (int i = 0; i < soluonghp; i++) {
			if (diem[i].compareTo("A")==0)
				tb += (float) 4.0;
			else
				if (diem[i].compareTo("B+")==0)
					tb += (float) 3.5;
				else
					if (diem[i].compareTo("B")==0)
						tb += (float) 3.0;
					else
						if (diem[i].compareTo("C+")==0)
							tb += (float) 2.5;
						else
							if (diem[i].compareTo("C")==0)
								tb += (float) 2.0;
							else
								if (diem[i].compareTo("D+")==0)
									tb += (float) 1.5;
								else
									if (diem[i].compareTo("D")==0)
										tb += (float) 1.0;
									else 
										tb += (float) 0.0;
		}
		return tb/soluonghp;
	}
	public void themHP(String hp, String diem1) {
		if (soluonghp < tenhp.length - 1) {
			soluonghp++;
			tenhp[soluonghp-1] = new String(hp);
			diem[soluonghp-1] = new String(diem1);
		}
		else
			System.out.println("So luong hoc phan da day!! Khong the dang ky them!!");
	}
	public void xoaHP(String hp) {
		int i;
		for(i = 0; i <= soluonghp; i++)
			if(tenhp[i].compareTo(hp) == 0) break;
		if (i < soluonghp) {
			for (int j = i; j < soluonghp; j++) {
				tenhp[j] = new String(tenhp[j+1]);
				diem[j] = new String(diem[j+1]);
			}
			soluonghp--;
		}
		else
			System.out.println("Khong ton tai hoc phan: "+hp);
	}
	public String getHoTen() {
		Tachname t = new Tachname();
		return t.tachten(hoten);
	}
	public int getsoluongHP() {
		return soluonghp;
	}
	public String getEmail() {
		return "";
	}
}
