package steps;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class User implements ActionListener {
	JFrame window = new JFrame();
	
	JLabel msg = new JLabel("Choose any user...");
	JButton admin = new JButton("Authority(Admin)");
	JButton doctor = new JButton("Doctor");
	JButton patient = new JButton("Patient");
	JButton exit = new JButton("Exit");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(5,1,8,8);
		window.setLayout(g1);
		
		window.add(msg);
		window.add(admin);
		window.add(doctor);
		window.add(patient);
		window.add(exit);
		
		window.setTitle("Hospital Management System");
		window.setSize(600, 700);
		window.setLocation(450, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.setFont(new Font("Arial", Font.BOLD, 28));
		admin.setFont(new Font("Arial", Font.BOLD, 28));
		doctor.setFont(new Font("Arial", Font.BOLD, 28));
		patient.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		admin.addActionListener(this);
		doctor.addActionListener(this);
		patient.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==admin) {
			window.dispose();
			Admin_LogIn a7 = new Admin_LogIn();
			a7.initGui();
		}
			
		
		if(e.getSource()==doctor) {
			window.dispose();
			Doctor_Gui d1 = new Doctor_Gui();
			d1.initGui();
		}
		
		if(e.getSource()==patient) {
			window.dispose();
			Patient_GUI p1 = new Patient_GUI();
			p1.initGui();
		}
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		
	}

}
