import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class paintdemo extends Applet implements MouseMotionListener{
    int w,h;
    Image i;
    Graphics g1;
    public void init(){
        w=getSize().width;
        h=getSize().height;
        i=createImage(w,h);
        g1=i.getGraphics();
        g1.setColor(Color.white);
        g1.fillRect(0,0,w,h);
        g1.setColor(Color.red);
        i=createImage(w,h);
        g1.setColor(Color.white);
        g1.fillRect(0,0,w,h);
        g1.setColor(Color.blue);
        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent me){
        int x=me.getX();
        int y=me.getY();
        g1.fillOval(x-10,y-10,20,20);
        repaint();
        me.consume();
    }
    public void update(Graphics g){
        g.drawImage(i,0,0,this);
    }
    public void pain(Graphics g){
        update(g);
    }
}