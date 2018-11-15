import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;
/**
 *	Title: Ajoke.java
 *	Description: This class is to select a joke randomly.
 *	@author  Qiaokun Wen
 *	@version 1.0 
 */



public class Ajoke extends JFrame implements ActionListener {
	public JFrame frame2;
	public JPanel panel1,panel2,panel3;
	public JLabel l1,l2,l3;
	public JButton button1,button2,button3,button4;
	public FileReader fileReader;
	public BufferedReader reader;
	public String line,message,message2;
	
	/**
	 * this part is similar to WelcomeMessage.java, to read the jokes
	 */
	public Ajoke(int n){
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
		if (n==1){
			l2=new JLabel("Are you sure to leave?",JLabel.CENTER);
		}
		else{
			l2=new JLabel("You've ordered it successfully.Let me tell a joke for you~",JLabel.CENTER);
		}
		
		int x = (int)(Math.random()*4);
		if(x==1){
			try{
				File myFile=new File("..\\..\\Files\\jokes.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("1")){
						message=reader.readLine();
						message2=reader.readLine();
						l1=new JLabel(message,JLabel.CENTER);
						l3=new JLabel(message2,JLabel.CENTER);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if(x==2){
			try{
				File myFile=new File("..\\..\\Files\\jokes.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("2")){
						message=reader.readLine();
						message2=reader.readLine();
						l1=new JLabel(message,JLabel.CENTER);
						l3=new JLabel(message2,JLabel.CENTER);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if(x==3){
			try{
				File myFile=new File("..\\..\\Files\\jokes.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("3")){
						message=reader.readLine();
						message2=reader.readLine();
						l1=new JLabel(message,JLabel.CENTER);
						l3=new JLabel(message2,JLabel.CENTER);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else{
			try{
				File myFile=new File("..\\..\\Files\\jokes.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("4")){
						message=reader.readLine();
						message2=reader.readLine();
						l1=new JLabel(message,JLabel.CENTER);
						l3=new JLabel(message2,JLabel.CENTER);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		l1.setBackground(Color.PINK);
		l2.setBackground(new Color(90, 155, 213));
		l3.setBackground(Color.PINK);
		l1.setOpaque(true);//显示标签
		l2.setOpaque(true);
		l3.setOpaque(true);
		
		l1.setFont(new Font("",Font.BOLD,40));//字号大小
		l2.setFont(new Font("",Font.BOLD,40));
		l3.setFont(new Font("",Font.BOLD,40));
		
		panel1.setLayout(new GridLayout(2,1));
		panel1.add(l1);
		panel1.add(l3);
		panel2.add(l2);
		
		button1=new JButton("BACK TO MAINMENU");
		button2=new JButton("LEAVE THE RESTAURANT");
		button3=new JButton("YES");
		button4=new JButton("NO");
		button1.addActionListener(this);
		button2.addActionListener(this);
		if(n==1){
			panel2.add(button3);
			panel2.add(button4);
			button3.addActionListener(this);
			button4.addActionListener(this);
		}
		
		panel3.add(button1);
		panel3.add(button2);
		
		frame2.setLocation(0, 0);
		frame2.setSize(1280, 600);
		frame2.setVisible(true);
		
	}
		
	/**
	 * this part is to add the action event of each button.
	 */
	public void actionPerformed(ActionEvent event){
		frame2.dispose();
		if (event.getSource()==button1){
			new mainMenu(0);
		}
		else if(event.getSource()==button2){
			new Ajoke(1);
		}
		else if(event.getSource()==button3){
			new settle();
		}
		else if(event.getSource()==button4){
			new Ajoke(0);
		}
	}
	
}
