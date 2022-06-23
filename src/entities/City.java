package entities;

import java.util.Objects;

import entities.enums.Continent;
import utils.NumUtils;

public class City {

	// Instance attributes
	private String name;
	private int population;
	private Continent continent;
	
	// Constructor
	public City(String name, int population, Continent continent) {
		this.name = name;
		this.population = population;
		this.continent = continent;
	}
	
	// Instance methods
	public void displayInfo() {
		System.out.println(this.name + " (" + this.continent.getName() + "), " + NumUtils.formatLocale(this.population) + " habitants");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof City)) {
			return false;
		}
		City cast = (City) obj;
		if (Objects.equals(this.name, cast.getName()) && this.population == cast.getPopulation()) {
			return true;
		}
		return false;
	}

	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public Continent getContinent() {
		return this.continent;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setContinent(Continent continent) {
		this.continent =  continent;
	}
	
}
