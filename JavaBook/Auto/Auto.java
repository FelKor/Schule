package Auto;

public class Auto {
	
	//Instanzvariabelen
	String farbe;
	int ccm;
	double Vmax;
	double tankVolumen;
	double masse;
	double fahren;
	double geschwindigkeit;
	//Klassenvariabelen	
	static int anzahl;
	
	//Instanzmethoden
	//Geschwindigkeit
	public void fahren(double var) {
		System.out.println("Das Auto foehrt mit " + var + " km/h vorwoerts");
		geschwindigkeit = var;
	}
	public void fahren() {
		System.out.println("Das Auto foehrt Vorwoerst");
	}
	
	//Print
	public void print() {
		System.out.println("Das Auto hat eine maximale Geschwindigkeit von " + Vmax + "km/h");
		System.out.println("Das Auto hat ein Tankvolumen von " + tankVolumen + "L");
		System.out.println("Das Auto ist " + masse + "T schwer");
	}
	
	//Konstruktoren:
	//Konstruktor 1:
	public Auto() {
		anzahl = anzahl + 1;
	}
	
	//Konstruktor 2:
	public Auto(String var) {
		anzahl = anzahl +1;
		farbe = var;
		System.out.println("Das Auto hat die Farbe " + farbe);
	}
	
	//Konstruktor 3:
	public Auto(String var, int x) {
		anzahl = anzahl +1;
		farbe = var;
		System.out.println("Das Auto hat die Farbe " + farbe);
		ccm = x;
		System.out.println("Das Auto hat " + ccm + " Qubikzentimeter Hubraum");
	}
	
}
