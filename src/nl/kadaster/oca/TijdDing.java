package nl.kadaster.oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TijdDing {
	public static void main(String [] args){
		// van nu (LocalDateTime)
//		LocalDateTime today = LocalDateTime.now();
//		System.out.println("Nu: " + today);
		
		// gebruik van datum en tijd (LocalDate en LocalTime)
//		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
//		System.out.println("Current DateTime = " + today);
		
		// Kan ook door specifiek in te voeren, met object:
//		LocalDateTime ooit = LocalDateTime.of(2017,2,5, 15,26,1);
//		System.out.println(ooit);
		// Met betrekking tot de standaard formatters met 'ISO' staat in het boek... 
		
	}
}
