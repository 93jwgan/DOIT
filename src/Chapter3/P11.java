package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();

		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int inputStack = 1;

		for(int i=0;i<N;i++) {
			
			if(inputStack <= arr[i]) {
				while(inputStack <= arr[i]) {
					st.add(inputStack++);
					System.out.println("+");
				}
				st.pop();
				System.out.println("-");
			}else {
				if(st.peek() > arr[i]) {
					System.out.println("NO");
					break;
				}else {
					st.pop();
					System.out.println("-");
				}
			}
			
		}
	}
}
