import java.util.*;
public class Calculator{

		public static void main(String[] args) {
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		int option = 0,ex=0;
		do
 		{
 			System.out.println("Enter your choice from the following menu:");
 			System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
	 		option = sc.nextInt();
 			if(option!=5){
 				op.INPUT();
 			}
 			else
 			{
 				break;
 			}
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
	private int A,B;
	private Scanner sc = new Scanner(System.in);
	public Operation(){
		A=0;
		B=0;
	}
	public void INPUT(){
 	System.out.println("Enter the first number");
	A=sc.nextInt();
 	System.out.println("Enter the second number");
 	B=sc.nextInt();
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
 	