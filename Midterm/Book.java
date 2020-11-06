import java.util.*;
 class Library{

		public static void main(String[] args); {
		Book bk = new Book();
		Scanner sc = new Scanner(System.in);
		int book_no=0, N=0, option = 0,ex=0;
		float price=0;
		String book_title;
		do
 		{
 			System.out.println("Enter your choice from the following menu:");
 			System.out.println("1.Shop  2.Exit");
	 		option = sc.nextInt();
 			if(option!=5){
 				System.out.println("Enter the number of copies purchased:");
 				N = sc.nextInt();
 				System.out.println("Enter the Book Number");
				book_no=sc.nextInt();
				sc.nextLine();
 				System.out.println("Enter the Book Title");
 				book_title=sc.nextLine();
 				System.out.println("Enter the Book Price");
 				price=sc.nextFloat();
 				bk.INPUT(book_no,book_title,price);
 			}
 			else
 			{
 				break;
 			}
 			switch(option)
 			{
	 		case 1:bk.PURCHASE(N);
	 		break;
	 		case 5: break;
	 		default: System.out.println("Invalid choice!!");
	 		}
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
		}
	}
class Book{
	private int BOOK_NO;
	private String BOOK_TITLE;
	private float PRICE;
	private Scanner sc = new Scanner(System.in);
	public Book(){
		BOOK_NO = 0;
		PRICE = 0;
		BOOK_TITLE = null;
	}
 	private float TOTAL_COST(int n){
 		return PRICE*n;
 	}
 	public void INPUT(int book_no,String book_title,float price){
 		BOOK_NO = book_no;
 		BOOK_TITLE = book_title;
 		PRICE = price;
 	}
 	public void PURCHASE(int N){
 		System.out.println(" Total Cost of "+N+" Copies of "+BOOK_TITLE+" is "+ TOTAL_COST(N));
 	}
 	}
