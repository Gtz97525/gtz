import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.*;
/**
 *	Title: settle.java
 *	Description: This class can show the dishes wich users ordered and calculate total price.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */
public class settle implements ActionListener {
	public JFrame frame3;
	public JPanel panel1,panel2,panel3;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	public FileReader fileReader;
	public BufferedReader reader;
	public String line,message,as;
	public JButton button1,button2;
	public String[] s;
	public int a,price;
	static int totalprice;
	/**
	 * this part is to make a frame, its labels, panels and button, and it also put the data of order.txt into an array.
	 */
	public settle(){
		frame3=new JFrame();
		
		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();
		panel1.setBackground(Color.pink);
		panel2.setBackground(new Color(90, 155, 213));
		panel3.setBackground(new Color(90, 155, 213));
		frame3.getContentPane().add(panel1, BorderLayout.CENTER);
		frame3.getContentPane().add(panel2, BorderLayout.NORTH);
		frame3.getContentPane().add(panel3, BorderLayout.SOUTH);
		
		l1=new JLabel("You have ordered",JLabel.CENTER);
		
		l3=new JLabel("гд in total",JLabel.CENTER);
		
		s = new String[30];
		for(int m=0;m<30;m++){
			s[m]="";
		}
		int i = 0;
		try {
			String line = new String();
			fileReader = new FileReader("ordered.txt");
			reader = new BufferedReader(fileReader);
			while ((line = reader.readLine()) != null) {
				s[i] = line;
				i++;
			}
			System.out.println(s[1]);
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		int j=1;
		for (j = 1; j <= i; j=j+2) {
			price = Integer.parseInt(s[j]);
			a=account(price);
		}		
		as=String.valueOf(a);
		l2=new JLabel(as,JLabel.CENTER);
		l4=new JLabel(s[0]+" " +" гд"+s[1],JLabel.CENTER);
		l5=new JLabel(s[2]+" " +" гд"+s[3],JLabel.CENTER);
		l6=new JLabel(s[4]+" " +" гд"+s[5],JLabel.CENTER);
		l7=new JLabel(s[6]+" " +" гд"+s[7],JLabel.CENTER);
		l8=new JLabel(s[8]+" " +" гд"+s[9],JLabel.CENTER);
		l9=new JLabel(s[10]+" " +" гд"+s[11],JLabel.CENTER);
		l10=new JLabel(s[12]+" " +" гд"+s[13],JLabel.CENTER);
		l11=new JLabel(s[14]+" " +" гд"+s[15],JLabel.CENTER);
		l12=new JLabel(s[16]+" " +" гд"+s[17],JLabel.CENTER);
	
		l1.setBackground(new Color(90, 155, 213));
		l2.setBackground(new Color(90, 155, 213));
		l3.setBackground(new Color(90, 155, 213));
		l4.setBackground(Color.pink);
		l1.setOpaque(true);
		l2.setOpaque(true);
		l3.setOpaque(true);
		l4.setOpaque(true);
		l1.setFont(new Font("",Font.BOLD,40));
		l2.setFont(new Font("",Font.BOLD,40));
		l3.setFont(new Font("",Font.BOLD,40));
		l4.setFont(new Font("",Font.BOLD,20));
		l5.setFont(new Font("",Font.BOLD,20));
		l6.setFont(new Font("",Font.BOLD,20));
		l7.setFont(new Font("",Font.BOLD,20));
		l8.setFont(new Font("",Font.BOLD,20));
		l9.setFont(new Font("",Font.BOLD,20));
		l10.setFont(new Font("",Font.BOLD,20));
		l11.setFont(new Font("",Font.BOLD,20));
		l12.setFont(new Font("",Font.BOLD,20));
		
		
			
		panel2.setLayout(new GridLayout(1,3));
		panel2.add(l1);
		panel2.add(l2);
		panel2.add(l3);
		
		panel1.setLayout(new GridLayout(3,3));
		panel1.add(l4);
		panel1.add(l5);
		panel1.add(l6);
		panel1.add(l7);
		panel1.add(l8);
		panel1.add(l9);
		panel1.add(l10);
		panel1.add(l11);
		panel1.add(l12);
		button1=new JButton("PAY");
		button1.setFont(new Font("",Font.BOLD,30));
		panel3.add(button1);
		button1.addActionListener(this);
			
		frame3.setLocation(0, 0);
		frame3.setSize(1280, 600);
		frame3.setVisible(true);		
	}
	
	/**
	 * this part is the action listener.
	 */
	public void actionPerformed(ActionEvent event){
		frame3.dispose();
		new Goodbye();
	}
	
	public int account(int num){
		totalprice=totalprice+num;//add all the price
		return totalprice;
	}	
}
