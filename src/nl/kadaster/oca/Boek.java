package nl.kadaster.oca;

public class Boek {
	public static void main(String [] args){
	String name = "Hallo";
	System.out.println(name.replace("ll","LL"));
	System.out.println(name);
	
	name = name.replace("l", "$");
	System.out.println(name);
	
	String str1 = "Hallo"; // Verwijzing naar StringPool
	String str2 = "Hello"; // Verwijzing naar StringPool
	str2 = str2.replace('e', 'a'); // methode maakt kennelijk nieuw object. Dus, return een String object. (nieuwe, dus niet op de StringPool.)
	// alleen via de "" wordt de StringPool gevuld.
	System.out.println(str1 == str2);
	// wordt ding in Stringpool
	
	String str3 = new String("Hallo");
	String str4 = new String("Hallo");
	System.out.println(str3 == str4);
	// wordt object
	}
}
