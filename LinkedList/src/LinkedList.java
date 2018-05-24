public class LinkedList {
	
	private class Node {
		int item;
		Node next;
	}
	Node first,last;
	
	
	public boolean isEmpty() {
		return first==null;
	}
	
	
	public void push(int data) {
		Node oldLast = last;
		last = new Node();
		last.item=data;
		last.next=null;
		if (isEmpty()) {
			first=last;
		}
//		else {
//			Node n = first;
//			while(n.next!=null) {
//				n=n.next;
//			}
//			n.next=oldLast;
//		}
		else {
			oldLast.next = last;
		}
	}
	
	public void insertAtStart(int data) {
		Node oldFirst = first;
		first = new Node();
		first.item = data;
		first.next = oldFirst;
		//first=oldFirst;
	}
	
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.item = data;
		node.next = null;
		if(index==0) {
			insertAtStart(data);
		}
		else {
			Node n = first;
			while(index>1) {//or for
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
		//Node node;
		//node.data = data;
		//node.next = null;
		Node n = first;
		//Node n1=null;
		while(index>0) {//or for
			n = n.next;
			index--;
		}
		
		return n;
//			n1.next=n.next;
//			n.next=n1.next;
//			n1=null;
	}
	
	public void show() {
		Node node = first;
		while(node.next!=null) {
			System.out.println(node.item);
			node=node.next;
		}
		System.out.println(node.item);
	}
}
