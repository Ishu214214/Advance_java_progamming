package workshop;

public class Conditional_operator {

    public static void main(String[] args)
    {
        int i,j;
        i=10;
        j= i<0 ? -i : i;
        System.out.println(i + " " + j); 
        
        i=-10;
        j= i<0 ? -i : i;
        System.out.println(i + " " + j);
    }
    
}
