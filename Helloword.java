import java.util.Scanner;

class Helloword1
{
  int z=0;
}

class Helloword2 extends Helloword1{

    void ishu()
    {
    System.out.println("Hello");
    Scanner in = new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
        int a[]=new int[5];
        System.out.println("enter the number");
        a[i]=in.nextInt();
        z+=a[i];
    }

if(z==10)
{
    System.out.println("sum of 2 number is " + z);

}
else{
    System.out.println("sum of 2 number is not 10");
}

}
}

public class Helloword {
    public static void main(String[] args){

        Helloword2 a=new Helloword2();
        
        a.ishu();

    }
}