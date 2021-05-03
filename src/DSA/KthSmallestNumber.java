package DSA;
import java.util.Scanner;
public class KthSmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num of elements:");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int kth[]= new int[n];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
			{
				min=a[i];
				kth[i]=min;
			}
			
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(kth[i]);
		}

	}

}
