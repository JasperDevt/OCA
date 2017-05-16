package nl.kadaster.oca;

public class Arrays1 {

	public static void main(String args[]) {
		//				int intArray[] = new int[] {}; 			// array met lengte 0 
		//				System.out.println(intArray.length);
		//				System.out.println(intArray[0]);		// runtime error!

		int intArray[] = new int[4]; 			// of via [aantal] alloceren of via [] {1, 3} NIET de combi! 
		System.out.println(intArray.length);
		System.out.println(intArray[0]);		// default waardes, DUS 0.
		intArray[0] = 5;
		intArray[1] = intArray[2] = 3;

		for (int i = 0; i < intArray.length ; i++) {
			System.out.println("Hallo " + i);
			intArray[i] = i;
		}
		for (int i = 0; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
		// for (;;); // Dit is geldige code!!!

		String[] strArray[] = new String[2][];
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		strArray[0] = new String[2];
		strArray[1] = new String[] {"Eén ", "twee ", "drie"};

		strArray[0][0] = "Hallo ";
		strArray[0][1] = "daar ";
		// sysout voor de adressen
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("Adres array " + strArray[i]);
		}

		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.println();
		} // einde van i!


		// hoe om te gaan met {} in multi-dimensionale arrays
		int multiArray[][] = { 	{0,1}, 
				{0,1,2} };
		int multiArray2[][] = new int[2][];
		//				System.out.println(multiArray[0].length);
		//				System.out.println(multiArray[1].length);
		// multiArray2[0] = {0,1}; // Dit mag niet! Alleen in de 1e dimensie mag er direct met {} gealloceerd en geïnitialiseerd worden
		multiArray2[0] = new int[] {0,1};
		multiArray2[1] = new int[3];  // vervolgens hier nog per item v/d 2e dimensie waarden toekennen.



	}
}
