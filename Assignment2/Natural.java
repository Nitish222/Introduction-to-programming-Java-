import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Natural {
	public static void main(String[] args) {
		//for measuring time consumed in execution
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int ex=0;
		BigInteger N;
		do
 		{
 			try{
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			
 			fs.useDelimiter("\\D+");
        	while(fs.hasNext()){
 			//inputing limit
	 		N=fs.nextBigInteger();
	 		System.out.print("The limit is: "+N);
	 		Natural_Numbers nn = new Natural_Numbers(N);
	 		//printing result
            System.out.println("The sum of the natural numbers till "+N+" is "+ nn.Compute_Sumofnatural());
	 		}
	 		}
	 		catch(NoSuchElementException|FileNotFoundException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
      		//for checkig the time consumed
      		long finish = System.currentTimeMillis();
            System.out.println("Time consumed: " + (finish - start) + " ms");
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
	}
}		

class Natural_Numbers {
	private BigInteger N;
	
	//constructor to initialize N with the number passed in main
	public Natural_Numbers(BigInteger n){
		N = n;
	}
	public BigInteger Compute_Sumofnatural(){
		BigInteger sum = new BigInteger("0");
		for(BigInteger i= N; i.compareTo(BigInteger.ZERO)>0; i=i.subtract(BigInteger.ONE))
		{
			BigInteger b = new BigInteger(String.valueOf(i));
			sum = sum.add(b);
		}
		return sum;				
	}
}

