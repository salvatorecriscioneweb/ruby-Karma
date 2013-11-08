package it.d0ge01.karma.main;


import java.io.IOException;

import it.d0ge01.karma.lib.*;
import it.d0ge01.karma.util.*;

public class Menu {
	public Menu() throws IOException {
		int menuInput;
		System.out.print("Lang? ( it / en ) : ");
		Lang lang = new Lang(Utils.inputString());
		Karma karma = new Karma(lang);
		
		while(true) {
			System.out.println(" 1- " + lang.configureAP);
			System.out.println(" 2- " + lang.chTarget);
			System.out.println(" 3- " + lang.startAttack);
			
			System.out.println(" 99-" + lang.changeLang);
			System.out.println(" 0- " + lang.exit);
			
			// Input Menu
			try {
				menuInput = Utils.inputInt();
			} catch (IOException e) {
				menuInput = -1;
			}
			
			switch(menuInput) {
			case 1:
				karma.configure();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			
			case 99:
				System.out.print("Lang? ( it / en ) : ");
				lang = new Lang(Utils.inputString());
				break;
			case 0:
				return;
			default:
				System.out.println("Scelta non valida");
			}
		}
	}
}
