package steps;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


import javax.swing.*;

public class Doctor_Gui implements ActionListener {

	JFrame window = new JFrame();
	
	JLabel name = new JLabel("Name:");
	JLabel age = new JLabel("Age:");
	JLabel gender = new JLabel("Gender:");
	JLabel time = new JLabel("Timing:");
	JLabel phone = new JLabel("Phone:");
	JLabel specialist = new JLabel("Specialist:");
	JLabel mbbs = new JLabel("MBBS Status:");
	JLabel mbbs_from = new JLabel("MBBS From:");
	JLabel mbbs_country = new JLabel("Country:");
	JLabel mbbs_year = new JLabel("Year:");
	JLabel fcps = new JLabel("FCPS Status:");
	JLabel fcps_from = new JLabel("FCPS From:");
	JLabel fcps_country = new JLabel("Country:");
	JLabel fcps_year = new JLabel("Year:");
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JLabel empty = new JLabel();
	
	
	JTextField name_in = new JTextField();
	JTextField age_in = new JTextField();
	JTextField phone_in = new JTextField();
	JTextField specialist_in = new JTextField();
	JTextField mbbs_from_in = new JTextField();
	JTextField mbbs_country_in = new JTextField();
	JTextField mbbs_year_in = new JTextField();

	JTextField fcps_from_in = new JTextField();
	JTextField fcps_country_in = new JTextField();
	JTextField fcps_year_in = new JTextField();
	JTextField username_in= new JTextField();
	JPasswordField password_in = new JPasswordField();
	
	
	String []gen = {"Male", "Female"};
	JComboBox gender_in = new JComboBox(gen);
	String []timing = {"08:00 AM - 11:00 AM", "11:30 AM - 02:30 PM", "03:00 PM - 06:00 PM", 
						"06:30 PM - 09:30 PM"};
	JComboBox time_in = new JComboBox(timing);
	String [] status = {"Yes", "No"};
	JComboBox mbbs_in = new JComboBox(status);
	JComboBox fcps_in = new JComboBox(status);
	
	JButton reset = new JButton("Reset");
	JButton login = new JButton("Log in");
	JButton signup = new JButton("Sign up");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	
	public void initGui() {
		GridLayout g1 = new GridLayout(19,2,3,3);
		window.setLayout(g1);
		
		window.add(name);
		window.add(name_in);
		window.add(age);
		window.add(age_in);
		window.add(gender);
		window.add(gender_in);
		window.add(time);
		window.add(time_in);
		window.add(phone);
		window.add(phone_in);
		window.add(specialist);
		window.add(specialist_in);
		window.add(mbbs);
		window.add(mbbs_in);
		window.add(mbbs_from);
		window.add(mbbs_from_in);
		window.add(mbbs_country);
		window.add(mbbs_country_in);
		window.add(mbbs_year);
		window.add(mbbs_year_in);
		window.add(fcps);
		window.add(fcps_in);
		window.add(fcps_from);
		window.add(fcps_from_in);
		window.add(fcps_country);
		window.add(fcps_country_in);
		window.add(fcps_year);
		window.add(fcps_year_in);
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
	
		
		window.setTitle("Doctor's Registration Form");
		window.setSize(800, 900);
		window.setLocation(450, 50);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		name.setFont(new Font("Arial", Font.BOLD, 22));
		name_in.setFont(new Font("Arial", Font.BOLD, 22));
		age.setFont(new Font("Arial", Font.BOLD, 22));
		age_in.setFont(new Font("Arial", Font.BOLD, 22));
		gender.setFont(new Font("Arial", Font.BOLD, 22));
		gender_in.setFont(new Font("Arial", Font.BOLD, 22));
		time.setFont(new Font("Arial", Font.BOLD, 22));
		time_in.setFont(new Font("Arial", Font.BOLD, 22));
		phone.setFont(new Font("Arial", Font.BOLD, 22));
		phone_in.setFont(new Font("Arial", Font.BOLD, 22));
		
		specialist.setFont(new Font("Arial", Font.BOLD, 22));
		specialist_in.setFont(new Font("Arial", Font.BOLD, 22));
		
		mbbs.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_in.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_from.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_from_in.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_country.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_country_in.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_year.setFont(new Font("Arial", Font.BOLD, 22));
		mbbs_year_in.setFont(new Font("Arial", Font.BOLD, 22));
		fcps.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_in.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_from.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_from_in.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_country.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_country_in.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_year.setFont(new Font("Arial", Font.BOLD, 22));
		fcps_year_in.setFont(new Font("Arial", Font.BOLD, 22));
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
			Doctor_Gui g1 = new Doctor_Gui();
			g1.initGui();
		}
		
		if(e.getSource()==login) {
			window.dispose();
			Log_in_doc d1 = new Log_in_doc();
			d1.initGui();
		}
		
		if(e.getSource()==signup) {
			String name = name_in.getText();
			String age = age_in.getText();
			String gender = gender_in.getSelectedItem().toString();
			String time = time_in.getSelectedItem().toString(); 
			String phone = phone_in.getText();
			String specialist = specialist_in.getText();
			String mbbs = mbbs_in.getSelectedItem().toString();
			String mbbs_from = mbbs_from_in.getText(); 
			String mbbs_country = mbbs_country_in.getText();
			String mbbs_year = mbbs_year_in.getText();
			String fcps = fcps_in.getSelectedItem().toString();
			String fcps_from = fcps_from_in.getText();
			String fcps_country = fcps_country_in.getText();
			String fcps_year = fcps_year_in.getText();
			String user = username_in.getText();
			String pass = password_in.getText();
			
			if(name.isEmpty() || age.isEmpty() || phone.isEmpty() || specialist.isEmpty() || mbbs.isEmpty() || mbbs_from.isEmpty() ||
				mbbs_country.isEmpty() || mbbs_year.isEmpty() || user.isEmpty() || pass.isEmpty()){}
			
			else {	
			window.dispose();
			File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\doctor.txt");
			
			try(FileWriter fw  = new FileWriter(file,true);)
			{
				fw.write(name +"\n"+age+"\n"+gender+"\n"+time+"\n"+phone+"\n"+specialist+"\n"+mbbs+"\n"+
							mbbs_from+"\n"+mbbs_country+"\n"+mbbs_year+"\n");
				if(fcps == "Yes")
				{
					fw.write(fcps+"\n"+fcps_from+"\n"+fcps_country+"\n"+fcps_year+"\n\n");
				}
				else
				fw.write("n/a\nn/a\nn/a\nn/a\n\n");
				
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			File file1 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\doctor_info.txt");
			
			try(FileWriter fp  = new FileWriter(file1,true);)
			{
				fp.write(name +"\n"+time+"\n"+specialist+"\n"+mbbs+"\n"+mbbs_from+
						"\n"+mbbs_country+"\n"+mbbs_year+"\n");
				if(fcps == "Yes")
				{
					fp.write(fcps+"\n"+fcps_from+"\n"+fcps_country+"\n"+fcps_year+"\n\n");
				}
				else
				fp.write("n/a\nn/a\nn/a\nn/a\n\n");
				
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\doctor_UserPass.txt");
			
			try(FileWriter fu  = new FileWriter(file2,true);)
			{
				fu.write(user +" "+pass+"\n");
				
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
			Sign_up_Doc d1 = new Sign_up_Doc();
			d1.initGui();
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
