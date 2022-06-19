package Chapter4;

import java.util.Scanner;
//버블정렬 더이상 swap안일어나는 루프
public class P16B1377 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean change = false;
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			change = false;
			for(int j=0;j<N-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					change = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			if(!change) {
				System.out.println(i+1);
				break;
			}
		}
		
		
	}

}
//10 1 5 2 3
//1 5 2 3 10 0
//1 2 3 5 10 1
