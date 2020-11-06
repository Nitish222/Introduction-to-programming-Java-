import java.util.*;
import java.io.*;

public class Find_Result{
	public static void main(String[] args) {
		
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int N=0,ex=0;
		
		do
 		{
      try{
 			//inputing number and power
 			File file = new File(args[0]);
      Scanner fs = new Scanner(file);
      fs.useDelimiter("\\D+");
      while(fs.hasNext()){
        N=fs.nextInt();
        System.out.println("the number: ");
        EVENODDPRIME eop = new EVENODDPRIME(N);
        //printing result
      System.out.println(N+" is "+eop.FIND_EVENODDPRIME());
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

class EVENODDPRIME{
	private int NUM; //declared counter var
	
	//constructor to initialize members
	public EVENODDPRIME(int n){ 
		NUM = n; 
	}

	public String FIND_EVENODDPRIME(){
      
      //using even and prime for deciding 
      boolean even=false,prime=true;
      //if the number is even , even is assigned 1 
      if(NUM % 2 == 0){
            even = true;
        }
     // checking is prime or not
      // for(int i = 2; i <= NUM/2; ++i){
      // if(NUM % i == 0){
      //           prime = false; //assign value of 0 to prime if number divides
      //           break;
      //       }   
      //   }
        // Corner cases 
        if (NUM <= 1) 
            prime=false; 
        if (NUM <= 3) 
            prime=true; 

        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (NUM % 2 == 0 || NUM % 3 == 0) 
            prime=false; 

         for (int i = 5; i * i <= NUM; i = i + 6) 
            if (NUM % i == 0 || NUM % (i + 2) == 0) 
                prime=false;   
        
        if(even){
            if(prime){
                 return "even and prime"; //adds to give code 2 
                }
            else{
                return "even"; // code remain 1 
        	  }
        }
        else{
            if(prime){
                return "odd and prime"; //adds to give code 4
            }
            else {
                return "odd"; // code remains 3 
            }
        }
    }
}
