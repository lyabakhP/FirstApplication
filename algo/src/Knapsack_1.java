import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Collections;
public class Knapsack_1 {
	public void Knapsack(int n, double w, double [][]array) {
		//sort array by c/w
		double [][] buff = new double [n][];
		for(int i = 0;i<array.length;i++) {
			for(int j = 0; j<buff.length;j++) {
				double left = array[i][0]/array[i][1];
				double right = array[j][0]/array[j][1];
				if(left>right) {
					buff[i]=array[i];
					array[i]=array[j];
					array[j]=buff[i];
				}
			}
		}
		
		//Arrays.sort(arr, Collections.reverseOrder());
		
		double w_buff = w;
	    double sum = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i][1]<=w_buff) {
				sum+=array[i][0];
				w_buff-=array[i][1];
			}
			//else if(w_buff==0) {continue;}
			else if(array[i][1]>w_buff) {
				//double der = (array[i][1]-w_buff);
				double res = array[i][0]/array[i][1];
				sum+=(res*w_buff);
				w_buff-=w_buff;
				//if(w_buff<0) {w_buff=0;}
				//w_buff-=(array[i][1]-w_buff);
			}
		}
		
		//System.out.println(String.format("%.6g%n", sum) );
		System.out.printf("%.3f",sum);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int cost = 0;
//		int weight = 0;
		int number_stuff = sc.nextInt();
		double w_knapsack = sc.nextInt();
		double [][]stuff_array = new double[number_stuff][]; 
		for(int i = 0; i<number_stuff;i++) {
			double cost = sc.nextInt();
			double weight = sc.nextInt();
			stuff_array[i] = new double[2];
			stuff_array[i][0] = cost;
			stuff_array[i][1] = weight;
			//int cost = sc.nextInt();
			//int weight = sc.nextInt();
		}
		
		new Knapsack_1().Knapsack(number_stuff,w_knapsack,stuff_array);
	}

}
