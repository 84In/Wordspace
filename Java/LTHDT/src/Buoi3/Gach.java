package Buoi3;

import java.util.Scanner;

public class Gach {
    private String maso;
    private String mau;
    private int soluong, chieudai, chieungang;
    private long giaban;

    public Gach() {
        maso = new String();
        mau = new String();
        soluong = 0;
        chieudai = 0;
        chieungang = 0;
        giaban = 0;
    }

    public Gach(String maso1, String mau1, int soluong1, int chieudai1, int chieungang1, long giaban1) {
        maso = new String(maso1);
        mau = new String(mau1);
        soluong = soluong1;
        chieudai = chieudai1;
        chieungang = chieungang1;
        giaban = giaban1;
    }

    public Gach(Gach aGach) {
        this.maso = new String(aGach.maso);
        this.mau = new String(aGach.mau);
        this.soluong = aGach.soluong;
        this.chieudai = aGach.chieudai;
        this.chieungang = aGach.chieungang;
        this.giaban = aGach.giaban;
    }

    public void nhapGach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so:");
        this.maso = sc.nextLine();
        System.out.println("Nhap mau:");
        this.mau = sc.nextLine();
        System.out.println("Nhap so luong:");
        this.soluong = sc.nextInt();
        System.out.println("Nhap chieu dai vien gach:");
        this.chieudai = sc.nextInt();
        System.out.println("Nhap chieu ngang vien gach:");
        this.chieungang = sc.nextInt();
        System.out.println("Nhap gia ban cua mot hop gach:");
        this.giaban = sc.nextLong();
    }

    public void inGach() {
        System.out.println("MaSo: " + maso + "\nMau: " + mau + "\nSo Luong vien trong 1 hop: " + soluong
                + "\nChieu dai vien gach: " + chieudai + "cm\nChieu ngang vien gach: " + chieungang
                + "cm\nGia ban 1 hop: " + giaban);
    }

    public String toString() {
        return "MaSo: " + maso + "\nMau: " + mau + "\nSo Luong vien trong 1 hop: " + soluong + "\nChieu dai vien gach: "
                + chieudai + "cm\nChieu ngang vien gach: " + chieungang + "cm\nGia ban 1 hop: " + giaban;
    }

    public float giaBanLe() {
        float temp = (giaban / soluong);
        temp = temp + (temp * 20 / 100);
        return temp;
    }

    public int dienTich() {
        return chieudai * chieungang;
    }

    public int soLuongHop(int D, int N) {
        long tempdai = D / chieudai;
        if (D % chieudai != 0)
            tempdai++;
        long tempngang = N / chieungang;
        if (N % chieungang != 0)
            tempngang++;
        return ((int) (tempdai * tempngang) / soluong);
    }

    public long getGiaBan() {
        return giaban;
    }
}
