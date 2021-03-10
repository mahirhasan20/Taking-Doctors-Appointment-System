package steps;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Appointment implements ActionListener{


	JFrame window = new JFrame();
	JLabel username = new JLabel("Your Username");
	JLabel doc_name = new JLabel("Doctor Name:");
	JLabel time = new JLabel("Timing:");
	JLabel empty = new JLabel();
	JTextField doc_name_in = new JTextField();
	//JTextField time_in = new JTextField();
	JTextField username_in = new JTextField();
	
	String []timing = {"08:00 AM - 11:00 AM", "11:30 AM - 02:30 PM", "03:00 PM - 06:00 PM", 
	"06:30 PM - 09:30 PM"};
	JComboBox time_in = new JComboBox(timing);
	JButton list = new JButton("Doctor List");
	JButton reset = new JButton("Reset");
	JButton take = new JButton("Take an appointment");
	JButton back = new JButton("Back");
	JButton exit = new JButton("Exit");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(6,2,4,4);
		window.setLayout(g1);
		window.add(username);
		window.add(username_in);
		window.add(doc_name);
		window.add(doc_name_in);
		window.add(time);
		window.add(time_in);
		window.add(list);
		window.add(empty);
		window.add(reset);
		window.add(take);
		window.add(back);
		window.add(exit);
		
		window.setTitle("Taking An Appointment");
		window.setSize(900, 400);
		window.setLocation(550, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		username.setFont(new Font("Arial", Font.BOLD, 28));
		username_in.setFont(new Font("Arial", Font.BOLD, 28));
		doc_name.setFont(new Font("Arial", Font.BOLD, 28));
		doc_name_in.setFont(new Font("Arial", Font.BOLD, 28));
		time.setFont(new Font("Arial", Font.BOLD, 28));
		time_in.setFont(new Font("Arial", Font.BOLD, 28));
		list.setFont(new Font("Arial", Font.BOLD, 28));
		reset.setFont(new Font("Arial", Font.BOLD, 28));
		take.setFont(new Font("Arial", Font.BOLD, 28));
		back.setFont(new Font("Arial", Font.BOLD, 28));
		exit.setFont(new Font("Arial", Font.BOLD, 28));
		
		list.addActionListener(this);
		reset.addActionListener(this);
		take.addActionListener(this);
		back.addActionListener(this);
		exit.addActionListener(this);
		window.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==list) {
		DoctorClass[] d1 = new DoctorClass[100];
		int currDoctor = 0;
		
		File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\doctor_info.txt");
		
		try(Scanner input = new Scanner(file);) 
		{	
			while(input.hasNext()) {
				String name = input.nextLine();
				String time = input.nextLine();
				String specialist = input.nextLine();
				String mbbs = input.nextLine();
				String mbbs_from = input.nextLine();
				String mbbs_country = input.nextLine();
				String mbbs_year = input.nextLine();
				String fcps = input.nextLine();
				String fcps_from = input.nextLine();
				String fcps_country = input.nextLine();
				String fcps_year = input.nextLine();
				input.nextLine();
				
				d1[currDoctor] = new DoctorClass(name, time, specialist, mbbs,mbbs_from,mbbs_country, mbbs_year, 
													fcps,fcps_from,fcps_country,fcps_year);
				currDoctor++;
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		Doctor_listGUI d2 = new Doctor_listGUI();
		d2.initGui(d1, currDoctor);
		}
		if(e.getSource()==take) {
			int count = 0 , currP = 0;
			String username = username_in.getText();
			String doc_name2 = doc_name_in.getText();
			String time = time_in.getSelectedItem().toString();
			if(username.isEmpty() || doc_name2.isEmpty())
			{
				
			}
			else {
				window.dispose();
				//Serials_PatientsClass[] z1 = new Serials_PatientsClass[20];
				String name ="", age="", gender="", address="", phone="";
				File file = new File("D:\\eclipse-workspace\\Project\\src\\steps\\patient.txt");
				try(Scanner in = new Scanner(file);)
				{
					//Scanner in = new Scanner(file);
					while(in.hasNext())
					{
						String user = in.nextLine();
						count++;
						if(user.equals(username))
						{
							System.out.println("Else, "+count);
							name = in.nextLine();
							age = in.nextLine();
							gender = in.nextLine();
							address = in.nextLine();
							phone = in.nextLine();
							break;
							//z1[currP] = new Serials_PatientsClass(doc_name2, name, age, gender, address, phone);
						}
					}
				} 
				catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				System.out.println(doc_name2);
				
				if(doc_name2.equals("Dr. Mahir") )
				{
					System.out.println("ELSEOF");
					File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\mahir.txt");
					try(FileWriter fw = new FileWriter(file2,true);)
					{
						fw.write(name+"\n"+age+"\n"+gender+"\n"+address+"\n"+phone+"\n");
					} 
					catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if(doc_name2.equals("Dr. Shakel") )
				{
					System.out.println("ELSEOF2");
					File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\shakel.txt");
					try(FileWriter fw = new FileWriter(file2,true);)
					{
						fw.write(name+"\n"+age+"\n"+gender+"\n"+address+"\n"+phone+"\n");
					} 
					catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if(doc_name2.equals("Dr. Siam") )
				{
					System.out.println("ELSEOF3");
					File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\siam.txt");
					try(FileWriter fw = new FileWriter(file2,true);)
					{
						fw.write(name+"\n"+age+"\n"+gender+"\n"+address+"\n"+phone+"\n");
					} 
					catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				if(doc_name2.equals("Dr. Jannat") )
				{
					System.out.println("ELSEOF4");
					File file2 = new File("D:\\eclipse-workspace\\Project\\src\\steps\\jannat.txt");
					try(FileWriter fw = new FileWriter(file2,true);)
					{
						fw.write(name+"\n"+age+"\n"+gender+"\n"+address+"\n"+phone+"\n");
					} 
					catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
			after_take_serial a1 = new after_take_serial();
			a1.initGui(doc_name2);
		
		
		if(e.getSource()==reset) {
			window.dispose();
			Appointment d5 = new Appointment();
			d5.initGui();
		}
		
		if(e.getSource()==back) {
			window.dispose();
			Log_in_Patient d10 = new Log_in_Patient();
			d10.initGui();
		}
		
		if(e.getSource()==exit) {
			window.dispose();
			Exit e1 = new Exit();
			e1.initGui();
		}
		
	}



		}
	}


}
