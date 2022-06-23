package fr.diginamic.enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.City;
import entities.enums.Continent;
import entities.enums.Season;

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
		
		List<City> cityList = new ArrayList<>(
			Arrays.asList(
				new City("New York", 8_804_190, Continent.AMERICA),
				new City("Paris", 2_165_423, Continent.EUROPE),
				new City("Beijing", 1_411_778_724 , Continent.ASIA),
				new City("Moscow", 12_455_682, Continent.EUROPE),
				new City("Berlin", 3_664_088, Continent.EUROPE),
				new City("Sydney", 4_959_107, Continent.OCEANIA),
				new City("Sao Paulo", 213_317_639, Continent.AMERICA),
				new City("Dakar", 2_646_503, Continent.AFRICA)
			)
		);
		
		for (City city : cityList) {
			city.displayInfo();
		}

	}

}
