package Chapter3;

import java.util.Scanner;

/**
 * @author 한진원
 * 모듏러 연산
 * (A+B)%C = ((A%C) + (B%C)) % C
 * (A-B)%C = ((A%C) - (B%C)) % C
 * 
 * ACB -> A개 중에서 B개를 뽑는 확률
 * (A*(A-1)) / B 
 */
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];
		long[] C = new long[M];
		
		long answer = 0;
		
		S[0] = sc.nextInt();
		
		for(int i=1;i<N;i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			int remainder = (int)(S[i]%M);
			
			if(remainder == 0) answer++;
			
			C[remainder]++;
		}
		
		for(int i=0;i<M;i++) {
			if(C[i] > 1) {
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}
		
		System.out.println(answer);
	}

}
