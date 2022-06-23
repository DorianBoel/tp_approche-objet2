package fr.diginamic.enumeration;

public enum Season {

	// Instances
	SPRING("Printemps", 1),
	SUMMER("Été", 2),
	AUTUMN("Automne", 3),
	WINTER("Hiver", 4);
	
	// Instance attributes
	private String name;
	private int order;
	
	// Constructor
	private Season(String name, int order) {
		this.name = name;
		this.order = order;
	}
	
	// Class methods
	public static Season getInstanceFromName(String name) {
		for (Season season : Season.values()) {
			if (season.getName().equals(name)) {
				return season;
			}
		}
		return null;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public int getOrder() {
		return this.order;
	}
	
}
