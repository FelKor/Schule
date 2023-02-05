package Dackel;

public class dackel {
	
	//Kunstruktoren:
	//Konstrukter 1
	public dackel() {
		System.out.println("Ein Dackel ist geboren!");
		anzahl = anzahl + 1;
		Alter = 1;
	}
	//Konstruktor 2
	public dackel(int x) {
		System.out.println("Ein Dackel ist geboren!");
		anzahl = anzahl+1;
		Alter = x;
	}
	//Konstruktor 3
	public dackel(int x, String var) {
		System.out.println("Ein Dackel ist geboren!");
		anzahl = anzahl + 1;
		Alter = x;
		name = var;
	}
	
	
	//Destrukturen:
	//Destruktor 1:
	public void finalize() {
		System.out.println("Ein Dackel ist gestorben");
		anzahl = anzahl-1;
	}
	
	
	//Instanzvariabele(Besteht foer jedes Objekt)
	int Alter;
	int Schulterhoehe;
	int fressen;
	String name;
	
	//Objektmethoden:
	//Bellen
	public void bellen() {
		System.out.println("WauWau!");
	}
	
	//Alter
	public int getAlter() {
		return this.Alter;
	}
	public void setAlter(int x) {
		this.Alter += x;
	}
	
	//Schulterhoehe
	public int getSchulterhoehe() {
		return this.Schulterhoehe;
	}
	public void setSchulterhoehe(int x) {
		this.Schulterhoehe = x;
	}
	
	//Laufen
	public void laufen() {
		System.out.println("Der Hund loeuft geradeaus");
	}
	
	//Fressen
	public void fressen() {
		System.out.println("Der Hund frisst seinen Napf leer.");
	}
	
	//Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name; //Return wird gebrauch um aus einer privaten classe einzelne Variabelen herauszuziehen
	}
	
	
	//Klassenvariabele(Steht oeber den Objekten)
	static int anzahl;
	
	//Klassenmethoden
	//Anzahl
	static void moreDackel() {
		dackel.anzahl = dackel.anzahl + 1;
	}
}

