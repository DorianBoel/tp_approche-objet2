package entities.enums;

public enum Continent {
	
	// Instances
	AFRICA("Afrique"),
	AMERICA("Amérique"),
	ASIA("Asie"),
	EUROPE("Europe"),
	OCEANIA("Océanie");
	
	// Instance attributes
	private String name;
	
	// Constructor
	private Continent(String name) {
		this.name = name;
	}

	// Getter
	public String getName() {
		return this.name;
	}

}
