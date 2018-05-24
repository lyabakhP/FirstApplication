
import java.util.Scanner;
public class points {
	public void Points(int number, int[][] array) {
		//System.out.println("Hello");
		int []buff = new int[number];
		//sort array by right points
		for (int i = 0; i < array.length; i++) {
			//System.out.println(i+" segment:");
			for(int j = 0;j<array.length;j++) {
				//System.out.println(array[i][1]);
				//System.out.println(array[j][1]);	
				if(array[i][1]<array[j][1]) {
					buff = array[i];
					array[i]=array[j];
					array[j]=buff;
				}
			}
		}
		
		
		int array_points[] = new int[array.length];
		int array_index = 0; 
		int array_count = 0;
		//int new_array_index = 0;
		
		for(int i = 0;i<array.length;i++) { 
			int point = array[i][1];
			array_points[array_index] = point;
			array_index++;
			//new_array_index++;
			int j=0;
			j+=array_count;	
			j++;
			//j++;
			for(; j<array.length;j++) {
				
				if((point >= array[j][0])&&(point<= array[j][1])) {
					array_count++;
					for(int k=array_count;k<array.length;k++ ) {
						if ((k)==array.length-1) {
							array[k] = new int[2];
							array[k][0] = 0;
							array[k][1] = 0;
							//array[k][1] = 0;
						}
						else {array[k] = array[k+1];}
						break;
						
					}
					//i++;
					
					//array_points[array_index] = point;
					//i++;
					//if(j+1 >= array.length) {break;}
					//array[j] = array[j+1];
					//array_count=j+1;
				}
			}
		}
		array_count--;
		//System.out.println("array_count: "+ array_count);
		int array_new[] = new int[array_count];
		System.arraycopy(array_points, 0, array_new, 0, array_count);
		//System.out.println("array_new size: "+array_new.length);
		for(int i = 0;i<array_new.length;i++){
			System.out.println(array_new[i]);
		}
		
	}
		
			
	
		
		
		
		
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		//System.out.println("Number of segments: "+number);
		int [][] array = new int[number][];
		for (int i = 0; i < number; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = new int[]{a,b};
		}
		//print arrays
		for (int i = 0; i < number; i++) {
			//System.out.println(i+"_segment:");
			for(int j = 0;j<2;j++) {
				System.out.println(array[i][j]);	
			}
			//System.out.println();
		}
		
		new points().Points(number, array);
	}

}
