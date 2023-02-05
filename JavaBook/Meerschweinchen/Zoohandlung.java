package Meerschweinchen;

public class Zoohandlung {
	public static void main(String[]args) {
		
		Meerschweinchen lutz = new Meerschweinchen();
		lutz.fressen();
		System.out.println();
		
		Meerschweinchen kolli = new Meerschweinchen("rot");
		System.out.println("Rasse " + kolli.rasse);
		System.out.println();
		
		Meerschweinchen Adrian = new Meerschweinchen("gelb", 500000000);
		System.out.println("Rasse " + Adrian.rasse);
		System.out.println("Bauchumfang " + Adrian.bauchumfang);
		System.out.println();
		
		System.out.println("Es gitbt " + Meerschweinchen.tieranzahl + " Meerschweinchen");
	}
}
