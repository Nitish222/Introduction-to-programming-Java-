import java.util.*;
class Principal{
	public static void main(String[] args) {
		String name,subject;
		float basic,da,hra;
		Scanner sc = new Scanner(System.in);
		Teacher tc = new Teacher();
 		System.out.println("Enter the name");
		name=sc.nextLine();
 		System.out.println("Enter the subject");
 		subject=sc.nextLine();
 		System.out.println("Enter the basic salary");
 		basic=sc.nextFloat();
 		System.out.println("Enter the DA ");
 		da=sc.nextFloat();
 		System.out.println("Enter the HRA");
 		hra=sc.nextFloat();
 		tc.READ_DATA(name,subject,basic,da,hra);
 		tc.DISPLAY_DATA();
	}
}
class Teacher{
	private String NAME,SUBJECT;
	private float BASIC, DA, HRA;
	private float CALCULATE(){
		return BASIC+DA+HRA;
	}
	public Teacher(){
		NAME = null;
		SUBJECT = null;
		BASIC = 0.0f;
		DA = 0.0f;
		HRA = 0.0f;
	}
	public void READ_DATA(String name, String subject, 
						float basic,float da,float hra)
	{
		NAME = name;
		SUBJECT = subject;
		BASIC = basic;
		DA = da;
		HRA = hra;
	} 
	public void DISPLAY_DATA(){
		System.out.println("Name : "+NAME);
		System.out.println("Subject : "+SUBJECT);
		System.out.println("Basic salary : "+BASIC);
		System.out.println("DA : "+DA);
		System.out.println("HRA : "+HRA);
		System.out.println("Total salary : "+CALCULATE());
	}
}
