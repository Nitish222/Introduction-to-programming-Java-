import java.util.*;
import java.io.*;

public class RECTANGLE{
	public static void main(String[] args) {
		
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int ex=0;
		float l=0,b=0;
		do
 		{
 			try{
 			//inputing number and power
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);

 			//reading format
 			fs.useDelimiter("\\D+");
 			//run loop until eof(end of file)
 			while(fs.hasNext()){
 				//inputting format from file (l,b), l=length , b=breadth
 				l=fs.nextFloat();
				b=fs.nextFloat();
				
				//passing values of length and breadth
				PERIMETER pr = new PERIMETER(l,b);
				
				System.out.println("Length :"+l+" Breadth :"+b);
				//printing result
	 			System.out.println(" PERIMETER :"+pr.COMPUTE_PARAMETER()+" m");
 			}
	 		}
	 		catch(System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");){
	 			System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
	 		}
	 		sc.nextLine(); // clearing the buffer
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);

		}
	}

class PERIMETER{
	private static float LENGTH,BREADTH; //declared counter var
	
	//constructor to initialize members
	public PERIMETER(float l, float b){ 
		LENGTH = l; 
		BREADTH = b;
	}

	public float COMPUTE_PARAMETER(){
		//computing paramete
	 	//returning the result to main 
		return 2*(LENGTH+BREADTH);
	}
}
