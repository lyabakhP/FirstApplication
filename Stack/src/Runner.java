
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack nums = new Stack();
		System.out.println("Empty: "+nums.isEmpty());
		nums.Push(15);
		System.out.println("Empty: "+nums.isEmpty());
		nums.Push(18);
		System.out.println("Size: "+nums.Size());
		nums.Push(9);
		System.out.println("Size: "+nums.Size());
		System.out.println(nums.Pop());
		System.out.println("Size: "+nums.Size());
		System.out.println(nums.Peek());
		System.out.println("Size: "+nums.Size());
		System.out.println(nums.Pop());
		System.out.println(nums.Pop());
		System.out.println(nums.Pop());

		System.out.println(nums.Pop());

		//System.out.println(nums.Pop());
		System.out.println("Empty: "+nums.isEmpty());		
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Show();
	}

}
