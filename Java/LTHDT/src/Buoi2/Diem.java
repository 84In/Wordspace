package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;

	public Diem() {
		this.x = 0;
		this.y = 0;
	}

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		this.x = sc.nextInt();
		this.y = sc.nextInt();
	}

	public void hienThi() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}

	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int giaTriX() {
		return this.x;
	}

	public int giaiTriY() {
		return this.y;
	}

	public float khoangCach() {
		return (float) Math.sqrt((this.x * this.x) + (this.y * this.y));
	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt((this.x - d.x) * (this.x - d.x) + (this.y - d.y) * (this.y - d.y));
	}
}
