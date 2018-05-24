
//import java.util.Scanner;
//public class Main {
	//public long fibo(int n,int m){
	    
	    //if(n<2){
	      //  return (n%m);
	    //}
	    //long [] array = new long[n+1];
	    //array[0] = 0;
	    //array[1] = 1;
	    //for(int i = 2; i<=n;i++){
	      //  array[i] = array[i - 1] + array[i - 2];
	    //}
	  //  return (array[n]%m);
	    
	//} 

	//public static void main(String[] args) {
		 //Scanner in = new Scanner(System.in);
		 //System.out.print("¬ведите им€: ");
		 //int number = in.nextInt();
		 //System.out.print("¬ведите им€: ");
	     
	     //int m = in.nextInt();
	     //System.out.println(new Main().fibo(number,m));
	//}

//}


import java.util.Scanner;
class Main {
    public long fibo(int n){
	    //long [] array = new long[n+1];
    	long a = 0, b = 1;
        for(int i = 0; i<n;i++){
	        long c = (a+b);
            a = b;
            b = c;
	    }
	    return (a);
} 

  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
		 int number = in.nextInt();
		 //int mod = in.nextInt();
	     System.out.println(new Main().fibo(number));
          
  }
}
