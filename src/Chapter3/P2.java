package Chapter3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		
		long max = 0;
		long sum = 0;
		for(int i=0;i<N;i++) {
			if(max < A[i]) max = A[i];
			sum += A[i];
		}
		
		System.out.println(sum/(float)max*100.0/N);
		System.out.println(sum*100.0/max/N);
	}

}
 

