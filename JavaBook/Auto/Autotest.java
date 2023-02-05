package Auto;

public class Autotest {
	public static void main(String[]args) {
		
		Auto BMW = new Auto();
		BMW.Vmax = 300;
		BMW.tankVolumen = 30.5;
		BMW.masse = 3;
		BMW.print();
		BMW.fahren(155.6);
		System.out.println();
		
		Auto mercedes = new Auto("rot");
		mercedes.Vmax = 250.7;
		mercedes.tankVolumen = 25.6;
		mercedes.masse = 2.8;
		mercedes.print();
		mercedes.fahren(30.8);
		System.out.println();
		
		Auto audi = new Auto("groen", 2000);
		audi.Vmax = 333.3;
		audi.tankVolumen = 35.2;
		audi.masse = 2.5;
		audi.print();
		audi.fahren(215.9);
		System.out.println();
		
		Auto lutz = new Auto();
		lutz.fahren();
		System.out.println();
		
		System.out.println("Es befindet/en sich " + Auto.anzahl + " Auto/s auf der Straoee");
	}
}
