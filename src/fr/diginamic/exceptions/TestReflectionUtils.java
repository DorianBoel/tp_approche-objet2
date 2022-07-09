package fr.diginamic.exceptions;

import entities.City;
import entities.enums.Continent;

public class TestReflectionUtils {

	public static void main(String[] args) {
		try {

			@SuppressWarnings("unused")
			City city2 = new City("Nice", 343_000, Continent.EUROPE);

			ReflectionUtils.displayAttributes(null);
			
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
