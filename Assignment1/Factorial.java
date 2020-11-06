import java.util.*;
import java.io.*;

class Factorial{
	public static void main(String[] args) {
		FACT fc = new FACT();
		Scanner s = new Scanner(System.in);
		int ex=0,N=0;
		do{
			try{
			File file = new File(args[0]);
        	Scanner sc = new Scanner(file);
        	sc.useDelimiter("\\D+");
        	while(sc.hasNext()){
             N = sc.nextInt();
            System.out.println("number is =" + N);
            System.out.println("Factorial of "+N+" is :"+fc.COMPUTE_FACT(N));
        	}
        	}
        	catch(FileNotFoundException e){
        		System.out.println("File doesnt exist!!");
        	}

			//System.out.println("Enter the number to get the factorial: ");
			//N=sc.nextInt();
			
			System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=s.nextInt();
		}while(ex==1);
	}
}

class FACT{
	// private int fct;
	private Scanner sc = new Scanner(System.in);
	// public FACT() {
	// 	fct = 1;
	// }
	public int COMPUTE_FACT(int N) { 
    	return (N == 1 || N == 0) ? 1 : N * COMPUTE_FACT(N - 1); 
	}
}