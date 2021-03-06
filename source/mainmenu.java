import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainmenu extends JFrame implements ActionListener
{
	Container con = getContentPane();
	GregorianCalendar curtime = new GregorianCalendar();
  		JLabel label1 = new JLabel("Current time is: " + curtime.get(GregorianCalendar.HOUR) + ":" + curtime.get(GregorianCalendar.MINUTE));
		Icon sms = new ImageIcon(getClass().getResource("sms.png"));
		JButton bSMS = new JButton("SMS", sms);
		Icon calc = new ImageIcon(getClass().getResource("calc.png"));
		JButton bCalc = new JButton("Calculator", calc);
		Icon pb = new ImageIcon(getClass().getResource("pb.png"));
		JButton bPB = new JButton("Phonebook", pb);
		Icon phone = new ImageIcon(getClass().getResource("phone.png"));
		JButton bPhone = new JButton("Phone", phone);
  public mainmenu()
  {
	    super("Main menu");
		con.setLayout(new BorderLayout());
		con.add(label1, BorderLayout.CENTER);
		con.add(bSMS, BorderLayout.NORTH);
		con.add(bCalc, BorderLayout.SOUTH);
		con.add(bPB, BorderLayout.EAST);
		con.add(bPhone, BorderLayout.WEST);
		bSMS.addActionListener(this);
		bCalc.addActionListener(this);
		bPB.addActionListener(this);
		bPhone.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent ae)
  {
	  Object source = ae.getSource();
	  if(source == bSMS)
	  {
	  SMS SMSFrame = new SMS();
	  SMSFrame.setVisible(true);
	  }
	  else if(source == bCalc)
	  {
		  Calculator CalcFrame = new Calculator();
		  CalcFrame.setVisible(true);
	  }
	  else if(source == bPB)
	  {
		Phonebook phonebook=new Phonebook();
        phonebook.setVisible(true);
        phonebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        phonebook.setTitle("Phonebook");
        phonebook.setSize(800,600);
        phonebook.setResizable(false);
	  }
	  else if(source == bPhone)
	  {
		  Phone pFrame = new Phone();
		  pFrame.setVisible(true);
		  pFrame.setSize(300,300);
	  }
  }
}
 
