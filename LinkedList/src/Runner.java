//import LinkedList.Node;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.push(5);
		list.push(7);
		list.push(1);
		list.push(9);
		list.push(4);
		//Node item = list.GetItem(3);
	    //System.out.println("data_1: " + item.data);
	    //System.out.println("data_2: " + item.data);
		list.insertAtStart(77);
		list.insertAt(3, 0);
		list.insertAt(0, 34);
		list.deleteAt(2);
		list.show();
	}

}
