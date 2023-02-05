package Klausurübung;

public class Schiff {
	
	//Nr. 1
	
	double Knoten;
	boolean mitMotor;
	
	public void fahren() {
		System.out.println("Das Schiff faehrt vorwaerts!");
	}
	
	static int anzahl = 0;
	
	static int getAnzahl() {
		return anzahl;
	}
	static void moreSchiffe() {
		anzahl++;
	}
	
	//Nr. 2
	
	String herstellername;
	double Zuladung;
	
	public Schiff() {
		moreSchiffe();
	}
	public Schiff(String var) {
		this.herstellername = var;
		moreSchiffe();
	}
	public Schiff(String var, double x) {
		this.Zuladung = x;
		this.herstellername = var;
		moreSchiffe();
	}
	
	//Nr. 3
	
	public void fahren(double x) {
		this.Knoten = x;
		System.out.println("Das Schiff faehrt mit " + Knoten + " Knoten vorwaerts");
	}
	
}
