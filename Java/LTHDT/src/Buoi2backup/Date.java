package Buoi2backup;

import java.util.Scanner;

public class Date {
	private int day, month, year;
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1;
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date temp) {
		day = temp.day;
		month = temp.month;
		year = temp.year;
	}
	public void in() {
		System.out.println(this.day + "/" + this.month + "/" + year);
	}
	public String toString() {
		return this.day + "/" + this.month + "/" + year;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay");
			this.day = sc.nextInt();
			System.out.println("Nhap thang");
			this.month = sc.nextInt();
			System.out.println("Nhap nam");
			this.year = sc.nextInt();
		} while(!hopLe());
	}
	public boolean hopLe() {
		int[] check = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((year % 400 == 0)||((year % 100 != 0)&&(year % 4 ==0 ))) check[2] = 29;
		if((year < 1) || ((month < 1)||(month > 12)) || ((check[month] < day) || (1 > day)) )
			return false;
		return true;
	}
	public Date ngayHomSau() {
		Date date = new Date(day,month,year);
		date.day += 1;
		if (!date.hopLe()) {
			date.day = 1;
			date.month++;
			if(!date.hopLe()) {
				date.month = 1;
				date.year++;
			}
		}
		return date;
	}
	public Date congNgay(int n) {
		Date date = new Date(day,month,year);
		for (int i = 0; i<n; i++) {
			date.day += 1;
			if (!date.hopLe()) {
				date.day = 1;
				date.month++;
				if(!date.hopLe()) {
					date.month = 1;
					date.year++;
				}
			}
		}
		return date;
	}
}
