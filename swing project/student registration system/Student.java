import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Student extends JFrame implements ActionListener
{
	MenuItem newmenuitem,updatemenuitem,reportmenuitem,exitmenuitem;
	TextArea t1;
	Student()
	{
		super("Student");
		
		MenuBar mbr=new MenuBar();
		Menu Filemenu=new Menu("Student");
		
		Filemenu.add(newmenuitem=new MenuItem("New"));
		
		Filemenu.add(updatemenuitem=new MenuItem("Update"));
	//	Filemenu.add(reportmenuitem=new MenuItem("Report"));
		
		Filemenu.add(exitmenuitem=new MenuItem("Exit"));
		mbr.add(Filemenu);
		setMenuBar(mbr);

		newmenuitem.addActionListener(this);
		updatemenuitem.addActionListener(this);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	
	}
	public void actionPerformed(ActionEvent ce)
	{
		if(ce.getActionCommand()=="New")
		{
			Newpage n=new Newpage();
			n.setSize(1200,900);
			n.setVisible(true);
			
		}
		if(ce.getActionCommand()=="Update")
		{
			updatestud u=new updatestud();
			u.setSize(1200,900);
			u.setVisible(true);
		
		}
	
	}
	
		
	
}

class Teststudent
{
	public static void main(String ar[])
	{
		Student s1=new Student();
		s1.setBounds(0,0,400,400);
		s1.setVisible(true);
		}
}	