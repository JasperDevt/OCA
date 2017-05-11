package nl.kadaster.oca;

public class ObjectReference {

	public static void main(String[] args) {
		int getal1 = 5;
		int getal2 = getal1;
		getal1 = 10;
		System.out.println(getal2);
		
		Tafel tafel1 = new Tafel(); // links, reference variabele. Rechts: object
		tafel1.aantalPoten = 4;
		Tafel tafel2 = tafel1;
		tafel1.aantalPoten = 10;
		System.out.println(tafel2.aantalPoten);
		
		tafel2 = new Tafel();
		System.out.println(tafel2.aantalPoten);
		
		getal2=10;
		if(getal1 == getal2){
			System.out.println("getallen zijn gelijk");
		}
		
		tafel2.aantalPoten = 10;
		System.out.println("Aantal poten van beide tafels: " + tafel1.aantalPoten + " " + tafel2.aantalPoten);
		
		if(tafel1 == tafel2){
			System.out.println("Tafels zijn gelijk");
		} else {
			System.out.println("Tafels zijn niet gelijk.");
		}
		System.out.println(tafel1);
		System.out.println(tafel2);
		
		if(tafel1.equals(tafel2)){
			System.out.println("Tafels zijn gelijk");
	} else {
		System.out.println("Tafels zijn niet gelijk.");
	}
		if(tafel1.aantalPoten == tafel2.aantalPoten){
			System.out.println("Het aantal poten is gelijk");
		} else {
			System.out.println("Het aantal poten is niet gelijk");
		}
	}

}

class Tafel{
	int aantalPoten;
}