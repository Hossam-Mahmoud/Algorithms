import java.util.Scanner;


public class LongestSeq {
	public static String res = "";
	
	public static int LCS(char[] x, char[] y)
	{
		int [][] dp = new int[x.length][y.length];
		int [][] back = new int[x.length][y.length];
		String lcs = "";
		for(int i=0; i<x.length; i++)
		{
			for(int j=0; j<y.length; j++)
			{
				if(x[i] == y[j])
				{
					dp[i][j] = 1;
					lcs += x[i];
					if(i != 0 && j!=0)
					{
						dp[i][j] += dp[i-1][j-1];
						back[i][j] = -1; //means diagonal
					}
				}	
				else
				{
					int one =0 ,two =0;
					if(i!=0)
						one = dp[i-1][j];
					if(j!= 0)
						two = dp[i][j-1];
						              
					dp[i][j] = Math.max(one, two);
					if(one > two)
						back[i][j] = 1; // means up
					else
						back[i][j] = 2; //means left
				}
				
			}
		}
		int i = x.length-1;
		int j = y.length-1;
		while(j>-1 && i>-1){
			if(x[i] == y[j])
				res += x[i];
			if(back[i][j] == -1){
				i--;
				j--;
			}
			else if(back[i][j] == 1)
				i--;
			else if(back[i][j] == 2)
				j--;
			else
				break;
			
		}
		
		return dp[x.length-1][y.length-1];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(LCS(a.toCharArray(), b.toCharArray()));
		System.out.println(res);
	}

}
