import java.util.*;
import java.io.*;
public class Table_of_Numbers{
	public static void main(String[] args) {

		//creating scanner obj for taking inputs
		Scanner sc = new Scanner(System.in);
		int N=0,ex=0; //variable for inputting number and ex for asking user to continue
		do
 		{
 			try{
 			//inputing number and power
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			fs.useDelimiter("\\D+");
 			while(fs.hasNext()){
 			//inputing number
	 		N=fs.nextInt();
	 		System.out.println("The number is: "+N);
	 		Table t = new Table(N);
	 		//printing result
            System.out.println("The multiplication table of "+N+" is ");
            t.Find_Table();
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

class Table {

	//privatemembers
	private int N;
	
	//constructor initializing member with parameter
	public Table(int n){
		N = n;
	}

	//function to print table
	public void Find_Table(){
		for(int i=1; i<=10;i++)
		{
			System.out.println(N + " x " + i + " = "+ N*i);
		}
	}
}

