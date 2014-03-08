import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LCS {
	public static int[][] dp;
	public static char[] a, b;

	public static int minMatch(int i, int j) {
		if (i == -1 && j == -1)
			return 0;
		if (i == -1)
			return ((j + 1) * 3);
		if (j == -1)
			return ((i + 1) * 4);

		if (dp[i][j] != -1)
			return dp[i][j];

		int insert = minMatch(i - 1, j) + 4;
		int delete = minMatch(i, j - 1) + 3;
		int replace;
		if (a[i] == b[j])
			replace = minMatch(i - 1, j - 1);
		else
			replace = minMatch(i - 1, j - 1) + 5;

		int minCost = Math.min(insert, Math.min(delete, replace));
		return dp[i][j] = minCost;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String b1 = read.readLine();
		String a1 = read.readLine();
		b = b1.toCharArray();
		a = a1.toCharArray();
		
		dp = new int[a1.length()][b1.length()];
		for (int i = 0; i < dp.length; i++)
			Arrays.fill(dp[i], -1);
		int cost = minMatch(a.length - 1, b.length - 1);
		System.out.println(cost);
	}
}