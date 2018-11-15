
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;
import java.util.Scanner;
/**
 *	Title: fish.java
 *	Description: This class is 6 types of fish and users can select a dish.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */

public class fish extends JFrame implements ActionListener {
	public JFrame frame2;
	public JPanel panel1,panel2,panel3;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	public JButton button1,button4;
	public JTextField tf;
	public String line,name,number2;
	/**
	 * this part is similar to mainMenu, through this part I add labels,buttons and panels.
	 */
	public fish(int n){
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
		
		l1=new JLabel("1.q¨©ngzh¨¥ng l¨²y¨²   £¤30",JLabel.CENTER);//ÎÄ×Ö¾ÓÖÐ
		l2=new JLabel("2.s¨­ngsh¨³ y¨²   £¤45",JLabel.CENTER);
		l3=new JLabel("3.shu¨«zh¨³ hu¨®y¨²   £¤28",JLabel.CENTER);
		l4=new JLabel("4.q¨©ngzh¨¥ng gu¨¬y¨²   £¤52",JLabel.CENTER);
		l5=new JLabel("5.k¨¯ushu¨« y¨²   £¤35",JLabel.CENTER);
		l6=new JLabel("<html>6. s¨¬chu¨¡n hu¨¢ngm¨¥n m¨¢n<br/>  £¤40",JLabel.CENTER);
		l7=new JLabel("Please select an option:");
		l8=new JLabel("Option selected:");
		if(n==1){
			l7=new JLabel("Sorry,it's not avalible.Please select again:");
		}
		else if(n==2){
			l7=new JLabel("Are you sure to order it?");
		}
		else if(n==3){
			l7=new JLabel("Error!Please select a right option:");
		}
		else{
			l7=new JLabel("Please select an option:");	
		}
		
		l1.setBackground(new Color(157, 195, 229));
		l2.setBackground(new Color(243, 177, 131));
		l3.setBackground(new Color(126, 225, 249));
		l4.setBackground(new Color(255, 255, 167));
		l5.setBackground(new Color(229, 147, 223));
		l6.setBackground(new Color(143, 251, 165));
		
		l1.setOpaque(true);
		l2.setOpaque(true);
		l3.setOpaque(true);
		l4.setOpaque(true);
		l5.setOpaque(true);
		l6.setOpaque(true);
		
		l1.setFont(new Font("",Font.BOLD,30));
		l2.setFont(new Font("",Font.BOLD,30));
		l3.setFont(new Font("",Font.BOLD,30));
		l4.setFont(new Font("",Font.BOLD,30));
		l5.setFont(new Font("",Font.BOLD,30));
		l6.setFont(new Font("",Font.BOLD,30));
		l7.setFont(new Font("",Font.BOLD,40));
		l8.setFont(new Font("",Font.BOLD,40));
		
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
		button4=new JButton("BACK TO MAINMENU");
		panel3.add(button1);
		panel3.add(button4);
		
		button1.addActionListener(this);
		button4.addActionListener(this);
		
		frame2.setLocation(0, 0);
		frame2.setSize(1280, 600);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	/**
	 * this part is to add the action event of each button, and it will achieve the assignment of name.
	 */
	public void actionPerformed(ActionEvent event){
	
		if (event.getSource().equals(button1)) {
			frame2.dispose();	
		number2=tf.getText();
		//System.out.println(number2);
		if(number2.equals("1")){
			name="q¨©ngzh¨¥ng l¨²y¨²";
			new makeSureFish("q¨©ngzh¨¥ng l¨²y¨²");
		}
		else if(number2.equals("2")){
			name="s¨­ngsh¨³ y¨²";
			new makeSureFish("s¨­ngsh¨³ y¨²");
		}
		else if(number2.equals("3")){
			name="shu¨«zh¨³ hu¨®y¨²";
			new makeSureFish("shu¨«zh¨³ hu¨®y¨²");
		}
		else if(number2.equals("4")){
			name="q¨©ngzh¨¥ng gu¨¬y¨²";
			new makeSureFish("q¨©ngzh¨¥ng gu¨¬y¨²");
		}
		else if(number2.equals("5")){
			name="k¨¯ushu¨« y¨²";
			new makeSureFish("k¨¯ushu¨« y¨²");
		}
		else if(number2.equals("6")){
			name="s¨¬chu¨¡n hu¨¢ngm¨¥n m¨¢n";
			new makeSureFish("s¨¬chu¨¡n hu¨¢ngm¨¥n m¨¢n");
		}
		else{
			new fish(3);
		}
		}
		//System.out.println(name);
		
		if (event.getSource().equals(button4)){
			frame2.dispose();
			new mainMenu(0);//it can back to mainMenu.
		}	
	}
		/*public static void main(String[] args) {
			new fish(0);
		}	*/
	}
	
	
	
	
	
	
	
	
	
	
	
	

