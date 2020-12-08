import java.util.*;

class prg9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the rows of the array you want");
		int rows=sc.nextInt();
		System.out.println("Please enter the columns of the array you want");
		int col=sc.nextInt();
		if(rows==col)
		{
		int n=rows;
		int arr[][] = new int[n][n];
		int transpose[][] = new int[n][n];

		System.out.println("Please enter the numbers of the array: ");
		for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                arr[i][j]=sc.nextInt(); 
            } 
  }
            System.out.println("the numbers you have entered are: "); 


		for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print(arr[i][j] + "("+i+","+j+") " ); 
            } 
  
            System.out.println();
        }


        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
            	transpose[i][j]=arr[j][i];
            }
        }

        System.out.println("the matrix after transpose is: ");

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print(transpose[i][j] + "("+i+","+j+") " ); 
            } 
  
            System.out.println();
        }
    }
    else
    	System.out.println("The transpose is not possible ");

	}
}