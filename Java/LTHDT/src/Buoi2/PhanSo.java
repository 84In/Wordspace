package Buoi2;

import java.util.Scanner;

public class PhanSo {
	public int tuso, mauso;

	public PhanSo() {
		this.tuso = 0;
		this.mauso = 1;
	}

	public PhanSo(int tu, int mau) {
		this.tuso = tu;
		this.mauso = mau;
	}

	public void nhapPS() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			tuso = sc.nextInt();
			mauso = sc.nextInt();
			if (mauso == 0)
				System.out.println("nhap lai phan so: ");
			else
				break;
		}
	}

	public void inPS() {
		if (this.tuso == 0 || this.mauso == 1)
			System.out.println(this.tuso);
		else
			System.out.println(this.tuso + "/" + this.mauso);
	}

	// ==============================
	private int ucln(int a, int b) {
		if (b == 0)
			return a;
		if (a % b == 0)
			return b;
		return ucln(b, a % b);
	}
	private void chuanhoa() {
		int temp = ucln(tuso, mauso);
		tuso = tuso / temp;
		mauso = mauso / temp;
		if(mauso <= 0) {
			mauso = -mauso;
			tuso = -tuso;
		}
	}

	// ==============================
	public void nghichDao() {
		int temp = tuso;
		tuso = mauso;
		mauso = temp;
	}

	public PhanSo giaTriNghichDao() {
		PhanSo temp = new PhanSo();
		temp.tuso = mauso;
		temp.mauso = tuso;
		return temp;
	}

	public double giaTriPhanSo() {
		return ((double)tuso)/mauso; //(1.0 * tuso) / mauso;
	}

	public boolean lonHon(PhanSo a) {
		if (giaTriPhanSo() > a.giaTriPhanSo())
			return true;
		return false;
	}
	/*
	 * public boolean lonHon(PhanSo a) {
		if(giaTri() > a.giaTri())
			return true;
		return false;
	}
	 */
	public PhanSo cong(PhanSo a) {

		PhanSo c = new PhanSo();
		c.tuso = tuso * a.mauso + a.tuso * mauso;
		c.mauso = mauso * a.mauso;
		c.chuanhoa();
		return c;
	}

	public PhanSo tru(PhanSo a) {
		PhanSo c = new PhanSo();
		c.tuso = tuso * a.mauso - a.tuso * mauso;
		c.mauso = mauso * a.mauso;
		c.chuanhoa();
		return c;
	}

	public PhanSo nhan(PhanSo a) {
		PhanSo c = new PhanSo();
		c.tuso = tuso * a.tuso;
		c.mauso = mauso * a.mauso;
		int temp = ucln(c.tuso, c.mauso);
		c.chuanhoa();
		return c;
	}

	public PhanSo chia(PhanSo a) {

		PhanSo c = new PhanSo();
		c.tuso = tuso * a.mauso;
		c.mauso = mauso * a.tuso;
		int temp = ucln(c.tuso, c.mauso);
		c.tuso = c.tuso / temp;
		c.mauso = c.mauso / temp;
		return c;
	}

	// ============
	public PhanSo cong(int n) {
		PhanSo c = new PhanSo();
		c.tuso = tuso + mauso * n;
		c.mauso = mauso * n;
		c.chuanhoa();
		return c;
	}

	public PhanSo tru(int n) {
		
		PhanSo c = new PhanSo();
		c.tuso = tuso - mauso * n;
		c.mauso = mauso;
		c.chuanhoa();
		return c;
	}

	public PhanSo nhan(int n) {

		PhanSo c = new PhanSo();
		c.tuso = tuso * n;
		c.mauso = mauso;
		c.chuanhoa();
		return c;
	}

	public PhanSo chia(int n) {

		PhanSo c = new PhanSo();
		c.tuso = tuso * 1;
		c.mauso = mauso * n;
		c.chuanhoa();
		return c;
	}
}
