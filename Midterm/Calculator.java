import java.util.*;
import java.util.InputMismatchException;
public class Calculator{

		public static void main(String[] args) {
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		int a,b,option = 0,ex=0;
		do
 		{
 			try{
 			System.out.println("Enter your choice from the following menu:");
 			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
	 		option = sc.nextInt();
 			if(option!=5){
 
 				System.out.println("Enter the first number");
				a=sc.nextInt();
 				System.out.println("Enter the second number");
 				b=sc.nextInt();
 				op.INPUT(a,b);
 				}
 			else
 			{
 				break;
 			}
 			}	
 				catch(InputMismatchException e){
 					System.out.println("Enter a integer");
 				}
 			sc.nextLine();
 			switch(option)
 			{
	 		case 1:System.out.println("Addition  is "+op.SUM());
	 		break;
	 		case 2:System.out.println("Subtraction  is "+op.DIFF());
	 		break;
	 		case 3:System.out.println("Product of  is "+op.PROD());
	 		break;
	 		case 4: 
	 		System.out.println(" Division is "+op.DIV()); 
	 		break;
	 		case 5: break;
	 		default: System.out.println("Invalid choice!!");
	 		}
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
		}
	}
	


class Operation{
	private static int A,B;
	private static Scanner sc = new Scanner(System.in);
	public Operation(){
		A=0;
		B=0;
	}
	public void INPUT(int a,int b){
		this.A=a;
		this.B=b;
 	}
 	public int SUM(){
 		return A+B;
 	}
 	public int DIFF(){
 		return A-B;
 	}
 	public int PROD(){
 		return A*B;
 	}
 	public int DIV(){
 		return A/B;
 	}
 	}
 	