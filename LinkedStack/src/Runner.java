
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedStack lstack=new LinkedStack();
        lstack.push(2);
        lstack.push(3);
        lstack.push(5);
        lstack.push(1);
        lstack.show();
        System.out.println();
        System.out.println(lstack.pop());
        System.out.println();
        lstack.show();
        System.out.println();
        System.out.println(lstack.pop());
        System.out.println();
        lstack.show();
        System.out.println();
        System.out.println(lstack.pop());
        System.out.println();
        lstack.show();
        System.out.println();
        System.out.println(lstack.pop());
        System.out.println();
        lstack.show();
	}

}
