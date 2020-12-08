
import java.util.*;
import java.io.*;
public class Que14{

  public static Scanner sc = new Scanner(System.in);
  public static Que14 obj = new Que14();
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
        SelectionSort(parsedArry);
        System.out.print("\nThe Sorted Array is : ");
        for (int i : parsedArry) {
            System.out.print(i+" | ");
        }
        obj.out(parsedArry);
    }
  public static void SelectionSort(int[] arr)
  {
    int lowest, lowestIndex;
        for(int i = 0; i < arr.length -1; i++) {
            //Find the lowest
            lowest = arr[i];
            lowestIndex = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < lowest) {
                    lowest = arr[j];
                    lowestIndex = j;
                }
            }
            //Swap
            if(i != lowestIndex) {
                int temp = arr[i];
                arr[i] = arr[lowestIndex];
                arr[lowestIndex] = temp;
            }
            
        }
  }
  public void out(int[] sorted){
        try{
        String sortA = Arrays.toString(sorted);  
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n Sorted Array is : "+ sortA);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }

}