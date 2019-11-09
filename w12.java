import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class n implements WindowListener
{
  n()
  {
     JFrame f = new JFrame("Window Events");
     f.addWindowListener(this);
     f.setVisible(true);
     f.setLayout(null);
     f.setSize(300,300);
  }

  public void windowActivated(WindowEvent e)
  {
 	System.out.println("Window Activated.");
  }
  public void windowClosed(WindowEvent e)
  {
 	System.out.println("Window Closed.");
  }
  public void windowClosing(WindowEvent e)
  {
 	System.out.println("Window Closing.");
  }
  public void windowDeactivated(WindowEvent e)
  {
 	System.out.println("Window Deactivated.");
  }
  public void windowDeiconified(WindowEvent e)
  {
 	System.out.println("Window Deiconified.");
  }

  public void windowIconified(WindowEvent e)
  {
 	System.out.println("Window Iconified");
  }

  public void windowOpened(WindowEvent e)
  {
 	System.out.println("Window Opened.");
  }
 }

public class week12_windowevents
{
  public static void main(String args[])
  {
     new n();
  }
}

