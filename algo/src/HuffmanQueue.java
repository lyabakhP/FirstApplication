import java.util.Scanner;

public class HuffmanQueue {
	private void run() {
		Scanner scan = new Scanner(System.in);
		String input_string = scan.next(); 
		Dictionary dict = new Dictionary();
//		for(char c : input_string.toCharArray()) {
//			
//		}
		char ch = input_string.charAt(0);
		dict.push(ch, 1);
		for(int i=1;i<input_string.length();i++) {
			char c = input_string.charAt(i);
//			if(dict.isEmpty()) {
//				dict.push(c, 1);
//			}
//			else 
			if(dict.contains(c)) {
				dict.update(c);		
			}
			else {
				dict.push(c, 1);
			}
		}
		
		dict.show();
		
		dict.sort();
		Queue queue = new Queue();
		//MinPQ<Comparable<Node>> minPq = new MinPQ<>(10);
		int length=dict.dictLength();
		for(int i=0;i<length;i++) {
			//queue.enQueue(dict.GetItemByIndex(i));
			queue.enQueue(new LeafNode(dict.GetItemByIndex(i).key, dict.GetItemByIndex(i).value));
			
		}
		//MinPQ<Comparable<Node>> queue = new MinPQ<>(10);
		
	}
	
	// Linked dictionary
	public class Dictionary{
		
		private class Node {
			char key;
			int value;
			Node next;
//			@Override
//			public int compareTo(Node o) {
//				return Integer.compare(value, o.value);
//			}
		}
		Node first,last;
		
		
		public boolean isEmpty() {
			return first==null;
		}
		
		
		public void push(char key,int value) {
			
			Node oldLast = last;
			last = new Node();
			last.key=key;
			last.value = value;
			last.next=null;
			if (isEmpty()) {
				first=last;
			}

			else {
				oldLast.next = last;
			}
		}
		public void update(char key) {
			int length = dictLength();
			Node n = first;
			if(n.key==key) {
				n.value ++;
			}
			while(length>0) {
				if(n.next!=null){
					n = n.next;
					if(n.key==key) {
						n.value++;
					};
				}
				length--;
			}
		}
		public void insertAtStart(char key,int value) {
			Node oldFirst = first;
			first = new Node();
			first.key = key;
			first.value=value;
			first.next = oldFirst;
		}
		
		public void insertAt(int index,char key,int value) {
			Node node = new Node();
			node.key = key;
			node.value=value;
			node.next = null;
			if(index==0) {
				insertAtStart(key,value);
			}
			else {
				Node n = first;
				while(index>1) {
					n = n.next;
					index--;
			    }
				node.next=n.next;
				n.next=node;
			}
		}
		
		public void deleteAt(int index) {
			if(index == 0) {
				first = first.next;
			}
			else {
				Node n = first;
				Node n1=null;
				while(index>1) {
					n = n.next;
					index--;
			    }
				n1=n.next;
				n.next=n1.next;
				n1=null;
				
			}
		}
		
		public void sort() {
			int length = dictLength();
			Node buff = first;
			Node q = first;
			for (int i = 0; i < length; i++) {
				for(int j=0;j<length;j++) {
					if(GetItemByIndex(i).value > GetItemByIndex(j).value) {
						q=GetItemByIndex(i);
						buff=q;
						q=GetItemByIndex(j);
						//q
					}
				}
				
			}	
			
			
			for(int i=0;i<length;i++) {
				if(GetItemByIndex(i).value > GetItemByIndex(i+1).value) {
					q=GetItemByIndex(i);
					buff=q;
					q=q.next;
					q.next=buff;
				}
			}
		}
		public int dictLength() {
			Node node = first;
			int length=0;
			if(isEmpty())return 0;
			while(node.next!=null) {
				length++;
				node=node.next;
			}
			length++;
			return length;
		}
		public Node GetItemByIndex(int index) {
			
			Node n = first;
			while(index>0) {
				n = n.next;
				index--;
			}
			
			return n;
		}
		public char GetItemByKey(char key) {
			int length = dictLength();
			Node n = first;
			if(n.key==key) {return n.key;}
			while(length>0) {
				if(n.next!=null){
					n = n.next;
					if(n.key==key)return n.key;
				}
				length--;
			}
			
			return n.key;
		}
		
