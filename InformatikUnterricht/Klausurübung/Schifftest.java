package Klausurübung;

public class Schifftest {
	public static void main(String[]args) {
		
		Schiff Lutz = new Schiff();
		Schiff Kolli = new Schiff("bester boot hersteller");
		//Schiff Sav = new Schiff("Hersteller der Boote", 30.5);
		
		System.out.println("Es gibt " + Schiff.anzahl + " Schiffe");
		
		Lutz.fahren();
		Kolli.fahren(2.53);
	}

}
