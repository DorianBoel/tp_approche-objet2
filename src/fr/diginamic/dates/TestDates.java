package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("deprecation")
public class TestDates {

	
	public static void main(String[] args) {
		
		Date today = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Date d'aujourd'hui: " + dateFormat.format(today));
		System.out.println();
		
		Date date1 =  new Date(116, 4, 19, 23, 59, 30);
		
		DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(dateTimeFormat.format(date1));
		System.out.println();
		
		System.out.println("Date et heure actuelles: " + dateTimeFormat.format(today));
		System.out.println();
		
	}
	
}
