import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class w9alternate implements ActionListener
{
   JTextField a,b,c;
   JButton    x,y;
   
   w9alternate()
   {
     JFrame f = new JFrame("Simple GUI Calculator");
     JLabel l = new JLabel("Welcome! Please enter two numbers to add or subtract them.");
     a = new JTextField();
     b = new JTextField();
     c = new JTextField();
     x = new JButton("ADD");
     y = new JButton("SUBTRACT");
     l.setBounds(100,25,400,50);
     a.setBounds(175,100,150,50);
     b.setBounds(175,200,150,50);
     c.setBounds(175,400,150,50);
     c.setEditable(false); 
     x.setBounds(25,300,150,50);
     y.setBounds(300,300,150,50);
     x.addActionListener(this);
     y.addActionListener(this);
     f.add(a);
     f.add(b);
     f.add(c);
     f.add(x);
     f.add(y);
     f.add(l);
     f.setSize(500,500);
     f.setLayout(null);
     f.setVisible(true);
   }

   public void actionPerformed(ActionEvent e)
   {
      float one = Float.parseFloat(a.getText());
      float two = Float.parseFloat(b.getText());
      float three = 0;
      if(e.getSource()==x)
	three = one + two;
      else if(e.getSource()==y)
         three = one - two;
      c.setText(String.valueOf(three));
   }
}

public class w9alternate
{
   public static void main(String args[])
   {
      new w9alternate();
   }
}
     
