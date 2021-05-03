package DSA;
import java.util.Scanner;
public class ArrayRev {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		int temp;
		int start=0;
		int end=n-1;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]);	
		}
	}

}
