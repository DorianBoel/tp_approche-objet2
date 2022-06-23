package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 5, 19, 23, 59, 30);
		
		Date date1 = calendar.getTime();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(dateFormat.format(date1));
		System.out.println();
		
		calendar.setTime(new Date());
		
		Date dateNow = calendar.getTime();
		
		DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Date et heure actuelles: " + dateTimeFormat.format(dateNow));
		System.out.println();
		
		DateFormat dateTimeFormatFR = new SimpleDateFormat ("EEEE dd MMMM yyyy HH:mm:ss", new Locale("fr", "FR"));
		DateFormat dateTimeFormatRU = new SimpleDateFormat ("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		DateFormat dateTimeFormatCN = new SimpleDateFormat ("EEEE dd MMMM yyyy HH:mm:ss", new Locale("zh", "CN"));
		DateFormat dateTimeFormatDE = new SimpleDateFormat ("EEEE dd MMMM yyyy HH:mm:ss", new Locale("de", "DE"));
		
		System.out.println("Locale France: " + dateTimeFormatFR.format(dateNow));
		System.out.println();
		System.out.println("Locale Russie: " + dateTimeFormatRU.format(dateNow));
		System.out.println();
		System.out.println("Locale Chine: " + dateTimeFormatCN.format(dateNow));
		System.out.println();
		System.out.println("Locale Allemagne: " + dateTimeFormatDE.format(dateNow));
		System.out.println();
		
	}

}
