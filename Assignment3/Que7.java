
import java.util.*;//importing scanner class
import java.io.*;
public class Que7{
    //creting a global static object to scanner class
    public static Scanner sc = new Scanner(System.in);
    public static Que7 obj = new Que7();
    public static void main(String[] args)
    {
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
        obj.reverse(ch);
    }
    public void reverse(char[] c){
            int len = c.length;
             for (int i=0; i < (len/2); i++)
            {
              char l = c[i];
              c[i] = c[len-i-1];
              c[len-i-1] = l;
            }
            System.out.println("\nThe Reversed string is: "+new String(c));
            
            obj.out(c);
     }

     public void out(char[] rev){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        
        myWriter.write("\n Reversed String is: "+ new String(rev));
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }
}