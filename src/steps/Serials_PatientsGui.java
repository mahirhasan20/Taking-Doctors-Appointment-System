package steps;

import java.awt.*;
import javax.swing.*;

public class Serials_PatientsGui {
	
	JFrame window = new JFrame();
	JFrame window2 = new JFrame();
	JFrame window3 = new JFrame();
	JFrame window4 = new JFrame();
	JFrame window5 = new JFrame();
	
	public void initGui(Serials_PatientsClass [] list , int size, String Doctor) {
		//System.out.println("Worked");
		String name;
		
		if(Doctor.equals("Dr. Mahir")) 
		{
			String[][] data = new String[size][6];
			String col[] = {"Serial No","Name","Age","Gender","Address","Phone"};
			for(int i=0; i<size;i++)
			{
				name = list[i].getDoctor_name();
				data[i][0] = ""+(i+1);
				data[i][1] = list[i].getName();
				data[i][2] = list[i].getAge();
				data[i][3] = list[i].getGender();
				data[i][4] = list[i].getAddress();
				data[i][5] = list[i].getPhone();	
			}
			JTable table = new JTable(data, col);
			JScrollPane k = new JScrollPane(table);
			window.add(k);
			
			table.setFont(new Font("Arial", Font.BOLD, 15));
			
			
			window.setTitle("Today's patient list");
			window.setSize(1000, 450);
			window.setLocation(650, 150);
			//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		
		}

		else if(Doctor.equals("Dr. Shakel")) 
			{
			String[][] data = new String[size][6];
			String col[] = {"Serial No","Name","Age","Gender","Address","Phone"};
			for(int i=0; i<size;i++)
			{
				name = list[i].getDoctor_name();
				data[i][0] = ""+(i+1);
				data[i][1] = list[i].getName();
				data[i][2] = list[i].getAge();
				data[i][3] = list[i].getGender();
				data[i][4] = list[i].getAddress();
				data[i][5] = list[i].getPhone();	
			}
			JTable table = new JTable(data, col);
			JScrollPane k = new JScrollPane(table);
			window2.add(k);
			
			table.setFont(new Font("Arial", Font.BOLD, 15));
			
			
			window2.setTitle("Today's patient list");
			window2.setSize(1000, 450);
			window2.setLocation(650, 150);
			//window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window2.setVisible(true);
			
			}
		
		else if(Doctor.equals("Dr. Siam"))
		{

			String[][] data = new String[size][6];
			String col[] = {"Serial No","Name","Age","Gender","Address","Phone"};
			for(int i=0; i<size;i++)
			{
				name = list[i].getDoctor_name();
				data[i][0] = ""+(i+1);
				data[i][1] = list[i].getName();
				data[i][2] = list[i].getAge();
				data[i][3] = list[i].getGender();
				data[i][4] = list[i].getAddress();
				data[i][5] = list[i].getPhone();	
			}
			JTable table = new JTable(data, col);
			JScrollPane k = new JScrollPane(table);
			window3.add(k);
			
			table.setFont(new Font("Arial", Font.BOLD, 15));
			
			
			window3.setTitle("Today's patient list");
			window3.setSize(1000, 450);
			window3.setLocation(650, 150);
			//window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window3.setVisible(true);
		}
		
		else if(Doctor.equals("Dr. Jannat")) {
		String[][] data = new String[size][6];
		String col[] = {"Serial No","Name","Age","Gender","Address","Phone"};
		for(int i=0; i<size;i++)
		{
			name = list[i].getDoctor_name();
			data[i][0] = ""+(i+1);
			data[i][1] = list[i].getName();
			data[i][2] = list[i].getAge();
			data[i][3] = list[i].getGender();
			data[i][4] = list[i].getAddress();
			data[i][5] = list[i].getPhone();	
		}
		JTable table = new JTable(data, col);
		JScrollPane k = new JScrollPane(table);
		window4.add(k);
		
		table.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		window4.setTitle("Today's patient list");
		window4.setSize(1000, 450);
		window4.setLocation(650, 150);
		//window4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window4.setVisible(true);
		
		}
	
	}
	
}