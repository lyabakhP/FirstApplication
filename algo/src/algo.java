import java.util.Scanner;
public class algo {
	
//	public int[] remove_element(int index) {
//        int removeItem = theItems[index];
//        for (int i = index; i < size() - 1; i++) {
//            theItems[i] = theItems[i + 1];
//        }
//        theSize--;
//        return removeItem;
//    }
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
		//int array_count = 1;
		//int new_array_index = 0;
		int [][] buff_array=new int[array.length][];
		for(int i = 0;i<array.length;i++) { 
			if(array[i][1]==0) {/*array_count++;*/
			continue;}
			int point = array[i][1];
			//buff_array[new_array_index] = array[i];
			//new_array_index++;
			array_points[array_index] = point;
			array_index++;
			//new_array_index++;
			
			for(int j = i+1/*array_count*/;j<array.length;j++) {
				if((point >= array[j][0])&&(point<= array[j][1])) {
					
					
					if(array[j][1]!=0) {
						array[j][0] = 0;
						array[j][1] = 0;	
						
					}
					else {continue;}
//					array_count++;
//					if(j==(array.length-1)) {
//						array[j]=new int[2];
//						array[j][0]=0;
//						array[j][0]=0;
//					}
//					array[j] = array[j+1];
					//array[j][1] = 0;
				}
			}
//			for(int k=j;k<array.length;k++) {
//				if(k==(array.length-1)) {
//					array[k] = new int[2];
//					array[k][0] = 0;
//					array[k][1] = 0;
//					continue;
//				}
//				array[k] = array[k+1];
//			}
			
			
			// HJHKH
//			for(int k=1;k<array.length;k++) {
//				if(k==(array.length-1)) {
//					continue;
//				}
//				array[k] = array[k+1];
//			}
			//array_count++;
			
			
//			int j=0;
//			j+=array_count;	
//			j++;
//						for(; j<array.length;j++) {
//				
//				if((point >= array[j][0])&&(point<= array[j][1])) {
//					
//					array_count++;
//					array[j][0] = 0;
//					array[j][1] = 0;
//			}
//		}
//			
//			for(int k = 0; k<array.length-1;k++) {
//				if((array[k][1] == 0)&&(k<array.length-1)) {
//					array[k] = array[k+1];
//				}
//				else if((array[k][1] == 0)&&(k==array.length-1)) {
//					array[k] = new int[2];
//     				array[k][0] = 0;
//					array[k][1] = 0;
//				}
//			}
		//array_count--;
		//System.out.println("array_count: "+ array_count);
		//int array_new[] = new int[array_count];
		//System.arraycopy(array_points, 0, array_new, 0, array_count);
		//System.out.println("array_new size: "+array_new.length);
		//for(int i = 0;i<array_new.length;i++){
			//System.out.println(array_new[i]);
		//}
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
		//for (int i = 0; i < number; i++) {
			//System.out.println(i+"_segment:");
			//for(int j = 0;j<2;j++) {
				//System.out.println(array[i][j]);	
			//}
			//System.out.println();
		//}
		
		new algo().Points(number, array);
	}

	

}

	
		
		
		
		
	
	