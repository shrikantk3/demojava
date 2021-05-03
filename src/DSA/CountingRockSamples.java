package DSA;
import java.util.Scanner;
public class CountingRockSamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of pos_integer Sample Rocks" );
		int s = sc.nextInt();
		System.out.println("Enter rounds:");
		int r = sc.nextInt();
		int[] a = new int[s];
		System.out.println("Enter the SRocks:");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		int[] rn = new int[2];
		System.out.println("Enter round btween elements:");
		for (int i =0;i<2;i++) {
			rn[i]=sc.nextInt();
		}
		int min=rn[0];
		int max=rn[1];
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min && i>max) {
					count++;
			}
			
		}
		
		
		
		

	}

}
