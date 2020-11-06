import java.util.*;
import java.io.*;

public class Product{
	public static void main(String[] args) {
		PROD pd = new PROD();
		Scanner s = new Scanner(System.in);
		int ex=0,a,b;
		do{
			try{
			File file = new File(args[0]);
        	Scanner sc = new Scanner(file);
        	sc.useDelimiter("\\D+");
        	while(sc.hasNext()){
             a = sc.nextInt();
             b = sc.nextInt();
            //sc.nextLine();
            pd.INPUT(a,b);
            System.out.println("1st number is =" + a + "\n2nd number is =" + b);
            System.out.println("Product is :"+pd.COMPUTEPROD());
        	}
        	}
        	catch(FileNotFoundException e){
        		System.out.println("File doesnt exist!!");
        	}
			System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=s.nextInt();
		}while(ex==1);
	}
}

class PROD{
	private int A,B;
	private Scanner sc = new Scanner(System.in);
	public PROD(){
		A=0;
		B=0;
	}
	public void INPUT(int a,int b){
 		A=a;
 		B=b;
	}
	public int COMPUTEPROD(){
		return A*B;	
	}	
}