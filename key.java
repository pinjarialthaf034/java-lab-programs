import java.awt.*;
import java.awt.event.*;

public class key implements KeyListener
 {
    Frame f;
    String msg="";
    key()
    {
        f=new Frame(){
            public void paint(Graphics g)
            {
                g.drawString(msg,100,100);
            }
        };
        f.setBackground(Color.black);
        f.setForeground(Color.white);
        f.setVisible(true);
        f.addKeyListener(this);
        f.setSize(400,400);

    }
    public void keyPressed(KeyEvent e)
    {
        msg="key is pressed";
         f.setBackground(Color.RED);
        f.repaint();
    }
    public void keyReleased(KeyEvent e)
    {
        msg="key is released";
        f.setBackground(Color.BLUE);
        f.repaint();
    }
    public void keyTyped(KeyEvent e)
    {
        msg="key is typed";
         f.setBackground(Color.green);
        f.repaint();
    }
    public static void main(String args[])
    {
        new key();
    }
}
