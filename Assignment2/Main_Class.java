import java.util.*;
import java.io.*;
public class Main_Class{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Character> Capital = new ArrayList<>();
		List <Character> Small = new ArrayList<>();
		List <Character> Number = new ArrayList<>();
		List <Character> Special = new ArrayList<>();
		char ch = '\0';
		int ex=0; //variable ex for asking user to continue
		do
 		{
 			try{
 		// 	//inputing number and power
 		// 	File file = new File(args[0]);
 		// 	Scanner fs = new Scanner(file);
 		// 	fs.useDelimiter("\\D+");
 		// 	while(fs.hasNext()){
 		// 	//inputing character
			// ch = fs.next().charAt();
 			File f=new File("Test.txt");     //Creation of File Descriptor for input file
      		FileReader fr=new FileReader(f);   //Creation of File Reader object
      		BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
      		int c = 0;             
      		while((c = br.read()) != -1)         //Read char by Char
      		{
            	ch = (char) c;          //converting integer to char
	 			Finding_Character fc = new Finding_Character(ch);
	 			//printing result
            	if(fc.Seek_Rightcharacter()=="Capital")
            		Capital.add(ch);
            	else if(fc.Seek_Rightcharacter()=="Small")
            	Small.add(ch);
           	 	else if(fc.Seek_Rightcharacter()=="Number")
            		Number.add(ch);
            	else if(fc.Seek_Rightcharacter()=="Special")
            		Special.add(ch);
	 		}
	 		}
	 		catch(IOException|ArrayIndexOutOfBoundsException e){
        System.out.println("Either one of the input in file is not correct format or The file doesn't exist!!");
      }
            System.out.println("Capital : "+Capital);
	 		System.out.println("Small : "+Small);
	 		System.out.println("Number : "+Number);
	 		System.out.println("  Special : "+Special);
	 		//asking user if he want to continue
	 		System.out.println("Do you want to continue?1.Yes 2.No");
	 		ex=sc.nextInt();
	 		}while(ex==1);
	 		
	}
}

class Finding_Character {
	private char A;
	//constructor initializing member with parameter
	public Finding_Character(char ch) {
		A = ch;
	}
	//function to check
	public String Seek_Rightcharacter() {
		if(A>='A' && A <= 'Z')
			return "Capital";
		else if(A>='a' && A <= 'z')
			return "Small";
		else if(A>='0' && A<= '9')
			return "Number";
		else
			return "Special";
	}
}

