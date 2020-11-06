import java.util.*;
import java.io.*;

class Fibonacci{
	public static void main(String[] args) {
		int N=0,ex=0;	
        FIB f = new FIB();
		Scanner s = new Scanner(System.in);
		do
 		{
 			try{
			File file = new File(args[0]);
        	Scanner sc = new Scanner(file);
        	sc.useDelimiter("\\D+");
        	while(sc.hasNext()){
             N = sc.nextInt();
            System.out.println("\nthe fibonacci limit is: "+N);
            System.out.print("\nThe fibonacci series is: ");
            for(int i=0; i<N; i++)
            {
            	System.out.print(f.GENERATE_FIB(i)+" ");
            }
        	}
        	}
        	catch(FileNotFoundException e){
        		System.out.println("File doesnt exist!!");
        	}
	 		System.out.println("\nDo you want to continue?1.Yes 2.No");
	 		ex=s.nextInt();
	 	}while(ex==1);
	}
}

class FIB{
	//private int FIRST, SECOND, THIRD;
	
	// public FIB() {	
	// 	// FIRST = 0; 
	// 	// SECOND = 1; 
	// 	// THIRD=0;
	// }

	public int GENERATE_FIB(int N) {
		int fn[] = new int[N + 2];
		int i;
        fn[0] = 0; 
        fn[1] = 1; 
  
        for (i = 2; i <= N; i++){  
            fn[i] = fn[i - 1] + fn[i - 2];
        }  
        return fn[N]; 
		}
	}