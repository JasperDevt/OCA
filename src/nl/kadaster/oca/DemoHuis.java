package nl.kadaster.oca;

public class DemoHuis {
	public static void main(String [] args){
		Huis huisA = new Huis("Keulenstraat", 11);
		Huis huisB = new Huis("Keulenstraat");
//		huisA.straat = "Keulenstraat";
//		huisA.huisnummer = 11;
		Stad apeldoorn = new Stad();
		apeldoorn.wijk.straat.huis.huisnr.nummer = 12;
		Stad steden[] = new Stad[10];
		for(int i=0; i<steden.length;i++){
			if(steden[i] != null){
				System.out.println(steden[i].naam);
			}else{
				steden[i] = new Stad();
			}
		}
		
	}
}
class Stad{
	Wijk wijk = new Wijk();
	String naam;
}
class Wijk{
	Straat straat = new Straat();
	String naam;
}
class Straat{
	Huis huis = new Huis();
	String naam;
}
class Huisnummer{	
	int nummer;
}

class Huis{
	Huisnummer huisnr = new Huisnummer();
	Huis(){
		this("<onbekend>",10);
}
	Huis(String straat, int huisnummer){
		this.straat = straat;
		this.huisnummer = huisnummer;
		System.out.println("We hebben een eigen constructor!");	
		System.out.println(straat +" " +huisnummer);	
	}
	Huis(String straat){
		this(straat, 10);
	}
	Huis(int huisnummer){
		this("<onbekend>", huisnummer);
	}
	String straat;
	int huisnummer;
}
