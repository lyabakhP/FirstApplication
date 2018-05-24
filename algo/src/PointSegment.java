import java.util.Scanner;

public class PointSegment {
	
public void Points(int number, int[][] array) {
	// sort array
		int []buff = new int[number];
		for (int i = 0; i < array.length; i++) {
			for(int j = 0;j<array.length;j++) {
				if(array[i][1]<array[j][1]) {
					buff = array[i];
					array[i]=array[j];
					array[j]=buff;
				}
			}
		}	
		
		int array_points[] = new int[array.length];
		int array_index = 0; 
		for(int i = 0;i<array.length;i++) { 
			if(array[i][1]==0) {continue;}
			int point = array[i][1];
			array_points[array_index] = point;
			array_index++;
			
			for(int j = i+1;j<array.length;j++) {
				if((point >= array[j][0])&&(point<= array[j][1])) {					
					if(array[j][1]!=0) {
						array[j][0] = 0;
						array[j][1] = 0;		
					}
				}
			}
		}
		// new array/ with points
		int [] pointSegment = new int[array_index];
		System.arraycopy(array_points, 0, pointSegment, 0,array_index);
		System.out.println(pointSegment.length);
		for(int i=0;i<pointSegment.length;i++) {
			System.out.println(pointSegment[i]);
		}
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int [][] array = new int[number][];
		for (int i = 0; i < number; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			array[i] = new int[]{a,b};
		}
		
		new PointSegment().Points(number, array);

	}

}
