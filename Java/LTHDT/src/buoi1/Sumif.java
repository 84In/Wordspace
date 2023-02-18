package buoi1;

import java.util.Scanner;

public class Sumif {
	public static Scanner sc = new Scanner(System.in);
	public int nhap(){
		String s = sc.nextLine();
		int n = 0;
		boolean k = true;
		do{
			try{
				n = Integer.parseInt(s);
				k =false;
			}
			catch(Exception e){
				System.out.println("Vui long nhap lai");
				k = true;
			}
		}while(k);
		return n;
	}
	public static void main(String[] args) {
		Sumif t = new Sumif();
		System.out.println("Nhap a=");
		int a = t.nhap();
		System.out.println("Nhap b=");
		int b = t.nhap();
		System.out.println("Tong "+a+" + "+b+" = "+(a+b));

	}

}
