package fr.diginamic.enumeration;

public class TestEnum {

	public static void main(String[] args) {
		
		for (Season season : Season.values()) {
			System.out.println("Saison " + season.getOrder() + ": " + season.getName());
		}
		System.out.println();
		
		String seasonInstanceName =  "SUMMER";
		Season seasonInstance = Season.valueOf(seasonInstanceName);
		
		System.out.println("L'instance d'énumération '" + seasonInstance + "' correspond à la saison " + seasonInstance.getName());
		System.out.println();
		
		String seasonName = "Hiver";
		
		System.out.println("'" + seasonName + "' correspond à l'instance de saison " + Season.getInstanceFromName(seasonName));
		System.out.println();

	}

}
