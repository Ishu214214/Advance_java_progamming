public class Exception_eg {

    public static void main(String[] args){

        try{
            //string
        String s;
        s=null;
        System.out.println(s.length());
       
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("null call");
        }
         //////////////////////////////////////////////////////////////
      //array out of bound
       try
       {
        int [] a={1,2,3,4};
       System.out.println(a[10]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
           System.out.println("array call");
       }

      /////////////////////////////////////////
      //throw whia
      
      try{
            int a=2;
            if(a>18){
                System.out.println("you are eligebal");

            }
            else{
                throw new ArithmeticException("You are not  eligebal");
            }

      }

      catch(ArithmeticException e)
      {
          System.out.println(e);
          System.out.println("vote cheak");
      }




    }
    
}
