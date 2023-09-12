package p3simpleloginform;
import javax.swing.*;

 

import java.awt.*;
import java.awt.event.*;
public class Myframe extends JFrame implements ActionListener

{
	Container c;
	JLabel label1,label2;
	JTextField mustakjim;
	JPasswordField pass;
	JButton btn;
	Myframe()
	{
	setTitle("Login form");
	setSize(400,300);
	setLocation(100,100);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c=getContentPane();
	c.setLayout(null);
	
	label1=new JLabel("username");
	label2=new JLabel("password");
	
	label1.setBounds(10,50,100,20);
	label2.setBounds(10,100,100,20);
	
	c.add(label1);
	c.add(label2);
	
	mustakjim=new JTextField();
	mustakjim.setBounds(120,50,120,20);
	c.add(mustakjim);
	

	pass=new JPasswordField();
	pass.setBounds(120,100,120,20);
	c.add(pass);
	

	btn=new JButton("login");
	btn.setBounds(100,150,70,20);
	c.add(btn);
	
	btn.addActionListener(this);
	setVisible(true);

	
}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("username :"+mustakjim.getText());
		System.out.println("password :"+pass.getText());
	}
}
