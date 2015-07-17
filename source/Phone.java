import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Phone extends JFrame implements ActionListener
{
	JLabel num = new JLabel("");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bh = new JButton("#");
	JButton bs = new JButton("*");	
	JButton bcall = new JButton("Call");
    private String number = "";
    public Phone()
    { 
	super("Phone app");
    Container con = getContentPane();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	con.setLayout(new GridLayout(5,3));
    con.add(b1);
    con.add(b2);
    con.add(b3);
    con.add(b4);
    con.add(b5);
    con.add(b6);
    con.add(b7);
    con.add(b8);
    con.add(b9);
    con.add(bh);
    con.add(b0);
    con.add(bs);
    con.add(bcall);
	con.add(num);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	bh.addActionListener(this);
	bs.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == b1)
		{
			number += "1";
			num.setText(number);
		}
		else if(source == b2)
		{
			number += "2";
			num.setText(number);
		}
		else if(source == b3)
		{
			number += "3";
			num.setText(number);
		}
		else if(source == b4)
		{
			number += "4";
			num.setText(number);
		}
		else if(source == b5)
		{
			number += "5";
			num.setText(number);
		}
		else if(source == b6)
		{
			number += "6";
			num.setText(number);
		}
		else if(source == b7)
		{
			number += "7";
			num.setText(number);
		}
		else if(source == b8)
		{
			number += "8";
			num.setText(number);
		}
		else if(source == b9)
		{
			number += "9";
			num.setText(number);
		}
		else if(source == b0)
		{
			number += "0";
			num.setText(number);
		}
		else if(source == bh)
		{
			number += "#";
			num.setText(number);
		}
		else if(source == bs)
		{
			number += "*";
			num.setText(number);
		}
		else if(source == bcall)
		{
	  JFrame calling = new JFrame();
	  JLabel call = new JLabel("Calling " + number + "...");
	  calling.add(call);
		}	
	}	
}
