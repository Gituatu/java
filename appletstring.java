import java.awt.*;
import java.applet.*;
/*<applet code=appletstring height=400 width=400></applet> */
class appletstring extends Applet{
    public static void init(){
        setForeground(color.yellow);
    }
    public static void paint(Graphics g){
        g.drawString("Hello World", 80, 40);
    }
}
