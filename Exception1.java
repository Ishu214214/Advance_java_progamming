import java.util.Scanner;

class Parent
{ 
    void ishu()
    {
        try{
        System.out.println("enter the input for division ");

        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("the value of 1st number");
        a=sc.nextInt();
        System.out.println("the value of 2st number");
        
        b=sc.nextInt();
        System.out.println("the answer is "+a/b);
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
        // e.printStackTrace(); // it will track all the value wherre the error is handeling 
        System.out.println("enter the again input where not = zero of 2nd value");
    }
    // funally statement will always run 
    finally{
        System.out.println("the you get the result ");

    }
    }

}

public class Exception1 extends Parent
{
    public static void main (String[] args)
    {
        Exception1 a1 =new Exception1();
        a1.ishu();
    }
}
