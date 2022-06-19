package Chapter3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			qu.add(i);
		}
		
		while(qu.size() > 1) {
			qu.poll();
			qu.add(qu.poll());
		}
		
		System.out.println(qu.poll());
	}

}
