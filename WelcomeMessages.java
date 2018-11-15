import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *	Title: WelcomeMessages.java
 *	Description: This class is to show the frame of welcome, the text will be selected randomly from WelcomeMessages.txt.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */
public class WelcomeMessages extends JFrame implements ActionListener {
	public JFrame frame1;
	public JButton button;
	public FileReader fileReader;
	public BufferedReader reader;
	public String line,message;
	public Timer timer;
	
	/**
	 * creat random numbers from 0 to 4,
	 *    the robot compare the number and the line in the Welcommessages.txt,
	 *   and read the next line when the numbers are equal to it in the text. 
	 */
	public WelcomeMessages(){
                timer1();
		frame1=new JFrame("I am robot");
	    button=new JButton();
		int x = (int)(Math.random()*4);
		if (x==1){
			try{
				File myFile=new File("..\\..\\Files\\WelcomeMessages.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("1")){
						message=reader.readLine();
						button.setText(message);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if (x==2){
			try{
				File myFile=new File("..\\..\\Files\\WelcomeMessages.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("2")){
						message=reader.readLine();
						button.setText(message);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if (x==3){
			try{
				File myFile=new File("..\\..\\Files\\WelcomeMessages.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("3")){
						message=reader.readLine();
						button.setText(message);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else {
			try{
				File myFile=new File("..\\..\\Files\\WelcomeMessages.txt");
				fileReader=new FileReader(myFile);
				reader=new BufferedReader(fileReader);
				
				line=null;
				while((line=reader.readLine())!=null){
					if(line.equals("4")){
						message=reader.readLine();
						button.setText(message);
					}
							
				}
				reader.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		button.setBackground(new Color(90, 155, 213));
		button.setForeground(Color.black);
		button.setFont(new Font("",Font.BOLD,40));
		button.addActionListener(this);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().add(button);

		frame1.setSize(1280,600);
		frame1.setVisible(true);	
	}

	public void actionPerformed(ActionEvent event){
		frame1.dispose();
		new mainMenu(0);
	}
	public static void timer1(){
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				new robotSleep();
			}
		},30000);
	}
}
