package steps;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Doctor_listGUI {
	
	JFrame window = new JFrame();
	
	public void initGui(DoctorClass [] list , int size) {
		String[][] data = new String[size][11];
		String col[] = {"Name","Timing","Specialist On","MBBS","MBBS From","MBBS Country","MBBS Year",
				"FCPS","FCPS From","FCPS Country","FCPS Year"};
		for(int i=0; i<size;i++)
		{
			data[i][0] = list[i].getName();
			data[i][1] = list[i].getTiming();
			data[i][2] = list[i].getSpecialist();
			data[i][3] = list[i].getMbbs_status();
			data[i][4] = list[i].getMbbs_from();
			data[i][5] = list[i].getMbbs_country();
			data[i][6] = list[i].getMbbs_year();
			data[i][7] = list[i].getFcps_status();
			data[i][8] = list[i].getFcps_from();
			data[i][9] = list[i].getFcps_country();
			data[i][10] = list[i].getFcps_year();
			
		}
		JTable table = new JTable(data, col);
		JScrollPane k = new JScrollPane(table);
		window.add(k);
		
		table.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		window.setTitle("Doctor List");
		window.setSize(1600, 450);
		window.setLocation(200, 50);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
		
	}
	

}
