import java.util.Scanner;


public class Main {
	
	public void Points(int size, LinkedList array) {
		for(int i=0;i<size;i++) {
			array.GetItem(i);
			
			System.out.println();
//			for(int j=i;j<size;i++) {
//				
//			}
		}
	}
	
	// NODE CLASS
	public class Node {
		int start;
		int end;
		Node next;
	}

	//LINKEDLIST CLASS
	public class LinkedList {
		Node head;
		public void Insert(int start,int end) {
			Node node = new Node();
			node.start=start; 
			node.end=end;
			node.next=null;
			if (head==null) {
				head=node;
			}
			else {
				Node n = head;
				while(n.next!=null) {
					n=n.next;
				}
				n.next=node;
			}
		}
		
		public void InsertAtStart(int start,int end) {
			Node node = new Node();
			node.start=start;
			node.end = end;
			node.next = head;
			head=node;
		}
		
		public void InsertAt(int index,int start,int end) {
			Node node = new Node();
			node.end = end;
			node.next = null;
			if(index==0) {
				InsertAtStart(start,end);
			}
			else {
				Node n = head;
				while(index>1) {//or for
					n = n.next;
					index--;
			    }
				node.next=n.next;
				n.next=node;
			}
		}
		
		public void DeleteAt(int index) {
			if(index == 0) {
				head = head.next;
			}
			else {
				Node n = head;
				Node n1=null;
				while(index>1) {//or for
					n = n.next;
					index--;
			    }
				n1=n.next;
				n.next=n1.next;
				n1=null;
				//node.next=n.next;
				//n.next=node;
			}
		}
		public Node GetItem(int index) {
			Node n = head;
			while(index>0) {//or for
				n = n.next;
				index--;
			}
			
			return n;
		}
		public void Show() {
			Node node = head;
			while(node.next!=null) {
				System.out.println(node.end);
				node=node.next;
			}
			System.out.println(node.end);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int [][] array = new int[number][];
		for (int i = 0; i < number; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = new int[]{a,b};
		}
		// sort array
				int []buff = new int[number];
				for (int i = 0; i < array.length; i++) {
					for(int j = 0;j<array.length;j++) {
						if(array[i][1]<array[j][1]) {
							buff = array[i];
							array[i]=array[j];
							array[j]=buff;
						}
					}
				}	
				
		LinkedList list = new Main().new LinkedList(); 
		for (int i = 0; i < number; i++) {
			list.Insert(array[i][0],array[i][1]);
		}
		
		new Main().Points(number,list);
	}

}
