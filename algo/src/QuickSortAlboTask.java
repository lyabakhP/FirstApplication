import java.util.Scanner;

public class QuickSortAlboTask {
	public class BinarySearch {		
//		int BinarySearchMethod(int array[],int k) {
//			int l=0;
//			int r = array.length-1;
//			while(l<=r) {
//				int m = (l+r)/2;
//				if(array[m]==k) {
//					return m+1;
//				}
//				else if(array[m]>k) {
//					r=m-1;
//				}
//				else{
//					l=m+1;
//				}
//			}
//			return -1;
//		}
		int BinarySearch_2(int array[],int k) {
			//ad two fictive elements to start and end
			int l=-1;
			int r = array.length;
			while(r>(l+1)) {
				int m = (l+r)/2;//int m = (l+r)>>1;
				if(array[m]<k) {
					l=m;
				}
				else {
					r=m;
				}
			}
			return r;
		}
		int BinarySearchMethod(int array[],int k) {
			//ad two fictive elements to start and end
			int l=-1;
			int r = array.length;
			while(r>(l+1)) {
				int m = (l+r)/2;//int m = (l+r)>>1;
				if(array[m]<=k) {
					l=m;
				}
				else {
					r=m;
				}
			}
			return r;

			
			
//			// find last element
//			//a[l] <= x
//			// a[r] > x
//			while(r>(l+1)) {
//				int m = (l+r)/2;//int m = (l+r)>>1;
//				if(array[m]<=k) {
//					l=m;
//				}
//				else {
//					r=m;
//				}
//			}
//			if (l>0 && array[l] == k) {
//				return r+1;
//			}
//			else {
//				return 0;
//			}	
			
			
//			// find first element
//			//a[l] < x
//			// a[r] >= x
//			while(r>(l+1)) {
//				int m = (l+r)/2;//int m = (l+r)>>1;
//				if(array[m]<k) {
//					l=m;
//				}
//				else {
//					r=m;
//				}
//			}
//			if (r<array.length && array[r] == k) {
//				return r;
//			}
//			else {
//				return -1;
//			}		
		}
	}
	public class QuickSortClass{
		public int[] QuickSort(int [] A, int l, int r) {
			if(l<r) {
				int m=Partition(A,l,r);
				QuickSort(A,l,m-1);
				QuickSort(A,m+1,r);
			}
			return A;		
		}
		
		public int Partition(int [] A, int l, int r) {
			int x = A[l];
			int j = l; //region where elements<=pivot 
			for (int i = l+1; i <= r; i++) {
				if(A[i]<x) {
					j++;
					int buff = A[j];
					A[j]=A[i];
					A[i]= buff;	
				}
			}
			int buff=A[l];
			A[l]= A[j];
			A[j]=buff;
			return j; // index of pivot element
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int segmentNum = sc.nextInt();
		int pointsNum = sc.nextInt();
		int [] beginning = new int [segmentNum];
		int [] end = new int [segmentNum];
		for(int i = 0;i<segmentNum;i++) {
			beginning[i] = sc.nextInt();
			end[i] = sc.nextInt();
		}
		new QuickSortClass().QuickSort(beginning, 0, beginning.length-1);
		new QuickSortClass().QuickSort(end, 0, end.length-1);
		
		while(pointsNum>0) {
			int point = sc.nextInt();
			int index_begin = new BinarySearch().BinarySearchMethod(beginning, point);
			int index_end = new BinarySearch().BinarySearch_2(end, point);	
			System.out.print(index_begin-index_end+" ");
			pointsNum--;
		}
		//System.out.println("END");
		
		
//		for(int i = 0;i<beginning.length;i++) {
//			System.out.println(beginning[i]);
//		}
//		System.out.println();
//		for(int i = 0;i<beginning.length;i++) {
//			System.out.println(end[i]);
//		}
	}
//	10
//	12
//	1 2
//	1 3
//	1 99
//	3 4
//	6 9
//	7 10
//	11 17
//	80 105
//	90 106
//	106 107

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuickSortAlboTask().run();
	}

}
