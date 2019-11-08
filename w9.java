import java.awt.*;
import java.awt.event.*;

public class w9 extends Frame implements ActionListener
{
	Button b1,b2;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	w9()
	{
		super("Calc");
		setLayout(null);
		l1 = new Label("Parameter 1");
		l2 = new Label("Parameter 2");
		l3 = new Label("Result");
		b1 = new Button("Addition");
		b2 = new Button("Subtraction");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		l1.setBounds(50,50,70,20);
		l2.setBounds(50,100,70,20);
		l3.setBounds(50,150,70,20);
		b1.setBounds(50,200,50,20);
		b2.setBounds(150,200,70,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		t3.setBounds(150,150,100,20);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new w9();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			t3.setText((Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()))+"");
		}
		if(ae.getSource() == b2)
		{
			t3.setText((Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText()))+"");
		}
	}
}
