package buoi1;
import java.util.Scanner;
public class Nguyento {
	public static Scanner sc = new Scanner(System.in);
	public boolean isPrime(int n){
		if (n<=1) return false;
		for(int i = 2; i<Math.sqrt(n); i++){
			if (n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Xin moi nhap so n= ");
		int n = sc.nextInt();
		Nguyento t = new Nguyento();
		if (t.isPrime(n))
			System.out.println("n là số nguyên tố");
		else
			System.out.println("n không là số nguyên tố");
		System.out.println(Integer.toBinaryString(n));
	}

}
