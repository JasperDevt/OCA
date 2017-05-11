package nl.kadaster.oca;

public class Les115 {
	public static void main(String [] args){
		Auto mijnAuto = new Auto();
		mijnAuto.autoSchilderen("zwart");
		System.out.println(mijnAuto.kleur);
		
		Auto mijn2eAuto = new Auto();
		mijn2eAuto.autoSchilderen("wit");
		System.out.println(mijnAuto.kleur);
		System.out.println(mijn2eAuto.kleur);
	} // einde main	
}

class Auto {
	static int aantalWielen = 4;
	String kleur;
	void besturen(){
		System.out.println("Ga maar rijden. broem, broem.");
	}
	
	void autoSchilderen(String watVoorKleur) {
		System.out.println("Schilderen met kleur: " + watVoorKleur);
		kleur = watVoorKleur;
	}
}