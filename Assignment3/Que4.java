

import java.util.*; //importing scanner class
import java.io.*;

public class Que4{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	public static Que4 obj = new Que4();

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
    	int lineindex =0;
        try{

             File myObj = new File("test.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
             String data1 = myReader.nextLine();
             String data2 = myReader.nextLine();
             System.out.print("["+data1+"]"+" "+"["+data2+"]\n");
             obj.convertToArray(data1,data2);
             lineindex++;      
            }
         }

            catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
     }

     public void convertToArray(String str1, String str2){
        
        //seprating our file input into comma seprated array
        String[] parts1 = str1.split(",");
        String[] parts2 = str2.split(",");
        int len1= parts1.length;
        int len2= parts2.length;
        //declaring our character array
        int[] parsedArry1 = new int[len1];
        int[] parsedArry2 = new int[len2];
        //filtering the integers in the string with comma sepration
        // that is 1 , 2 , 3
        for(int i =0; i < len1; i++)
        {       
           parsedArry1[i] = Integer.parseInt(parts1[i]);
        }
         for(int i =0; i < len2; i++)
        {       
           parsedArry2[i] = Integer.parseInt(parts2[i]);
        }
        System.out.println("\nThe First Array is : "+ Arrays.toString(parsedArry1));
        System.out.println("\nThe Second Array is : "+ Arrays.toString(parsedArry2));
        int[] combined = obj.combine(parsedArry1,parsedArry2);
        System.out.println("The combined array is: "+ Arrays.toString(combined));
        obj.out(combined);
    }

    public int[] combine(int[] arry1,int[] arry2){
    		//creating third array
		int comb[] = new int[arry1.length+arry2.length];
		
		//pos variable to keep track of position in the merging array
		int pos = 0;

		//adding first array A to C
		for (int i: arry1) {
			comb[pos] = i;
			pos++;
		}
		//Adding second array B to C 
		for(int i:arry2){
			comb[pos] = i;
			pos++;
		}
		return comb;
    }
     public void out(int[] arry){
        try{ 
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n The combined Array is : "+ Arrays.toString(arry));
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt\n");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing\n");
        }
    }
}