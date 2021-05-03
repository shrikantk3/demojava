package DSA;
import java.util.Scanner;
public class max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num of elements:");
		int n = sc.nextInt();
		int a[]=new int[n];
		
		for(int j=0;j<a.length;j++) {
			a[j]=sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("maximum value="+max);
		System.out.print("\nminimum value="+min);
		

	}
}
