import java.util.*;
import java.io.*;
public class Armstrong_Result{
	public static void main(String[] args) {
		
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int N=0,ex=0;
		
		do
 		{
 			try{
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			
 			fs.useDelimiter("\\D+");
        	while(fs.hasNext()){
 			//inputing number 
	 		N=fs.nextInt();
	 		System.out.println("the number is: "+N);
	 		Armstrong_Number arm = new Armstrong_Number(N);
	 		//printing result
            System.out.println(N + " is " + arm.Compute_Armstrong());
	 		}
	 	}
	 	catch(NoSuchElementException|FileNotFoundException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
	}
}

class Armstrong_Number{
	private int NUM;
	
	public Armstrong_Number(int n){
		NUM=n;
	}
	
	public String Compute_Armstrong(){
		//a temprory variable to store our number
		//a for storing digits at diff place 
		//sum for storing sum of cube of each digit
		int temp,a,sum=0;
		
		temp = NUM;
		for(;temp!=0;temp/=10)
		{
			a = temp%10;
			sum +=a*a*a;
		}

		if(sum==NUM)
			return " Armstrong number";
		else
			return "not a Armstrong number";
	}		
}


		