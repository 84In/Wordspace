package buoi1;
import java.util.Scanner;
public class Tachname {
	public static Scanner sc = new Scanner(System.in);
	public String tachten(String hoten){
		hoten = hoten.trim();
		int p = hoten.lastIndexOf(" ");
		return hoten.substring( p + 1);
	}
	public static void main(String[] args) {
		System.out.println("Xin moi ban nhap ho va ten: ");
		String hoten = sc.nextLine();
		Tachname t = new Tachname();
		String ten = t.tachten(hoten);
		System.out.println("Ban ten la: ");
		System.out.println(ten);
	}

}
