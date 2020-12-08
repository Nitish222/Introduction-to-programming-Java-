import java.util.*;

class prg6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowsum=0;
		int colsum=0;
		System.out.println("Please enter the rows of the array you want");
		int rows=sc.nextInt();
		System.out.println("Please enter the columns of the array you want");
		int col=sc.nextInt();
		int arr[][] = new int[rows][col];

		System.out.println("Please enter the numbers of the array: ");
		for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                arr[i][j]=sc.nextInt(); 
            } 
  }
            System.out.println("the numbers you have entered are: "); 

            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(arr[i][j] + "("+i+","+j+") " ); 
                

            } 
  
            System.out.println();
        }


		for (int i = 0; i < rows; i++) { 
			rowsum=0;
            for (int j = 0; j < col; j++) { 
         
                rowsum+=arr[i][j];

            } 
  
            System.out.println();
            System.out.println("the sum of row "+(i+1)+" is "+rowsum);


        }

        for (int i = 0; i < col; i++) { 
            for (int j = 0; j < rows; j++) { 
                
                colsum+=arr[i][j];

            } 
  
            System.out.println();
            System.out.println("the sum of elements of column "+(i+1)+" is "+colsum);
            

        }


   
	}
}