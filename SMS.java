import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SMS extends JFrame implements KeyListener, ActionListener
{
    JLabel tlabel = new JLabel ("Welcome to SMS app");
	JTextField receiver = new JTextField();
    JTextArea SMSarea = new JTextArea();
	JButton send = new JButton("Send");
    public String smstext;
    public int charcount;
    public int smscount;	
    public SMS()
    { 
	super("SMS app");
    Container con = getContentPane();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	con.setLayout(new BorderLayout());
    con.add(tlabel, BorderLayout.NORTH);
	con.add(receiver, BorderLayout.SOUTH);
	con.add(SMSarea, BorderLayout.CENTER);
	con.add(send, BorderLayout.EAST);
	SMSarea.addKeyListener(this);
	send.addActionListener(this);
    }
  
  public void keyTyped(KeyEvent e)
  {
	  Object sourcem = e.getSource();
	  if (sourcem == SMSarea)
	  {
	  this.smstext = SMSarea.getText();
	  this.charcount = this.smstext.length();
	  countsms(this.charcount);
	  tlabel.setText("Number of characters: " + this.charcount + " and number of SMS is " + this.smscount);
	  }
  }
  public void keyPressed(KeyEvent e)
  { 
  }
  public void keyReleased(KeyEvent e)
  {
  }
  public void actionPerformed(ActionEvent e)
  {
	  JFrame sending = new JFrame();
	  JLabel sendm = new JLabel("Sending SMS...");
	  sending.add(sendm);
  }
  
  public void countsms(int charc)
  {
	  if(charc%160==0)
	  {
		  this.smscount = charc/160;
	  }
	  else
	  {
		  this.smscount = charc/150+1;
	  }
  }
}
