/**
 *  Author: Isaiah Lee
 */

import java.util.*;



public class CommandShell {
	//Main method
	public static void main(String[] cheese){
		Scanner snr = new Scanner(System.in);
		printMenu();
		
		
		String input = snr.next();
		input = input.toLowerCase();
		char put = input.charAt(0);
		switch(put) {
		case 'n': CharacterCreation.main(cheese); break;
		case 'l': break;
		case 'c': break;
		case 'o': break;
		case 'x': break;
		default:
		}
		
		snr.close();
	}
	
	//prints the menu
	public static void printMenu(){
		System.out.println("New Game - N");
		System.out.println("Load Game - L");
		System.out.println("Continue - C");
		System.out.println("Options - O");
		System.out.println("eXit - X");
	}
	
	
}
