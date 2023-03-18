import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;  


 

class Login implements ActionListener{



Frame f = new Frame();


JLabel l1 = new JLabel("User iD");
JLabel l2 = new JLabel("password");


JTextField t1 = new JTextField();
JPasswordField t2 = new JPasswordField();


Button b1 = new Button("Submit");
Button b2 = new Button("Cancle");

    


Login()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);


t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);


b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);


f.add(l1);
f.add(l2);


f.add(t1);
f.add(t2);


f.add(b1);
f.add(b2);



b1.addActionListener(this);
b2.addActionListener(this);


f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);


}

public void actionPerformed(ActionEvent e)
{



if(e.getSource()==b1)
{
    try{
    Class.forName("com.mysql.dbc.Driver");  
    
    Connection con = DriverManager.getConnection("dbc:mysql://localhost:3306/java_database", "root", "root");

    PreparedStatement ps = con.prepareStatement("insert ui and password...");

    ResultSet rs = ps.executeQuery();

   // if (rs.next())

//    {

    Label l3 = new Label("Done");
    l3.setBounds(200,180,100,20);

    f.add(l3);


    t1.setText("");
    t2.setText("");
  //  }

    }
    catch (Exception ex)

    {

        System.out.println(ex);

    }
}

if(e.getSource()==b2)
{
    System.exit(0);
}

}
public static void main(String[] args)
{
    try{
   
    new Login();

}


catch(Exception e){ System.out.println(e);}  
}  

}

