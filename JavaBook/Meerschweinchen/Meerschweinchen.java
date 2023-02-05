package Meerschweinchen;

public class Meerschweinchen {
	
	String rasse;
	double bauchumfang;
	boolean vollgefressen;
	
	static int tieranzahl;
	
	public void fressen() {
		System.out.println("Das Meerschweinchen ist satt");
		this.vollgefressen = true;
	}
	public void neuesTier() {
		tieranzahl++;
	}
	
	public Meerschweinchen() {
		neuesTier();
	}
	public Meerschweinchen(String var_rasse) {
		neuesTier();
		this.rasse = var_rasse;
	}
	public Meerschweinchen(String var_rasse, double var_bauch) {
		neuesTier();
		this.rasse = var_rasse;
		this.bauchumfang = var_bauch;
	}
}
