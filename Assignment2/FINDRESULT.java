import java.util.*;

public class RECTANGLE{
	public static void main(String[] args) {
		
		//creating obj of scanner class for input
		Scanner sc = new Scanner(System.in);
		int N=0,PWR=0,ex=0;
		POWER pw = new POWER();
		do
 		{
 			//inputing number and power
 			System.out.println("Enter the number: ");
	 		N=sc.nextInt();
	 		System.out.println("Enter the power: ");
	 		PWR=sc.nextInt();
	 		
	 		//printing result
	 		System.out.println(N+" ^ "+PWR+" = "+pw.COMPUTE_POWER(N,PWR));
	 		
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
		}
	}

class ARMSTRONG_NUMBER{
	private int NUM; //declared counter var

	//constructor to initialize members
	public ARMSTRONG_NUMBER(){ 
		NUM = 0; 
	}

	public int COMPUTE_ARMSTRONG(int n,int pwr){
		int c=0,a,temp;  
    	int n=153;//It is the number to check armstrong  
    	temp=n;  
    	while(n>0)  
    	{  
    	a=n%10;  
    	n=n/10;  
    	c=c+(a*a*a);  
    	}  
    	if(temp==c)  
    	System.out.println("armstrong number");   
    	else  
        System.out.println("Not armstrong number");
}
