import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class Phonebook extends JFrame implements ActionListener{
    JLabel[]labelContacts = new JLabel[1000];
    JLabel[]labelSearchResult = new JLabel[1000];
    JButton	buttonAdd,buttonSearch,buttonDelete;
    JTextField	textName,textNumber;
    JLabel	labelName,labelContact,labelFound;

    int	searchCount	= 0;
    String[][]	str	= new String[1000][2];

    int x = 0;
    int y = 2;
    int count = 0;

    JPanel panelFungsi,panelContacts;
    String[][] temp=new String[2][2];

    Phonebook()
    {
        panelFungsi = new JPanel(null);
        panelContacts = new JPanel(new GridLayout(x,y));

        buttonAdd = new JButton("Add");
        buttonAdd.setBounds(40,50,80,30);
        buttonAdd.addActionListener(this);
        panelFungsi.add(buttonAdd);

        buttonSearch = new JButton("Search");
        buttonSearch.setBounds(150,50,80,30);
        buttonSearch.addActionListener(this);
        panelFungsi.add(buttonSearch);

        buttonDelete = new JButton("Delete");
        buttonDelete.setBounds(260,50,80,30);
        buttonDelete.addActionListener(this);
        panelFungsi.add(buttonDelete);

        textName = new JTextField(20);
        textName.setBounds(40,10,100,20);
        panelFungsi.add(textName);

        textNumber = new JTextField(20);
        textNumber.setBounds(270,10,100,20);
        panelFungsi.add(textNumber);

        labelName = new JLabel("Name: ");
        labelName.setBounds(0,10,40,20);
        panelFungsi.add(labelName);

        labelContact = new JLabel("Contact Number: ");
        labelContact.setBounds(170,10,100,20);
        panelFungsi.add(labelContact);

        labelFound = new JLabel("");
        labelFound.setBounds(0,120,200,20);
        panelFungsi.add(labelFound);

        JScrollPane jsp=new JScrollPane(panelContacts);

        for(int i=0;i<1000;i++)
        {
            labelContacts[i] = new JLabel("");
            panelContacts.add(labelContacts[i]);
        }
        for(int i=0;i<100;i++)
        {
            labelSearchResult[i] = new JLabel("");
            panelFungsi.add(labelSearchResult[i]);
        }

        //untuk mengatur tampilan label lebih rapi
        int x=0,y=150,w1=100;
        for(int i=0;i<100;i++)
        {
            x=0;
            labelSearchResult[i].setBounds(x,y,w1,20);
            x=x+120;
            i++;
            labelSearchResult[i].setBounds(x,y,w1,20);
            y=y+10;
        }

        try
        {
            display();
            System.out.println(count);
        } catch(IOException e){
            e.printStackTrace();
        }
        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,panelFungsi,jsp);

        add(split);
    }
    
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()==buttonAdd)
        {
            String stringName,stringNumber;
            stringName=textName.getText();
            stringNumber=textNumber.getText();

            try {
                addto(stringName,stringNumber);
            } catch(IOException e){
            }
            count=0;
            textName.setText("");
            textNumber.setText("");

            try {
                display();
            } catch(IOException e){
            }
            repaint();
        }

        if(evt.getSource()==buttonSearch)
        {
            searchCount=0;
            String sertxt=textName.getText();

            int j=0;
            for(int i=0;i<count;i++)
            {
                if(sertxt.equalsIgnoreCase(str[i][0])==true)
                {
                labelSearchResult[j].setText(str[i][0]);
                j++;
                String temp2=str[i][1];
                labelSearchResult[j].setText(temp2);
                j++;

                repaint();
                searchCount++;
                }
            }
            labelFound.setText("Found "+searchCount+" Contact(s)");
            textName.setText("");
        }

        if(evt.getSource()==buttonDelete)
        {
            try {
                delete(textName.getText());
            } catch (IOException e) {
                System.err.println(e);
            }
            count = 0;
        }
    }
    
    public void display() throws IOException 
	{
            str = new String[1000][2];
            BufferedReader br=new BufferedReader(new FileReader("contacts.txt"));
            String stringConctacts=br.readLine();
            stringConctacts=br.readLine();
            while(stringConctacts!=null)
            {
                str[count][0]=stringConctacts;
                stringConctacts=br.readLine();
                str[count][1]=stringConctacts;
                stringConctacts=br.readLine();
                count++;
            } //masukkin txt ke gui

            for(int i=0;i<count-1;i++)
            {
                for(int j=i+1;j<count;j++)
                {
                    int c=str[i][0].compareTo(str[j][0]);
                    if(c>0)
                    {
                    temp[0][0]=str[i][0];
                    temp[0][1]=str[i][1];
                    str[i][0]=str[j][0];
                    str[i][1]=str[j][1];
                    str[j][0]=temp[0][0];
                    str[j][1]=temp[0][1];
                    }
                }
            } //sort

            int pole=0;  //untuk penulisan contacts di panel
            for(int i=0;i<count;i++)
            {
                labelContacts[pole].setText(str[i][0]);
                pole++;
                labelContacts[pole].setText(str[i][1]);
                pole++;
            }
            br.close();
	}

	public void addto(String name,String number) throws IOException
	{
            BufferedWriter in=new BufferedWriter(new FileWriter("contacts.txt",true));
            in.newLine();
            in.write(name);
            in.newLine();
            in.write(number);
            in.close();
	}
	
	public void delete (String lineToRemove) throws IOException
	{
            File fromFile = new File("contacts.txt");
            File tempFile = new File("contacts_temp.txt");

            BufferedWriter in=new BufferedWriter(new FileWriter("contacts_temp.txt",true));

            for(int i=0;i<count;i++)
            {
                if(lineToRemove.equals(str[i][0]))
                {
                    str[i][0]="";
                    str[i][1]="";
                }
            }

            for (int i = 0 ; i <count ; i++){
                if (str[i][0].length() > 0){
                    in.newLine();
                    in.write(str[i][0]);
                    in.newLine();
                    in.write(str[i][1]);
                }
            }
            in.close();
       
            if(!fromFile.delete()){
                System.out.println("Cannot Delete");
                return;
            } else {
                System.out.println("Delete Successfull");
            }
            
            if(!tempFile.renameTo(fromFile)){
                System.out.println("Cannot Rename");
            } else {
                System.out.println("Rename Successfull");
            }          
            count = 0; 
            display();
	}

}
