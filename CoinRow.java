import java.util.Scanner;


public class CoinRow {
	
	public static int max(int[] row , int n){
		int dp[] = new int[n+1];
		dp[0] = 0; dp[1]= row[1];
		for(int i=2; i<=n; i++)
			dp[i] = Math.max(row[i]+dp[i-2], dp[i-1]);
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int coins[] = new int[n+1];
		for(int i=1; i<=n; i++)
			coins[i] = read.nextInt();
		
		System.out.println(max(coins, n));		
	}

}
