/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(Place.INDOOR , 5, "Basket"),
	SOCCER(Place.OUTDOOR , 11, "Soccer"),
	TENNIS(Place.OUTDOOR , 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Bike"), 
	F1(Place.OUTDOOR, 1, "F1"), 
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"), 
	VOLLEY(Place.OUTDOOR, 7, "Volley");
    /*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
	private final Place actualPlace;
	private final int noTeamMembers;
	private final String actualName;
	
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.actualPlace = place;
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;	
	}
	
	public String getName() {
		return this.actualName;
	}
	
	public Place getPlace() {
		return this.actualPlace;
	}
	
	public boolean isIndividualSport() {
		return 1 == this.noTeamMembers;
	}
	
	public boolean isIndoorSport() {
		return Place.INDOOR == this.actualPlace;
	}
	
	public String toString() {
		return this.getName() + this.getPlace().toString() + " is played in " + this.noTeamMembers + " per team";
	}
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
