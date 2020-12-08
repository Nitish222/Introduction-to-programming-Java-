import java.util.*;

class prg1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=0;
		System.out.println("Please enter the number of rows you want: ");
		rows=sc.nextInt();

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}
}