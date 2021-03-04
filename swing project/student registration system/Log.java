import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

class Login extends JFrame implements ActionListener
{
	ResultSet rs;
	JButton b1,b2;
	JLabel l1,l2;
	JTextField t1,t2;
	Login()
	{
		super("Login");
		
		setLayout(null);
		l1=new JLabel("User Name");
		add(l1);
		l1.setBounds(20,45,100,30);
				
		t1=new JTextField();
		add(t1);
		t1.setBounds(110,50,150,20);

		setLayout(null);
		l2=new JLabel("Password");
		add(l2);
		l2.setBounds(20,95,100,30);
		
		t2=new JPasswordField();
		add(t2);
		t2.setBounds(110,100,150,20);
		
		b1=new JButton("Submit");
		add(b1);
		b1.setBounds(90,160,90,30);

		b1.addActionListener(this);
	
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1="",s2="";
		Integer flag=0;
		String user=t1.getText();		
		String pwd=t2.getText();
		conn c=new conn();
		if(ae.getSource()==b1)
		{		
			try{
			rs=c.st.executeQuery("select * from Login");
			rs.first();
			do
			{	
				s1=rs.getString(2);
				s2=rs.getString(3);	
				if(user.equals(s1) && pwd.equals(s2))
				{
					Student s=new Student();
					s.setBounds(300,300,500,500);
					s.setVisible(true);
				}
				
			}while(rs.next());			
			c.con.close();
			
			}catch(Exception e){}
                         		
					
		}
		else
					{
					System.out.println("Enter data Proparly");
  			    		JOptionPane.showMessageDialog(this,"Plse Fillup All Field",
        		    		"Error",JOptionPane.ERROR_MESSAGE);
					}

			
	}
}
class log
{
	public static void main(String ar[])
	{
		Login l1=new Login();
		l1.setBounds(300,300,300,250);
		l1.setVisible(true);
	}	
}		