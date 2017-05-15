package Weekopdrachten;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Yahtzee2 {

	public static void main(String[] args) {
		Dobbelsteen D1 = new Dobbelsteen(), D2 = new Dobbelsteen(),D3 = new Dobbelsteen(),D4 = new Dobbelsteen(),D5 = new Dobbelsteen();
		ArrayList<Dobbelsteen> steentjes = new ArrayList();
		Scanner sc = new Scanner(System.in);
		steentjes.add(D1);
		steentjes.add(D2);
		steentjes.add(D3);
		steentjes.add(D4);
		steentjes.add(D5);	
		for(int counter2 = 0; counter2<= 10 ; counter2++){
			System.out.println("Nieuwe ronde");
			System.out.println("Welke wilt u vastzetten?");
			final int input = sc.nextInt();						 // leest dus ook stenen die gerolt worden, niet alleen user input. Hoe dit af te vangen?
			for (int counter = 0; counter<= 4 ; counter++){
				if(steentjes.get(counter).dobbel() == input){
					steentjes.get(counter).vastgezet = true;
					System.out.println("De steen: "+ steentjes.get(counter).waarde +" is vastgezet");
				} else {
					steentjes.get(counter).vastgezet = false;
					System.out.println("Deze steen: "+ steentjes.get(counter).waarde + " wordt nogmaals gegooid.");
				}
			}
		}
	}
}

class Dobbelsteen{
	int waarde;
	boolean vastgezet;
	int dobbel(){
		if(!vastgezet){
			waarde = (int)(Math.random()*6)+1;
			return waarde;
		} else { 			
			return waarde;
		}

	}
}

