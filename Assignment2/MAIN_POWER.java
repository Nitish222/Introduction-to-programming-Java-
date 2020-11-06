import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class MAIN_POWER{
	public static void main(String[] args) {
		
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int ex=0;
		BigInteger N,PWR;
		do
 		{
 			try{
 			
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);

 			fs.useDelimiter("\\D+");
        	while(fs.hasNext()){
             N = fs.nextBigInteger();
             PWR = fs.nextBigInteger();
             POWER pw = new POWER(N,PWR);          
             
             //for formatting our huge output
             NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
    		 String str = formatter.format(pw.COMPUTE_POWER()); 	
	 		 System.out.println(N+" ^ "+PWR+" = "+str);
	 		}
	 	}
	 		catch(InputMismatchException|FileNotFoundException e){
				System.out.println("Invalid input!");
			}
			sc.nextLine();
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	
	 		}while(ex==1);

		}
	}

class POWER{
	private static BigInteger COUNTER,NUM; //declared counter var
	
	//constructor to initialize members
	public POWER(BigInteger N,BigInteger PWR){ 
		NUM = N;
		COUNTER = PWR; 
	}

	public BigInteger COMPUTE_POWER(){
		BigInteger num=NUM; //storing the value of number 
		//loop to compute power
		while(!COUNTER.equals(BigInteger.ONE)){
			NUM=num.multiply(NUM);
			COUNTER = COUNTER.subtract(BigInteger.ONE);
		}
		//returning the result to main 
		return NUM;
	}
}
