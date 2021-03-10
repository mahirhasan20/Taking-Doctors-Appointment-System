package steps;

import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Admin_LogIn implements ActionListener {
JFrame window = new JFrame();
	
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	
	JTextField username_in = new JTextField();
	JPasswordField password_in = new JPasswordField(); 
	
	JButton reset = new JButton("Reset");
	JButton login = new JButton("Log in");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(4,2,4,4);
		window.setLayout(g1);
		
		window.add(username);
		window.add(username_in);
		window.add(password);
		window.add(password_in);
		window.add(reset);
		window.add(login);
		window.add(back);
		window.add(exit);
		
		window.setTitle("Admin Log in");
		window.setSize(600, 300);
		window.setLocation(650, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		username.setFont(new Font("Arial", Font.BOLD, 28));
		username_in.setFont(new Font("Arial", Font.BOLD, 28));
		password.setFont(new Font("Arial", Font.BOLD, 28));
		password_in.setFont(new Font("Arial", Font.BOLD, 28));
		reset.setFont(new Font("Arial", Font.BOLD, 28));
		login.setFont(new Font("Arial", Font.BOLD, 28));
		back.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		
		reset.addActionListener(this);
		login.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			window.dispose();
			Admin_LogIn d1 = new Admin_LogIn();
			d1.initGui();
		}
		
		if(e.getSource()==login) {
			String username = username_in.getText();
			String password = password_in.getText();
			File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\admin.txt");
			try(Scanner in = new Scanner(file);)
			{
				while(in.hasNext()) {
				String usernamefile = in.next();
				String passfile = in.next();	
				
				if(usernamefile.equals(username) && passfile.equals(password))
				{
					System.out.println("Matched.!");
					window.dispose();
					Admin_mainGui a1 = new Admin_mainGui();
					a1.initGui();
				}
				}
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		if(e.getSource()==back) {
			window.dispose();
			User d1 = new User();
			d1.initGui();
		}
		
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		
	}
}

