package steps;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;


public class Admin_mainGui implements ActionListener {

	JFrame window = new JFrame();
	
	JLabel msg = new JLabel("Choose any option...");
	JButton doctor = new JButton("Doctor");
	JButton patient = new JButton("Patient");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(5,1,8,8);
		window.setLayout(g1);
		
		window.add(msg);
		window.add(doctor);
		window.add(patient);
		window.add(back);
		window.add(exit);
		
		window.setTitle("Admin");
		window.setSize(600, 700);
		window.setLocation(450, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.setFont(new Font("Arial", Font.BOLD, 28));
		doctor.setFont(new Font("Arial", Font.BOLD, 28));
		patient.setFont(new Font("Arial", Font.BOLD, 28));
		back.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		
		doctor.addActionListener(this);
		patient.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name, age, gender, time, phone,specialist,mbbs,mbbs_from,mbbs_country,mbbs_year,fcps,
		fcps_from,fcps_country,fcps_year;
		if(e.getSource()==doctor) {
			window.dispose();
			admin_Doc_Class [] a1 = new admin_Doc_Class[100];
			int count = 0; 
			File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\doctor.txt");
			try(Scanner in = new Scanner(file);)
			{
				while(in.hasNext()) {
				name = in.nextLine();
				age = in.nextLine();
				gender = in.nextLine();
				time = in.nextLine();
				phone = in.nextLine();
				specialist = in.nextLine();
				mbbs = in.nextLine();
				mbbs_from = in.nextLine();
				mbbs_country = in.nextLine();
				mbbs_year = in.nextLine();
				fcps = in.nextLine();
				fcps_from = in.nextLine();
				fcps_country = in.nextLine();
				fcps_year = in.nextLine();
				in.nextLine();
				a1[count] = new admin_Doc_Class(name, age, gender, time, phone, specialist, mbbs, 
						mbbs_from, mbbs_country, mbbs_year, fcps, fcps_from, fcps_country, fcps_year);
				count++;
				}
				admin_Doc_Gui g2 = new admin_Doc_Gui();
				g2.initGui(a1, count);
				
			} 
			catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		String user, pname, page, pgender, address, pphone;
		if(e.getSource()==patient) {
			window.dispose();
			Admin_Patient_Class [] a3 = new Admin_Patient_Class[100];
			int count2 = 0; 
			File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\patient.txt");
			try(Scanner in = new Scanner(file);)
			{
				//System.out.println("Try");
				while(in.hasNext()) {
					user = in.nextLine();
					pname = in.nextLine();
					page = in.nextLine();
					pgender = in.nextLine();
					address = in.nextLine();
					pphone = in.nextLine();
					in.nextLine();
					//System.out.println(user+"\n"+ pname+"\n"+ page+"\n"+ pgender+"\n"+ address+"\n"+ pphone);
					a3[count2] = new Admin_Patient_Class(user, pname, page, pgender, address, pphone);
					//System.out.println(a3[count2]);
					count2++;	
				}
				Admin_Patient_Gui p5 = new Admin_Patient_Gui();
				p5.initGui(a3, count2);
				
				
			} 
			catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==back) {
			window.dispose();
			Admin_LogIn a4 = new Admin_LogIn();
			a4.initGui();
		}
		
		
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		
	}



}
