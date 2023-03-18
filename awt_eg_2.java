import java.awt.*;

import java.awt.event.*;

import javax.swing.Action;

public class awt_eg_2 {
    awt_eg_2()
    {
        Frame f = new Frame();

        Checkbox cheakbox1 = new Checkbox("Welcome");
        cheakbox1.setBounds(100,100,50,50);
        
        
        Checkbox cheakbox2 = new Checkbox("Welcome");
        cheakbox2.setBounds(100,150,50,50);

        f.add(cheakbox1);
        f.add(cheakbox2);




        Label I = new Label("ishu id");

        Button B = new Button("submit");

        TextField t = new TextField();

        B.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                t.setText("Welcome to javapointer");
            }

        } );

        I.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        B.setBounds(100,100,80,30);
        f.add(B);
        f.add(I);
        f.add(t);

        f.setTitle("title");

        f.setLayout(null);

        f.setVisible(true);
    }

    public static void main(String[] args){

        awt_eg_2 awt_obj = new awt_eg_2();

    }

    
}
