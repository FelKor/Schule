package Dackel;

public class mainDackel {
	public static void main(String[]args) {
		
		dackel waldi = new dackel();
		dackel hundi = new dackel(5);
		dackel lutz = new dackel(6, "lutz");
		
		System.out.println();
		
		waldi.bellen();
		waldi.laufen();
		waldi.fressen();
		waldi.setAlter(4);
		waldi.setSchulterhoehe(59);
		waldi.setName("Waldi");
		System.out.println("Alter des Dackels " + waldi.getAlter());
		System.out.println("Schulterhoeeh des Dackels " + waldi.getSchulterhoehe());
		System.out.println("Name des Dackels " + waldi.getName());
		
		System.out.println();
		
		hundi.bellen();
		hundi.laufen();
		hundi.fressen();
		hundi.Alter += 10;
		hundi.Schulterhoehe = 40;
		hundi.name = "Hundi";
		System.out.println("Alter des Dackels " + hundi.Alter);
		System.out.println("Schulterhoeeh des Dackels " + hundi.Schulterhoehe);
		System.out.println("Name des Dackels " + hundi.name);
		
		System.out.println();
		
		lutz.bellen();
		lutz.laufen();
		lutz.fressen();
		lutz.Alter += 0;
		lutz.Schulterhoehe = 40;
		System.out.println("Alter des Dackels " + lutz.Alter);
		System.out.println("Schulterhoeeh des Dackels " + lutz.Schulterhoehe);
		System.out.println("Name des Dackels " + lutz.name);
		
		System.out.println();
		
		System.out.println("Anzahl der Dackel: " + dackel.anzahl);
			
		waldi.finalize();
		hundi.finalize();
		
		System.out.println();
		
		System.out.println("Die neue Anzahl der Dackel: " + dackel.anzahl);
	
	}
}
