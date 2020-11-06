import java.util.*;

class Addition{
	public static void main(String[] args) {
		ADD add = new ADD();
		Scanner sc = new Scanner(System.in);
		int ex=0;
		do{
			add.INPUT();
			System.out.println("Sum is :"+add.COMPUTESUM());
			System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
		}while(ex==1);
	}
}

class ADD{
	private static int A,B;
	private Scanner sc = new Scanner(System.in);
	public ADD(){
		A=0;
		B=0;
	}
	public void INPUT(){
		System.out.println("Enter the first number");
		valid();
		A=sc.nextInt();
 		System.out.println("Enter the second number");
 		valid();
 		B=sc.nextInt();
	}
	public int COMPUTESUM(){
		return A+B;
	}
	public void valid(){
		while (!sc.hasNext("[0-9]+")) {
        System.out.println("Please, Enter numbers!!");
        sc.next();
    	}
	}
}