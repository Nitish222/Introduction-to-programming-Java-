import java.util.*; //imported util classes for Scanner class
import java.io.*;
public class Que11{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	//creating a global static object to our Que11 class
	public static Que11 obj = new Que11();

	//main fucntion
	public static void main(String[] args) {
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
             System.out.print(data);
             convertToArray(data);      
            }
         }

            catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
     }

     public static void convertToArray(String str){
        int len= str.length();
        //declaring our character array
        char[] ch = new char[len];
        //inputting string characters in character array
        for(int i =0; i < len; i++)
        {
           ch[i] = str.charAt(i);
        }
        obj.capitalize(ch);
    }
	
	//function to check string is pallindrome or not
	public void capitalize(char[] charArray){
		
		//for checking for space
		boolean foundSpace = true;

    	for(int i = 0; i < charArray.length; i++) {

      	// if the array element is a letter
      	if(Character.isLetter(charArray[i])) {

        // check space is present before the letter
        if(foundSpace){
          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          //make found space false
          foundSpace = false;
        }
      }

      else {
        // if the new character is not character
        foundSpace = true;
      }
	}
		String Cap = new String(charArray); 	
		System.out.println("Capitalised string is: "+Cap); 
		obj.out(Cap);
	}
	 public void out(String Cap){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n Capitalized sentence is : "+ Cap);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }
}