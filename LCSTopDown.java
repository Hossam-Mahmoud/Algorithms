import java.util.Arrays;
import java.util.Scanner;


public class LCSTopDown {
	
	public static int[][] dp;
	public static char[] x;
	public static char[] y;
	public static int LCS(int i, int j)
	{
		if(i == -1 || j==-1)
			return 0;
		if(dp[i][j] != -1)
			return dp[i][j];
		else if( x[i] == y[j])
			return dp[i][j] = 1+LCS(i-1, j-1);
		else
			return dp[i][j] = Math.max(LCS(i-1, j), LCS(i, j-1));
			             
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		x = read.next().toCharArray();
		y = read.next().toCharArray();
		dp = new int[x.length][y.length];
		for(int i=0; i<x.length; i++)
			Arrays.fill(dp[i], -1);
		System.out.println(LCS(x.length-1, y.length-1));
	}

}
