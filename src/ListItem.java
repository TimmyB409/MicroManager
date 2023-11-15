
/**
 * Lead Author(s):
 * Evens Brunel
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Java specs for enums
 * https://docs.oracle.com/javase/specs/jls/se21/html/jls-8.html#jls-8.9.3
 * 
 * <<add more references here>>
 *  
 * Version/date: 11/15/23
 * 
 * Responsibilities of class: abstract class that represents an item in a list with a name, details, and a priority Level
 * 
 */

public abstract class ListItem {
	
	//fields
	public static enum PriorityLevel {Low, Medium, High};
	protected PriorityLevel priority;
	protected String name;
	protected String details;
	
	//methods
	/**
	 * Purpose: returns value in priority
	 * @return PriorityLevel: priority
	 */
	public PriorityLevel getPriority() {
		return this.priority;
	}
	/**
	 * Purpose: returns value in name
	 * @return String: name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Purpose: returns value in details
	 * @return String: details
	 */
	public String getDetails() {
		return this.details;
	}
	/**
	 * Purpose: sets the value in priority
	 * @param PriorityLevel: priority
	 */
	public void setPriority(PriorityLevel priority) {
		this.priority = priority;
	}
	/**
	 * Purpose: sets the value in name
	 * @param String: name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Purpose: sets the value in details
	 * @return String: details
	 */
	public void setDetails(String details) {
		this.details = details;
	}

}
