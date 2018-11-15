import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/**
 *	Title: robotSleep.java
 *	Description: This class is frame of sleeping.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */
public class robotSleep extends JFrame implements ActionListener{
	public JFrame frame5;
	public JPanel panel1;
	public JButton button1;
	public JLabel label1;
	/**
	 * this part is to create a frame of sleep
	 */
	public robotSleep(){
		frame5=new JFrame();
		panel1=new JPanel();
		button1=new JButton("wake up");
		label1=new JLabel("I am sleeping...",JLabel.CENTER);
		label1.setFont(new Font("",Font.BOLD,50));
		button1.setFont(new Font("",Font.BOLD,40));
		button1.addActionListener(this);
		
		panel1.setBackground(new Color(90, 155, 213));
		frame5.add(panel1);
		panel1.setLayout(new BorderLayout());
		panel1.add(label1,BorderLayout.CENTER);
		panel1.add(button1,BorderLayout.SOUTH);
		
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setSize(1280,600);
		frame5.setVisible(true);
		
	}
	
	/**
	 * this part is the the action event to make this frame close
	 */
	public void actionPerformed(ActionEvent event){
		frame5.dispose();
	}

	
}


