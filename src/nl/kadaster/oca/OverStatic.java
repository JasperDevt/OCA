package nl.kadaster.oca;

public class OverStatic {

	public static void main(String[] args) {
		Schrijver auteur1 = new Schrijver();
		setNaam(auteur1);
		System.out.println(auteur1.naam);
	}
	static void setNaam(Schrijver schrijver){
		schrijver.naam = "Suzanne Collins";
		schrijver = new Schrijver();
		schrijver.naam = "A.A. Milne";
	}
}
class Schrijver{
	String naam;
}