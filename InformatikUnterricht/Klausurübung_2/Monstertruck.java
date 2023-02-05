package Klausurübung_2;

public class Monstertruck extends Auto{
	
	int reifengroesse;
	double laenge;
	
	Monstertruck(int r, double l){
		super();
		this.reifengroesse = r;
		this.laenge = l;
	}
	Monstertruck(String var, int r, double l){
		super(var);
		this.reifengroesse = r;
		this.laenge = l;
	}
	Monstertruck(String var, int x, int r, double l){
		super(var, x);
		this.reifengroesse = r;
		this.laenge = l;
	}

}
