package DSA;
import java.util.Scanner;
public class digonalSum {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[][] da = new int[n][m];
		for(int i=0;i<da.length;i++) {
			for(int j=0;j<da.length;j++) {
				da[i][j]=sc.nextInt();
				//System.out.println(da[i][j]);
			}
			sum1=sum1+da[i][i];
		}
		System.out.println(sum1);
		int i=0,j=2;
		while(i!=0) {
			sum2=sum2+da[i][j];
			i++;
			j--;
			System.out.println(sum2);
		}
		
		
		
	}
}
