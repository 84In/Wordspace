package buoi1;

public class MaxandSum {

	public static void main(String[] args) {
		Double n = 0.0, sum = 0.0, max = Double.MIN_VALUE;
		for(String s: args){
			try{
				n = Double.parseDouble(s);
			}
			catch(Exception e){
				n = 0.0;
			}
			sum += n;
			if (max<n) max=n;
		}
		System.out.println("Max = " + max);
		System.out.println("Tong = " + sum);

	}

}
