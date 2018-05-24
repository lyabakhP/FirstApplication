import java.util.Scanner;

public class Huffman {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.next();
		Dictionary dictionary = new Dictionary(5);
		
		for(int i=0;i<inputString.length();i++) {
			char ch = inputString.charAt(i);
			dictionary.push(ch, 1);	
		}
		LeafNode [] array = new LeafNode[dictionary.getLength()];
		Queue queue = new Queue();
		for (int i=0;i<dictionary.getLength();i++) {
			LeafNode leafNode = new LeafNode(dictionary.getKeyByIndex(i), dictionary.getValueByIndex(i));
			array[i]=leafNode;
			//d.push(keyItem, valueItem);
			queue.enQueue(leafNode);
		}
		int sum = 0;
		while(queue.size>1) {
			//int wdwd = queue.size;
			Node first = queue.deQueue();
			Node second = queue.deQueue();
			InternalNode node = new InternalNode(first, second);
			sum+= node.frequency;
			queue.enQueue(node);
		}
		if(dictionary.getLength()==1) {
			sum =inputString.length();
		}
		System.out.println(dictionary.getLength()+" "+sum);
		Node root = queue.deQueue();
		
		if(dictionary.getLength()==1) {
			root.code="0";
			System.out.println(array[0].symbol+": "+root.code);
		}
		//String encodedString="";
		else{root.buildCode("");}
		for(int i=0;i<inputString.length();i++) {
			char c = inputString.charAt(i);
			for(int j=0;j<array.length;j++) {
				if(c==array[j].symbol) {
					System.out.print(array[j].code);
					continue;
				}
			}
			
		}
		
	}

	
	class Node {
		String code;
		//int frequency=0;
        final int frequency;
	
        void buildCode(String code) {
        	this.code=code;
        }
        
		public Node(int frequency) {
			this.frequency = frequency;
		}
	}
	
	class InternalNode extends Node{
		Node left;
		Node right;
		@Override
		void buildCode(String code) {
			super.buildCode(code);
			left.buildCode(code+"0");
			right.buildCode(code+"1");
		}
		public InternalNode(Node left, Node right) {
			super(left.frequency+right.frequency);
			this.left = left;
			this.right=right;
			//this.frequency = left.frequency+left.frequency;
		}
	}
	
	class LeafNode extends Node{
		char symbol;
		@Override
		void buildCode(String code) {
			super.buildCode(code);
			System.out.println(symbol + ": " + code);
		}
		
		
		public LeafNode(char symbol,int frequency) {
			super(frequency);
			this.symbol = symbol;
			//this.frequency = frequency;
		}
	}
	
	class Dictionary{
		char key[];
		int value[];
		int N=0;
		int M=0;
		
		public Dictionary(int capacity){
			key = new char[capacity];
			value = new int[capacity];
		}
		
		public boolean isEmpty() {
			return N==0;
		}
		
		public boolean contains(char keyItem) {
			return getKey(keyItem)==keyItem;
		}
		
		public char getKey(char keyItem) {
			M=0;
			if(isEmpty())return '\u0000';
			for(int i=0;i<N;i++) {
				if(key[i]==keyItem) { 
					return key[i];
				}
				M++;
			}
			return '\u0000';
		}
		
		public void push(char keyItem, int valueItem) {
			if(N==key.length) {resize(N*2);}
			if(contains(keyItem)) {
				//key[M]=keyItem;
				value[M]+=valueItem;
			}
			else {
				key[N]=keyItem;
				value[N]=valueItem;
				N++;}
		}
		
		public void resize(int capacity) {
			char[]key_copy = new char[capacity];
			int[]value_copy = new int[capacity];
			for(int i=0;i<N;i++){
				key_copy[i]=key[i];
				value_copy[i]=value[i];
			}
			key=key_copy;
			value=value_copy;
		}
		
		public char getKeyByIndex(int index) {
			if(isEmpty())return '\u0000';
			return key[index];
		}
		public int getValueByIndex(int index) {
			if(isEmpty())return 0;
			return value[index];	
		}
		
		public int getLength() {
			return N;
		}	
	}
	
	class Queue{
	
		int N=0;
		Node queue[] = new Node[5];
		int size;
		int front;
		int rear;
		
		public boolean isEmpty() {
			return queue[0]==null;
		}
		
		public void sort() {
			for(int i=front;i<size+front;i++) {
				for(int j=i+1;j<size+front;j++) {
					if(queue[i].frequency>queue[j].frequency) {
						Node buff=queue[i];
						queue[i]=queue[j];
						queue[j]=buff;
					}
				}
			}
		}
		
		public void enQueue(Node data) {
			if(N==queue.length) {resize(N*2);}
			queue[rear] = data;
			rear++;
			size++;
			N++;
			sort();
		}
		
		public void resize(int capacity) {
			Node []copy = new Node[capacity];
			for(int i=0;i<queue.length;i++) {
				copy[i] = queue[i];
			}
			queue = copy;
		}
		
		public Node deQueue() {
			Node data = queue[front];
			front++;
			size--;
			return data;
		}
		
		public void show() {
			for(int i=0;i<size;i++) {
				System.out.print(queue[front + i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Huffman().run();
	}

}
