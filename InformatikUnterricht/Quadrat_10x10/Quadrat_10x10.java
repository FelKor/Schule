package Quadrat_10x10;

//Aufgabe: 
//Schreiben Sie ein Programm das eine Zwei dimensioneles Feld(Array) mit den Dimensionen 10x10 erstellt.
//Fuellen sie dieses feld mit den Zahlen von eins bis 100, lassen Sie dann das Fled als Quadrat Augeben, mit 10 Zeilen pro Zeile.
//Dann werden alle Slots per Schleife Quadriet und wieder als Quadrat ausgegeben.

public class Quadrat_10x10 {
	public static void main(String[]args) {
		
		
		int[][] arr = new int[10][10];
		int l=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {				
				l++;
				arr[i][j] = l;
				System.out.print(arr[i][j] + "\t | \t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]*arr[i][j] + "\t | \t");
			}
			System.out.println();
		}
	}
}
