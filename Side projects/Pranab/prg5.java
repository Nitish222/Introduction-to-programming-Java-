import java.util.*;

class Que5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of coloumn");
		int col=sc.nextInt();
		int arr[][] = new int[rows][col];
		System.out.println("Input the array: ");
		for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                arr[i][j]=sc.nextInt(); 
            } 
  }
            System.out.println("the numbers you have entered are: "); 
		for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(arr[i][j] + "("+i+","+j+") " ); 
                sum+=arr[i][j];
            } 
            System.out.println();
        }
         System.out.println("Sum of all the elements is: "+sum); 
	}
}