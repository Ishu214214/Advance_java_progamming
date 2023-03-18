class Box{
    int height;
    int width;
    int depth;
    void ishu(int a,int b,int c)
    {

        int vol;
        vol=a*b*c;
        System.out.println(vol);
    }
}

public class object {
    

    public static void main(String args[])
    {
       Box mybox = new Box();
        mybox.width=10;
        mybox.height=10;
        mybox.depth=10;



       // System.out.println(vol);
       
        mybox.ishu(mybox.width,mybox.height,mybox.depth);

        
    }
}
