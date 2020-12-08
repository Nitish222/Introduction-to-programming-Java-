import java.util.*;//imported util classes for Scanner class
import java.io.*;
public class Que2{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	public static Que1 obj = new Que1();
	//main function
	public static void main(String[] args) throws IOException {
		//Start time
      //long start = System.currentTimeMillis();
      //obj.cont(start);
      File f = new File("test.txt");
      f.createNewFile();
      for (int i=0; i<5; ++i) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}
  // public void cont(long start){
 //        int ex=1;
 //        do{
 //                obj.input();
 //                long finish = System.currentTimeMillis();
 //                System.out.println("Time consumed: " + (finish - start) + " ms");
 //                System.out.println("\nDo you want to continue?1.Yes 2.No");
 //                ex=sc.nextInt();
 //            }while(ex==1);
 //    }

 //    public void input(){
 //        try{
 //             File myObj = new File("test.txt");
 //             Scanner myReader = new Scanner(myObj);
 //             while (myReader.hasNextLine()) {
 //             String data = myReader.nextLine();
 //             System.out.print(data);
 //             obj.convertToArray(data);      
 //            }
 //         }

 //            catch(IOException|ArrayIndexOutOfBoundsException e){
 //        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
 //      }
 //     }

     // public void draw(){
     //    for (int i=0; i<5; ++i) {
     //        for (int j=0; j<i; ++j) {
     //            System.out.println("*");
     //        }
     //    }
     // }
    //  public void convertToArray(String str){
        
    //     //seprating our file input into comma seprated array
    //     String[] parts = str.split(",");
    //     int len= parts.length;

    //     //declaring our character array
    //     int[] parsedArry = new int[len];
    //     //filtering the integers in the string with comma sepration
    //     // that is 1 , 2 , 3
    //     for(int i =0; i < len; i++)
    //     {       
    //        parsedArry[i] = Integer.parseInt(parts[i]);
    //     }
    //     System.out.print("\nThe Array is : "+ Arrays.toString(parsedArry));
    //     obj.out(parsedArry);
    // }
    //  public void out(int[] arry){
    //     try{ 
    //     //initilized file writer method to pass true value to append the output
    //     FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
    //     myWriter.write("\n The Array is : "+ Arrays.toString(arry));
    //     myWriter.close();
    //     System.out.println("Successfully wrote to Output.txt");
    //     }
    //     catch (IOException e) {
    //         System.out.println("An error occurred while writing");
    //     }
    // }	
}
