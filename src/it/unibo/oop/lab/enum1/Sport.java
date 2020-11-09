/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
	//Senza accorgermi ho fatto la enum1 come avrei dovuto fare la enum2
	BASKET("Basket"),
	SOCCER("Soccer"),
	TENNIS("Tennis"),
	BIKE("Bike"), 
	F1("F1"), 
	MOTOGP("MotoGP"), 
	VOLLEY("Volley");
    /*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
	private final String sportName;
	
	private Sport(final String sportName) {
		this.sportName = sportName;
	}
	
	public String getName() {
		return this.sportName;
	}

}
