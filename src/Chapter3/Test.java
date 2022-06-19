package Chapter3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue(new Comparator() {

			
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if((int)o1 > (int)o2) {
					return 1;
				}else if((int)o1 == (int)o2) {
					return 0;
				}else{
					return -1;
				}
				
			}
			
		});
		pq.add(1);
		pq.add(-1);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
