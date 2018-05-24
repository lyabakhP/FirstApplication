import java.util.Scanner;
public class different_terms {
	
	public void get_terms(int n) {
		long array[] = new long[14902025];
		int sum = 0;
		int counter = 0;
		
		for(int i = 1;i<=n;i++) {

			if(((i + sum)<=n)&&((i + sum)+(i+1)<=n)) {
				array[counter]=i;
			    sum+=i;
		 	    counter++;
			}
			else if(((i + sum)<=n)&&((i + sum)+(i+1)>=n)) {
				if(i + sum!=n) {
					continue;
				}
				else if(i + sum==n) {
					array[counter]=i;
				    sum+=i;
			 	    counter++;
				}
			}

		}
		//System.out.println(sum);
		System.out.println(counter);
		for(int i = 0;i<counter;i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//System.out.println(1000000000);
		//long[] arr = new long[1000000000];
		
		new different_terms().get_terms(number);
		
	}

}
