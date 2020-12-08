import java.util.*;
import java.io.*;

public class FileInput{
	public int fileSize(){
		int count = 0;
		try{
		File f=new File("test.txt");     //Creation of File Descriptor for input file
  		
  		// FileReader fr=new FileReader(f);   //Creation of File Reader object
  		// BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
  		//int c = 0;             
  		Scanner fs = new Scanner(f);	
  		while(fs.hasNext())         //Read char by Char
  		{
        	count++;
 		}
 		}
 		catch(ArrayIndexOutOfBoundsException|FileNotFoundException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      	}
		return count;
	}
	//input function
	public int[] input(){
		int[] arry = new int[fileSize()];
		try{
		int N=0;
		File f=new File("test.txt");     //Creation of File Descriptor for input file
  		// FileReader fr=new FileReader(f);   //Creation of File Reader object
  		// BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
  		Scanner fs = new Scanner(f);
  		while(fs.hasNext())         //Read char by Char
  		{
			arry[N++] = fs.nextInt();
 		}
 		}
 		//return it
 		catch(ArrayIndexOutOfBoundsException|FileNotFoundException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      	}
		
		return arry; 
	}
}