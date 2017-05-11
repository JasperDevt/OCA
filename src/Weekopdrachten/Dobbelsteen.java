package Weekopdrachten;

import java.util.Random;

public class Dobbelsteen {

	public int worp(){
		int Steen = (int)(Math.random()*6) + 1;
		System.out.print(Steen + " ");
		return Steen;
	}
}
