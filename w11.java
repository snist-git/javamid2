import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class w11 implements MouseListener, MouseMotionListener, KeyListener
{
  JFrame f;
  JLabel l,l2,l3;
  w11()
  {
    f = new JFrame("Event Testing GUI");
    l  = new JLabel();
    l2 = new JLabel();
    l3 = new JLabel();
    l.setBounds(25,25,400,50);
    l2.setBounds(25,85,400,50);
    l3.setBounds(25,140,400,50);
    l.setFont(new Font("Consolas",Font.BOLD,18));
    l2.setFont(new Font("Consolas",Font.BOLD,18));
    l3.setFont(new Font("Consolas",Font.BOLD,18));
    f.addMouseListener(this);
    f.addMouseMotionListener(this);
    f.addKeyListener(this);
    f.setSize(500,300);
    f.add(l);
    f.add(l2);
    f.add(l3);
    f.setVisible(true);
    f.setLayout(null);
  }

  public void mouseClicked(MouseEvent e)
  {
	l.setText("Mouse Clicked : X = "+e.getX()+" Y = "+e.getY());
  }

  public void mouseEntered(MouseEvent e)
  {
	l.setText("Mouse Entered : X = "+e.getX()+" Y = "+e.getY());
  }

  public void mouseExited(MouseEvent e)
  {
	l.setText("Mouse Exited : X = "+e.getX()+" Y = "+e.getY());
  }

  public void mousePressed(MouseEvent e)
  {
	l.setText("Mouse Pressed : X = "+e.getX()+" Y = "+e.getY());
  }

  public void mouseReleased(MouseEvent e)
  {
	l.setText("Mouse Released : X = "+e.getX()+" Y = "+e.getY());
  }

  public void mouseMoved(MouseEvent e)
  {
        l2.setText("Current Mouse Co-ordinates : ("+e.getX()+","+e.getY()+")");
  }

  public void mouseDragged(MouseEvent e)
  {
       l.setText("Mouse dragged.");
  }

  public void keyPressed(KeyEvent e)
  {
      l3.setText("Key Pressed.");
  }

  public void keyReleased(KeyEvent e)
  {
      l3.setText("Key Released.");
  }

  public void keyTyped(KeyEvent e)
  {
      l3.setText("Key Typed.");
  }

}

public class week11_mouseandkeyevents
{
  public static void main(String args[])
  {
    new w11();
  }
}

