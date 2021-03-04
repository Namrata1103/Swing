import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;
class Newpage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,head;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
	JButton b1,b2,b3;
	JComboBox cmb;
	PreparedStatement ps;
	JPanel p;
	String msg="";
	Newpage()
	{
		super("Sudent EntryForm");
		
		setLayout(null);   	 			
		head=new JLabel("Student Entry Form");
		head.setBounds(270,30,600,50);
		head.setFont(new Font("Courier",Font.BOLD,30));
		add(head);
		
				
		l1=new JLabel("Index Number");
		l1.setBounds(150,110,100,30);
		add(l1);
	
		t1=new JTextField();
		t1.setHorizontalAlignment (JTextField.RIGHT);
		t1.setBounds(280,114,170,25);
		add(t1);


		l2=new JLabel("Registraction Id");
		l2.setBounds(150,170,100,30);
		add(l2);
		
		t2=new JTextField();
		t2.setHorizontalAlignment (JTextField.RIGHT);
		t2.setBounds(280,174,170,25);
		add(t2);
		
		l3=new JLabel("Name ");
		l3.setBounds(150,230,100,30);
		add(l3);
		

		t3=new JTextField();
		t3.setHorizontalAlignment (JTextField.RIGHT);
		t3.setBounds(280,234,170,25);
		add(t3);

		l4=new JLabel("Age");
		l4.setBounds(150,294,100,30);
		add(l4);
		
		t4=new JTextField();
		t4.setHorizontalAlignment (JTextField.RIGHT);
		t4.setBounds(280,294,170,25);
		add(t4);

		l5=new JLabel("Birth Date");
		l5.setBounds(150,354,100,30);
		add(l5);
		
		t5=new JTextField();
		t5.setHorizontalAlignment (JTextField.RIGHT);
		t5.setBounds(280,354,170,25);
		add(t5);

		l6=new JLabel("Gender");
		l6.setBounds(150,414,100,30);
		add(l6);

		cmb=new JComboBox();
		cmb.addItem("Male");	
		cmb.addItem("Female");
		cmb.setBounds(280,414,170,30);
		add(cmb); 

		l7=new JLabel("Registration Date");
		l7.setBounds(150,474,100,30);
		add(l7);
	
		t7=new JTextField();
		t7.setHorizontalAlignment (JTextField.RIGHT);
		t7.setBounds(280,474,170,25);
		add(t7);


		l8=new JLabel("Address");
		l8.setBounds(150,534,100,30);
		add(l8);
		
		t8=new JTextField();
		t8.setHorizontalAlignment (JTextField.RIGHT);
		t8.setBounds(280,534,170,25);
		add(t8);
		
		l9=new JLabel("City");
		l9.setBounds(650,110,100,30);
		add(l9);
		
		t9=new JTextField();
		t9.setHorizontalAlignment (JTextField.RIGHT);		
		t9.setBounds(780,110,170,25);
		add(t9);

		l10=new JLabel("State");
		l10.setBounds(650,170,100,30);
		add(l10);
		
		t10=new JTextField();
		t10.setHorizontalAlignment (JTextField.RIGHT);
		t10.setBounds(780,170,170,25);
		add(t10);

		l11=new JLabel("Zip");
		l11.setBounds(650,230,100,30);
		add(l11);
		
		t11=new JTextField();
		t11.setHorizontalAlignment (JTextField.RIGHT);
		t11.setBounds(780,230,170,25);
		add(t11);
		
		l12=new JLabel("Home Phone");
		l12.setBounds(650,290,100,30);
		add(l12);

		t12=new JTextField();
		t12.setHorizontalAlignment (JTextField.RIGHT);
		t12.setBounds(780,290,170,25);
		add(t12);   
	
		l13=new JLabel("Cell");
		l13.setBounds(650,350,100,30);
		add(l13); 
		
		t13=new JTextField();
		t13.setHorizontalAlignment (JTextField.RIGHT);
		t13.setBounds(780,350,170,25);
		add(t13);   
	
		l14=new JLabel("EMail");
		l14.setBounds(650,410,100,30);
		add(l14);

		t14=new JTextField();
		t14.setHorizontalAlignment (JTextField.RIGHT);
		t14.setBounds(780,410,170,25);
		add(t14);   
		
		l15=new JLabel("Department");
		l15.setBounds(650,470,100,30);
		add(l15);

		t15=new JTextField();
		t15.setHorizontalAlignment (JTextField.RIGHT);
		t15.setBounds(780,470,170,25);
		add(t15);   

		l16=new JLabel("Year");
		l16.setBounds(650,530,100,30);
		add(l16);

		t16=new JTextField();
		t16.setHorizontalAlignment (JTextField.RIGHT);	
		t16.setBounds(780,530,170,25);
		add(t16);  
		
		b1=new JButton("Submit");
		b1.setBounds(280,630,100,30);
		add(b1);

		b2=new JButton("Clear");
		b2.setBounds(440,630,100,30);
		add(b2);

		b3=new JButton("Exit");
		b3.setBounds(600,630,100,30);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		 	
		t1.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
		t2.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
		t11.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
		t12.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
		t13.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
		
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			String cmbitem=(String)cmb.getSelectedItem();	
			if(ae.getSource()==b1)
			{
				if(!t1.getText().equals("")&!t2.getText().equals("")&!t3.getText().equals("")&!t4.getText().equals("")&!t5.getText().equals("")&!t7.getText().equals("")&!t8.getText().equals("")&!t9.getText().equals("")&!t10.getText().equals("")&!t11.getText().equals("")&!t12.getText().equals("")&!t13.getText().equals("")&!t14.getText().equals("")&!t15.getText().equals("")&!t16.getText().equals("")) // if the JTextField is not empty then enable the button
            			{
					//b1.setEnabled(true);
					try
					{
						conn c=new conn();
						ps=c.con.prepareStatement("insert into stud values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						ps.setInt(1,Integer.parseInt(t1.getText()));  
			    			ps.setInt(2,Integer.parseInt(t2.getText()));
			        		ps.setString(3,t3.getText());
			        		ps.setString(4,t4.getText());
			        		ps.setString(6,cmbitem);
			   			ps.setString(5,t5.getText());
			        		ps.setString(7,t7.getText());
			   			ps.setString(8,t8.getText());
			       		        ps.setString(9,t9.getText());
			   			ps.setString(10,t10.getText());
 			        		ps.setString(11,t11.getText());
			        		ps.setString(12,t12.getText());
			        		ps.setString(13,t13.getText());
			        		ps.setString(14,t14.getText());
			   			ps.setString(15,t15.getText());
			        		ps.setString(16,t16.getText());

			        		ps.executeUpdate();
			       			c.con.commit();
						}
						catch(Exception e){}
						{
							
  			    				JOptionPane.showMessageDialog(this,"Record are Save",
        		    				"Message",JOptionPane.INFORMATION_MESSAGE);
							}
					}
					else
					{
					System.out.println("Enter data Proparly");
  			    		JOptionPane.showMessageDialog(this,"Plse Fillup All Field",
        		    		"Error",JOptionPane.ERROR_MESSAGE);
					}

			}
			if(ae.getSource()==b2)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
			}
			if(ae.getSource()==b3)
			{
				setVisible (false);
				dispose();
			}
			
	}
	
}
class Newstudent
{
	public static void main(String ar[])
	{
		Newpage nw=new Newpage();
		nw.setBounds(0,0,1048,900);
		nw.setVisible(true);
		}
}
