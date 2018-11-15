import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
/**
 *	Title: makeSureMeat.java
 *	Description: This class is make users make sure whether they want to order that meat.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */
public class makeSureMeat extends JFrame implements ActionListener {
	public JFrame frame8;
	public JPanel panel1,panel2;
	public JButton button1,button2;
	public JLabel label1;
	public FileReader fileReader;
	public FileWriter writer;
	public BufferedReader reader;
	public BufferedWriter bufferWritter;
	public String[] s;
	public int num;
	public String name,meatPrice;
	/**
	 * use name and add two button ,use the method to write.
	 */
	public makeSureMeat(String name){
		this.name=name;
		frame8=new JFrame();
		panel1=new JPanel();
		panel2=new JPanel();
		button1=new JButton("yes");
		button2=new JButton("back");
		button1.setFont(new Font("",Font.BOLD,30));
		button2.setFont(new Font("",Font.BOLD,30));
		label1=new JLabel("Are you sure to order  "+name +"?",JLabel.CENTER);
		label1.setFont(new Font("",Font.BOLD,40));//×ÖºÅ´óÐ¡
	
		panel1.setBackground(new Color(90, 155, 213));
		panel2.setBackground(new Color(90, 155, 213));
		
		frame8.add(panel1,BorderLayout.CENTER);
		frame8.add(panel2,BorderLayout.SOUTH);
		panel1.setLayout(new BorderLayout());
		panel1.add(label1,BorderLayout.CENTER);
		panel2.add(button1);
		panel2.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	
		
		
		
		frame8.setLocation(0, 0);
		frame8.setSize(1280, 600);
		frame8.setVisible(true);
		//System.out.println(name);
	}
	/**
	 * put the data in to an array
	 * through comparing name from fish.java
	 * and read the nextline, make it -1
	 * and then write into the FishDishes.txt
	 */
	public void actionPerformed(ActionEvent event){
		
		if (event.getSource().equals(button1)){
			frame8.dispose();
			
			s = new String[30];
			for(int m=0;m<30;m++){
				s[m]="";
			}
			
			int i = 0;
			
			//System.out.println("which do you like?meat,fish or drink");
			
			//System.out.println(this.name);
			try {
				String line=new String();
				fileReader=new FileReader("..\\..\\Files\\MeatDishes.txt");
				reader=new BufferedReader(fileReader);

				while ((line=reader.readLine()) != null) {
					s[i]=line;
					i++;
				}
				reader.close();
			} catch (Exception ex) {
				ex.printStackTrace();
				
			}
			//System.out.println(s[1]);
			
			int j=0;
			
			for (j=0; j<= i; j++) {
				if ( s[j].equals(name) ) {
					num=Integer.parseInt(s[j + 1]);
					meatPrice=s[j + 2];
					if (num < 1) {
						System.out.println(name + " is not available");
						new meat(1);
						//System.out.println("ddd");
						break;
					} else {
						new Ajoke(0);
						set(name);
						settwo(meatPrice);
						break;
					}
				}
			}
			s[j+1]=String.valueOf(num - 1);
			//System.out.println(s[3]);
			try {
				writer = new FileWriter("..\\..\\Files\\MeatDishes.txt");
				bufferWritter = new BufferedWriter(writer);
				for (int k = 0; k <= i; k++) {
					bufferWritter.write(s[k]);
					bufferWritter.newLine();
				}
				bufferWritter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("hhhhh you foolish");
			}	
		}
		if(event.getSource().equals(button2)){
			frame8.dispose();
			new meat(0);
		}
	}
	/**
	 * when users order some dish, its name and price will write in to a file order.txt
	 * if it doesn't exist, the robot will create one
	 */
	public String set(String name){
	     try{
	      String data = name;
	      File file =new File("ordered.txt");
	      file.createNewFile();
	      FileWriter fileWritter = new FileWriter(file.getName(),true);
	             BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	             bufferWritter.write(data);
	             bufferWritter.newLine();
	             bufferWritter.close();

	         System.out.println("Done");

	     }catch(IOException e){
	      e.printStackTrace();
	     }
	     return "1";
	}
	/**
	 * this part is to write the price which is ordered into ordered.txt.
	 */
	public String settwo(String meatPrice){
	     try{
	      String data = meatPrice;
	      File file =new File("ordered.txt");
	      file.createNewFile();
	      FileWriter fileWritter = new FileWriter(file.getName(),true);
	             BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	             bufferWritter.write(data);
	             bufferWritter.newLine();
	             bufferWritter.close();

	         System.out.println("Done");

	     }catch(IOException e){
	      e.printStackTrace();
	     }
	     return "1";
	}
}
