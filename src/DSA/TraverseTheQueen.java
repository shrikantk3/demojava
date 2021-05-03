package DSA;
import java.util.Scanner;
public class TraverseTheQueen {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row and col:");
		System.out.print("row:");
		int r = sc.nextInt();
		System.out.print("col:");
		int c = sc.nextInt();
		int[][] mat = new int[r][c];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int queen = mat[0][0];
		System.out.println("Enter the steps:");
		System.out.println("position(row):");
		int st_r = sc.nextInt();
		System.out.println("position(col):");
		int st_c = sc.nextInt();
		for(int i=st_r;i<mat.length;i++) {
			for(int j=st_c;j<mat.length;j++) {
				queen=mat[i][j];
				System.out.print("Queen:");
				System.out.println(queen);
				//break;
				if(queen!=0) {
					int num = queen%2;
					if(num==0) {System.out.println("white");}else {System.out.println("black");}
				}
				break;
			}
			break;
		}
	}

}
