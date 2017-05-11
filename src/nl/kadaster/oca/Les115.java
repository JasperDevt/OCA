package nl.kadaster.oca;

public class Les115 {
	public static void main(String [] args){
		Auto mijnAuto = new Auto();
		mijnAuto.setAantalRuiten(87); // de setter wordt zo gedaan, de enige manier waarop de private variabele benaderd kan worden.
//		mijnAuto.aantalRuiten; Deze regel zou niet werken, het is immers een private int
		mijnAuto.getAantalRuiten(); // deze regel werkt wel, we hebben ingesteld dat via een methode de private variabele benaderd kan worden
	} // einde main	
}

class Auto {
	private int aantalRuiten; // encapsulation stap 1
	void setAantalRuiten(int methodeRuiten){ // encapsulation stap 2
		if(methodeRuiten < 3)
			aantalRuiten = 3;
		else{
			methodeRuiten = aantalRuiten;
		}
	}
	int getAantalRuiten(){ // encapsulation stap 3
	return aantalRuiten;
	}
}