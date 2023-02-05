package Klausurübung_2;

public class Auto {
	
	String farbe;
	int geschwindigkeit;
	
	Auto(){
		
	}
	
	Auto(String var){
		this.farbe = var;
	}
	
	Auto(String var, int x){
		this.farbe = var;
		this.geschwindigkeit = x;
	}
	
	public void fahren(int x) {
		System.out.println("Das Auto faehrt " + x + " km/h");
	}
	public void fahren() {
		System.out.println("Das Auto faehrt");
	}

}
