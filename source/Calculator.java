import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	private JTextField answerfield;
	private JButton satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, nol, tambah, kurang, kali, bagi, samdeng, clear;
	private String stemp1,stemp2, sanswer;
	//private String simpanAll, simpanInput; 
	private double answer = 0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChosen = false;
	char operation = ' ';
	
	public Calculator(){
		super("Calculator Cooy!!");
		
		answerfield = new JTextField(null, 20);
		
		satu = new JButton ("1");
		dua = new JButton ("2");
		tiga = new JButton ("3");
		empat = new JButton ("4");
		lima = new JButton ("5");
		enam = new JButton ("6");
		tujuh = new JButton ("7");
		delapan = new JButton ("8");
		sembilan = new JButton ("9");
		nol = new JButton ("0");
		tambah = new JButton ("+");
		kurang = new JButton ("-");
		kali = new JButton ("*");
		bagi = new JButton ("/");
		samdeng = new JButton ("=");
		clear = new JButton ("C");
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		satu.addActionListener(n); dua.addActionListener(n); tiga.addActionListener(n);
		empat.addActionListener(n); lima.addActionListener(n); enam.addActionListener(n);
		tujuh.addActionListener(n); delapan.addActionListener(n); sembilan.addActionListener(n);
		nol.addActionListener(n);
	
		tambah.addActionListener(c); kurang.addActionListener(c); kali.addActionListener(c);
		bagi.addActionListener(c); samdeng.addActionListener(c); clear.addActionListener(c);
		
		//Besar button
		Dimension dim = new Dimension (75, 25);
	
		satu.setPreferredSize(dim); dua.setPreferredSize(dim); tiga.setPreferredSize(dim);
		empat.setPreferredSize(dim); lima.setPreferredSize(dim); enam.setPreferredSize(dim);
		tujuh.setPreferredSize(dim); delapan.setPreferredSize(dim); sembilan.setPreferredSize(dim);
		nol.setPreferredSize(new Dimension(230, 25)); tambah.setPreferredSize(new Dimension(113, 25)); kurang.setPreferredSize(new Dimension(113, 25));
		kali.setPreferredSize(new Dimension(113, 25)); bagi.setPreferredSize(new Dimension(113, 25)); samdeng.setPreferredSize(dim);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.BLUE);
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(satu); contentPanel.add(dua); contentPanel.add(tiga);
		contentPanel.add(empat); contentPanel.add(lima); contentPanel.add(enam);
		contentPanel.add(tujuh); contentPanel.add(delapan); contentPanel.add(sembilan);
		contentPanel.add(nol); contentPanel.add(tambah); contentPanel.add(kurang);
		contentPanel.add(kali); contentPanel.add(bagi); contentPanel.add(samdeng);
		contentPanel.add(clear);
		
		this.setContentPane(contentPanel);
		
	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			
			if(src.equals(satu)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "1";
					}else{
						stemp1 = stemp1 + "1";
					}
				}else{
					if(stemp2==null){
						stemp2 = "1";
					}else{
						stemp2 = stemp2 + "1";
					}
				}
			}
			if(src.equals(dua)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "2";
					}else{
						stemp1 = stemp1 + "2";
					}
				}else{
					if(stemp2==null){
						stemp2 = "2";
					}else{
						stemp2 = stemp2 + "2";
					}
				}
			}
			if(src.equals(tiga)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "3";
					}else{
						stemp1 = stemp1 + "3";
					}
				}else{
					if(stemp2==null){
						stemp2 = "3";
					}else{
						stemp2 = stemp2 + "3";
					}
				}
			}
			if(src.equals(empat)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "4";
					}else{
						stemp1 = stemp1 + "4";
					}
				}else{
					if(stemp2==null){
						stemp2 = "4";
					}else{
						stemp2 = stemp2 + "4";
					}
				}
			}
			if(src.equals(lima)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "5";
					}else{
						stemp1 = stemp1 + "5";
					}
				}else{
					if(stemp2==null){
						stemp2 = "5";
					}else{
						stemp2 = stemp2 + "5";
					}
				}
			}
			if(src.equals(enam)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "6";
					}else{
						stemp1 = stemp1 + "6";
					}
				}else{
					if(stemp2==null){
						stemp2 = "6";
					}else{
						stemp2 = stemp2 + "6";
					}
				}
			}
			if(src.equals(tujuh)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "7";
					}else{
						stemp1 = stemp1 + "7";
					}
				}else{
					if(stemp2==null){
						stemp2 = "7";
					}else{
						stemp2 = stemp2 + "7";
					}
				}
			}
			if(src.equals(delapan)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "8";
					}else{
						stemp1 = stemp1 + "8";
					}
				}else{
					if(stemp2==null){
						stemp2 = "8";
					}else{
						stemp2 = stemp2 + "8";
					}
				}
			}
			if(src.equals(sembilan)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "9";
					}else{
						stemp1 = stemp1 + "9";
					}
				}else{
					if(stemp2==null){
						stemp2 = "9";
					}else{
						stemp2 = stemp2 + "9";
					}
				}
			}
			if(src.equals(nol)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "0";
					}else{
						stemp1 = stemp1 + "0";
					}
				}else{
					if(stemp2==null){
						stemp2 = "0";
					}else{
						stemp2 = stemp2 + "0";
					}
				}
			}
			if(equalsClicked==false){
				if(opChosen==false){
					answerfield.setText(stemp1);
				}else{
					answerfield.setText(stemp2);
				}
			}
			
		}
	}
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(tambah)){
				if(stemp1==null){
					System.out.println("Masukan Angka");
				}else
					if(stemp1 != null && stemp2 == null){
						opChosen = true;
						operation = '+';
					}else
						if(stemp1 != null && stemp2 !=null){
					System.out.println("hanya duaX perhitungan");
					}				
			}
			if(src.equals(kurang)){
				if(stemp1==null){
					System.out.println("Masukan Angka");
				}else
					if(stemp1 != null && stemp2 == null){
						opChosen = true;
						operation = '-';
					}else
						if(stemp1 != null && stemp2 !=null){
					System.out.println("hanya duaX perhitungan");
					}				
			}
			if(src.equals(kali)){
				if(stemp1==null){
					System.out.println("Masukan Angka");
				}else
					if(stemp1 != null && stemp2 == null){
						opChosen = true;
						operation = '*';
					}else
						if(stemp1 != null && stemp2 !=null){
					System.out.println("hanya duaX perhitungan");
					}				
			}
			if(src.equals(bagi)){
				if(stemp1==null){
					System.out.println("Masukan Angka");
				}else
					if(stemp1 != null && stemp2 == null){
						opChosen = true;
						operation = '/';
					}else
						if(stemp1 != null && stemp2 !=null){
					System.out.println("hanya duaX perhitungan");
					}
				
			}
			if(src.equals(samdeng)){
				if(stemp1==null){
					System.out.println("Masukan Angka");
				}else
					if(stemp1 != null && stemp2 == null){
						System.out.println("hanya duaX perhitungan");
					}
					
				if(stemp1 != null && stemp2 != null){
						double d1 = 0 ,d2 = 0;
						d1 = Double.parseDouble(stemp1);
						d2 = Double.parseDouble(stemp2);
// ngubah dari string ke double
						switch(operation){
						case '+':
							answer = d1 + d2;
							break;
						case '-':
							answer = d1 - d2;
							break;
						case '*':
							answer = d1 * d2;
							break;
						case '/':
							answer = d1 / d2;
							break;
							
						}
						sanswer = Double.toString(answer);
						answerfield.setText(sanswer);
					}	
			}
			if(src.equals(clear)){
				 stemp1 = null;
				 stemp2 = null;
				 equalsClicked =false;
				 opChosen = false;
				 operation = ' ';
				 answerfield.setText(null);
				 sanswer = null;
			}
		}
	}
}
