import java.util.*;
import java.io.*;
public class Que9 {

    public static Scanner sc = new Scanner(System.in);
    public static Que9 obj = new Que9();
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
        System.out.println("\nNumber of words are: " + obj.wordcount(ch)); 
        obj.out(obj.wordcount(ch));
    }
    public int wordcount(char[] characters) {
        int count = 0;
        boolean isWord = false;
        int last = characters.length - 1;
        for(int i = 0;i<characters.length;i++)
        {
            if(Character.isLetter(characters[i]) && i != last) 
            {
                isWord = true;
            }
            else if(!Character.isLetter(characters[i]) && isWord)
            {
                count++;
                isWord = true;
            }
            else if(Character.isLetter(characters[i]) && i == last) 
            {
                count++;
            }
        }
        return count;
    }
    public void out(int count){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        
        myWriter.write("\n Number of words are: "+ count);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }
}