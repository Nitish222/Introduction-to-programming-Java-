import java.util.*;

class prg2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=0;
		int i,j;
		System.out.println("Please enter the number of rows you want: ");
		rows=sc.nextInt();

		for(i=0; i<rows; i++) 
        { 
              for(j=2*(rows-i); j>=0; j--)               
                System.out.print(" "); 
           
             
         
            for(j=0; j<=i; j++)   
                System.out.print("* "); 
            
              
            System.out.println(); 
        } 
	}
}