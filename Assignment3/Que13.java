import java.util.*; //imported util classes for Scanner class
import java.io.*;
public class Que13{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	//creating a global static object to our Que13 class
	public static Que13 obj = new Que13();

	//main fucntion
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
        obj.mergeSort(parsedArry,len);
        System.out.print("\nThe Sorted Array is : ");
		for (int i : parsedArry) {
		System.out.print(i+" | ");
		}

		obj.binarySearch(parsedArry);

    }
	public static void mergeSort(int[] a, int n) {
    //if array is smaller than 2 then exit
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }

    //sorting left and right
    mergeSort(l, mid);
    mergeSort(r, n - mid);
 
    merge(a, l, r, mid, n - mid);
	}

	public static void merge(
  	int[] a, int[] l, int[] r, int left, int right) {
  
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
	}

	//function to check string is pallindrome or not
	public void binarySearch(int arr[]) 
	{ 
		int l = 0, r = arr.length - 1; 
		System.out.println("\nEnter the number to found :");
		int key = sc.nextInt();
		System.out.println(key+" Found at Positions : ");
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			// Check if key is present at mid 
			if (arr[m] == key){ 
				System.out.print(m+"  ");
				obj.out(m,key);
			}	

			// If key greater, ignore left half 
			if (arr[m] < key){ 
				l = m + 1; 
			}

			// If key is smaller, ignore right half 
			else{
				r = m - 1; 
			}
		}  
	}
	public void out(int pos,int key){
        try{
        //initilized file writer method to pass true value to append the output
        FileWriter myWriter = new FileWriter("E:\\Java Assignments\\Assignment3\\Output.txt",true);
        myWriter.write("\n"+key + " found at positions: "+ pos);
        myWriter.close();
        System.out.println("Successfully wrote to Output.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing");
        }
    }
}