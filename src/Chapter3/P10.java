package Chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P10 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		
		
		Deque<Node> dq = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			while(!dq.isEmpty() && dq.getLast().value >temp) {
				dq.removeLast();
			}
			
			dq.addLast(new Node(i,temp));
			
			if(dq.getFirst().index < i-L+1) {
				dq.removeFirst();
			}
			
			System.out.print(dq.getFirst().value + " ");
		}
	}	

}

class Node{
	int index;
	int value;
	
	Node(int index , int value){
		this.index = index;
		this.value = value;
	}
}