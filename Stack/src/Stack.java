
public class Stack {
	int stack[]=new int[5];
	int top = 0;
	
	//add
	public void Push(int data) {
		if(top==5) {
			System.out.println("Stack is full");
		}
		else {
			stack[top]=data;
			top++;
		}
		
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
