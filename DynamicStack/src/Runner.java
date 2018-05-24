
public class Runner {

	public static void main(String[] args) {
		DStack nums = new DStack();
		System.out.println("Empty: "+nums.isEmpty());
		nums.Push(15);
		System.out.println("Empty: "+nums.isEmpty());
		nums.Push(18);
		nums.Push(9);
		
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		nums.Push(18);
		System.out.println("Size: "+nums.Size());
		//nums.Show();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Pop();
		nums.Show();

	}

}
