import java.util.*;

class Que3{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows=0;
		int k=0;
		System.out.println("Please enter the number of rows you want: ");
		rows=sc.nextInt();
		for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
	}
}