import java.awt.*;
// import java.util.logging.Formatter;

public class AWT_program_1 extends Frame{

    AWT_program_1(){

        Button b = new Button("ishu");

        b.setBounds(30,200,80,30);

        add(b);

        setSize(300,200);

        setTitle("titel");

        setLayout(null);

         setVisible(true);


    }

   public static void main(String[] args){


    AWT_program_1 f =new AWT_program_1();

   }


}


