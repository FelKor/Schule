package Lotto_6_aus_49_array;

import java.util.Random;

public class mainLotto {
	public static void main(String[]args) {
		
		Random rand = new Random();
		boolean[] arr = new boolean[50];
		int[] ergebniss = new int[6];
		int zaehler = 0, randomzahl;
		
		while(zaehler < 6) {	
			randomzahl = rand.nextInt(49)+1;
			if(arr[randomzahl]==false) {
				arr[randomzahl]=true;
				ergebniss[zaehler] = randomzahl;
				zaehler++;
			}
		}
		for(int i=0; i<6; i++) {
			System.out.println("Die " + (i+1) + ". Zahl ist: " + ergebniss[i]);
		}
	}
}