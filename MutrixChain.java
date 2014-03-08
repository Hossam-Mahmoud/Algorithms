import java.util.Scanner;


public class MutrixChain {

	
	public static int[][] minMul(int seq[])
	{
		int n = seq.length-1;
		int[][] memo = new int[seq.length][seq.length];
		for(int len =2; len<=n; len++)
		{
			for(int i=1; i<=n-len+1; i++)
			{
				int j= i+len-1;
				memo[i][j] = Integer.MAX_VALUE;
				int q;
				for(int k=i; k<j; k++)
				{
					q = memo[i][k]+memo[k+1][j]+(seq[i-1]*seq[k]*seq[j]);
					if(q< memo[i][j])
						memo[i][j] = q;
				}
			}
		}
		return memo;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int[] sequence = new int[n+1];
		for(int i=0; i<n+1; i++)
			sequence[i] = read.nextInt();
		int[][] rs = minMul(sequence);
		for(int i=1 ; i<rs.length; i++){
			System.out.println();
			for(int j=1; j<rs.length; j++)
				System.out.print(rs[i][j]+" ");
		}
	}

}
