
public class DStack {
	
	int capacity=2;
	int stack[]=new int[capacity];
	int top = 0;
	
	//add
	public void Push(int data) {
		if(Size()==capacity) {
			//System.out.println("Stack is full");
			Expand();
		}
		stack[top]=data;
		top++;
	}
	
	private void Expand() {
		int length = Size();
		int newStack[]=new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
		capacity*=2;
	}
	
	private void Shrink() {
		int length = Size();
		if(length>0 && length<=(capacity/4)) {
			capacity = capacity/2;
		}
		int newStack[]=new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack=newStack;
	}
	
	//del
	public int Pop() {
		int data=0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			top--;
			data=stack[top];
			stack[top]=0;
			Shrink();
		}
		return data;
	}
	
	//take
	public int Peek() {
		int data;
		data=stack[top-1];
		return data;
	}
	
	//size
	public int Size() {
		return top;
	}
	
	//empty
	public boolean isEmpty() {
		return top<=0;
	}
	
	//show
	public void Show() {
		for(int n:stack) {
			System.out.print(n+" ");
		}
	}
}
