package buoi1;
import java.util.Scanner;
public class Giaipt {
	public static Scanner sc = new Scanner(System.in);
	public static void ptb1(int a, int b){
		System.out.println("Giap phuong trinh bac 1 ax + b = 0");
		if (a == 0){
			if (b == 0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong tring vo nghiem");
		}else
			System.out.println("Phuong trinh co nghiem la x = " + ((-b)/(a*1.0)));
	}
	public static void ptb2(int a, int b, int c){
		System.out.println("Giai phuong trinh bac 2 ax^2 + bx + c = 0");
		if(a==0) Giaipt.ptb1(b,c);
		else{
			double delta = (b*b-4*a*c);
			if (delta > 0){
				System.out.println("X1 = "+((-b) + Math.sqrt(delta)/(2.0*a)));
				System.out.println("X2 = "+((-b) - Math.sqrt(delta)/(2.0*a)));
			}else
				if(delta==0)
					System.out.println("X = "+((-b)/(2.0*a)));
				else
					System.out.println("Phuong trinh vo nghiem");
		}
	}
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Vui long nhap chon phuong trinh can giai 1/2");
		int n = sc.nextInt();
		if(n==1){
			System.out.println("Nhap a= ");
			a=sc.nextInt();
			System.out.println("Nhap b= ");
			b=sc.nextInt();
			Giaipt.ptb1(a, b);
		}
		else{
			System.out.println("Nhap a= ");
			a=sc.nextInt();
			System.out.println("Nhap b= ");
			b=sc.nextInt();
			System.out.println("Nhap c= ");
			c=sc.nextInt();
			Giaipt.ptb2(a, b, c);
		}
		

	}

}
