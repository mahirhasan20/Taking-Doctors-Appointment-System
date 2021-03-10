package steps;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Patient_GUI implements ActionListener {
	JFrame window = new JFrame();
	
	JLabel name = new JLabel("Name:");
	JLabel age = new JLabel("Age:");
	JLabel gender = new JLabel("Gender:");
	JLabel address = new JLabel("Address:");
	JLabel phone = new JLabel("Phone:");
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JLabel empty = new JLabel();
	
	
	JTextField name_in = new JTextField();
	JTextField age_in = new JTextField();
	JTextField address_in = new JTextField();
	JTextField phone_in = new JTextField();
	JTextField username_in= new JTextField();
	JPasswordField password_in = new JPasswordField();
	
	
	String []gen = {"Male", "Female", "Other"};
	JComboBox gender_in = new JComboBox(gen);

	
	JButton reset = new JButton("Reset");
	JButton login = new JButton("Log in");
	JButton signup = new JButton("Sign up");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	
	public void initGui() {
		GridLayout g1 = new GridLayout(10,2,3,3);
		window.setLayout(g1);
		
		window.add(name);
		window.add(name_in);
		window.add(age);
		window.add(age_in);
		window.add(gender);
		window.add(gender_in);
		window.add(address);
		window.add(address_in);
		window.add(phone);
		window.add(phone_in);
		window.add(username);
		window.add(username_in);
		window.add(password);
		window.add(password_in);
		window.add(reset);
		window.add(empty);
		window.add(login);
		window.add(signup);
		window.add(back);
		window.add(exit);
	
		
		window.setTitle("Patient's Registration Form");
		window.setSize(800, 900);
		window.setLocation(450, 50);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		name.setFont(new Font("Arial", Font.BOLD, 22));
		name_in.setFont(new Font("Arial", Font.BOLD, 22));
		age.setFont(new Font("Arial", Font.BOLD, 22));
		age_in.setFont(new Font("Arial", Font.BOLD, 22));
		gender.setFont(new Font("Arial", Font.BOLD, 22));
		gender_in.setFont(new Font("Arial", Font.BOLD, 22));
		address.setFont(new Font("Arial", Font.BOLD, 22));
		address_in.setFont(new Font("Arial", Font.BOLD, 22));
		phone.setFont(new Font("Arial", Font.BOLD, 22));
		phone_in.setFont(new Font("Arial", Font.BOLD, 22));
		username.setFont(new Font("Arial", Font.BOLD, 22));
		username_in.setFont(new Font("Arial", Font.BOLD, 22));
		password.setFont(new Font("Arial", Font.BOLD, 22));
		password_in.setFont(new Font("Arial", Font.BOLD, 22));
		reset.setFont(new Font("Arial", Font.BOLD, 22));
		login.setFont(new Font("Arial", Font.BOLD, 22));
		signup.setFont(new Font("Arial", Font.BOLD, 22));
		back.setFont(new Font("Arial", Font.BOLD, 22));
		exit.setFont(new Font("Arial", Font.BOLD, 22));
		
		
		reset.addActionListener(this);
		login.addActionListener(this);
		signup.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			window.dispose();
			Patient_GUI g1 = new Patient_GUI();
			g1.initGui();
		}
		
		if(e.getSource()==login) {
			window.dispose();
			Log_in_Patient p1 = new Log_in_Patient();
			p1.initGui();
		}
		
		if(e.getSource()==signup) {
			String name = name_in.getText();
			String age = age_in.getText();
			String gender = gender_in.getSelectedItem().toString();
			String address = address_in.getText(); 
			String phone = phone_in.getText();
			String user = username_in.getText();
			String pass = password_in.getText();
			
			if(name.isEmpty() || age.isEmpty() || address.isEmpty() || phone.isEmpty() || user.isEmpty() 
					|| pass.isEmpty()) {
			
			}
			
			else {
				//System.out.println("else");
			window.dispose();
			File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\patient.txt");
			
			try(FileWriter fw  = new FileWriter(file,true);)
			{
				fw.write(user+"\n"+name +"\n"+age+"\n"+gender+"\n"+address+"\n"+phone+"\n\n");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			
			File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\patient_UserPass.txt");
			
			try(FileWriter fu  = new FileWriter(file2,true);)
			{
				fu.write(user +" "+pass+"\n");
				
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			Sign_up_Patient p1 = new Sign_up_Patient();
			p1.initGui();
			}
			
			
		}
		
		if(e.getSource()==back) {
			window.dispose();
			User g1 = new User();
			g1.initGui();
		}
		
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		
	}





}
