import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Digitsum {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		BigInteger N;
		int ex=0;
		do
 		{
 			try{
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			fs.useDelimiter("\\D+");
 			while(fs.hasNext()){
 			//inputing number
 			
			N = fs.nextBigInteger();
			System.out.println("The number is: "+N);
	 		Sumofdigits sd = new Sumofdigits(N);
	 		//printing result
            System.out.println("The sum of the digits of "+N+" is : "+sd.Compute_Sumofdigits());	
	 		//asking user if he want to continue
        	}
	 		}
	 		catch(NoSuchElementException|FileNotFoundException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
	 		//for checkig the time consumed
      		long finish = System.currentTimeMillis();
            System.out.println("Time consumed: " + (finish - start) + " ms");
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
	}
}

class Sumofdigits {
	private BigInteger NUM;

	//constructor to initialize members
	public Sumofdigits(BigInteger n) {
		NUM = n;
	}

	public BigInteger Compute_Sumofdigits(){
		BigInteger digit= new BigInteger("0"); 
		BigInteger sum= new BigInteger("0");
		//getting digit at 10s place
		//adding it to sum
		//moving to digit at other places
		while(!NUM.equals(BigInteger.ZERO)){
			digit = NUM.mod(new BigInteger("10"));
			sum = sum.add(digit);
			NUM= NUM.divide(new BigInteger("10"));
		}
		return sum;
	}
}

