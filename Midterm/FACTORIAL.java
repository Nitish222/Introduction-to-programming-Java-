import java.util.*;

class FACT{
	private int fct;
	public FACT() {
		fct = 1;
	}
	public int COMPUTE_FACT(int N) {
		for(int i=1; i<=N; i++){
			fct = fct*i;
		}
		return fct;
	}
}

class FACTORIAL{
	public static void main(String[] args) {
        FACT f = new FACT();
		Scanner sc = new Scanner(System.in);
		int N=0,ex=0;
		do
 		{
 			System.out.println("Enter the number to get the factorial: ");
			N = sc.nextInt();
			int ans = f.COMPUTE_FACT(N);
			System.out.println("The factorial of "+ N + " is: "+ ans);
	 		System.out.println("\nDo you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 	}while(ex==1);
	}
}
	