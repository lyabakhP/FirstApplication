
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue q = new Queue();
        q.enQueue(3);
        q.enQueue(7);
        q.enQueue(1);
        q.enQueue(8);
        q.Show();
        q.deQueue();
        q.Show();
        System.out.println();
        System.out.println("     "+q.deQueue());
        q.Show();
	}

}
