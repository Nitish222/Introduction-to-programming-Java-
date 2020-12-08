import java.util.*;//imported util classes for Scanner class
import java.io.*;
public class Que12{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);

	public static Que12 obj = new Que12();
	//main function
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		obj.cont(start);
		
		//printing array element with index
		
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
             convertToArray(data);      
            }
         }

            catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
     }

     public static void convertToArray(String str){
        
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
        obj.search(parsedArry);
    }
	
	//function to check string is pallindrome or not
	public void search(int[] intArray){
		
		//for checking for space
		System.out.println("\nEnter the number to found :");
		int key = sc.nextInt();
		System.out.println(key+" Found at Positions : ");
		for(int i=0; i<intArray.length; ++i){
			if(intArray[i]==key){
				System.out.print(i+" | ");
				obj.out(i);
			}
		}		 
	}
	 public void out(int pos){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n Key found at positions: "+ pos);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }	
}