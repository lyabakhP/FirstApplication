import java.util.Scanner;
public class MergeSortInversions {
	int [] buff;
	int [] array;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		buff=new int[n];
		MergeSort(0,n);
		for(int i = 0; i<n;i++) {
			System.out.println(array[i]);
		}
		System.out.println(count);
	}
	
	private void Merge(int l,int m, int r) {
		// a[l...m-1] ,a[m...r-1] -> buff[l...r-1] -> array[l...r-1]
		int i=l;
		int j=m;
		for (int k = l; k < r; k++) {
			if(j==r || (i< m && array[i]<=array[j])) {
				buff[k]=array[i];
				i++;
			}
			else {
				count+=m-i;
				buff[k]=array[j];
				j++;		
			}
		}
		for(int k = l;k<r;k++) {
			array[k]= buff[k];
		}
		
		//System.arraycopy(buff, l, array, l, r-l);
	}
	

    int count=0;
    private void MergeSort(int l, int r) {
    	if(r<=l+1) return;
        // array[l...r-1] -> a[l....m-1] a [m....r-1]
    	int m = (l+r)>>1;//(l+r)/2;
		MergeSort(l,m);
		MergeSort(m,r);
    	Merge(l,m,r);
    }
//  private int[] Merge(int [] left,int[] right) {
//	int i=0;
//	int j=0;
//	int[] array= new int[left.length+right.length];
//	for (int k = 0; k < array.length; k++) {
//		if(j==right.length || (i< left.length && left[i]<=right[j])) {
//			array[k]=left[i];
//			i++;
//		}
//		else {
//			count+=(left.length-i);
//			array[k]=right[j];
//			j++;
//			
//		}
//	}
//	return array;
//}
//    private int[] MergeSort(int [] array) {
//    	if(array.length==1) return array;
//    	int n = array.length;
//    	int m = n/2;
//    	
//    	int[] left = new int[m];
//    	int[] right = new int[n-m];
//    	for(int i = 0;i<m;i++) {
//			left[i]= array[i];
//		}
//		for(int i = 0;i<n-m;i++) {
//			right[i]= array[i+m];
//		}
//
//		left = MergeSort(left);
//		right = MergeSort(right);
//    	return Merge(left,right);
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeSortInversions().run();
	}

}
