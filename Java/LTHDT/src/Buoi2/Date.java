package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 0;
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void in() {
		System.out.println(this.ngay + "/" + this.thang + "/" + nam);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			this.ngay = sc.nextInt();
			this.thang = sc.nextInt();
			this.nam = sc.nextInt();
		} while(!hopLe());
	}
	public boolean tinhNamNhuan(int nam) {
		return ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0);
	}
	private int tinhngaytrongthang(int thang, int nam) {
		int songay = 0;

		switch (thang)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			songay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			songay = 30;
			break;
		case 2:
			if (tinhNamNhuan(nam))
			{
				songay = 29;
			}
			else
			{
				songay = 28;
			}
			break;
		}

		return songay;
	}
	public boolean hopLe() {
		if (nam < 0)
		{
			return false; // Ngày không còn hợp lệ nữa!
		}

		// Kiểm tra tháng
		if (thang < 1 || thang > 12)
		{
			return false; // Ngày không còn hợp lệ nữa!
		}

		// Kiểm tra ngày
		if (ngay < 1 || ngay > tinhngaytrongthang(thang , nam))
		{
			return false;
			
		}

		return true; // Trả về trạng thái cuối cùng...
	}
	public Date ngayHomSau() {
		this.ngay += 1;
		if (this.ngay > tinhngaytrongthang(this.thang, this.nam)) {
			this.ngay = 1;
			this.thang++;
			if(this.thang > 12) {
				this.thang = 1;
				this.nam++;
			}
		}
		Date date = new Date(ngay,thang,nam);
		return date;
	}
	public Date congNgay(int n) {
		
		for (int i = 0; i<n; i++) {
			ngay += 1;
			if (this.ngay > tinhngaytrongthang(this.thang, this.nam)) {
				ngay = 1;
				thang++;
				if(this.thang > 12) {
					thang = 1;
					nam++;
				}
			}
		}
		Date date = new Date(ngay, thang, nam);
		return date;
	}
}
