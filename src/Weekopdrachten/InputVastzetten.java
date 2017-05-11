package Weekopdrachten;

import java.util.Scanner;

public class InputVastzetten {
	public void VastzetVraag(){
		System.out.println("Welke dobbelstenen wilt u vastzetten?");
	}
	public int RegelInput(){
		Scanner sc = new Scanner(System.in);
		int GekozenGetal = sc.nextInt();
		return GekozenGetal;
	}
}
