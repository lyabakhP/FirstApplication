import java.util.Scanner;


public class Nod {
	
	public int EuclidGCD(int a, int b) {
		if(a==0) {
			return b;	
		}
		else if(b==0) {
			return a;
		}
		
		else if(a>=b) {
			return EuclidGCD(a%b,b);
		}
		else {
			return EuclidGCD(a,b%a);
		}
		
	}
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
			 int number1 = in.nextInt();
			 int number2 = in.nextInt();
		     System.out.println(new Nod().EuclidGCD(number1,number2));     
	  }
}
