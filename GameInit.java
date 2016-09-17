import java.io.*;
import java.util.Scanner;
/**
 * 
 * @author ilee & dfra
 *
 */

public class GameInit {
	
	public static String diff;
	public static boolean loopMenu = true;
	
	public static void main(String[] cheese){
		Scanner snr = new Scanner(System.in);
		diff = "easy";
		
		while(loopMenu){
			printMenu(diff);	
			
			String input = snr.next();
			input = input.toLowerCase();
			char put = input.charAt(0);
			switch(put) {
			case 't': break;
			case 'a': break;
			case 'i': break;
			case 'c': FrameDrive.main(cheese);
			case 'x': loopMenu = false; break;
			case 'e': diff = "easy"; break;
			case 'n': diff = "normal"; break;
			case 'h': diff = "hard"; break;
			default:
			}
		}
	
		
		snr.close();
	}
	//prints the menu
		public static void printMenu(String diff){
			System.out.println("Terrain Options - T"); 	// options = seed
			System.out.println("Actor options - A"); 	// options = numEnemies, race, disposition 
			System.out.println("Items options- I"); 	//Item sets like, medieval, magic, guns
			System.out.printf("Toggle Difficulty (e = easy, n = normal h = hard) Current = %s \n", diff);
			System.out.println("Continue - C"); 		//advance to game
			System.out.println("eXit - X"); 			//Exit program
		}
}
