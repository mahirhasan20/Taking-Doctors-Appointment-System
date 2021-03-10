package steps;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class See_Serials_Gui implements ActionListener{
	JFrame window = new JFrame();
	
	JLabel msg = new JLabel("To see your today's serial patients write down your name & click the Serials button");
	JLabel name = new JLabel("Your Name:");
	JTextField name_in = new JTextField();
	JButton serial = new JButton("Serials");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	public void initGui() {

		GridLayout g1 = new GridLayout(6,1,4,4);
		window.setLayout(g1);
		
		window.add(msg);
		window.add(name);
		window.add(name_in);
		window.add(serial);
		window.add(back);
		window.add(exit);
		
		window.setTitle("Doctor's account");
		window.setSize(1200, 500);
		window.setLocation(300, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		name.setFont(new Font("Arial", Font.BOLD, 28));
		name_in.setFont(new Font("Arial", Font.BOLD, 28));
		msg.setFont(new Font("Arial", Font.BOLD, 28));
		serial.setFont(new Font("Arial", Font.BOLD, 28));
		back.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		serial.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);	
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==serial) {
			//window.dispose();
			int count=0;
			String docName = name_in.getText();
			
			if(docName.equals("Dr. Mahir")) {
			String name ="", age="", gender="", address="", phone="";
			Serials_PatientsClass[]list = new Serials_PatientsClass[20];
			File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\mahir.txt");
			try(Scanner in = new Scanner(file2);){
				while(in.hasNext())
				{
					name = in.nextLine();
					age = in.nextLine();
					gender = in.nextLine();
					address = in.nextLine();
					phone = in.nextLine();
					list[count] = new Serials_PatientsClass(docName, name, age, gender, address, phone);
					//System.out.println(list[count]);
					count++;
					//in.nextLine();
				}
			//System.out.println(count);
			Serials_PatientsGui g1 = new Serials_PatientsGui();
			g1.initGui(list, count, docName);
			
			} 
			catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			if(docName.equals("Dr. Shakel")) {
				String name ="", age="", gender="", address="", phone="";
				Serials_PatientsClass[]list = new Serials_PatientsClass[20];
				File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\shakel.txt");
				try(Scanner in = new Scanner(file2);){
					while(in.hasNext())
					{
						name = in.nextLine();
						age = in.nextLine();
						gender = in.nextLine();
						address = in.nextLine();
						phone = in.nextLine();
						list[count] = new Serials_PatientsClass(docName, name, age, gender, address, phone);
						//System.out.println(list[count]);
						count++;
						//in.nextLine();
					}
				//System.out.println(count);
				Serials_PatientsGui g1 = new Serials_PatientsGui();
				g1.initGui(list, count, docName);
				
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(docName.equals("Dr. Siam")) {
				String name ="", age="", gender="", address="", phone="";
				Serials_PatientsClass[]list = new Serials_PatientsClass[20];
				File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\siam.txt");
				try(Scanner in = new Scanner(file2);){
					while(in.hasNext())
					{
						name = in.nextLine();
						age = in.nextLine();
						gender = in.nextLine();
						address = in.nextLine();
						phone = in.nextLine();
						list[count] = new Serials_PatientsClass(docName, name, age, gender, address, phone);
						//System.out.println(list[count]);
						count++;
						//in.nextLine();
					}
				//System.out.println(count);
				Serials_PatientsGui g1 = new Serials_PatientsGui();
				g1.initGui(list, count, docName);
				
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(docName.equals("Dr. Jannat")) {
				String name ="", age="", gender="", address="", phone="";
				Serials_PatientsClass[]list = new Serials_PatientsClass[20];
				File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\jannat.txt");
				try(Scanner in = new Scanner(file2);){
					while(in.hasNext())
					{
						name = in.nextLine();
						age = in.nextLine();
						gender = in.nextLine();
						address = in.nextLine();
						phone = in.nextLine();
						list[count] = new Serials_PatientsClass(docName, name, age, gender, address, phone);
						//System.out.println(list[count]);
						count++;
						//in.nextLine();
					}
				//System.out.println(count);
				Serials_PatientsGui g1 = new Serials_PatientsGui();
				g1.initGui(list, count, docName);
				
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}

		if(e.getSource()==back) {
			window.dispose();
			Log_in_doc d10 = new Log_in_doc();
			d10.initGui();
		}
		
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		}
}

