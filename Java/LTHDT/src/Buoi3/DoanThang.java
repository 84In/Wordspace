package Buoi3;

import java.util.Scanner;

import Buoi2backup.Diem;

public class DoanThang {
    private Diem d1, d2;

    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = new Diem(d1);
        this.d2 = new Diem(d2);
    }

    public DoanThang(int x1, int y1, int x2, int y2) {
        this.d1 = new Diem(x1, y1);
        this.d2 = new Diem(x2, y2);
    }

    public DoanThang(DoanThang dt) {
        this.d1 = new Diem(dt.d1);
        this.d2 = new Diem(dt.d2);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem thu nhat: ");
        d1.nhapDiem();
        System.out.println("Nhap diem thu hai: ");
        d2.nhapDiem();
    }

    public void in() {
        System.out.println("[ " + d1 + ", " + d2 + " ]");
    }

    public String toString() {
        return "[ " + d1 + ", " + d2 + " ]";
    }

    public void tinhtienDT(int dx, int dy) {
        d1.tinhtien(dx, dy);
        d2.tinhtien(dx, dy);
    }

    public float khoangCachDT() {
        return d1.khoangCach(d2);
    }

    public double tinhgoc() {
        double k =((double) (d1.giaiTriY() - d2.giaiTriY()) / (d1.giaTriX() - d2.giaTriX()));
        return Math.toDegrees(Math.atan(k));
      //k = (y-y)/(x-x) tan(alpha)=k
      //todegrees doi radiant sang do
      //atan =shift Tan tren casio
    }
}
