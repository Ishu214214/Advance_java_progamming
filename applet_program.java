import java.awt.*;
import java.applet.*;
public class applet_program extends Applet
{
String msg="";
public void init()
{
msg="This is first applet program";
}

public void start()
{
msg=msg+",it is client side program";
}

public void paint(Graphics g)

{
g.drawString(msg,40,60);
}

}

/*
<applet code="fillColor" width=300 height=400>;
</applet>;
*/