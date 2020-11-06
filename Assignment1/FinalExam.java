import java.util.*;
import java.io.*;
class FinalExam{
	public static void main(String[] args) {
		int ex=0,n=0;
		float N=0;	
		//float sub1=0, sub2=0, sub3=0, sub4=0, sub5=0;
        Score sco = new Score();
		Scanner s = new Scanner(System.in);
		do
 		{
 			try{
			File file = new File(args[0]);
        	Scanner sc = new Scanner(file);
        	sc.useDelimiter("\\D+");
        	while(sc.hasNext()){
             while(n!=5){
             	N = sc.nextInt();
				System.out.println("The Marks of "+(n+1)+" subject is :"+ N);	
				sco.INPUT(N);
				n++;
				}
				sc.nextLine();
        	}
        	}
        	catch(FileNotFoundException e){
        		System.out.println("File doesnt exist!!");
        	}
        	System.out.println("Final Grade is: "+sco.CALC_GRADE());
	 		System.out.println("\nDo you want to continue?1.Yes 2.No");
	 		ex=s.nextInt();
	 	}while(ex==1);
	}
}

class Score{
	private float mrk[] = new float[10];
	private Scanner sc = new Scanner(System.in);
	
	public void INPUT(float N){
		for (int i=0; i<5; i++ ) {
			if(N<=100){
			mrk[i] = N;
			}
			else{
				System.out.println("The file contain invalid input!!");
				System.exit(0);
			}
		}
	}
	private float SUM(){
		float sum=0;
		for (int i=0; i<5; i++) {
			sum = sum+mrk[i];
		}
		return sum;
	}
	public float CALC_PERC(){
		return (SUM()/500)*100;
	}
	public char CALC_GRADE(){
		if(CALC_PERC()>=80){
        	return 'A';
      	}
      	else if(CALC_PERC()>=60 && CALC_PERC()<80){
        	return 'B';
      	}
      	else if(CALC_PERC()>=40 && CALC_PERC()<60){
        	return 'C';
      	}
      	else {
        	return 'D';
      	}
	}
}