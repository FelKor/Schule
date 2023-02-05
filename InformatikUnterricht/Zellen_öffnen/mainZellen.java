package Zellen_öffnen;

public class mainZellen {
	public static void main(String[]args) {
		
		boolean[] tueren = new boolean[101];
		int count = 1;
		
		while(count<101){
			for(int i=0; i<tueren.length; i+=count) {
				tueren[i] = !tueren[i];
			}
			count+=1;	
		}
		System.out.println("Freie Zellen: ");
		
		for(int i=0; i<tueren.length; i++) {			
	
			if(tueren[i]==true) {
				System.out.println(i);
			}
		}
	}
}
