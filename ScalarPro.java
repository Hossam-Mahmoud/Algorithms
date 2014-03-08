import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class ScalarPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int count = 1;
		while(cases -- > 0 ){
			int n = sc.nextInt();
			int[] xs = new int [n];
			int[] ys = new int [n];
			for(int i=0; i<n; i++){
				xs[i]= sc.nextInt();
			}
			Arrays.sort(xs);
			for(int i=0;i<n; i++){
				ys[i] = sc.nextInt();
			}
			Arrays.sort(ys);
			BigInteger res = new BigInteger("0");
			long temp;
			for(int i=0; i<n; i++){
				temp = xs[i];
				temp *= ys[n-i-1];
				res =res.add(new BigInteger(""+temp));
			}
			
			System.out.println("Case #"+ (count++) +": "+res);
			
		}
	}

}
