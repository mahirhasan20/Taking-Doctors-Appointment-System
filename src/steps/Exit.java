package steps;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exit implements ActionListener {
	JFrame window = new JFrame();
	JLabel msg = new JLabel("Thank you so much for using Hospital Management System!");
	JButton close = new JButton("Close");
	
	public void initGui() {
		GridLayout g1 = new GridLayout(2,1,8,8);
		window.setLayout(g1);
		
		window.add(msg);
		window.add(close);
		
		window.setTitle("Exiting");
		window.setSize(1000, 500);
		window.setLocation(450, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.setFont(new Font("Arial", Font.BOLD, 28));
		close.setFont(new Font("Arial", Font.BOLD, 28));
		
		close.addActionListener(this);
		window.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==close)
			window.dispose();
		
	}

}
