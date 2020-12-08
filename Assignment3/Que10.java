import java.util.*; //imported util classes for Scanner class
import java.io.*;
public class Que10{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	//creating a global static object to our Que10 class
	public static Que10 obj = new Que10();

	//main fucntion
	public static void main(String[] args) {
		//starting time
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
             File myObj = new File("Strings.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
             String data = myReader.nextLine();
             System.out.print("Unsorted String is: "+data);
             System.out.println(data+" "+obj.pallindrome(data));
             obj.out(data);      
            }
         }

            catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
     }
    //function to check string is pallindrome or not
	public String pallindrome(String s){
		//for storing reversed string
		String reverse="";
		int length = s.length();
		//running reverse loop 
		//with charat function to store characters at those indices
		for ( int i = length - 1; i >= 0; i--){  
          reverse = reverse + s.charAt(i);
      }
    //Printign reverse   
    System.out.println("\nThe reverse of string is: "+reverse);
	
	//checking if the reverse string is equal to the original
	if((reverse.toLowerCase()).equals(s.toLowerCase())){
		return "is pallindrome";
	}

	else{
		return "is not pallindrome";
	}
	}
    public void out(String str){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n"+str+" "+ obj.pallindrome(str));
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }

}