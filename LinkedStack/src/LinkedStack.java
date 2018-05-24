
public class LinkedStack {
	private class Node{
		int item;
		Node next;
		//Node prev;
	}
	Node first,last;
	public boolean isEmpty() {
		return first==null;
	}
//	public void push(int data) {
//		Node oldLast = last;
//		last = new Node();
//		last.item=data;
//		last.next=null;
//		last.prev=oldLast;
//		if(isEmpty()) {
//			first = last;
//		}
//		else {oldLast.next=last;}
//	}
//	public int pop() {
//		Node oldLast = last;
//		//last = new Node();
//		//last.item=data;
//		last=oldLast.prev;
//		if(isEmpty()) {
//			return 0;
//		}
//		
//		else {
//				int del_item = oldLast.item;
//				oldLast=null;
//				return del_item;
//			}
//	}
	
	public void push(int data) {
		Node oldLast = first;
		first = new Node();
		first.item=data;
		first.next=oldLast;
		//first.prev=oldLast;

	}
	public int pop() {
		int item = first.item;
		first = first.next;
		return item;
	}
	
	
	
	
	
	public void show() {
		System.out.println("Elements of stack: ");
		Node node = first;
		while(node.next!=null) {
			System.out.print(node.item+" ");
			node = node.next;
		}
		System.out.print(node.item);
	}
	

}
