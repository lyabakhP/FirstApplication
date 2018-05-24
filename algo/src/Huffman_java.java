import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman_java {
	
	class Node{
		final int frequency;
		public Node(int frequency) {
			this.frequency = frequency;
			// TODO Auto-generated constructor stub
		}
//		@Override
//		public int compareTo(Node o) {
//			// TODO Auto-generated method stub
//			return Integer.compare(frequency, o.frequency);
//		}
	}
	class InternalNode extends Node{
		Node left;
		Node right;
		public InternalNode(Node left, Node right) {
			super(left.frequency+right.frequency);
			this.left = left;
			this.right=right;
			//this.frequency = 
		}
	}
	
	class LeafNode extends Node{
		char symbol;
		public LeafNode(char symbol, int frequency) {
			super(frequency);
			this.symbol = symbol;
		}
	}
	
	public void sort() {
		
	}
	
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	String st = sc.next();
    	Map<Character, Integer> dict = new HashMap<>();
    	for(int i = 0;i<st.length();i++) {
    		char c = st.charAt(i);
    		if(dict.containsKey(c)) {
    			dict.put(c, dict.get(c)+1);
    		}
    		else {
    			dict.put(c, 1);
    		}
    	}
    	
    	PriorityQueue<Node> queue = new PriorityQueue<>();
    	for(Map.Entry<Character, Integer> entry:dict.entrySet()) {
    		queue.add(new LeafNode(entry.getKey(),entry.getValue()));
    	}
    	int sum = 0;
    	while(queue.size()>1) {
    		Node first= queue.poll();
    		Node second = queue.poll();
    		InternalNode n = new InternalNode(first, second);
    		sum+=n.frequency;
    		queue.add(n);
    	}
    	System.out.println(sum);
    	//queue.poll();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Huffman_java().run();
	}

}
