package Buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong loai gach: ");
		n = sc.nextInt();
		Gach List[] = new Gach[n];
		for (int i = 0; i < n; ++i) {
			List[i] = new Gach();
			List[i].nhapGach();
		}
		for (int i = 0; i < n; ++i) {
			System.out.println("========\n" + List[i]);
		}
		float min = 9999999;
		int vt = 0;
		for (int i = 0; i < n; ++i) {
			float temp = List[i].giaBanLe() / List[i].dienTich();
			if (min > temp) {
				min = temp;
				vt = i;
			}
		}
		System.out.println("Gach co chi phi thap nhat la: \n" + List[vt]);
		int chieungang1 = 5 * 100;
		int chieudai1 = 20 * 100;
		for (int i = 0; i < n; ++i) {
			System.out.println("========\n");
			System.out.println("Chi phi lot nen cua loai gach thu " + (i + 1) + " :");
			System.out.println(List[i].soLuongHop(chieudai1, chieungang1) * List[i].getGiaBan());
		}
	}

}
