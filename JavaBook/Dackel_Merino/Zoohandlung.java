package Dackel_Merino;

public class Zoohandlung {
	public static void main(String args[]) {
		
		Meerschweinchen bommel = new Meerschweinchen();
		//Meerschweinchen rommel = new Meerschweinchen("Rothaar");
		//Meerschweinchen bammel = new Meerschweinchen("Silberhaar", 99.9);
		
		bommel.fressen();
		
		System.out.println("Anzahl: " + Meerschweinchen.tieranzahl);
		
		//Merino hanni = new Merino();
		Merino nanni = new Merino("Merino");
		//Merino fanni = new Merino("Braunhaar", 4.5);
		
		nanni.fressen();
		
		System.out.println("Anzahl: " + Merino.tieranzahlmerino);
		System.out.println("Anzahl: " + Meerschweinchen.tieranzahl);
	}

}
