import java.util.Scanner;

public class BinarySearch {
	public void run() {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int []array = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		int n_2=sc.nextInt();
		int []find=new int[n_2];
		for(int i=0;i<find.length;i++) {
			find[i]=sc.nextInt();
		}
//		for(int i=0;i<array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				if(array[i]>array[j]) {
//					int buff = array[i];
//					array[i]=array[j];
//					array[j]=buff;
//				}
//			}
//		}
		
		for(int i=0;i<find.length;i++) {
			System.out.print(BinarySearchMethod(array,find[i])+" ");
		}
		
	}
	
	int BinarySearchMethod(int array[],int k) {
		int l=0;
		int r = array.length-1;
		while(l<=r) {
			int m = (l+r)/2;
			if(array[m]==k) {
				return m+1;
			}
			else if(array[m]>k) {
				r=m-1;
			}
			else{
				l=m+1;
			}
		}
		return -1;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BinarySearch().run();
	}

}
