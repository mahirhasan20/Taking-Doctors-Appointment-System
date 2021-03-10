package steps;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class after_take_serial implements ActionListener {

	JFrame window = new JFrame();
	JLabel msg;
	JButton close = new JButton("Close");
	
	public void initGui(String name) {
		GridLayout g1 = new GridLayout(2,1,8,8);
		window.setLayout(g1);
		msg = new JLabel("You have been successfully added to "+name+"'s serials");
		window.add(msg);
		window.add(close);
		
		window.setTitle("Exiting");
		window.setSize(900, 300);
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
