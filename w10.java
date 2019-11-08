import java.awt.*;
import java.awt.event.*;

public class w10 extends Frame implements ActionListener , WindowListener
{
	String str = "";
	Label l;
	char op;
	double n1,n2;
	Panel p;
	TextField tf;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdiv,bequal,bmul,bpoint,bsub,bsum,del,clr,sqrt,pow;
	w10()
	{
		super("Advaneced Calculator");
		setSize(400,400);
		
		p = new Panel();
		l=new Label("# denotes Square Root");
		tf = new TextField();
		b9 = new Button("9");
		b8 = new Button("8");
		b7 = new Button("7");
		b6 = new Button("6");
		b5 = new Button("5");
		b4 = new Button("4");
		b3 = new Button("3");
		b2 = new Button("2");
		b1 = new Button("1");
		b0 = new Button("0");
		bdiv = new Button("/");
		bmul = new Button("*");
		bsum = new Button("+");
		bsub = new Button("-");
		bequal = new Button("=");
		bpoint = new Button(".");
		del = new Button("Del");
		clr = new Button("AC/C");
		sqrt = new Button("sqrt");
		pow = new Button("^");
		
		p.setLayout(new GridLayout(4,5,5,5));
		
		add(tf,BorderLayout.NORTH);	
		add(l,BorderLayout.SOUTH);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bdiv);
		p.add(sqrt);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bmul);
		p.add(pow);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bsub);
		p.add(del);
		p.add(bpoint);
		p.add(b0);
		p.add(bequal);
		p.add(bsum);		
		p.add(clr);
		
		
		addWindowListener(this);
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
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bpoint.addActionListener(this);
		bsum.addActionListener(this);
		bequal.addActionListener(this);
		del.addActionListener(this);
		clr.addActionListener(this);
		sqrt.addActionListener(this);
		pow.addActionListener(this);
		
		add(p,BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	public static void main(String arg[])
	{
		new w10();
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("0"))
			tf.setText(str+="0");
		else if(s.equals("1"))
			tf.setText(str+="1");
		else if(s.equals("2"))
			tf.setText(str+="2");
		else if(s.equals("3"))
			tf.setText(str+="3");
		else if(s.equals("4"))
			tf.setText(str+="4");
		else if(s.equals("5"))
			tf.setText(str+="5");
		else if(s.equals("6"))
			tf.setText(str+="6");
		else if(s.equals("7"))
			tf.setText(str+="7");
		else if(s.equals("8"))
			tf.setText(str+="8");
		else if(s.equals("9"))
			tf.setText(str+="9");
		else if(s.equals("."))
			tf.setText(str+=".");
		else if(s.equals("Del"))
			tf.setText(str=(str.equals(""))?"":str.substring(0,str.length()-1));
		else if(s.equals("AC/C"))
			tf.setText(str="");
		else if(s.equals("+"))
		{
			op=s.charAt(0);
			tf.setText(str+="+");
		}
		else if(s.equals("-"))
		{
			op=s.charAt(0);
			tf.setText(str+="-");
		}
		else if(s.equals("*"))
		{
			op=s.charAt(0);
			tf.setText(str+="*");
		}
		else if(s.equals("/"))
		{
			op=s.charAt(0);
			tf.setText(str+="/");
		}
		else if(s.equals("^"))
		{
			op=s.charAt(0);
			tf.setText(str+="^");
		}
		else if(s.equals("sqrt"))
		{
			op='#';
			tf.setText(str+="#");
		}
		else if(s.equals("="))
		{
			tf.setText(calculate(str));
			str="";
		}
		else
			tf.setText("ERROR");
	}
	public String calculate(String exp)
	{
		int n=exp.indexOf(op);
		double res=0.0;
		switch(op)
		{
			case '+' :n1=Double.parseDouble(exp.substring(0,n));
			n2=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=n1+n2;
			break;
			case '-' :n1=Double.parseDouble(exp.substring(0,n));
			n2=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=n1-n2;
			break;
			case '*' :n1=Double.parseDouble(exp.substring(0,n));
			n2=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=n1*n2;
			break;
			case '/' :n1=Double.parseDouble(exp.substring(0,n));
			n2=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=n1/n2;
			break;
			case '^' :n1=Double.parseDouble(exp.substring(0,n));
			n2=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=Math.pow(n1,n2);
			break;
			case '#' :n1=Double.parseDouble(exp.substring(n+1,exp.length()));
			res=Math.sqrt(n1);
			break;
			default:return("Error");
		}
		return res+"";
	}
	public void windowDeactivated(WindowEvent we)
	{
		
	}
	public void windowActivated(WindowEvent we)
	{
	
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeiconified(WindowEvent we)
	{
	
	}
	public void windowIconified(WindowEvent we)
	{
	
	}
	public void windowClosed(WindowEvent we)
	{
	
	}
	public void windowOpened(WindowEvent we)
	{
	
	}
}
