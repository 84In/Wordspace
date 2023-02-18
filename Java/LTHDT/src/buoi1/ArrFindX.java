package buoi1;
import java.util.Scanner;
public class ArrFindX {
	public static Scanner sc = new Scanner(System.in);
	public int count_x(int x, int[] a){
		int cnt = 0;
		for (int i = 0; i<a.length; i++){
			if (a[i] == x) cnt+=1;
		}
		return cnt;
	}
	public void sort(int[] a){
		for(int i = 0; i < (a.length - 1); i++){
			for (int j = i+1; j<a.length; j++){
				if (a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhap so phan tu cua mang A");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap cac phan tu cua mang A");
		for(int i = 0; i<n; i++){
			System.out.println("So thu "+ i+" = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Nhap x = ");
		int x = sc.nextInt();
		ArrFindX t = new ArrFindX();
		int cnt = t.count_x(x, a);
		System.out.println("So phan tu = X la: " + cnt);
		t.sort(a);
		for(int i = 0; i<a.length; i++){
			System.out.println("So thu "+ i+" = " + a[i]);
		}
	}

}
