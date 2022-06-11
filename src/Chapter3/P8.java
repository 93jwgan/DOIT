package Chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * 문제에서 제시 하는 값은 -도 가능하다. 
 * @author 한진원
 *
 */
public class P8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int Result = 0;
		
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		
//		for(int k=0;k<N;k++) {
//			long find = A[k];
//			int i = 0;
//			int j = k-1;
//			
//			while(i<j) {
//				if(A[i] + A[j] < find) {
//					i++;
//				}else if(A[i] + A[j] > find) {
//					j--;
//				}else if(A[i] + A[j] == find) {
//					Result++;
//					break;
//				}
//			}
//		}
//		System.out.println(Result);
//		bf.close();
		
		for(int k=0;k<N;k++) {
			long find = A[k];
			int i = 0;
			int j = N-1;
			
			while(i<j) {
				System.out.println("i : " + i + " , j : " + j);
				if(A[i] + A[j] == find) {
					if(i != k && j != k) {
						Result++;
						break;
					}else if(i==k) {
						i++;
					}else if(j==k) {
						j--;
					}
				}else if(A[i] + A[j] < find) {
					i++;
				}else if(A[i] + A[j] > find) {
					j--;
				}
			}
		}
		System.out.println(Result);
		bf.close();
	}

}