		public boolean contains(char key) {
			return GetItemByKey(key)==key;
		}
		
		public void show() {
			Node node = first;
			while(node.next!=null) {
				System.out.print(node.key + " : " + node.value + "; ");
				node=node.next;
			}
			System.out.println(node.key + " : " + node.value  + ";");
		}
		
		
	}
	
	//// prior queue
	class Node implements Comparable<Node>{
		final int frequency;
		public Node(int frequency) {
			this.frequency=frequency;
		}
		@Override
		public int compareTo(Node o) {
			return -Integer.compare(frequency, o.frequency);
		}
	}
	
	class InternalNode extends Node{
		Node left;
		Node right;
		public InternalNode(Node left,Node right) {
			super(left.frequency+right.frequency);
			this.left = left;
			this.right = right;
			//frequency= left.frequency+right.frequency;
		}
	} 
	
	class LeafNode extends Node{
		char symbol;
		public LeafNode(char symbol, int frequency) {
			super(frequency);
			this.symbol = symbol;
			//this.frequency=frequency;
		}
	}
	
	public class Queue<Key> {
		private class Node {
			Key item;
			Node next;
		} 
		
		Node first,last;
		
//		int queue[] = new int [5];
//		int size;
//		int front;
//		int rear;
		public boolean isEmpty() {
			return first==null;
		}
		public void enQueue(Key data) {
//			queue[rear] = data;
//			rear++;
//			size++;
			Node oldLast = last;
			last = new Node();
			last.item = data;
			last.next = null;
			if(isEmpty())first=last;
			else oldLast.next = last;
		}
		
		public Key deQueue() {
			Key item = first.item;
			first = first.next;
			if(isEmpty())last=null;
			return item;
//			int data = queue[front];
//			front++;
//			size--;
//			return data;
		}
		
//		public void sort(int length,Queue queue) {
//			//int length = dictLength();
//			Queue.Node
//			Node buff = null;
//			Node q = null;
//			for(int i=0;i<length;i++) {
//				if(GetItemByIndex(i).value > GetItemByIndex(i+1).value) {
//					q=GetItemByIndex(i);
//					buff=q;
//					q=q.next;
//					q.next=buff;
//				}
//			}
//		}
		
		public void Show() {
			System.out.println("Elements of queue: ");
			Node node = first;
			while(node.next!=null) {
				System.out.println(node.item);
				node=node.next;
			}
			System.out.println(node.item);
//			for(int i=0;i<size;i++) {
//				System.out.print(queue[front + i]+" ");
//			}
		}
	}
	class MinPQ<Node extends Comparable<Node>>{
		private Node[] pq;
		private int N;
		
		
		@SuppressWarnings("unchecked")
		public MinPQ(int capacity) {
			pq=(Node[])new Comparable[capacity+1];
		}
		
		public boolean isEmpty() {
			return N==0;
		}
		
		public void insert(Node key) {
			pq[++N]=key;
			swim(N);
		}
		
		public Node delMin() {
			Node max=pq[1];
			exch(1, N--);
			sink(1);
			pq[N+1]=null;
			return max;

			
		}
		
		private boolean less(int i, int j) {
			return pq[i].compareTo(pq[j])>0;
		}
		private void exch(int i, int j) {
			Node t=pq[i];
			pq[i]=pq[j];
			pq[j]=t;
		}
		
		private void swim(int k) {
			while(k>1&& less(k/2,k)) {
				exch(k,k/2);
				k=k/2;
			}
		}
		private void sink(int k) {
			while(2*k<=N) {
				int j=2*k;
				if(j<N&&less(j,j+1)) j++;
				if(!less(k,j)) break;
				exch(k,j);
				k=j;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HuffmanQueue().run();
		
//		LinkedDict dict = new HuffmanQueue().new LinkedDict();
//		dict.push('s', 3);
//		dict.push('a', 1);
//		dict.push('n', 7);
//		dict.push('c', 1);
//		dict.push('l', 2);
//		dict.show();
//        dict.deleteAt(0);
//        dict.show();
       // MaxPQ<Comparable<Key>> hjh = new MaxPQ<>(capacity)
        //MaxPQ<Comparable<LinkedDict>> g = new HuffmanQueue().new MaxPQ<LinkedDict>(4);
	}

}
