//import LinkedList.Node;

public class Queue {
	private class Node {
		int item;
		Node next;
	} 
	
	Node first,last;
	
//	int queue[] = new int [5];
//	int size;
//	int front;
//	int rear;
	public boolean isEmpty() {
		return first==null;
	}
	public void enQueue(int data) {
//		queue[rear] = data;
//		rear++;
//		size++;
		Node oldLast = last;
		last = new Node();
		last.item = data;
		last.next = null;
		if(isEmpty())first=last;
		else oldLast.next = last;
	}
	
	public int deQueue() {
		int item = first.item;
		first = first.next;
		if(isEmpty())last=null;
		return item;
//		int data = queue[front];
//		front++;
//		size--;
//		return data;
	}
	
	public void Show() {
		System.out.println("Elements of queue: ");
		Node node = first;
		while(node.next!=null) {
			System.out.println(node.item);
			node=node.next;
		}
		System.out.println(node.item);
//		for(int i=0;i<size;i++) {
//			System.out.print(queue[front + i]+" ");
//		}
	}
}
