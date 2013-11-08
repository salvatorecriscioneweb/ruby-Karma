package it.d0ge01.karma.main;

import java.io.IOException;
import java.util.LinkedList;
import it.d0ge01.*;
import it.d0ge01.karma.lib.*;
import it.d0ge01.karma.util.Utils;


public class Karma {
	// Name of AP
	private String APName = "Karma";
	
	// Security, 0 = null, 1 = WEP , 2 = WPA
	private int APSec;
	
	// Handlers online
	LinkedList handlers;
	
	// Netaddr default
	private String netAddr = "192.168.2.";
	
	// Language database
	private Lang lang;
	
	public Karma(Lang lang) {
		this.handlers = new LinkedList();
		this.lang = lang;
		this.startAP();
	}
	
	public void restartAP() {
			
	}
		
	public void startAP() {
		System.out.println("[!]" + lang.APstarted);
	}


	
	public void configure() throws IOException {
		System.out.print(this.lang.APNameAnswer);
		this.APName = Utils.inputString();
		System.out.print(this.lang.netAddrAnswer);
		this.netAddr = Utils.inputString();
		
	}
}
