package steps;

import java.awt.*;

import javax.swing.*;

public class Admin_Patient_Gui {

	JFrame window = new JFrame();
	
	public void initGui(Admin_Patient_Class [] list , int size) {
		String[][] data = new String[size][7];
		String col[] = {"No. of Patients","Username","Name","Age","Gender","Address", "Phone"};
		for(int i=0; i<size;i++)
		{
			data[i][0] = ""+(i+1);
			data[i][1] = list[i].getUser();
			data[i][2] = list[i].getName();
			data[i][3] = list[i].getAge();
			data[i][4] = list[i].getGender();
			data[i][5] = list[i].getAddress();
			data[i][6] = list[i].getPhone();
			
		}
		JTable table = new JTable(data, col);
		JScrollPane k = new JScrollPane(table);
		window.add(k);
		
		table.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		window.setTitle("Patient Account");
		window.setSize(1600, 450);
		window.setLocation(200, 50);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
		
	}
	



}
