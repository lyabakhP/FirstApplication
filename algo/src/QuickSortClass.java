import java.util.Scanner;
public class QuickSortClass {
	
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
			if(A[i]<=x) {
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
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[]=new int[n];
		for (int i = 0; i < n; i++) {
			array[i]=sc.nextInt();
		}
		int []a = QuickSort(array, 0, n-1);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuickSortClass().run();
	}

}
