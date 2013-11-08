package it.d0ge01.karma.lib;

public class Lang {
	public String configureAP;
	public String chTarget;
	public String startAttack;
	public String APNameAnswer;
	public String netAddrAnswer;
	public String exit;
	public String changeLang;
	public String APstarted;
	
	
	
	
	
	public Lang(String lang) {
		switch (lang) {
		case "it":
			setItalian();
			break;
		case "en":
			setEnglish();
			break;
		default:
			setEnglish();
		}
	}
	
	private void setItalian() {
		this.configureAP = "Configura AP";
		this.chTarget = "Scegli bersaglio";
		this.startAttack = "Avvia attacco";
		this.APNameAnswer = "Inserisci il nome del AP: ";
		this.netAddrAnswer = "Inserisci l'indirizzo di rete di default ( 192.168.1. ) : ";
		this.exit = "Esci";
		this.changeLang = "Cambia Lingua";
		this.APstarted = "AP avviato";
	}
	
	private void setEnglish() {
		this.configureAP = "Configure AP";
		this.chTarget = "Choose target";
		this.startAttack = "Start attack";
		this.APNameAnswer = "Insert AP Name: ";
		this.netAddrAnswer = "Insert net address ( default: 192.168.1. ) : ";
		this.exit = "Exit";
		this.changeLang = "Change Language";
		this.APstarted = "AP started";
	}
}
