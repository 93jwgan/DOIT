package Chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
//4 
//3 5 2 7
public class P12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int arr[] = new int[N];
		int result[] = new int[N];
		
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		stack.add(0);
		
		for(int i=1;i<N;i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				result[stack.pop()] = arr[i];
			}
			stack.add(i);
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(result[i] + " ");
		}
		
	}

}
