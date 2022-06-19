package Chapter4;

import java.util.Scanner;
//선택정렬
public class P17B1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int arr[] = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i) - '0';
		}
	
		
		for(int i=0;i<arr.length;i++) {
			int max = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			if(arr[i] < arr[max]) {
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
		}
		
		for(int q=0;q<arr.length;q++) {
			System.out.print(arr[q]);
		}
	}

}
