import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;
/**
 *	Title: mainMenu.java
 *	Description: This class is to show the main menu of different types of food.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */
public class mainMenu extends JFrame implements ActionListener{
	public JFrame frame2;
	public JPanel panel1,panel2,panel3;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	public JButton button1;
	public JTextField tf;
	public String number;
	public int X = 0;
	public Timer timer;
	
	/**
	 * this part is to make a frame, add panels on the frame, add labels, textfield, buttons on the panels.
	 */
	public mainMenu(int n){
		//timer1();
		frame2=new JFrame();
		
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel1.setBackground(Color.yellow);
		panel2.setBackground(new Color(90, 155, 213));
		panel3.setBackground(new Color(90, 155, 213));
		
		frame2.getContentPane().add(panel1, BorderLayout.CENTER);
		frame2.getContentPane().add(panel2, BorderLayout.NORTH);
		frame2.getContentPane().add(panel3, BorderLayout.SOUTH);
		
		l1=new JLabel("1.fish",JLabel.CENTER);//make the text in the center of the panel
		l2=new JLabel("2.meat",JLabel.CENTER);
		l3=new JLabel("3.rice",JLabel.CENTER);
		l4=new JLabel("4.noodles",JLabel.CENTER);
		l5=new JLabel("5.drink",JLabel.CENTER);
		l6=new JLabel("",JLabel.CENTER);
		l8=new JLabel("Option selected:");
		/*
		 using a parameter to show different results on the top of the line
		 
		 */
		if(n==1){
			l7=new JLabel("Error!Please select again");
		}
		else if(n==2){
			l7=new JLabel("It's not available, please select again");
		}
		else{
			l7=new JLabel("Please select a dish to order:");	
		}
		
		l1.setBackground(new Color(157, 195, 229));
		l2.setBackground(new Color(243, 177, 131));
		l3.setBackground(new Color(126, 225, 249));
		l4.setBackground(new Color(255, 255, 167));
		l5.setBackground(new Color(229, 147, 223));
		l6.setBackground(new Color(143, 251, 165));
		
		l1.setOpaque(true);//show the label
		l2.setOpaque(true);
		l3.setOpaque(true);
		l4.setOpaque(true);
		l5.setOpaque(true);
		l6.setOpaque(true);
		
		l1.setFont(new Font("",Font.BOLD,50));//makesure the size
		l2.setFont(new Font("",Font.BOLD,50));
		l3.setFont(new Font("",Font.BOLD,50));
		l4.setFont(new Font("",Font.BOLD,50));
		l5.setFont(new Font("",Font.BOLD,50));
		l6.setFont(new Font("",Font.BOLD,50));
		l7.setFont(new Font("",Font.BOLD,40));
		l8.setFont(new Font("",Font.BOLD,40));
		/*
		 using GridLayout to compose type 
		 */
		panel1.setLayout(new GridLayout(2,3));
		panel1.add(l1);
		panel1.add(l2);
		panel1.add(l3);
		panel1.add(l4);
		panel1.add(l5);
		panel1.add(l6);
		panel2.add(l7);
		panel3.add(l8);
		
		tf=new JTextField(10);
		panel3.add(tf);
		
		
		
		
		button1=new JButton("OK");	
		panel3.add(button1);
		button1.addActionListener(this);
		
		frame2.setLocation(0, 0);
		frame2.setSize(1280, 600);
		frame2.setVisible(true);
	}
	/**
	 * this part is to add the action event of each button.
	 */
	public void actionPerformed(ActionEvent event){
		frame2.dispose();//close frame2
		number=tf.getText();//read the text of the textfield
		if(number.equals("1")){//using.equals to avoid mistakes
			new fish(0);
			X = 0;
		}
		else if(number.equals("2")){
			new meat(0);
			X = 1;
		}
		else if(number.equals("3")){
			new rice(0);
			X = 2;
		}
		else if(number.equals("4")){
			new noodels(0);
			X = 3;
		}
		else if(number.equals("5")){
			new drink(0);
			X = 4;
		}
		else{
			new mainMenu(1);
		}		
	}	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

