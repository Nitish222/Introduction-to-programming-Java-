import java.util.*;
class Que10 extends Thread{
  public static Scanner sc = new Scanner(System.in);
  public static Que10 obj = new Que10();
  private int rows,col;
  public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        obj.cont(start);

  }
  
public void cont(long start){
        int ex=1;
        do{
                obj.input();
                long finish = System.currentTimeMillis();
                System.out.println("Time consumed: " + (finish - start) + " ms");
                System.out.println("\nDo you want to continue?1.Yes 2.No");
                ex=sc.nextInt();
            }while(ex==1);
    }
public void print(int [][] arr){
  System.out.println("the numbers you have entered are: "); 
            for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print(arr[i][j] + "("+i+","+j+") " );
            } 
            System.out.println();
        }  
}

public int[][] input(){
    //entering rows and coloumns and initializing array
    System.out.println("Please enter the rows ");
    rows=sc.nextInt();
    System.out.println("Please enter the columns ");
    col=sc.nextInt();
    int arr[][] = new int[rows][col];
    if(rows==col){
    for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.println("Please enter the array element at position: ["+i+" , "+j+"]");
                arr[i][j]=sc.nextInt(); 
            } 
    }
  }
   else
    System.out.println("The Matrix is not eligible for such addition, number of row must be equal to coloumns");
    obj.print(arr);
    return arr;
}
  public void sum() {
       int arr[][] = obj.input();
       Thread sumabove = new Thread(){
            public void run() {
                  int abovesum=0;
                  for (int j = 1; j < col; j++) {
                  for (int i=j-1 ; i>=0 ; i--) {
                  abovesum= abovesum + arr[i][j];
                }
              }
              System.out.println("-----------------------\nThe sum of elements above the diagnal is:"+abovesum+"\n-----------------------");
            }
       };
       Thread sumBelow = new Thread(){
        public void run(){
           int sumBelow=0;
           for (int i = 1; i < rows; i++) {
              for (int j=i-1 ; j>=0 ; j--) {
                    sumBelow= sumBelow+ arr[i][j];
            }
          }
          System.out.println("The sum of elements below the diagnal is: "+sumBelow);
        }
      };
      sumabove.start(); 
      sumBelow.start();
    } 
}


public interface ToDo {

   void doing();

   void doingNext();

   void didIt();
}

public interface DoIt {

   void doSomething(int i, double x);
   int doSomethingElse(String s);
   
   
}

public interface ToDoVersion2 extends ToDo {
   
   void didIt();
   
}

public interface Cloneable {

}

public interface Serializable {

}

public interface ToDo {

   void doing(int i, double x);
   int doingNext(String s);
   default boolean didIt() {
      //implementation of our didIt method
   }
   
}

public interface Grouped Interface extends Interface1, Interface2, Interface3 {
    // constant declarations
    // base of natural logarithms
    double E = 2.718282;
    // method signatures
    void doSomething (int i, double x);
    int doSomethingElse(String s);
}


interface MyInterface
{
public void method1();
   public void method2();
}
class Demo implements MyInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error 
     */
public void method1()
   {   System.out.println("implementation of method1");
   }


public void method2(){
  System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
  MyInterface obj = new Demo();
  obj.method1();
   }
}

class B implements I1 { }
I1 i1 = new C();
i1 = new B();
i1 = new D();
.
.
.
class D extends C { }



interface I1 { }
interface I2 { }
class C implements I1, I2 { }
C c = new C();
boolean isC = (c instanceof C);   //true
boolean isI1 = (c instanceof I1); //true
boolean isI2 = (c instanceof I2); //true


public interface Grouped Interface extends Interface1, Interface2, Interface3 {
    
    double E = 2.718282;
    
    void doSomething (int i, double x);

    int doSomethingElse(String s);
}


interface MyInterface
{
public void method1();
   public void method2();
}
class Demo implements MyInterface
{
   
public void method1()
   {   System.out.println("implementation of method1");
   }
public void method2()
   {
  System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
  MyInterface obj = new Demo();
  obj.method1();
   }
}

public interface Todo {
   void doing();
   void doingNext(S);
   default boolean didIt() {
       // Method body 
   }
}
