import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;
public class mouse implements MouseListener,MouseMotionListener
 {
    Frame f;
    String msg="";
    int x=20,y=20;
    mouse()
    {
        f=new Frame("mouse events")
    {
        public void paint(Graphics g)
        {
            g.drawString(msg,x,y);
        }
    };
    f.setSize(400,400);
    f.setBackground(Color.black);
    f.setForeground(Color.white);
    f.setVisible(true);
    f.addMouseListener(this);
    f.addMouseMotionListener(this);
   }
  
   public void mouseClicked(MouseEvent e) {
        msg="mouse is clicked";
        f.setBackground(Color.red);
        f.repaint();
   }
   public void mouseEntered(MouseEvent e)
   {
    msg="mouse is entered";
    f.setBackground(Color.blue);
    f.repaint();
   }
   public void mouseExited(MouseEvent e)
   {
    msg="mouse is exited";
    f.setBackground(Color.green);
    f.repaint();
   }
   public void mouseReleased(MouseEvent e)
   {
    msg="mouse is released";
    f.setBackground(Color.orange);
    f.repaint();
   }
   public void mousePressed(MouseEvent e)
   {
    msg="mouse is pressed";
    f.setBackground(Color.MAGENTA);
    f.repaint();
   }
   public void mouseDragged(MouseEvent e)
   {
    msg="mouse is dragged";
    f.setBackground(Color.PINK);
    f.repaint();
   }
   public void mouseMoved(MouseEvent e)
   {
    msg="mouse is moved";
    f.setBackground(Color.yellow);
    f.repaint();
   }
   public static void main(String args[])
   {
    new mouse();
   }
}
