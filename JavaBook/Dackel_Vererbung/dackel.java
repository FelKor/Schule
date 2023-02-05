package Dackel_Vererbung;
 
public class dackel {
	
	//Konstruktoren
	public dackel() {
		System.out.println("Geburt eines Dackels!");
		this.alter = 1;
		this.name = "Dackel";
	}
	
	//Instanzmethoden
	public void bellen() {
		System.out.println("WauWau!");
	}
	
	//Instanzvariabelen
	int alter;
	String name;
}
