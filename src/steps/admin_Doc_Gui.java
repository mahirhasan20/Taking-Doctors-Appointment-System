package steps;

import java.awt.*;

import javax.swing.*;

public class admin_Doc_Gui {
	JFrame window = new JFrame();
	
	public void initGui(admin_Doc_Class [] list , int size) {
		String[][] data = new String[size][15];
		String col[] = {"No. of Doctor","Name","Age","Gender","Time", "Phone","Specialist On","MBBS","MBBS From","MBBS Country","MBBS Year",
				"FCPS","FCPS From","FCPS Country","FCPS Year"};
		for(int i=0; i<size;i++)
		{
			data[i][0] = ""+(i+1);
			data[i][1] = list[i].getName();
			data[i][2] = list[i].getAge();
			data[i][3] = list[i].getGender();
			data[i][4] = list[i].getTime();
			data[i][5] = list[i].getPhone();
			data[i][6] = list[i].getSpecialist();
			data[i][7] = list[i].getMbbs();
			data[i][8] = list[i].getMbbs_from();
			data[i][9] = list[i].getMbbs_country();
			data[i][10] = list[i].getMbbs_year();
			data[i][11] = list[i].getFcps();
			data[i][12] = list[i].getFcps_from();
			data[i][13] = list[i].getFcps_country();
			data[i][14] = list[i].getFcps_year();
			
		}
		JTable table = new JTable(data, col);
		JScrollPane k = new JScrollPane(table);
		window.add(k);
		
		table.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		window.setTitle("Doctor Account");
		window.setSize(1600, 450);
		window.setLocation(200, 50);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
		
	}
	

}
