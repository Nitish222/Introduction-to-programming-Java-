//WAP to read a 1-D integer array, printing the array elements with their indexes / positions. Also find the sum of array elements and print        the sum.

import java.util.*;//imported for scanner class
import java.io.*;
public class Que2{

	//created static scanner object
	public static Scanner sc = new Scanner(System.in);
	public static Que2 obj = new Que2();

	public static void main(String[] args) {
		//Start time
      long start = System.currentTimeMillis();
      obj.cont(start);
	}
	public void cont(long start){
        int ex=1;
        do{
                obj.input();
                long finish = System.currentTimeMillis();
                System.out.println("Time consumed: " + (finish - start) + " ms");
                System.out.println("\nDo you want to continue?1.Yes 2.No");
                ex=sc.nextInt();
            }while(ex==1);
    }

    public void input(){
        try{
             File myObj = new File("test.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
             String data = myReader.nextLine();
             System.out.print(data);
             obj.convertToArray(data);      
            }
         }

            catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
     }

     public void convertToArray(String str){
        
        //seprating our file input into comma seprated array
        String[] parts = str.split(",");
        int len= parts.length;

        //declaring our character array
        int[] parsedArry = new int[len];
        //filtering the integers in the string with comma sepration
        // that is 1 , 2 , 3
        for(int i =0; i < len; i++)
        {       
           parsedArry[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("\nThe Array is : "+ Arrays.toString(parsedArry));
        int sum = obj.sum(parsedArry);
        System.out.println("The sum of the elemens is: "+sum);
        obj.out(parsedArry,sum);
    }

    public int sum(int[] arry){
    	int sum = 0;
    	for(int i=0; i<arry.length; ++i){
			System.out.println("at "+i+" element is :"+arry[i]);
			sum+=arry[i];
		}
		return sum;
    }
     public void out(int[] arry,int sum){
        try{ 
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n The Array is : "+ Arrays.toString(arry)+" and the sum of elements is: "+sum);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }
}