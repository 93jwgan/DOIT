package Chapter3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(new Comparator() {
			//o1 기준으로 양수를 return하면 작은수가 앞으로
			//o2 기준으로 음수를 return하면 큰수가 앞으로
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				int a = Math.abs((int)o1);
				int b = Math.abs((int)o2);
				if(a == b) {
					return (int)o1 > (int)o2 ? 1 : -1;
				}else {
					return a > b ? 1 : -1;
				}
			}
		});
		
		for(int i=0;i<N;i++) {
			int request = sc.nextInt();
			if(request == 0) {
				if(pq.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.add(request);
			}
		}
		
	}

}
