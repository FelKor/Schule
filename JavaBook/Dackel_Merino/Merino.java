package Dackel_Merino;

public class Merino extends Meerschweinchen{
	
	double haarlaenge;
	boolean scheu;
	static int tieranzahlmerino;
	
	public Merino() {
		neuestiermerino();
	}
	public Merino(String var) {
		neuestiermerino();
		rasse = var;
	}
	public Merino(String var, double x) {
		neuestiermerino();
		rasse = var;
		bauchumfang = x;
	}
	
	public void neuestiermerino() {
		tieranzahlmerino++;
	}

}
