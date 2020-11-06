import java.util.*;

class FIB {
	private int FIRST, SECOND, THIRD;
	
	public FIB() {
		FIRST = 0; 
		SECOND = 1; 
		THIRD=0;
	}

	public void GENERATE_FIB(int N) {
		for(int i = 1; i <= N; ++i){
			System.out.print(FIRST + "  ");

			THIRD = FIRST + SECOND;
			FIRST = SECOND;
			SECOND = THIRD;
			
		}
	}
}

class FIBONACCI {
	public static void main(String[] args) {
        int N=0,ex=0;	
        FIB f = new FIB();
		Scanner sc = new Scanner(System.in);
		do
 		{
 			System.out.println("Enter the fibonacci series limit: ");
			N = sc.nextInt();
			f.GENERATE_FIB(N);
	 		System.out.println("\nDo you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 	}while(ex==1);
	}
}