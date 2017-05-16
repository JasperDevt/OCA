package Weekopdrachten;

import java.util.Scanner;

public class Yahtzee3 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoeveel spelers wilt u toevoegen?");
		int aantalspelers = sc.nextInt();
		System.out.println("Er zijn " + aantalspelers + " spelers toegevoegd.");
		Speler spelers[] = new Speler[aantalspelers];
		for(int f = 0; f<spelers.length;f++){	
			System.out.println("Wat is de naam van de speler?");
			spelers[f] = new Speler();			
			spelers[f].naam = sc.next();
			System.out.println(f+1);
			
		}
		for(int k = 0; k<aantalspelers;k++){
			System.out.println();
			System.out.println("De volgende speler is aan de beurt: "+ spelers[k].naam);
			spelers[k].volgendeRonde();
			int input = sc.nextInt();
			for(int i = 0;i<spelers[k].stenen.length;i++){
				if(spelers[k].stenen[i].waarde == input){
					spelers[k].stenen[i].vast = true;
				}
				spelers[k].stenen[i].worp();
			}
			input = sc.nextInt();
			for(int i = 0;i<spelers[k].stenen.length;i++){
				if(spelers[k].stenen[i].waarde == input){
					spelers[k].stenen[i].vast = true;
				}
				spelers[k].stenen[i].worp();
			}

		}

	}
}
class DobbelSteen {
	int waarde = 0;
	boolean vast;
	int worp(){
		if(vast){
			printDice(waarde);
			return waarde;
		} else {
			waarde = (int)(Math.random()*6)+1;
			printDice(waarde);
			return waarde;
		}
	}
	void printDice(int hoi){
		System.out.print(hoi);
	}
}
class Speler {
	int beurt = 1;
	int score = 0;
	String naam;
	DobbelSteen stenen[] = new DobbelSteen[5];
	void volgendeRonde(){
		for(int i=0;i<stenen.length;i++){
			stenen[i] = new DobbelSteen();
			stenen[i].waarde = stenen[i].worp();	
		}
	}
}
//	DobbelSteen [] beurt(int beurt){	
//		if(beurt == 1){		
//			for(int i=0;i<stenen.length;i++){
//				stenen[i] = {stenen[i].worp()};
//				System.out.println("regel A = " + stenen);
//				stenen[i] = new DobbelSteen();
//				this.beurt++;
//				System.out.println(i);
//				System.out.println(stenen[i]);
//				stenen[i].worp();
//				return stenen;
//			}
//		} else if (beurt == 2) {
//			for(int i=0;i<stenen.length;i++){
//				stenen[i] = new DobbelSteen();
//				this.beurt++;
//				stenen[i].worp();
//				return stenen;
//			}
//		} else if (beurt == 3){
//			for(int i=0;i<stenen.length;i++){
//				stenen[i] = new DobbelSteen();
//				this.beurt++;
//				stenen[i].worp();
//				return stenen;
//			}
//		}
//		return stenen;
//	}
//
//
//void vastzetten(DobbelSteen steen){
//	System.out.println(steen);
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Welke wilt u vasthouden?");
//	int vastzetten = sc.nextInt();
//	//		if (vastzetten == steen){
//	//			steen.vast = true;
//	//		} else {
//	//			steen.vast = false;

//}



// printdice methode
// meer methoden
// multiplayer
// meerdere ronden.