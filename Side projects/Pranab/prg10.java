import java.util.*;

class prg10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows of the array you want");
		int rows=sc.nextInt();
		System.out.println("Please enter the columns of the array you want");
		int col=sc.nextInt();
		int arr[][] = new int[rows][col];
		if(rows==col){
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

        int abovesum=0;
       for (int j = 1; j < col; j++) {
              for (int i=j-1 ; i>=0 ; i--) {
                    abovesum= abovesum + arr[i][j];
              }

       }

       int sumBelow=0;
       for (int i = 1; i < rows; i++) {
              for (int j=i-1 ; j>=0 ; j--) {
                    sumBelow= sumBelow+ arr[i][j];
              }

             
	}

		 System.out.println("The sum of elements above the diagnal is: "+abovesum);
              System.out.println("The sum of elements below the diagnal is: "+sumBelow);
	}
	else
		System.out.println("The Matrix is not eligible for such addition");

}
}