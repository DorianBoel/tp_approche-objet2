package fr.diginamic.equals;

public class City {

	// Instance attributes
	private String name;
	private int population;
	
	// Constructor
	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	// Instance methods
	public void displayInfo() {
		System.out.println(name + ", " + population + " habitants");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof City)) {
			return false;
		}
		City cast = (City) obj;
		if (this.name.equals(cast.getName()) && this.population == cast.getPopulation()) {
			return true;
		}
		return false;
	}

	// Getters
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
}
