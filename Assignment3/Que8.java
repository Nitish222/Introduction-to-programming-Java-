import java.util.*;
import java.io.*;

public class Que8 {
        //creting a global static object to scanner class
        public static Scanner sc = new Scanner(System.in);
        public static Que8 obj = new Que8();
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
        for (int i = 0; i < len; i++) {
                    for (int j = i + 1; j < len; j++) {
                        if (Character.toLowerCase(ch[j]) < Character.toLowerCase(ch[i])) {
                                obj.swap(i, j, ch);
                        }       
                    }
            }
       
        System.out.println("\nSorted string: " + Arrays.toString(ch)); 
        obj.out(ch);
    }
    private void swap(int i, int j, char[] c) {

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
    }
     public void out(char[] sort){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        
        myWriter.write("\n Reversed String is: "+ Arrays.toString(sort));
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }

   
}