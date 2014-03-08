import java.util.Arrays;
import java.util.Scanner;


public class CoinTopDown {
	
	
	public static int max(int[] row, int i, int[] dp)
	{
		if(i<0)
			return 0;
		
		if(dp[i] > -1)
			return dp[i];
		else
			return dp[i]=Math.max(row[i]+max(row, i-2, dp), max(row, i-1, dp));
		
			
				
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		int coins[] = new int[n];
		for(int i=0; i<n; i++)
			coins[i] = read.nextInt();
		
		System.out.println(max(coins, n-1, dp));
		
		
	}

}
