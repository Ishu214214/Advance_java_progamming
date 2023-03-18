//Create a Rectangle and fill color
import java.applet.*;
import java.awt.*;

public class GfgApplet extends Applet {
public void paint(Graphics g) {
g.drawRect(300,150,200,100);
g.setColor(Color.yellow);
g.fillRect( 300,150, 200, 100 );
g.setColor(Color.magenta);
g.drawString("Rectangle",500,150);

}
}
/*
<applet code="GfgApplet" width=300 height=400>;
</applet>;
*/