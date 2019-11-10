import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class w10alternate implements ActionListener
{
   JTextField a;
   JButton x,y,m,n,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ben,bcl;
   JPanel s;
   JLabel t1,t2,t3,t4,t5;
   double one=0,two=0,three=0;
   char op='0';
   
   w10alternate()
   {

     
     JFrame f = new JFrame("Nice Complex GUI Calculator");
     JLabel l = new JLabel("Welcome! Please enter two numbers to +, - , *, / them.");
     a = new JTextField();
     s = new JPanel(new GridLayout(4,4));
     x = new JButton("+");
     y = new JButton("-");
     m = new JButton("*");
     n = new JButton("/");
     b0 = new JButton("0");
     b1 = new JButton("1");
     b2 = new JButton("2");
     b3 = new JButton("3");
     b4 = new JButton("4");
     b5 = new JButton("5");
     b6 = new JButton("6");
     b7 = new JButton("7");
     b8 = new JButton("8");
     b9 = new JButton("9");
     ben= new JButton("ENTER");
     bcl= new JButton("CLEAR");
     t1 = new JLabel();
     t2 = new JLabel();
     t3 = new JLabel();
     t4 = new JLabel();
     t5 = new JLabel();     
     l.setBounds(20,25,600,50);
     a.setBounds(20,100,400,100); 
     s.setBounds(20,220,400,400);
     t1.setBounds(450,100,100,100);
     t2.setBounds(450,200,100,100);
     t3.setBounds(450,300,100,100);
     t4.setBounds(450,400,100,100);
     t5.setBounds(450,500,240,100);
     x.addActionListener(this);
     y.addActionListener(this);
     m.addActionListener(this);
     n.addActionListener(this);
     b0.addActionListener(this);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     ben.addActionListener(this);
     bcl.addActionListener(this);
     f.add(a);
     s.add(x);
     s.add(y);
     s.add(m);
     s.add(n);
     f.add(l);
     s.add(b0);
     s.add(b1);
     s.add(b2);
     s.add(b3);
     s.add(b4);
     s.add(b5);
     s.add(b6);
     s.add(b7);
     s.add(b8);
     s.add(b9);
     s.add(ben);
     s.add(bcl);
     f.add(s);
     f.add(t1);
     f.add(t2);
     f.add(t3);
     f.add(t4);
     f.add(t5);
     s.setBackground(Color.orange);
     f.setSize(700,700);
     a.setFont(new Font("Consolas",Font.BOLD,36));
     l.setFont(new Font("Consolas",Font.PLAIN,20));
     t1.setFont(new Font("Consolas",Font.BOLD,28));
     t2.setFont(new Font("Consolas",Font.BOLD,28));
     t3.setFont(new Font("Consolas",Font.BOLD,28));
     t4.setFont(new Font("Consolas",Font.BOLD,28));
     t5.setFont(new Font("Consolas",Font.BOLD,28));
     //f.setDefaultLookAndFeelDecorated(true);
     f.setLayout(null);
     f.setVisible(true);
     
   }

   public void actionPerformed(ActionEvent e)
   {
      
      if(e.getSource()==b0)
     		a.setText(a.getText()+"0");
      else if(e.getSource()==b1)
      		a.setText(a.getText()+"1");
      else if(e.getSource()==b2)
      		a.setText(a.getText()+"2");
      else if(e.getSource()==b3)
      		a.setText(a.getText()+"3");
      else if(e.getSource()==b4)
      		a.setText(a.getText()+"4");
      else if(e.getSource()==b5)
      		a.setText(a.getText()+"5");
      else if(e.getSource()==b6)
      		a.setText(a.getText()+"6");
      else if(e.getSource()==b7)
      		a.setText(a.getText()+"7");
      else if(e.getSource()==b8)
      		a.setText(a.getText()+"8");
      else if(e.getSource()==b9)
      		a.setText(a.getText()+"9");

      
      else if(e.getSource()==x)
      {
         op='+';
         t1.setText(a.getText());
         t2.setText(Character.toString(op));
	 one=Double.parseDouble(a.getText());
	 a.setText("");
       }

       else if(e.getSource()==y)
      {
         op='-';
         t1.setText(a.getText());
         t2.setText(Character.toString(op));
	 one=Double.parseDouble(a.getText());
	 a.setText("");
       }

       else if(e.getSource()==m)
      {
         op='*';
         t1.setText(a.getText());
         t2.setText(Character.toString(op));
	 one=Double.parseDouble(a.getText());
	 a.setText("");
       }

       else if(e.getSource()==n)
      {
         op='/';
         t1.setText(a.getText());
         t2.setText(Character.toString(op));
	 one=Double.parseDouble(a.getText());
	 a.setText("");
       }

      
      
       else if(e.getSource()==ben)
       {
          two=Double.parseDouble(a.getText());
          t3.setText(a.getText());
       	  a.setText(String.valueOf(calc(one,two,op)));
          t4.setText("=");
	  t5.setText(a.getText());
       }

       else if(e.getSource()==bcl)
       {
	   one=0;
	   two=0;
	   a.setText("");
        }

   }

   double calc(double one,double two,char op)
   {
	if(op=='+')
		return one+two;
	else if(op=='-')
		return one-two;
	else if(op=='*')
		return one*two;
	else if(op=='/')
		return one/two;
        return one;
   }
}

public class swing5
{
   public static void main(String args[])
   {
      new w10alternate();
   }
}
     
