import java.util.*; //imported util classes for Scanner class

public class Que13{
	//creting a global static object to scanner class
	public static Scanner sc = new Scanner(System.in);
	//creating a global static object to our Que13 class
	public static Que13 obj = new Que13();

	//main fucntion
	public static void main(String[] args) {
		//declaring inputting string
		System.out.println("Enter The length of the array: ");
		int length=sc.nextInt();
		int[] arry = new int[length];
		for (int i=0; i<length; i++){
			arry[i]= sc.nextInt();
		}

		for (int i = 0; i < length-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < length-1; j++) 
                if (arry[j] < arry[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arry[min_idx]; 
            arry[min_idx] = arry[i]; 
            arry[i] = temp; 
        }

		System.out.print("The Sorted Array is : ");
		for (int i : arry) {
		System.out.print(i+" | ");
		}
		System.out.println("\nenter element to search:");
		int Key = sc.nextInt();
		
		int result = obj.binarySearch(arry,Key); 
		if (result == -1) 
			System.out.println("\nElement not present"); 
		else
			System.out.println("\nElement found at "
							+ "index " + result);
	}

	//function to check string is pallindrome or not
	public int binarySearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			// Check if x is present at mid 
			if (arr[m] == x) 
				return m; 

			// If x greater, ignore left half 
			if (arr[m] < x) 
				l = m + 1; 

			// If x is smaller, ignore right half 
			else
				r = m - 1; 
		} 

		// if we reach here, then element was 
		// not present 
		return -1; 
	}
}