import java.util.Scanner;
public class MergeSort {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		MergeSortProcedure(array);
	}
	
	public void MergeSortProcedure(int [] array) {
		if(array.length<=1) return;
		int ar_1=array.length/2;
		int ar_2=array.length-ar_1;
		
		int[] left = new int [ar_1];
		int [] right = new int[ar_2];
		for(int i = 0;i<ar_1;i++) {
			left[i]= array[i];
		}
		for(int i = 0;i<ar_2;i++) {
			right[i]= array[i+ar_1];
		}
			
		MergeSortProcedure(left);
		MergeSortProcedure(right);
		Merge(array,left,right); 
	}
	
	public void Merge(int [] array,int []left, int []right) {
		int leftIndex=0;
		int rightIndex=0;
		int targetIndex=0;
		int remaining=left.length+right.length;
		
		while(remaining>0) {
			if(leftIndex>=left.length) {
				array[targetIndex]=right[rightIndex++];
			}
			else if(rightIndex>=right.length) {
				array[targetIndex]=left[leftIndex++];
			}
			else if(left[leftIndex]<right[rightIndex]) {
				array[targetIndex]=left[leftIndex++];
			}
			else {
				array[targetIndex]=right[rightIndex++];
			}
			targetIndex++;
			remaining--;
		}
//		int n1=m-l+1;
//		int n2=r-m;
//		int [] arrayLeft = new int[n1];
//		int [] arrayRight = new int[n2];
//		for(int i = 0;i<n1;i++) {
//			arrayLeft[i]= array[i];
//	    }
//		for(int j = 0;j<n2;j++) {
//			arrayRight[j]= array[m+1+j];
//		}
//		int i = 0, j = 0;
//		
//		int k = 1;
//		while(i<n1 && j <n2) {
//			if(arrayLeft[i]<=arrayRight[j]) {
//				array[k]=arrayLeft[i];
//				i++;
//			}
//			else {
//				array[k]= arrayRight[j];
//				j++;
//			}
//			k++;
//		}
//		
//		/* Copy remaining elements of L[] if any */
//        while (i < n1)
//        {
//            array[k] = arrayLeft[i];
//            i++;
//            k++;
//        }
// 
//        /* Copy remaining elements of R[] if any */
//        while (j < n2)
//        {
//        	array[k] = arrayRight[j];
//            j++;
//            k++;
//        }
//		
		
		//return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeSort().run();
	}

}
