package Dackel_Merino;

public class Meerschweinchen {
	
	String rasse;
	double bauchumfang;
	boolean vollgefressen;
	
	public void fressen() {
		System.out.println("Das Meerschweinchen ist satt");
		vollgefressen = true;
	}
	
	
	static int tieranzahl;
	
	static void neuestier() {
		tieranzahl++;
	}
	
	
	public Meerschweinchen() {
		neuestier();
	}
	public Meerschweinchen(String var) {
		neuestier();
		rasse = var;
	}
	public Meerschweinchen(String var, double x) {
		neuestier();
		rasse = var;
		bauchumfang = x;
	}
}
