import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class MAXIMUM_NUMBER{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int size;
		BigInteger series = new BigInteger("0");
		int ex=0;
		do
 		{
 			try{
 			//inputing number and power
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			fs.useDelimiter("\\D+");
 			while(fs.hasNext()){

 			//file format will be
 			// size,(vlaue,vlaue,......) upto size
 			// size,(value,value,......) upto size
 			size = fs.nextInt();	
 			System.out.println("Size is:"+size);
 			BigInteger[] values = new BigInteger[size];	
 			System.out.println("Series is:");
 			for (int i=0; i<size; i++){
 				series = fs.nextBigInteger();
 				values[i] = series;
 				System.out.print(series+" ");
 			}
 			System.out.println();
 			DESCENDING dc = new DESCENDING(values,size);
	 		//printing result
	 		System.out.println("The decending order is: ");
	 		dc.MAX_SERIES();
	 		System.out.println();
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
	 		start = 0;
	 		finish = 0;
	 		}while(ex==1);
	 		}
		}

class DESCENDING{
	private static int SIZE;
	private static BigInteger[] SERIES = new BigInteger[SIZE];
	//constructor to initialize members
	public DESCENDING(BigInteger[] srs,int size){
		SIZE = size;
		//SERIES= srs.clone(); 
		SERIES = srs;
		for (int i=0; i<size; i++) {
			SERIES[i] = srs[i];
		}
	}
	public void MAX_SERIES(){
		//Arrays.sort(SERIES, Collections.reverseOrder());
		for (int i = 0; i < SIZE; i++)   
		{  
		for (int j = i + 1; j < SIZE; j++)   
		{  
		BigInteger tmp; 
		int compare = SERIES[i].compareTo(SERIES[j]); 
		if (compare==1)   
		{  
			tmp = SERIES[i];  
			SERIES[i] = SERIES[j];  
			SERIES[j] = tmp;  
		}  
		} 
	}
	for (int i=0; i<SIZE; i++){
 				System.out.print(SERIES[i]+" "); 
 			}
	
	}
}
