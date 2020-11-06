import java.util.*;
import java.io.*;
class Even{
	public static void main(String[] args) {
		int ex=0,N;
		Scanner s = new Scanner(System.in);	
        PROLOGIC p = new PROLOGIC();
		do
 		{
 			try{
			File file = new File(args[0]);
        	Scanner sc = new Scanner(file);
        	sc.useDelimiter("\\D+");
        	while(sc.hasNext()){
             N = sc.nextInt();
            System.out.println("\nthe number is: "+N);
            p.INPUT(N);
            System.out.println("The number is "+p.FINDING_EVENODD());
        	}
        	}
        	catch(FileNotFoundException e){
        		System.out.println("File doesnt exist!!");
        	}
	 		System.out.println("\nDo you want to continue?1.Yes 2.No");
	 		ex=s.nextInt();
	 	}while(ex==1);
	}
}

class PROLOGIC{
	private int N;
	private Scanner sc = new Scanner(System.in);
	public PROLOGIC(){
		N=0;
	}
	public void INPUT(int n){
		N=n;
	}	
	public String FINDING_EVENODD(){
		
		return (N % 2 == 0) ? "even" : "odd";
		// if(N%2==0){
		// 	System.out.println(N+" is Even! ");
		// }
		// else{
		// 	System.out.println(N+" is Odd! ");
		// }
	}
}