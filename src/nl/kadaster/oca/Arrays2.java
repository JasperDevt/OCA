package nl.kadaster.oca;

public class Arrays2 {
	public static void main(String args[]) {
		String[] strArray[] = new String[2][];
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		strArray[0] = new String[2];
		strArray[1] = new String[] {"Eén ", "twee ", "drie"};
				
		strArray[0][0] = "Hallo ";
		strArray[0][1] = "daar ";
		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.println();
		} // einde van i!

		// Mag dit??
		String[] test = new String[] {"Test"};
//		strArray = test;			// links 2 dim array (2 paar nietjes) en rechts 1 dim, (1 paar nietjes)
		strArray[1] = test;			// links 1 dim array (1 paar nietjes) en rechts ook
//		strArray[1][1] = test;		// links 0 dim array, oftewel String en rechts 1 dim (1 paar nietjes)
		
		int[][][][] int4 = new int[4][4][4][4];
		int[][][]   int3 = new int[1][1][1];
		// ga hier ook zelf mee aan de slag;
//		int4[0][0] = int3[0][0];		// links 2 dim - rechts 1 dim X (compile fout)
//		int4[0] = int3[0][0];			// links 3 dim - rechts 1 dim X (compile fout)
//		int4[0][0][0] = int3[0][0][0];	// links 1 dim - rechts 0 dim X (compile fout) (0 dim, je zit echt in het laatje, int)
		int4[0] = int3;						// 3 dim
		int4[0][0] = int3[0];				// 2 dim
		int4[0][0][0] = int3[0][0];			// 1 dim
		int4[0][0][0][0] = int3[0][0][0];	// het echte veld (dim 0)
		
		// Dit mag!! 
		Object[] objecten = new Object[3];
		objecten[0] = new Object();
		objecten[1] = new int[3][2][2];
		objecten[2] = "Tekst";
		
		System.out.println();
		System.out.println("-- En nu met objecten in de array! --");
		///// Even kijken wat er gebeurt!
		Sollicitant a = new Sollicitant();
		System.out.println(a);
		a.naamSollicitant = "Jasper";
		System.out.println(a.naamSollicitant);
		
		Sollicitant[] sollicitanten = new Sollicitant[5];
		for (int i = 0; i < sollicitanten.length; i++) {
			System.out.println(sollicitanten[i]);
		}
		sollicitanten[0] = a;
//		sollicitanten[0].naamSollicitant = "Cor";
		System.out.println(sollicitanten[0].naamSollicitant + "hier");
		
		sollicitanten[1] = new Sollicitant();
		for (int i = 0; i < sollicitanten.length; i++) {
			System.out.println(sollicitanten[i]);
		}
		sollicitanten[0].naamSollicitant = "Claudia";
		System.out.println(a.naamSollicitant);
		
		// initialiseren van de sollicitanten array, oftewel per plek een new Sollicitant aanmaken en assignen.
		for (int i = 0; i < sollicitanten.length; i++) {
			sollicitanten[i] = new Sollicitant();
		}
		
		// afdrukken van de naam
		for (int i = 0; i < sollicitanten.length; i++) {
			System.out.println(sollicitanten[i].naamSollicitant);
		}
	}
}

class Sollicitant {
	String naamSollicitant;
}


