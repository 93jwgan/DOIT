package Chapter4;

import java.util.Scanner;
//버블정렬
public class P15B2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-(i+1);j++) {
				int temp =0;;
				if( arr[j] > arr[j+1] ) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}

}
