package Lotto_6_aus_49;

import java.util.Random;

public class mainLotto {
	public static void main(String[] args) {

		Random rand = new Random();
		int randomZahl, zahl1 = 0, zahl2 = 0, zahl3 = 0, zahl4 = 0, zahl5 = 0, zahl6 = 0;
		boolean cancel1 = false, cancel2 = false, cancel3 = false, cancel4 = false, cancel5 = false, cancel6 = false;

		while (cancel6 == false) {

			randomZahl = rand.nextInt(48) + 1;

			if (cancel1 == false) {
				zahl1 = randomZahl;
				cancel1 = true;
			} 
			else if (cancel2 == false) {
				if (randomZahl != zahl1) {
					zahl2 = randomZahl;
					cancel2 = true;
				}
			}
			else if (cancel3 == false) {
				if (randomZahl != zahl1 && randomZahl != zahl2) {
					zahl3 = randomZahl;
					cancel3 = true;
				}
			}
			else if (cancel4 == false) {
				if (randomZahl != zahl1 && randomZahl != zahl2 && randomZahl != zahl3) {
					zahl4 = randomZahl;
					cancel4 = true;
				}
			}
			else if (cancel5 == false) {
				if (randomZahl != zahl1 && randomZahl != zahl2 && randomZahl != zahl3 && randomZahl != zahl4) {
					zahl5 = randomZahl;
					cancel5 = true;
				}
			}
			else if (cancel6 == false) {
				if (randomZahl != zahl1 && randomZahl != zahl2 && randomZahl != zahl3 && randomZahl != zahl4 && randomZahl != zahl5) {
					zahl6 = randomZahl;
					cancel6 = true;
				}
			}
		}
		System.out.println("Ihre Zahlen sind: " + zahl1 + ", " + zahl2 + ", " + zahl3 + ", " + zahl4 + ", " + zahl5 + ", " + zahl6);
	}
}
