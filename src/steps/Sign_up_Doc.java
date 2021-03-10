package steps;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sign_up_Doc implements ActionListener {
	
	JFrame window = new JFrame();
	
	JLabel msg = new JLabel("Thank you so much for successfully completing the Registration. "
			+ "Now you can easity Log in into your account!");
	 
	
	JButton login = new JButton("Log in");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(4,1,4,4);
		window.setLayout(g1);
		
		window.add(msg);
		window.add(login);
		window.add(back);
		window.add(exit);
		
		window.setTitle("Successfully Registration");
		window.setSize(1200, 500);
		window.setLocation(400, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.setFont(new Font("Arial", Font.BOLD, 22));
		login.setFont(new Font("Arial", Font.BOLD, 28));
		back.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		
		login.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login)
		{
			window.dispose();
			Log_in_doc d1 = new Log_in_doc();
			d1.initGui();
		}
		
		if(e.getSource() == back)
		{
			window.dispose();
			Doctor_Gui p1 = new Doctor_Gui();
			p1.initGui();
		}
		
		if(e.getSource() == exit)
		{
			window.dispose();
			Exit eq = new Exit();
			eq.initGui();
			
		}
		
		
		
	}

}
