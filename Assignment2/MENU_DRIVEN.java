import java.util.*;
import java.io.*;
public class MENU_DRIVEN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 0,option=0, ex=1;
		do{
			try{
 			//inputing number and power
 			File file = new File(args[0]);
 			Scanner fs = new Scanner(file);
 			fs.useDelimiter("\\D+");
 			while(fs.hasNext()){
			//taking in the number and passing it to the constructor
			//of class Reverse_Palindrome as parameter
			
			N = fs.nextInt();
			Reverse_Palindrome rp = new Reverse_Palindrome(N);
			System.out.println("The number is: "+N);
			//switch case for menu 
			System.out.println("Enter your choice from the following menu:");
 			System.out.println("1.Reverse 2.Pallindrome 3.Exit"); 
			option = sc.nextInt();
			switch(option){
				case 1:rp.Print_Reverse();
					   break;
				case 2:rp.Compute_Palindrome();
			     	   break;
				case 3:ex = 0;
					   System.exit(0);
				default: {
					System.out.println("Invalid Response");
				}
			}
		}
	}
			catch(NoSuchElementException|FileNotFoundException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
			System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
		}while(ex==1);
	}
}


class Reverse_Palindrome {

	private int NUM;
	//constructor to initialize members
	public Reverse_Palindrome(int n){
		NUM=n;
	}

	//function to print reverse of the number
	public void Print_Reverse(){
		int digit=0, rev=0, Original_NUM=0;
		
		//storing the original number
		Original_NUM = NUM;

		//take digit at 10th place
		//store it in rev 
		// then move to digit at next place 
		while(NUM != 0){
			digit = NUM % 10;
			rev = rev * 10 + digit;
			NUM /= 10;
		}
		System.out.println("The reversed number is: "+ rev);
	}
	
	//function to check if the number is pallindrome
	public void Compute_Palindrome() {
		int rev=0, digit=0, Original_NUM=0;
		
		//storing the original number
		Original_NUM = NUM;
		//take digit at 10th place
		//store it in rev 
		// then move to digit at next place 
		while(NUM != 0){
			digit = NUM % 10;
			rev = rev * 10 + digit;
			NUM /= 10;
		}
		//conditions to check if reverse of number is equal to original
		//if it is then pallindrome , if not then its not
		if(Original_NUM == rev)
			System.out.println(Original_NUM + " is a palindrome.");
		else
			System.out.println(Original_NUM + " is not a palindrome.");
	}
}

