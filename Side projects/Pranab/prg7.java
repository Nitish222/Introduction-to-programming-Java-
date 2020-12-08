import java.util.*;

class prg7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows of the Arrays you want");
		int rows=sc.nextInt();
		System.out.println("Please enter the columns of the Arrays you want");
		int col=sc.nextInt();
		int A[][] = new int[rows][col];
		int B[][] = new int[rows][col];
		int C[][] = new int[rows][col];

		System.out.println("Please enter the numbers of the Array 1: ");
		for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                A[i][j]=sc.nextInt(); 
            } 
  }
            System.out.println("the numbers you have entered are: "); 

            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(A[i][j] + "("+i+","+j+") " ); 
            }
        }



        System.out.println("\nPlease enter the numbers of the Array 2: ");
		for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) {
                B[i][j]=sc.nextInt(); 
            } 
  }
            System.out.println("\nthe numbers you have entered are: "); 

            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(B[i][j] + "("+i+","+j+") " );
                }
            } 

            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) {
                C[i][j] = A[i][j]+B[i][j]; 
            } 
  }

  		System.out.println("\nthe sum of numbers in the third matrix are: : "); 

            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(C[i][j] + "("+i+","+j+") " );
                }
            } 


	}
}