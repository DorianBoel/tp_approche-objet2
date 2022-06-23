package fr.diginamic.equals;

public class TestEquals {

	public static void main(String[] args) {
		
		City city1 = new City("Nice", 343_000);
		City city2 = new City("Nice", 343_000);
		
		System.out.println("city1 equals city2 ? " + city1.equals(city2));
		System.out.println();

		city2 = new City("Marseille", 850_700);
		
		System.out.println("city1 equals city2 ? " + city1.equals(city2));
		
	}

}
