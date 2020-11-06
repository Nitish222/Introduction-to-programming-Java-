import java.util.*;
public class Manager{
	public static void main(String[] args) {
		Worker wk = new Worker();
		int ex=0;
		Scanner sc = new Scanner(System.in);
		do{
		wk.IN_DATA();
		wk.OUT_DATA();
		System.out.println("Do you want to continue?1.Yes 2.No");
	 	ex=sc.nextInt();
		}while(ex==1);
			
	}
}
class Worker{
	private int WNO;
	private String WNAME;
	private float HRWRK, WGRATE,TOTWAGE;
	private Scanner sc = new Scanner(System.in);
	private float CALCWG(){
		TOTWAGE=HRWRK*WGRATE;
		return TOTWAGE;
	}
	public Worker(){
		WNO=0;
		WNAME = null;
		HRWRK = 0;
		WGRATE = 0;
		TOTWAGE = 0;
	}
	public void IN_DATA(){
 		try{
 		System.out.println("Enter the Worker Number");
		WNO=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Worker Name");
 		while (!sc.hasNext("[A-Za-z]+")) {
        System.out.println("Please, Enter letters!!");
        sc.next();
    	}
    	sc.nextLine();
 		WNAME=sc.nextLine();
 		System.out.println("Enter the Hours worked");
 		HRWRK=sc.nextFloat();
 		System.out.println("Enter the hourly Wage rate");
 		WGRATE=sc.nextFloat();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		sc.nextLine();
	}
	public void OUT_DATA(){
		System.out.println("Worker Number : "+WNO);
		System.out.println("Worker Name : "+WNAME);
		System.out.println("Hours Worked : "+HRWRK);
		System.out.println("Wage Rate : "+WGRATE);
		System.out.println("Total Wage : "+CALCWG());
	}
}