import java.util.Timer;
import java.util.TimerTask;
/**
 *	Title: RobotGUI.java
 *	Description: This class is the start of the program.
 *	@author  Qiaokun Wen
 *	@version 1.0
 */

public class RobotGUI {
	public void WelcomeMessages(){
		new WelcomeMessages();
	}
	public void mainMenu(){
		new mainMenu(0);
	}
	public void fish(){
		new fish(0);
	}
	public void meat(){
		new meat(0);
	}
	public void rice(){
		new rice(0);
	}
	public void noodels(){
		new noodels(0);
	}
	public void drink(){
		new drink(0);
	}
	public void makeSureFish(){
		new makeSureFish(null);
	}
	public void makeSureMeat(){
		new makeSureMeat(null);
	}
	public void makeSureRice(){
		new makeSureRice(null);
	}
	public void makeSureNoodels(){
		new makeSureNoodels(null);
	}
	public void makeSureDrink(){
		new makeSureDrink(null);
	}
	public void Ajoke(){
		new Ajoke(0);	
	}
	public void settle(){
		new settle();	
	}
	public void Goodbye(){
		new Goodbye();
	}
	/**
	 * this part is used to calculate time
	 */
	public static void timer1(){
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				new robotSleep();
			}
		},30000);
	}
	
	/**
	 * this part is the main function
	 */
	public static void main(String[] args){
		new WelcomeMessages();
	}
	
}
