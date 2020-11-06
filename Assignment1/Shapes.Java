
import java.util.*;
import java.util.InputMismatchException;
public class Shapes{
     public static void main(String args[]) 

	{

	    DIFFERENT_SHAPES ds = new DIFFERENT_SHAPES();
        Scanner sc = new Scanner(System.in);
        int option = 0,ex=0;
        float side, length, breath;
        double radius;
        do
        {
            try{
            System.out.println("Enter your choice from the following menu:");
            System.out.println("1.Square 2.Rectangle 3.Circle 5.Exit");
            option = sc.nextInt();
            switch(option)
            {
            case 1: System.out.print("Enter the side :");
                    side = sc.nextFloat();
                    System.out.println("Area of Square is "+ds.area(side));
                    break;
            case 2: System.out.print("Enter the length :");
                    length = sc.nextFloat();
                    System.out.print("\nEnter the breath :");
                    breath = sc.nextFloat();
                    System.out.println("Area of Rectangle is "+ds.area(length,breath));
                    break;
            case 3: System.out.print("Enter the radius :");
                    radius = sc.nextDouble();
                    System.out.println("Area of Circle is "+ds.area(radius));
                    break;
            case 5: break;
            default: System.out.println("Invalid choice!!");
            }
             
            }
            catch(InputMismatchException e){
                    System.out.println("Enter a integer");
                }
            sc.nextLine();
            System.out.println("Do you want to continue?1.Yes 2.No");
             ex=sc.nextInt();
            }while(ex==1);
        }
    }

class DIFFERENT_SHAPES
{
    private float LENGTH,BREATH,SIDE;
    private double RADIUS;

    public DIFFERENT_SHAPES(){
        LENGTH=0;
        BREATH=0;
        SIDE=0;
        RADIUS=0;
    }

    public float area(float x)

    {

        return x*x;

    }

    public float area(float x, float y)

    {

        return x*y;

    }

    public double area(double x)

    {

        return 3.14*x*x;

    }

}