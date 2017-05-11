package Weekopdrachten;

public class Yahtzee {

	public static void main(String[] args) {
		boolean spelactief = true;
		Dobbelsteen dobbelsteen1 = new Dobbelsteen();
		Dobbelsteen dobbelsteen2 = new Dobbelsteen();
		Dobbelsteen dobbelsteen3 = new Dobbelsteen();
		Dobbelsteen dobbelsteen4 = new Dobbelsteen();
		Dobbelsteen dobbelsteen5 = new Dobbelsteen();
		Dobbelsteen dobbelsteen6 = new Dobbelsteen();
		int Stenen[] = new int[6];
		InputVastzetten IV = new InputVastzetten();
		boolean gooi[] = new boolean[6];
		gooi[0] = true;
		gooi[1] = true;
		gooi[2] = true;
		gooi[3] = true;
		gooi[4] = true;
		gooi[5] = true;
		if(gooi[0]){Stenen[0] = dobbelsteen1.worp();}
		if(gooi[1]){Stenen[1] = dobbelsteen2.worp();}
		if(gooi[2]){Stenen[2] = dobbelsteen3.worp();}
		if(gooi[3]){Stenen[3] = dobbelsteen4.worp();}
		if(gooi[4]){Stenen[4] = dobbelsteen5.worp();}
		if(gooi[5]){Stenen[5] = dobbelsteen6.worp();}
		while(spelactief){
			
			System.out.println();
			IV.VastzetVraag();
			int VastGezet = IV.RegelInput();
			int counter = 0;
			for (int stukvoorstuk : Stenen){
				counter++;
				System.out.println(counter + " " + stukvoorstuk);
				if(stukvoorstuk == VastGezet){
					gooi[counter]=false;
				} else {
					//doe niets.
				}
			}
		} // einde while loop
	}
}
// updaten naar GitHub
// 