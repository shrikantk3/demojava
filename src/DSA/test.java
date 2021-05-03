package DSA;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum=0;
		int num =sc.nextInt();
		long[] n = new long[num];
		for(int i=0;i<n.length;i++) {
			n[i]= sc.nextLong();
			sum = sum +n[i];
		}
		System.out.println(sum);
	}

}
